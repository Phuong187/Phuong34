package bài8;
import java.util.Scanner;
public class BAI8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n,sodu,tong=0;
		System.out.println(" Mời bạn nhập số nguyên: ");
        n=sc.nextInt();
       int count =0;

     while(n > 0) {
    	    sodu=n%10;
    	   n=n/10;
    	   tong+=sodu;
    	   count++;
    }
      int tbc=tong/count;
     System.out.println("Trung bình cộng của số nguyên vừa nhập là: "+tbc);
	}

}
