import java.util.Scanner;

public class Main extends Definitions {
	
	public static void main(String[] args) {

    input = new Scanner(System.in);
    System.out.print("Bir harf yazınız: ");
    String veri = input.nextLine();
    
    String buyukHarfeDonustur = veri.toUpperCase();
    char harf = buyukHarfeDonustur.charAt(0);
    
    Operations operations = new Operations();
    switch(harf) {
    	case 'A':
    	case 'I':
    	case 'O':
    	case 'U':
    		operations.KalinSesliHarf();
    		break;
    		default:
    			operations.InceSesliHarf();
    			
    }
    
  }
	
}