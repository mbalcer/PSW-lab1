import java.util.Scanner;

public class Zad2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String liczba = scanner.next();
        int licznik = 0;
        
        for(int i = 0; i < liczba.length()-2; i++){
            if(liczba.charAt(i) == '1'){
                for(int j = i + 1; j < liczba.length(); j++){
                    if(liczba.charAt(j) == '1'){
                        if(j - i > 1){
                            licznik++;}
                        break;
                    }
                }
            }
        }
        System.out.println(licznik);
    }
}
