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
        musicalInstruments3.set(0, musicalInstruments.get(0));
        musicalInstruments3.set(1, musicalInstruments2.get(0));
        musicalInstruments3.set(2, musicalInstruments.get(1));
        musicalInstruments3.set(3, musicalInstruments2.get(1));
        musicalInstruments3.set(4, musicalInstruments.get(2));
        musicalInstruments3.set(5, musicalInstruments2.get(2));
        musicalInstruments3.set(6, musicalInstruments.get(3));
        musicalInstruments3.set(7, musicalInstruments2.get(3));
        musicalInstruments3.set(8, musicalInstruments.get(4));
        musicalInstruments3.set(9, musicalInstruments2.get(4));
        System.out.println(musicalInstruments3);
        musicalInstruments3.sort(new SortClass());
        System.out.println(musicalInstruments3);
    }
}

//Данные для ввода, можно копировать и вставить всю строку
//musicalInstruments (Гитара, Аккустика, Электрогитара, Басс, Укулеле)
//musicalInstruments2 (Пианино, Рояль, Фортепиано, Орган, Клавесин)