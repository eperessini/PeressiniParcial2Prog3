package ar.edu.undec.computadoras.persistencia.entity;

import javax.persistence.*;

@Entity (name="computadoras")
@SequenceGenerator(name="computadoras_id_seq", initialValue = 1, sequenceName = "computadoras_id_seq", allocationSize = 1)
public class ComputadoraEntity {

    @Id
    @Column (name="i310401000GB16GB")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "computadoras_id_seq")
    private String i310401000GB16GB;

    @Column (name="s")
    private String s;
    @Column (name="i")
    private int i;
    @Column (name="ssd")
    private String ssd;
    @Column (name="i1")
    private int i1;
    @Column (name="pc")
    private String pc;


    public ComputadoraEntity() {}

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

}
