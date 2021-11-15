import java.util.Scanner;
public class Llab1 {
	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		

		Scanner in = new Scanner(System.in);

		System.out.print("Введите a: ");
		a = in.nextInt();
		System.out.print("Введите b: ");
		b = in.nextInt();
		System.out.print("Введите c: ");
		c = in.nextInt();
		System.out.print("Введите d: ");
		d = in.nextInt();

		if ((a < b) && (a < c) && (a < d)) {
		System.out.println("А - наименьшее");
		} else if ((b < a) && (b < c) && (b < d)) {
		System.out.println("B - наименьшее");
		} else if ((c < a) && (c < b) && (c < d)) {
		System.out.println("С - наименьшее");
		} else if ((d < a) && (d < b) && (d < c)) {
		System.out.println("D наименьшее");
		} in.close();}
}
