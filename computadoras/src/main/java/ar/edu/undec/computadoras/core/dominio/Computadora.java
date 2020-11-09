package ar.edu.undec.computadoras.core.dominio;


public class Computadora {

    private String i310401000GB16GB;
    private String s;
    private int i;
    private String ssd;
    private int i1;
    private String pc;

    public Computadora(String i310401000GB16GB, String s, int i, String ssd, int i1, String pc) {}

    public String getI310401000GB16GB() {
        return i310401000GB16GB;
    }

    public void setI310401000GB16GB(String i310401000GB16GB) {
        this.i310401000GB16GB = i310401000GB16GB;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public int getI1() {
        return i1;
    }

    public void setI1(int i1) {
        this.i1 = i1;
    }

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }

    public static Computadora instancia (String i310401000GB16GB, String s, int i, String ssd, int i1, String pc) {
        return new Computadora (i310401000GB16GB, s, i, ssd, i1, pc);
    }
}
