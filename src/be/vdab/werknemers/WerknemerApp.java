package be.vdab.werknemers;

import java.math.BigDecimal;

public class WerknemerApp {
    public static void main(String[] args) {
        Werknemer aaron = new Werknemer("Aaron", "Van Stappen",
                          new Adres("Hoekstraat", "7", 3600, "Genk"),
                        "programmeur", BigDecimal.valueOf(3600));

        Werknemer julie = new Werknemer("Julie", "Menten",
                          new Adres("Diesterstraat", "21B", 3700, "Sint-Truiden"));

        Manager joshua = new Manager("Joshua", "Van Stappen",
                         new Adres("Kempische Steenweg", "98", 3500, "Hasselt"),
                        "manager",BigDecimal.valueOf(8300));

        System.out.println(aaron.toString());
        System.out.println(julie.toString());
        System.out.println(joshua.toString());
        System.out.println(Werknemer.getAantalWN());
        System.out.println(Manager.getAantalMan());
        System.out.println(joshua.getProcAandeelManagers());
    }
}
