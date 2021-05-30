import java.util.Scanner;
public class ConversoDeFparaC{
    public static void main(String args[]) {
	
	double temperaturaC,temperaturaF;
	
	Scanner s = new Scanner(System.in);
	
	System.out.println("Insira a temperatura em Fahrenheit:\n");
	
	 temperaturaF= s.nextDouble();
	
	temperaturaC=((temperaturaF-32)/1.8);
	
	System.out.println(temperaturaF+ " graus Fahrenheit = "+ temperaturaC +" graus Celsius");
}
    }
