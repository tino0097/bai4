
package Giaodich;

public class giaodichtiente extends giaodich {
    private int tigia;
    private String tiente;

    public giaodichtiente(String tiente,int tigia,String magiaodich, String ngay, int dongia, int soluong) {
        super(magiaodich, ngay,dongia, soluong);
        this.tigia=tigia;
        this.tiente=tiente;
    }
    public giaodichtiente() {
        super();
        this.tigia=0;
        this.tiente="";
    }

    public int getTigia() {
        return tigia;
    }

    public void setTigia(int tigia) {
        this.tigia = tigia;
    }

    public String getTiente() {
        return tiente;
    }

    public void setTiente(String tiente) {
        this.tiente = tiente;
    }

        @Override
    public String toString(){
        String st="";
        st+=super.toString();
        st+=this.tiente;
        st+=this.tigia;
        return st;
    }
    
}
