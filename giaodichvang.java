
package Giaodich;

public class giaodichvang extends giaodich{
    private String loaivang;

    public giaodichvang(String loaivang,String magiaodich, String ngay, int dongia, int soluong) {
        super(magiaodich, ngay,dongia, soluong);
        this.loaivang = loaivang;
    }
    public giaodichvang() {
        super();
        this.loaivang = "";
    }

    public String getLoaivang() {
        return loaivang;
    }

    public void setLoaivang(String loaivang) {
        this.loaivang = loaivang;
    }

        @Override
    public String toString(){
        String st="";
        st+=super.toString();
        st+=this.loaivang+"\t\t";
        return st;
        
    }
    
}
