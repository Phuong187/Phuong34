package Lab2;
     import java.util.Scanner;
     
public class Bai4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Moi ban nhap vao so tu 1->12");
		int chon=sc.nextInt();
	   if(chon>=1&&chon<=12) {
		   System.out.println("Thang "+chon);
	   }
	   else {
		   System.err.println("Ban nhap khong dung ");
	   }
		
	  }
}
