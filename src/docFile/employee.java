package docFile;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class employee extends Person{
	public String department;
	public double cSalary;
	public double exp;
	public int bSalary;
	public employee(String name, String adress, String gender, String df, String department, double cSalary,
			double exp, int bSalary) {
		super(name, adress, gender, df);
		this.department = department;
		this.cSalary = cSalary;
		this.exp = exp;
		this.bSalary = bSalary;
	}
	public  employee ()
	{}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getcSalary() {
		return cSalary;
	}
	public void setcSalary(double cSalary) {
		this.cSalary = cSalary;
	}
	public double getExp() {
		return exp;
	}
	public void setExp(double exp) {
		this.exp = exp;
	}
	public int getbSalary() {
		return bSalary;
	}
	public void setbSalary(int bSalary) {
		this.bSalary = bSalary;
	}
	public double Salary()
	{
		double salary;
		salary = this.bSalary*this.cSalary*(1+ (this.exp/100));
		return salary;
	}
	public void showInfor() {
		super.showInfor();
		System.out.println("department:" + this.department);
		
		System.out.println("cSalary:" + this.cSalary);
		
		System.out.println("exp:" + this.exp);
		System.out.println("bSalary:" + this.bSalary);
		System.out.println("bSalary:" + this.Salary());
	}
	public void NhapDL()
	{
		
		Scanner input = new Scanner(System.in);
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("nhap vao ho ten:");
		this.name= input.nextLine();
		input.nextLine();
		System.out.println("nhap dia chi:");
		this.adress =input.next();
		input.nextLine();
		System.out.println("nhap vao ngay sinh:");
		this.birthday=input.next();
		
		df.setLenient(false);
		
		try {
			  df.parse(this.birthday);
			
		} catch (Exception e) {
			System.out.println("nhap sai ngay");
		}
		input.nextLine();
		System.out.println("nhap vao gioi tinh:");
		this.gender=input.nextLine();
		System.out.println("nhap vao phong ban:");
		this.department=input.nextLine();
		System.out.println("nhap vao he so luong:");
		this.cSalary=input.nextDouble();
		input.nextLine();
		System.out.println("nhap vao nam kinh nghiem:");
		this.exp=input.nextDouble();
		input.nextLine();
		System.out.println("nhap vao luong co ban:");
		this.bSalary=input.nextInt();
		this.showInfor();
		}
	

}
