package be.vdab.werknemers;

public class Persoon {
    private String voornaam;
    private String naam;
    private Adres adres;

    public Persoon(String voornaam, String naam, String straat, String nummer, int postcode, String gemeente) {
      this(naam, voornaam, new Adres(straat, nummer, postcode, gemeente));
    }

    public Persoon(String voornaam, String naam, Adres adres) {
        setVoornaam(voornaam);
        setNaam(naam);
        setAdres(adres);
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public void voegNamenToe(String... voornaam) {
        StringBuilder naamString = new StringBuilder();
        for (String naam : voornaam) {
            naamString.append(" ").append(naam);
        }
        setVoornaam(naamString.toString());
    }

    @Override
    public String toString() {
        return new StringBuilder().append(getVoornaam()).append(" ")
                                  .append(getNaam()).append("\n").append((getAdres())).toString();
    }
}
