package co.com.bancolombia.certification.utest.tasks;

import co.com.bancolombia.certification.userinterfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterUser implements Task {
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
                Click.on(Location.BUTTONLOCATION),
                Click.on(Devices.SISTEMA),
                Click.on(Devices.WINDOWS),
                Click.on(Devices.VERSION),
                Click.on(Devices.XP),
                Click.on(Devices.LANGUAGE),
                Click.on(Devices.ENGLISH),
                Click.on(Devices.BUTTONFINAL),
                SendKeys.of("Andres2022****").into(Complete.PASSWORD),
                SendKeys.of("Andres2022****").into(Complete.CONFIRMPASSWORD),
                Click.on(Complete.CHECKONE),
                Click.on(Complete.CHECKTWO),
                Click.on(Complete.BUTTONCOMPLETE)
        );
    }

    public static RegisterUser makeinformation(){
        return instrumented(RegisterUser.class);
    }
}
