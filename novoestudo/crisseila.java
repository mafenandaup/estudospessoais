
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.text.DecimalFormat;

public class crisseila {

	public static void main(String[] args) {

		nomemarca();
		System.out.println("");
		informações();
		System.out.println("");
		pedido();
	}

	public static void nomemarca() {
		System.out.println("VIVA GULA: DOCERIA E CAFÉ");
		System.out.println("Av. Luís Viana Filho, Shopping Paralela");
		System.out.println("(71)99999-9999");
		System.out.println("---------------------------------------");
		LocalDate data = LocalDate.now();
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String date = dateFormat.format(data);
		System.out.println("IMPRESSO EM " + date);

		LocalTime tempo = LocalTime.now();
		DateTimeFormatter tempoFormat = DateTimeFormatter.ofPattern("HH:mm");
		String time = tempo.format(tempoFormat);
		System.out.println(time);
		System.out.println("");
		System.out.println("***NÃO É DOCUMENTO FISCAL***");
		System.out.println("---------------------------------------");
	}

	public static void informações() {
		System.out.println("Cliente: MARIA FERNANDA");
		System.out.println("(71)99999-9999");
		System.out.println("(Entregar no endereço indicado)");
		System.out.println("Travessa Miguel Gustavo, Apto 766");
		System.out.println("Estação Brotas, Brotas, BA");
		System.out.println("");
		System.out.println("Entregador: Cecília | Setor #441");
		LocalDate data = LocalDate.now();
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String date = dateFormat.format(data);
		LocalTime tempo = LocalTime.now();
		DateTimeFormatter tempoFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
		String time = tempo.format(tempoFormat);
		System.out.println("ABERTO EM " + date + " ,  " + time);
	}

	public static void geneprint(int[] v) { // para gerar e imprimir o número do cartão
		Random rd = new Random ();
		for (int i = 0; i < v.length; i++) {
			v[i] = rd.nextInt(9);
		if (i<8) {
			System.out.print("X");
				
			}else {
				System.out.print(v[i]);
			}
		}
	}

	public static void pedido() {
		Random rd = new Random();
		int num = rd.nextInt(200);
		double limsup = 23.00;
		double liminf = 50.00;
		double taxa = 5.15;
		double valor = liminf + (limsup - liminf) * rd.nextDouble();
		DecimalFormat valorf = new DecimalFormat("##.##");
		String valornovo = valorf.format(valor);
		double total = valor + taxa;
		DecimalFormat totalf = new DecimalFormat("##.##");
		String totalnovo = totalf.format(total);
		System.out.println("           (Pedido N.: " + num + " )  ");
		System.out.println("ITEM (V.Unit.)                     Total");
		System.out.println("1 Fat. Torta Doce (" + valornovo + ")          " + valornovo);
		System.out.println("---------------------------------------");
		System.out.println("TOTAL:                             " + valornovo);
		System.out.println("+ Tx. Adicional                     " + taxa);
		System.out.println("= TOTAL A PAGAR:                   " + totalnovo);
		System.out.println("---------------------------------------");
		System.out.println("FORMA DE PAGAMENTO           VALOR PAGO");
		System.out.println("CT credito                         " +totalnovo);
		System.out.println("");
		System.out.println("NUM. CARTAO");
		int cartao[] = new int[12];
		geneprint(cartao);
		System.out.println("  ");
		System.out.println(" ");
		System.out.println("Atendente: Cecília");
		System.out.println("        ");
		System.out.println("                 ***                     ");
		System.out.println("         ");
		System.out.println("Obrigado por sua compra! Volte sempre =)");
	}
}
