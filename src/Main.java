public class Main {
//FUNZIONI
  public static boolean stringaPariDispari(String str) {
    int length = str.length();
    return length % 2 == 0;
    }
    
  public static boolean annoBisestile(int anno) {
	  return anno % 4 == 0 || anno % 100 == 0 && anno % 400 == 0 ? true : false; 
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
