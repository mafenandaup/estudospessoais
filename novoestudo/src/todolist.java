import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class todolist {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        inicio();
        newtask();
    }

    public static void inicio() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        LocalDate data = LocalDate.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String datanova = dateFormat.format(data);
        System.out.println("*TODO-LIST: " + datanova + "*");
        Thread.sleep(400);
        System.out.println("--------------");
    }

    public static void newtask() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gostaria de adicionar uma tarefa? (Y/n)");
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase("Y")) {
            System.out.println("Digite a tarefa que gostaria de inserir:");
            String tarefa = sc.nextLine();
            // Aqui você pode fazer algo com a variável 'tarefa', como armazená-la em uma
            // lista, por exemplo.
        } else if (answer.equalsIgnoreCase("N")) {
            inicio();
            newtask();
        }
    }
}
