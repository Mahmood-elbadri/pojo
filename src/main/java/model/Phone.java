package model;

public class Phone {
    private String ph1;
    private String code;

    public Phone(String ph1, String code) {
        this.ph1 = ph1;
        this.code = code;
    }

    public Phone() {
    }

    public String getPh1() {
        return ph1;
    }

    public void setPh1(String ph1) {
        this.ph1 = ph1;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
