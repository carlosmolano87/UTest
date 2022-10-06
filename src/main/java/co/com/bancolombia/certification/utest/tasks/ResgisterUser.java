package co.com.bancolombia.certification.utest.tasks;

import co.com.bancolombia.certification.userinterfaces.Home;
import co.com.bancolombia.certification.userinterfaces.Location;
import co.com.bancolombia.certification.userinterfaces.Personal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ResgisterUser implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Home.REGISTER),
                SendKeys.of("carlos").into(Personal.FIRSTNAME),
                SendKeys.of("molano").into(Personal.LASTNAME),
                SendKeys.of("cmolano@hotmail.com").into(Personal.EMAIL),
                SendKeys.of("July").into(Personal.MONTH),
                SendKeys.of("5").into(Personal.DAY),
                SendKeys.of("2000").into(Personal.YEAR),
                Click.on(Location.BUTTONLOCATION)
        );
    }

    public static ResgisterUser makeinformation(){
        return instrumented(ResgisterUser.class);
    }
}
