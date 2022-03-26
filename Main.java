package sayiSiralama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner scanner=new Scanner(System.in);
		System.out.println("ilk sayıyı giriniz");
		num1=scanner.nextInt();
		System.out.println("ikinci sayıyı giriniz");
		num2=scanner.nextInt();
		System.out.println("üçüncü sayıyı giriniz");
		num3=scanner.nextInt();
		if(num1>num2&&num1>num3&&num2>num3) {
			System.out.println(num1+">"+num2+">"+num3);
		}else if(num1>num2&&num1>num3&&num2<num3) {
			System.out.println(num1+">"+num3+">"+num2);
		}else if(num2>num1&&num2>num3&&num1>num3) {
			System.out.println(num2+">"+num1+">"+num3);
		}else if(num2>num1&&num2>num3&&num1<num3) {
			System.out.println(num2+">"+num3+">"+num1);
		}else if(num3>num1&&num3>num2&&num1<num2) {
			System.out.println(num3+">"+num2+">"+num1);
		}else if(num3>num1&&num3>num2&&num1>num2) {
			System.out.println(num3+">"+num1+">"+num2);
		}
	}

}
