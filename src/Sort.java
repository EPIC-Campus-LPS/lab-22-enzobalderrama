import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Sort {
    public static void radixSort() throws FileNotFoundException {
        ArrayList<String> unsortedList = new ArrayList<>();
        File file = new File("some_file.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            unsortedList.add(sc.nextLine());
        }


        ArrayList<String> sortedList = new ArrayList<>();
        int letterNum;
        for (int i = 0; i < unsortedList.size(); i++) {
            for (int j = 0; j < unsortedList.size(); j++) {
                String extraHassle = unsortedList.get(i);
                letterNum = Sort.toNum(extraHassle.substring(j,j+1).toLowerCase());
                if (sortedList.isEmpty()) {
                    sortedList.add(extraHassle);
                }
                else {
                    if (letterNum < Sort.toNum(sortedList.get(j).substring(j,j+1))) {
                        sortedList.add(j, extraHassle);
                    }
                    else {
                        sortedList.add(j-1, extraHassle);
                    }
                }
            }
        }
    }



    public static int toNum(String s){
        s.toLowerCase();
        return switch (s) {
            case "a" -> 1;
            case "b" -> 2;
            case "c" -> 3;
            case "d" -> 4;
            case "e" -> 5;
            case "f" -> 6;
            case "g" -> 7;
            case "h" -> 8;
            case "i" -> 9;
            case "j" -> 10;
            case "k" -> 11;
            case "l" -> 12;
            case "m" -> 13;
            case "n" -> 14;
            case "o" -> 15;
            case "p" -> 16;
            case "q" -> 17;
            case "r" -> 18;
            case "s" -> 19;
            case "t" -> 20;
            case "u" -> 21;
            case "v" -> 22;
            case "w" -> 23;
            case "x" -> 24;
            case "y" -> 25;
            case "z" -> 26;
            default -> -1;
        };
    }
}
