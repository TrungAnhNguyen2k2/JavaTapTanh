/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;
/**
 *
 * @author TrungAnhNguyen
 */
public class PTGT {
    private String Ma;
    private String Hang;
    private int NamSX;
    private double giaban;
    private String mau;
    public PTGT(){
        
    }
    public PTGT (String Ma,String Hang,int NamSX, double giaban, String mau){
        this.Ma=Ma;
        this.Hang=Hang;
        this.NamSX=NamSX;
        this.giaban=giaban;
        this.mau=mau;
    }
    public String getMa(){
        return Ma;
    }
    public String getHang(){
        return Hang;
    }
    public int getNamSX(){
        return NamSX;
    }
    public double getgiaban(){
        return giaban;
    }
    public String getmau(){
        return mau;
    }
    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public void setHang(String Hang) {
        this.Hang = Hang;
    }

    public void setNamSX(int NamSX) {
        this.NamSX = NamSX;
    }

    public void setgiaban(double giaban) {
        this.giaban = giaban;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }
    @Override
    public String toString(){
        return Ma + "\t" + Hang +"\t"+ NamSX +"\t"+mau;
    }
            
}

