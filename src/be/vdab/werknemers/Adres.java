package be.vdab.werknemers;

public class Adres {
    private String straat;
    private String nummer;
    private int postcode;
    private String gemeente;

    public Adres() {
    }

    public Adres(String straat, String nummer, int postcode, String gemeente) {
        setStraat(straat);
        setNummer(nummer);
        setPostcode(postcode);
        setGemeente(gemeente);
    }

    public String getStraat() {
        return straat;
    }

    public void setStraat(String straat) {
        this.straat = straat;
    }

    public String getNummer() {
        return nummer;
    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getGemeente() {
        return gemeente;
    }

    public void setGemeente(String gemeente) {
        this.gemeente = gemeente;
    }

    @Override
    public String toString() {
        return new StringBuilder().append(straat).append(" ").append(nummer)
                                  .append("\n").append(postcode).append(" ").append(gemeente)
                                  .toString();
    }
}
