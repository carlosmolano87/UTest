package co.com.bancolombia.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Location {

    public static final Target COUNTRY = Target.the("sistema").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[2]");
    public static final Target COLOMBIA = Target.the("windows").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[48]");
    public static final Target NEXT = Target.the("button next").
            locatedBy("//a[@class=\"btn btn-blue pull-right\"]");
}
