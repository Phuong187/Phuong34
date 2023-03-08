package Lab2;
    import java.util.Scanner;
    
public class Bai3 {

	 int Age=2023-YearofBirth;
		if(Age<16)
		{
			System.out.println("Ban"+""+name+"o do tuoi vi thanh nien");
		} else if(Age>=16&&Age<18)
		{
			System.out.println("Ban "+""+name+" o do tuoi truong thanh");
		} 
		else if(Age>=18)  {
			System.out.println("Ban "+name+" da gia");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  System.out.println("Moi ban nhap ten: ");
  String name=sc.nextLine();
  System.out.println("moi ban nhap nam sinh");
  int YearofBirth=sc.nextInt();
  if(YearofBirth==0||YearofBirth<0) {
 	 System.err.println("Sai roi!Nhap lai di thim");
  }else {
  check(name, YearofBirth);
  }
	}

}
