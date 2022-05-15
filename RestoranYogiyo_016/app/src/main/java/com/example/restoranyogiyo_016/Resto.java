package com.example.restoranyogiyo_016;

public class Resto {
    private int resId;
    private String filename;

    public Resto(int _resId, String _filename){
        resId= _resId;
        filename= _filename;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
