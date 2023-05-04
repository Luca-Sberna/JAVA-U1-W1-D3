public class Main {
//FUNZIONI
  public static boolean stringaPariDispari(String str) {
    int length = str.length();
    if (length % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean annoBisestile(int anno) {
    if (anno % 4 == 0) {
      if (anno % 100 == 0) {
        if (anno % 400 == 0) {
          return true;
        } else {
          return false;
        }
      } else {
        return true;
      }
    } else {
      return false;
    }
  }
//INIZIALIZZO , E APPLICO LE FUNZIONI
  public static void main(String[] args) {
    String str = "questa stringa è di prova";
    int anno = 2020;

    if (stringaPariDispari(str)) {
      System.out.println(str + " ha un numero pari di caratteri");
    } else {
      System.out.println(str + " ha un numero dispari di caratteri");
    }

    

    if (annoBisestile(anno)) {
      System.out.println(anno + " è un anno bisestile");
    } else {
      System.out.println(anno + " non è un anno bisestile");
    }

    
  }

}
