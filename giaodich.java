
package Giaodich;

public class giaodich {
    private String magiaodich;
    private String ngay;
    private int dongia;
    private int soluong;

    public giaodich(String magiaodich, String ngay, int dongia, int soluong) {
        this.magiaodich = magiaodich;
        this.ngay = ngay;
        this.dongia = dongia;
        this.soluong = soluong;
    }
    
    public giaodich() {
        this.magiaodich = "";
        this.ngay = "";
        this.dongia = 0;
        this.soluong = 0;
    }

    public String getMagiaodich() {
        return magiaodich;
    }

    public void setMagiaodich(String magiaodich) {
        this.magiaodich = magiaodich;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
     
    
    @Override
    public String toString(){
        String st="";
        st+=this.magiaodich+"\t\t";
        st+=this.ngay+"\t\t";
        st+=this.dongia+"\t\t";
        st+=this.soluong+"\t\t";
        return st;
    }
    
    
}
