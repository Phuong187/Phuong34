package Lab2;
import java.awt.Checkbox;
import java.util.Scanner;




public class Bai1 {
	public static double Sumtwonumers(double a, double b) {
		double sum = 0;
		return sum = a + b;
	}


	public static double Differenceoftwonumbers(double a, double b) {


		double Result = 0;
		return Result = a - b;
	}


	public static double laydu(double a, double b) {
		 double laydu ;
		if (b == 0) {
			System.out.println("Khong thuc hien duoc phep chia ->Mau phai khac 0");
			return 0;
		}
		return laydu=a%b;
	}


	public static double tich(double a, double b) {
		double tich ;
		return tich = a * b;
	}
     public static void  Check(float a,float b) {
    	 if(a>b) {
    		 System.out.println("a>b");
    	 }else {
    		 System.out.println("a<b");
    	 }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi ban nhap so thu nhat : ");
		int a = sc.nextInt();
		System.out.println("Moi ban nhap so thu hai");
		int b = sc.nextInt();
		System.out.println("Tong cua" + " " + a + "+" + b + "la= " + Sumtwonumers(a, b));
		System.out.println("Hieu cua" + " " + a + "-" + b + "la= " + Differenceoftwonumbers(a, b));
		System.out.println("Du cua " + " " + a + "%" + b + "la= " + laydu(a, b));
		System.out.println("Tich cua" + " " + a + "*" + b + "la= " + tich(a, b));
	    Check(a, b);
 
 
	}


}


}
