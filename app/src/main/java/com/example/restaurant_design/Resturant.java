package com.example.restaurant_design;


public class Resturant {

    private String nameitem;
    private String numbersitem;
    private int imag;


    public Resturant(int imag, String nameitem, String numbersitem) {
        this.nameitem = nameitem;
        this.numbersitem = numbersitem;
        this.imag = imag;
    }

    public String getnameitem() {
        return nameitem;
    }

    public void senameitem(String nameitem) {
        this.nameitem = nameitem;
    }

    public int getimag() {
        return imag;
    }

    public void setimage(int imag) {
        this.imag = imag;
    }

    public String getnumbersitem() {
        return numbersitem;
    }

    public void setnumbersitem(String numbersitem) {
        this.numbersitem = numbersitem;
    }

}