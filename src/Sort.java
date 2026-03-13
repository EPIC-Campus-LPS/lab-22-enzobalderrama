import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Sort {
    /**
     * Uses the radix sort to take from a file and sort it with one ArrayList per letter making an overall big list
     * @throws IOException for when you're making a new file
     * Will print the full sorted list that comes from the new txt file
     */
    public static ArrayList<String> radixSort() throws IOException{
        ArrayList<String> unsortedList = new ArrayList<>();
        File file = new File("some_file.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            unsortedList.add(sc.nextLine());
        }


        ArrayList<String> sortedList = unsortedList;
        int max = -1;
        for (String s : sortedList) {
            if (s.length() > max) {
                max = s.length();
            }
        }
        int letterNum = 0;
        for (int i = max-1; i >= 0; i--) {
            ArrayList<ArrayList<String>> letterCats = new ArrayList<>(27);
            for (int j = 0; j < 27; j++) {
                letterCats.add(new ArrayList<String>());
            }
            for (String k: sortedList){
                letterNum = 0;
                if (i < k.length()){
                    letterNum = toNum(k.substring(i,i+1));
                }
                letterCats.get(letterNum).add(k);
            }

            sortedList.clear();
            for (ArrayList<String> loopOne : letterCats) {
                for (String loopTwo : loopOne) {
                    sortedList.add(loopTwo);
                }
            }
        }


        FileWriter writer = new FileWriter("some_file_key.txt");
        for (String str: sortedList){
            writer.write(str + System.lineSeparator());
        }
        writer.close();
        System.out.println(writer);
        return sortedList;
    }

    /**
     * @param s length 1 substring
     * @return number version of s, 1-26
     * If not applicable, return 0
     */
    public static int toNum(String s){
        s = s.toLowerCase();
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
            default -> 0;
        };
    }
}
