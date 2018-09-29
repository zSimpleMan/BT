package com.example.nhathan.bt_tuan4;

public class ThongTin {
    private String TEN;
    private String SDT;
    private int HINH1;
    private int HINH2;

    public ThongTin(String TEN, String SDT, int HINH1, int HINH2) {
        this.TEN = TEN;
        this.SDT = SDT;
        this.HINH1 = HINH1;
        this.HINH2 = HINH2;
    }

    public String getTEN() {
        return TEN;
    }

    public void setTEN(String TEN) {
        this.TEN = TEN;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public int getHINH1() {
        return HINH1;
    }

    public void setHINH1(int HINH1) {
        this.HINH1 = HINH1;
    }

    public int getHINH2() {
        return HINH2;
    }

    public void setHINH2(int HINH2) {
        this.HINH2 = HINH2;
    }
}
