package be.vdab.werknemers;

import java.math.BigDecimal;

public class Werknemer extends Persoon {
    private String functie;
    private BigDecimal salaris;
    private static int aantalWN = 0;
    private static final BigDecimal MINIMUM_LOON = BigDecimal.valueOf(1000.00);

    Werknemer(String voornaam, String naam, Adres adres) {
        this(naam, voornaam, adres, "Algemeen bediende", BigDecimal.valueOf(1800));
    }

    Werknemer(String voornaam, String naam, Adres adres, String functie, BigDecimal salaris) {
        super(voornaam, naam, adres);
        setFunctie(functie);
        setSalaris(salaris);
        aantalWN++;
    }




    private String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    public BigDecimal getSalaris() {
        return salaris;
    }

    public void setSalaris(BigDecimal salaris) {
       this.salaris = salaris.doubleValue() < MINIMUM_LOON.doubleValue() ? MINIMUM_LOON : salaris;
    }

    public BigDecimal getMinimumLoon() {
        return MINIMUM_LOON;
    }

    static int getAantalWN() {
        return aantalWN;
    }

    @Override
    public String toString() {
        return super.toString() + new StringBuilder().append("\n ").append(getFunctie()).append(" ").append(getSalaris())
                    .append("\n").toString();
    }
}
