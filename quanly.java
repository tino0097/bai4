
package Giaodich;

import java.util.ArrayList;
import java.util.Scanner;

public class quanly  {
    ArrayList<giaodichvang> listv=new ArrayList();
    ArrayList<giaodichtiente> listtt=new ArrayList();
    Scanner sc=new Scanner(System.in);
    public giaodichvang Giaodichvang(){
        String magiaodich=sc.nextLine();
        String ngay=sc.nextLine();
        int dongia=sc.nextInt();
        int soluong=sc.nextInt();
        sc.nextLine();
        String loaivang=sc.nextLine();;
        giaodichvang ggv1=new giaodichvang( loaivang,magiaodich,  ngay, dongia,  soluong);
       
        return ggv1;
    }
    
    public void nhapv(){
        String traloi;
        
        do{ 
            this.listv.add(this.Giaodichvang());
            System.out.println("MOI BAN NHAP TIEP");
            traloi=sc.next();
        }while(traloi.equals("c"));
        
    }
    //System.out.println("MAGIAODICH\tNGAYGIAODICH\tDONGIA\tSOLUONG\\ttLOAIVANG");
    public int thanhtienv(){
        int a=0;
        System.out.println("THANHTIEN");
        for(int i=0;i<listv.size();i++){
            int b=listv.get(i).getSoluong()*listv.get(i).getDongia();
            a+=b;
        }
        return a;
    }
    public int tongslgdv(){
        int a=0;
        for(int i=0;i<listv.size();i++){
            int b=listv.get(i).getSoluong();
            a+=b;
        }
        return a;
    }
    
    public giaodichtiente Giaodichtt(){
        String magiaodich=sc.nextLine();
        String ngay=sc.nextLine();
        int dongia=sc.nextInt();
        int soluong=sc.nextInt();
        int tigia=sc.nextInt();
        sc.nextLine();
        String tiente=sc.nextLine();
        giaodichtiente gdtt=new giaodichtiente( tiente,tigia, magiaodich, ngay, dongia, soluong);
        return gdtt;
    }
    
    public void nhaptt(){
        String traloi;
        do{ 
            this.listtt.add(this.Giaodichtt());
            System.out.println("MOI BAN NHAP TIEP");
            traloi=sc.next();
        }while(traloi.equals("c"));  
    }
    
        public int tongslgdtt(){
        int a=0;
        for(int i=0;i<listtt.size();i++){
            int b=listtt.get(i).getSoluong();
            a+=b;
        }
        return a;
    }
    public double tbthanhtientt(){
        int a=0;
        int d=0;
        System.out.println("THANHTIEN");
        for(int i=0;i<listtt.size();i++){
            if("usd".equals(listtt.get(i).getTiente()))  
            {
            int b=listtt.get(i).getSoluong()*listtt.get(i).getDongia()*listtt.get(i).getTigia();
            a+=b;
            }
            else if("vnd".equals(listtt.get(i).getTiente()))
            {
            int c=listtt.get(i).getSoluong()*listtt.get(i).getDongia();
            d+=c;
            }
            else
                return 0;
            
        }
        return (double)(a+d)/listtt.size();
    }     
   
public void dongia1tyv(){
    System.out.println("MAGIAODICH\tNGAYGIAODICH\tDONGIA\tSOLUONG\\ttLOAIVANG");
    for(int i=0;i<listv.size();i++){
    if(listv.get(i).getDongia()>1000)
    {
        System.out.println(listv.get(i).toString());
    }
    else
        System.out.println("");
}
} 

public void dongia1tytt(){
    System.out.println("MAGIAODICH\tNGAYGIAODICH\tDONGIA\tSOLUONG\tTIGIA\tLOAITIEN");
    for(int i=0;i<listtt.size();i++){
    if(listtt.get(i).getDongia()>1000)
    {
        System.out.println(listtt.get(i).toString());
    }
    else
        System.out.println("");
}
} 
    
}
