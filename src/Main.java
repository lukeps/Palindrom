import java.util.Arrays;
import java.util.Scanner;

public class Main {
    Scanner skaner = new Scanner(System.in);
    String slowowpisane = skaner.nextLine();
    char[] c = slowowpisane.toCharArray();
    char tymczasowe;
    String slowo1;

    String naWspak(){
        for(int i=0;i<c.length-1;i++) {
            for (int j = i; j < c.length-1; j++) {

                tymczasowe = c[i];
                c[i] = c[j + 1];
                c[j+1] = tymczasowe;
            }

        }
        slowo1 = new String(c);
        return slowo1;
    }


    void wypiszPo(){

        System.out.print(" " + naWspak());

    }

    boolean czyPalindrom(){

        if(slowowpisane.equals(slowo1))
            return true;

        return false;
    }

    public static void main(String[] args) {

        Main obiekt = new Main();

        System.out.println("Przed zmiana kolejnosci:" + " " + obiekt.slowowpisane );
        System.out.print("Po zmianie kolejnosci:" );
        obiekt.wypiszPo();
        System.out.println();
        System.out.println("Czy palindrom?" + " " +  obiekt.czyPalindrom());








        }
    }


