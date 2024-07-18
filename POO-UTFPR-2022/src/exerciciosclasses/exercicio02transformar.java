package exerciciosclasses;
import java.util.Scanner;

public class exercicio02transformar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer x = 10;
		double  y = x.doubleValue();
		System.out.println("valor : " + y);
		
		
		String num = "-24";
		int z = Integer.parseInt(num);
		System.out.println("valor : " + z);
		
		
		Integer b = 10;
		String intConvertido = b.toString();
		System.out.println("valor convertido : " + intConvertido);
		
		
		double c = 10.43;
		//String doubleConvertido = c.toString();
		//System.out.println("valor convertido : " + doubleConvertido);
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("valor do 1 : ");
		int v1 = ent.nextInt();
		System.out.println("valor do 2 : ");
		int v2 = ent.nextInt();
		
		System.out.println("Maior valor entre os dois: " + Math.max(v1, v2));
		System.out.println("Raiz quadrada de " + v1 + ": " + Math.sqrt(v1));
		System.out.println(v1 + "^" + v2 + ": " + Math.pow(v1, v2));
		
		ent.close();
		
		
		Scanner ent2 = new Scanner(System.in);
		
		System.out.println("valor do 1 : ");
		double graus = ent2.nextDouble();
		double rad = Math.toRadians(graus);
		System.out.println("Seno do angulo: " + Math.sin(rad));
		System.out.println("Cosseno do angulo: " + Math.cos(rad));
		System.out.println("Tangente do angulo: " + Math.tan(rad));
		
		ent.close();
		
		
		
	}

}
