
import java.util.Random;
import java.util.Scanner;

public class então {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        start();
        String name = sc.nextLine();
        nome(name);
        System.out.println("vou fazer outra coisa bem legal");
        Thread.sleep(2000);
        chars(name);

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

    public static void nome(String s) throws InterruptedException {
        String[] letras = new String[s.length()];
        char[] charLetras = s.replace(" ", "").toCharArray();
        for (int i = 0; i < s.length(); i++) {
            letras[i] = String.valueOf(charLetras[i]);
            System.out.println("Prazer em conhecê-lo, " + s);
            Thread.sleep(300);
        }
    }

    public static void chars(String s) throws InterruptedException {
        String[] letras = new String[s.length()];
        char[] charLetras = s.replace(" ", "").toCharArray();
        Random rd = new Random();
        int tempo = rd.nextInt(41);
        int cont = 0;

        do {
            for (int i = s.length(); i > 0; i--) {
                System.out.println(new String(charLetras, 0, i));
                Thread.sleep(100);
            }
            for (int i = 0; i < s.length(); i++) {
                System.out.println(new String(charLetras, 0, i + 1));
                Thread.sleep(100);

            }
            Thread.sleep(100);
            cont++;

        } while (cont < tempo);

        System.out.println("O código foi executado por aproximadamente " + tempo + " segundos.");

    }
}
