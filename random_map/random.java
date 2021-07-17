import java.util.Scanner;


public class random {
	public static void main(String[] args) {
		int a;
		int b;
		int a1, b1;
		int a2, b2;
		int a3, b3;
		int coor;
		for(int i = 0; i < 5; i++){
			a = (int)(180-(Math.random()*360));
			b = (int)(90-(Math.random()*180));
			a1 = (int)(Math.random()*60);
			b1 = (int)(Math.random()*60);
			a2 = (int)(Math.random()*60);
			b2 = (int)(Math.random()*60);
			a3 = (int)(Math.random()*60);
			b3 = (int)(Math.random()*60);
			coor = (int)(Math.random()*2);
			if(a > 0){
				System.out.println(Math.abs(a)+"°" +a1+"'"+a2+"."+a3+ '"' + "E");
			}
			else if(a == 0){
				System.out.printf(Math.abs(a)+"°" +a1+"'"+a2+"."+a3+ '"');
				if(coor == 0){
					System.out.println("E");
				}
				else if(coor == 1){
					System.out.println("W");
				}
			}
			else if(a < 0){
				System.out.println(Math.abs(a)+"°" +a1+"'"+a2+"."+a3+ '"' + "W");
			}
			if(b > 0){
				System.out.println(Math.abs(b)+"°" +b1+"'"+b2+"."+b3+ '"' + "N");
			}
			else if(b == 0){
				System.out.printf(Math.abs(a)+"°" +b1+"'"+b2+"."+b3+ '"');
				if(coor == 0){
					System.out.println("N");
				}
				else if(coor == 1){
					System.out.println("S");
				}
			}
			else if(b < 0){
				System.out.println(Math.abs(b)+"°" +b1+"'"+b2+"."+b3+ '"' + "S");
			}
			System.out.println();
		}
	}
}
