import java.util.Scanner;

public class Nhanvien{
    private int id;
    private String name;
    private int age;
    private String department;
    private String code;
    private double salaryrate;
    public Nhanvien(){}

       
       
       
    public Nhanvien(int id, String name, int age, String department, String code, double salaryrate){
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.code = code;
        this.salaryrate = salaryrate;
    }
    public void setId(int id){
     this.id = id;} ;
    public int getId(){
        return this.id;
    }  
    public void setName(String name){
        this.name = name;}
    public String getName(){
        return this.name;
    }
    //getter/setter age
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public String getDepartment(){
        return this.department;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCode(){
        return this.code;
    }
    public void setSalaryrate(double salaryrate){
        this.salaryrate=salaryrate;
    }
    public double getSalaryrate(){
        return this.salaryrate;
    }
    //Phuong thuc nhap thong tin cua nhan vien tu ban phim
    public void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap id: ");
        setId(sc.nextInt());
        System.out.println("Nhap ten: ");
        setName(sc.next());
        System.out.println("Nhap Tuoi: ");
        setAge(sc.nextInt());
        System.out.println("Nhap Phong Ban: ");
        setDepartment(sc.next());
        System.out.println("Nhap ma: ");
        setCode(sc.next());
        System.out.println("Nhap Luong:");	
        setSalaryrate(sc.nextDouble());
    }
    //Phuong thuc output de hien thi thong tin cua nhan vien ra man hinh
    public void output(){
        System.out.println("ID:"+getId());
        System.out.println("Ten:"+getName());
        System.out.println("Tuoi:"+getAge());
        System.out.println("Phong Ban:"+getDepartment());
        System.out.println("Ma:"+getCode());
        System.out.println("Luong:"+getSalaryrate());

    }
    


}