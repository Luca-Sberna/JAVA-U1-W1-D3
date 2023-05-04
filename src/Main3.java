import java.util.Scanner;

public class Main3 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String str;

    do {
      System.out.print("Inserisci una stringa (digita ':q' per uscire): ");
      str = input.nextLine();

      if (!str.equals(":q")) {
        String[] caratteri = str.split("");
        System.out.print("Caratteri: ");
        for (String carattere : caratteri) {
          System.out.print(carattere + ",");
        }
        System.out.println();
      }

    } while (!str.equals(":q"));

    input.close();
  }

}
