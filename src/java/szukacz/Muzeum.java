package szukacz;

public class Muzeum {
    private int id;
    private String nazwa;
    private String kod;
    private String miasto;
    private String predef_ulicy;
    private String ulica;
    private String nr_domu;
    private String nr_lokalu;
    private String zalozyciel;
    private String data_wpisu;
    private String status;

    public Muzeum(int id, String nazwa, String kod, String miasto, String predef_ulicy, String ulica, String nr_domu, String nr_lokalu, String zalozyciel, String data_wpisu, String status) {
        this.id = id;
        this.nazwa = nazwa;
        this.kod = kod;
        this.miasto = miasto;
        this.predef_ulicy = predef_ulicy;
        this.ulica = ulica;
        this.nr_domu = nr_domu;
        this.nr_lokalu = nr_lokalu;
        this.zalozyciel = zalozyciel;
        this.data_wpisu = data_wpisu;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getKod() {
        return kod;
    }

    public String getMiasto() {
        return miasto;
    }

    public String getPredef_ulicy() {
        return predef_ulicy;
    }

    public String getUlica() {
        return ulica;
    }

    public String getNr_domu() {
        return nr_domu;
    }

    public String getNr_lokalu() {
        return nr_lokalu;
    }

    public String getZalozyciel() {
        return zalozyciel;
    }

    public String getData_wpisu() {
        return data_wpisu;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Muzeum{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", kod='" + kod + '\'' +
                ", miasto='" + miasto + '\'' +
                ", predef_ulicy='" + predef_ulicy + '\'' +
                ", ulica='" + ulica + '\'' +
                ", nr_domu='" + nr_domu + '\'' +
                ", nr_lokalu='" + nr_lokalu + '\'' +
                ", zalozyciel='" + zalozyciel + '\'' +
                ", data_wpisu='" + data_wpisu + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
