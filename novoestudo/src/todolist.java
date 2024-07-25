import java.sql.Time;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class todolist {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        inicio();
    }

    public static void inicio() throws InterruptedException{
        LocalDate data = LocalDate.now();
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String datanova = dateFormat.format(data);
      System.out.println("*TODO-LIST: " +datanova+ "*");
      Thread.sleep(400);
      System.out.println("gostaria de adicionar uma tarefa? (Y/n)");
   
    
   
    }
}