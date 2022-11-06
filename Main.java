import java.util.Scanner;
public class Main {

    static boolean isPalindrom(int number){
        int temp = number ; //geçici değişken
        int reverseNumber = 0; //ters sayı
        int lastNumber;
        
        while(temp != 0){
            System.out.println("********************");
            System.out.println("Sayı: " + temp);
            lastNumber = temp % 10;
            System.out.println("Son basamak: "+lastNumber);
            reverseNumber = (reverseNumber*10)+ lastNumber;// son sayım artık tersten ilk sayım oldu
            System.out.println("Yeni sayı: "+reverseNumber);
            temp /= 10;

        }
        if(number == reverseNumber){
            System.out.println("Palindrom sayıdır");
        }
        else{
            System.out.println("Palindrom sayı değildir.");
        }
        return true;
    }

    public static void main(String[] args) {
    isPalindrom(234 );

    }
}
