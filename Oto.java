/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.Calendar;

/**
 *
 * @author TrungAnhNguyen
 */
public class Oto extends PTGT implements TinhGia{
    private int soChoNgoi ;
    private String KieuDongCo;
    
    public Oto(){
        super();
    }

    public Oto(String Ma, String Hang, int NamSX, double giaban, String mau, int soChoNgoi, String KieuDongCo) {
        super(Ma, Hang, NamSX, giaban, mau);
        this.soChoNgoi = soChoNgoi;
        this.KieuDongCo = KieuDongCo;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public String getKieuDongCo() {
        return KieuDongCo;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public void setKieuDongCo(String KieuDongCo) {
        this.KieuDongCo = KieuDongCo;
    }
    public double getgiaban(){
        Calendar c = Calendar.getInstance();
        int y=c.get(Calendar.YEAR);
        if (y - super.getNamSX()>=2)
            return (super.getgiaban()*0.85);
        else return super.getgiaban();
    }
    @Override
    public String toString() {
        return super.toString()+"\t"+ getgiaban() +"\t"+KieuDongCo+"\t"+soChoNgoi;
    }
    
}
