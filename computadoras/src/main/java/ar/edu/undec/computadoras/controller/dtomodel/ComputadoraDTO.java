package ar.edu.undec.computadoras.controller.dtomodel;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ComputadoraDTO {

        @JsonProperty("i310401000GB16GB")
        private String i310401000GB16GB;
        @JsonProperty("s")
        private String s;
        @JsonProperty("i")
        private int i;
        @JsonProperty("ssd")
        private String ssd;
        @JsonProperty("i1")
        private int i1;
        @JsonProperty("pc")
        private String pc;

    public ComputadoraDTO(@JsonProperty("i310401000GB16GB") String i310401000GB16GB,
                          @JsonProperty("s") String s,
                          @JsonProperty("i") int i,
                          @JsonProperty("ssd") String ssd,
                          @JsonProperty("i1") int i1,
                          @JsonProperty("pc")String pc) {
        this.i310401000GB16GB = i310401000GB16GB;
        this.s = s;
        this.i = i;
        this.ssd = ssd;
        this.i1 = i1;
        this.pc = pc;
    }

    public String getI310401000GB16GB() {
        return i310401000GB16GB;
    }

    public String getS() {
        return s;
    }

    public int getI() {
        return i;
    }

    public String getSsd() {
        return ssd;
    }

    public int getI1() {
        return i1;
    }

    public String getPc() {
        return pc;
    }
}
