/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;
import java.util.*;

/**
 *
 * @author TrungAnhNguyen
 */
public class Main {
    public static void main(String[] args) {
        QLGT q = new QLGT();
        while (true){
            System.out.println("Menu");
            System.out.println("1. Nhap Oto");
            System.out.println("2. Nhap xe may");
            System.out.println("3. Viet ra danh sach");
            System.out.println("4.");
            System.out.println("5.");
            System.out.println("6.");
            int chon;
            Scanner in =new Scanner(System.in);
            chon= in.nextInt();
            switch (chon){
                case 0: System.out.println("Bye");
                    System.exit(0);
                    break;
                case 1:
                    q.nhapOto();
                    break;
                case 2:
                    q.nhapXeMay();
                    break;
                case 3:
                    q.vietDS();
                    break;                    
                default: 
                    System.out.println("Chi chon tu 0->");
                    break;
                    
            }
        }
    }
}
