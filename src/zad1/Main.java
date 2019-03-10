import java.util.*;

public class Main {
    public static void menu() {
        System.out.println("1. Wpisz wartość");
        System.out.println("2. Wyświetl liczbę unikatowych wartości");
        System.out.println("0. Wyjdź");
        System.out.print("Wybór: ");
    }

    public static void main(String[] args) {
        Set<Integer> valueList = new HashSet<>();
        for(;;) {
            menu();
            Scanner input = new Scanner(System.in);
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("Podaj liczbę całkowitą: ");
                    int number = input.nextInt();
                    valueList.add(number);
                break;
                case 2:
                    System.out.println("Liczba unikatowych elementów: "+valueList.size());
                break;
                case 0:
                    System.exit(0);
                break;
                default:
                    System.out.println("Nie ma takiego wyboru");
                break;
            }
        }
    }
}
