import java.util.ArrayList;
import java.util.Scanner;


public class Main{
    public static ArrayList<Nhanvien> danhsachnhanvien = new ArrayList<>();
    public static void main(String[] args){
        nhapDanhSachNhanVien();
        hienThiDanhSachNhanVien();
        themNhanVien();
        hienThiDanhSachNhanVien();
        xoaNhanVien();
        hienThiDanhSachNhanVien();
    }

    public static void nhapDanhSachNhanVien() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <10;i++) {
            Nhanvien nv=new Nhanvien(i+1,"Nhanvien"+(i+1),25+i,"Department"+(i+1),"NV00"+(i+1),5000+(i+1)*100);
                       danhsachnhanvien.add(nv);                                                                                                     
                 }

    }
    public static void hienThiDanhSachNhanVien(){
        System.out.println("Danh Sach nv: ");
        for(Nhanvien nv : danhsachnhanvien){
            nv.output();
        }
    }
    public static void themNhanVien(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Thong Tin Cho Nhan Vien Moi: ");
        System.out.println("Id: ");
        int id= sc.nextInt();
        System.out.println("Ten");
        String name= sc.next();
        System.out.println("Tuoi");
        int age=sc.nextInt();
        System.out.println("Phong Ban");
        String department= sc.next();
        System.out.println("Ma~: ");
        String code= sc.next();
        System.out.println("Luong: ");
        double salaryrate=sc.nextDouble();
        Nhanvien nv=new Nhanvien(id,name,age,department,code,salaryrate);
        danhsachnhanvien.add(nv);

    }
    public static void xoaNhanVien(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ID cua nhan vien muon xoa");
        int id=sc.nextInt();
        for(int i=0;i<danhsachnhanvien.size();i++){
            if(danhsachnhanvien.get(i).getId()==id){
                danhsachnhanvien.remove(i);
                System.out.println("Da xoa nhan vien co id "+id);
                return;
            }
        }
        System.out.println("Khong tim thay nhan vien co id"+id);
    }



}