package co.com.bancolombia.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Location {
    public static final Target BUTTONLOCATION = Target.the("button next").
            locatedBy("//a[@class=\"btn btn-blue\"]");
}
