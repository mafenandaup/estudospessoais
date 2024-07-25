
import java.util.Scanner;

public class então {

    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        start();
        String name = sc.nextLine();
        nome(name);
    
    }

    public static void reps(int i) {
        
    }

    public static void start() throws InterruptedException {
        System.out.println("Olá, sou o Simpático Automático");
        Thread.sleep(1000);
        System.out.println("Preciso tirar uma dúvida");
        Thread.sleep(1300);
        System.out.println("...");
        Thread.sleep(2500);
        System.out.println("Qual seu nome, afinal?");

    }
    public static void nome(String s) throws InterruptedException  {
        String[] letras = new String[s.length()]; 
        char[] charLetras = s.replace(" ", "").toCharArray();
        for (int i = 0; i < s.length(); i++) {
            letras[i] = String.valueOf(charLetras[i]);
            System.out.println("Prazer em conhecê-lo, " +s);
            Thread.sleep(300);
        }
    }
}
