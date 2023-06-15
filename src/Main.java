import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        ArrayList<String> musicalInstruments = new ArrayList<>();
        ArrayList<String> musicalInstruments2 = new ArrayList<>();
        ArrayList<String> musicalInstruments3 = new ArrayList<>();
        while (i < 10){
            System.out.println("Введите значение");
            String name = input.next();
            i++;
            System.out.println(name);
            System.out.println(i);
            if(i <= 5){
                musicalInstruments.add(name);
            }
            else {
                musicalInstruments2.add(name);
            }
        }
    }
}