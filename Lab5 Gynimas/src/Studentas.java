public class Studentas {

    private int PazymejimoNr;
    private String VardasPavarde;
    private int GimimoData;
    private String Grupe;
    private double Vidurkis;

    public Studentas(int pazymejimoNr, String vardasPavarde, int gimimoData, String grupe, double vidurkis) {
        PazymejimoNr = pazymejimoNr;
        VardasPavarde = vardasPavarde;
        GimimoData = gimimoData;
        Grupe = grupe;
        Vidurkis = vidurkis;
    }

    public int getPazymejimoNr() {
        return PazymejimoNr;
    }

    public void setPazymejimoNr(int pazymejimoNr) {
        PazymejimoNr = pazymejimoNr;
    }

    public String getVardasPavarde() {
        return VardasPavarde;
    }

    public void setVardasPavarde(String vardasPavarde) {
        VardasPavarde = vardasPavarde;
    }

    public int getGimimoData() {
        return GimimoData;
    }

    public void setGimimoData(int gimimoData) {
        GimimoData = gimimoData;
    }

    public String getGrupe() {
        return Grupe;
    }

    public void setGrupe(String grupe) {
        Grupe = grupe;
    }

    public double getVidurkis() {
        return Vidurkis;
    }

    public void setVidurkis(double vidurkis) {
        Vidurkis = vidurkis;
    }

    @Override
    public String toString() {
        return "Studentas{" +
                "PazymejimoNr=" + PazymejimoNr +
                ", VardasPavarde='" + VardasPavarde + '\'' +
                ", GimimoData=" + GimimoData +
                ", Grupe='" + Grupe + '\'' +
                ", Vidurkis=" + Vidurkis + "\n";
    }
}
