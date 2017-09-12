package be.vdab.werknemers;

import java.math.BigDecimal;

public class Manager extends Werknemer {
    private BigDecimal bonus = BigDecimal.valueOf(0.00);
    public static int aantalMan = 0;

    public Manager(String voornaam, String naam, Adres adres, String functie, BigDecimal salaris) {
        this(voornaam, naam, adres, functie, salaris, BigDecimal.valueOf(50.00));
    }

    public Manager(String voornaam, String naam, Adres adres, String functie, BigDecimal salaris, BigDecimal bonus) {
        super(voornaam, naam, adres, functie, salaris);
        setBonus(bonus);
        aantalMan++;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    public BigDecimal getProcAandeelManagers() {
        BigDecimal verhouding = BigDecimal.valueOf(getAantalMan()).divide(BigDecimal.valueOf(getAantalWN())
                .multiply(BigDecimal.valueOf(100)));
        return verhouding.setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    public static int getAantalMan() {
        return aantalMan;
    }

    @Override
    public BigDecimal getSalaris() {
        return super.getSalaris().add(this.bonus);
    }

    @Override
    public String toString() {
        return super.toString() + new StringBuilder().append(" ").append(getBonus())
                    .append("\n").toString();
    }
}
