import java.util.Scanner;


public class random {
	public static void main(String[] args) {
		int a;
		int b;
		int a1, b1;
		int a2, b2;
		int a3, b3;
		for(int i = 0; i < 5; i++){
			a = (int)(180-(Math.random()*360));
			b = (int)(90-(Math.random()*180));
			a1 = (int)(Math.random()*60);
			b1 = (int)(Math.random()*60);
			a2 = (int)(Math.random()*60);
			b2 = (int)(Math.random()*60);
			a3 = (int)(Math.random()*60);
			b3= (int)(Math.random()*60);
			if(a > 0){
				System.out.println(Math.abs(a)+"¢X" +a1+"'"+a2+"."+a3+ '"' + "E");
			}
			else if(a < 0){
				System.out.println(Math.abs(a)+"¢X" +a1+"'"+a2+"."+a3+ '"' + "W");
			}
			if(b > 0){
				System.out.println(Math.abs(b)+"¢X" +b1+"'"+b2+"."+b3+ '"' + "N");
			}
			else if(b < 0){
				System.out.println(Math.abs(b)+"¢X" +b1+"'"+b2+"."+b3+ '"' + "S");
			}
			System.out.println();
		}
	}
}