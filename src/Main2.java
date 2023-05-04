import java.util.Scanner;

public class Main2 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // CHIEDI ALL'UTENTE DI INSERIRE UN NUMERO
    System.out.print("Inserisci un numero: ");
    int num = input.nextInt();
    input.close();

    // UTILIZZO IL COSTRUTTO SWITCH PER STAMPARE IN LETTERE 
    switch (num) {
      case 0:
        System.out.println("Zero");
        break;
      case 1:
        System.out.println("Uno");
        break;
      case 2:
        System.out.println("Due");
        break;
      case 3:
        System.out.println("Tre");
        break;
      default:
        System.out.println("Valore inserito non valido.");
        break;
    }
  }

}
