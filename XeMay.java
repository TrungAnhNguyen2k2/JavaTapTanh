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
public class XeMay extends PTGT implements TinhGia{
    private double congsuat;

    public XeMay(double congsuat) {
        
    }

    public XeMay( String Ma, String Hang, int NamSX, double giaban, String mau, double congsuat) {
        super(Ma, Hang, NamSX, giaban, mau);
        this.congsuat = congsuat;
    }

    public double getCongsuat() {
        return congsuat;
    }

    public void setCongsuat(double congsuat) {
        this.congsuat = congsuat;
    }
    public double getgiaban(){
        Calendar c = Calendar.getInstance();
        int y=c.get(Calendar.YEAR);
        if (y - super.getNamSX()>=2)
            return (super.getgiaban()*0.95);
        else return getgiaban();
    }
    @Override
    public String toString() {
        return super.toString()+"\t"+ getgiaban() +"\t"+congsuat ;
    }
    
}
