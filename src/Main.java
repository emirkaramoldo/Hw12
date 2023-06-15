import java.util.ArrayList;
import java.util.Collections;
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
        System.out.println(musicalInstruments);
        System.out.println(musicalInstruments2);
        Collections.sort(musicalInstruments);
        Collections.sort(musicalInstruments2);
        Collections.reverse(musicalInstruments2);
        System.out.println(musicalInstruments);
        System.out.println(musicalInstruments2);
        musicalInstruments3.addAll(musicalInstruments);
        musicalInstruments3.addAll(musicalInstruments2);
        System.out.println(musicalInstruments3);
    }
}