import java.util.Scanner;
public class latihan5{
	public static void main(String[] args)
{ String output;
Scanner input = new Scanner(System.in);
System.out.print("Masukan Bilangan Positif atau Negatif = ");
int angka = input.nextInt();
if (angka >= 0){
	output = angka + ": Bilangan Positif";
	} else if(angka <0){
		output =angka +": Bilangan Negatif";
		
	}else {
		output=angka +"Bilangan bukan Positif,maupun Negatif";}
		System.out.println(output);
	}
}