/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;
import java.util.ArrayList;
import java.util.*;
        
/**
 *
 * @author TrungAnhNguyen
 */
public class QLGT implements ChucNang{
    private List<PTGT> list;
    private Scanner in= new Scanner (System.in);
    public QLGT(){
        list =new ArrayList<>();
        list.add(new Oto("123","y",2021,8000,"do",4,"san"));
        
    }
    private int tontai(String ma){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getMa().equalsIgnoreCase(ma))
                return i;
        }
        return -1;
    }
    
    private PTGT nhap(){
        String Ma;
        String Hang;
        int NamSX;
        double giaban;
        String mau;
        String reg ="\\d{3}";
        while (true){
            System.out.println("Nhap Ma:");
            Ma=in.nextLine().toUpperCase();
            if(tontai(Ma)==-1 && Ma.matches(reg))
                break;
            System.out.println("Nhap lai"); 
        }
        System.out.println("Nhap Hang:");
        Hang=in.nextLine();
        System.out.println("Nhap Nam:");
        NamSX=Integer.parseInt( in.nextLine());
        System.out.println("Nhap Gia:");
        giaban =Double.parseDouble(in.nextLine()) ;
        System.out.println("Nhap Mau:");
        mau=in.nextLine();
        return new PTGT(Ma,Hang,NamSX,giaban,mau);
    }

    @Override
    public void nhapOto() {
        PTGT p = nhap();
        System.out.println("Nhap kieu dong co:");
        String k=in.nextLine();
        System.out.println("Nhap so cho");
        int sc = Integer.parseInt(in.nextLine());
        list.add(new Oto(p.getMa(),p.getHang(),p.getNamSX(),p.getgiaban(),p.getmau(),sc,k));
    }

    @Override
    public void nhapXeMay() {
        PTGT p = nhap();
        System.out.println("Nhap cong suat:");
        double cs=Double.parseDouble(in.nextLine());
        
        list.add(new XeMay(p.getMa(),p.getHang(),p.getNamSX(),p.getgiaban(),p.getmau(),cs));    
    }

    @Override
    public void vietDS() {
        System.out.println("DanhSachOto ");
        for (PTGT i: list ){
            if(i instanceof Oto){
                System.out.println(i);
            }
        }
        System.out.println("Danh sach xe may:");
        for(PTGT i:list){
            if(i instanceof XeMay){
                System.out.println(i);
            }
            System.out.println("------------------------------------");
            
        }
    }

    @Override
    public void sua() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void xoa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void timTheoHang() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void timTheoMa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void timTheoNam() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void timTheoMau() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sapxepTheoHang() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sapxepTheoMa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sapxepTheoNam() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sapxepTheoMau() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sapxepTheoGiaGiamDan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sapxepTheoGiaTangDan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void sapxepOtoTheoGia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void ThongKe() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
