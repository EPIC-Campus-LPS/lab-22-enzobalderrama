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


        ArrayList<String> sortedList = unsortedList;
        int letterNum;
        for (int i = unsortedList.size(); i >= 0; i--) {
            ArrayList<ArrayList<String>> letterCats = new ArrayList<>(27);
            for (int j = 0; j < 27; j++) {
                letterCats.add(new ArrayList<String>());
            }
            for
        }




        File newFile = new File("some_file_key.txt");
        writeFile(outputName, sortedResult);
    }

//String extraHassle = unsortedList.get(i);
//                letterNum = Sort.toNum(extraHassle.substring(j,j+1).toLowerCase());
//                if (sortedList.isEmpty()) {
//                    sortedList.add(extraHassle);
//                }
//                else {
//                    if (letterNum < Sort.toNum(sortedList.get(j).substring(j,j+1))) {
//                        sortedList.add(j, extraHassle);
//                    }
//                    else {
//                        sortedList.add(j-1, extraHassle);
//                    }
//                }
    //// This is the core Radix Sort logic using your toNum concept
    //    public static ArrayList<String> radixSort(ArrayList<String> list, int maxLen) {
    //        ArrayList<String> currentList = list;
    //
    //        // We go from the LAST character to the FIRST (LSD Radix Sort)
    //        for (int d = maxLen - 1; d >= 0; d--) {
    //            // 1. Create 27 buckets (0 for 'end of word', 1-26 for a-z)
    //            ArrayList<ArrayList<String>> buckets = new ArrayList<>(27);
    //            for (int i = 0; i < 27; i++) buckets.add(new ArrayList<>());
    //
    //            // 2. Put each word into a bucket based on the character at position d
    //            for (String word : currentList) {
    //                int charIdx;
    //                if (d < word.length()) {
    //                    // Use your toNum logic on the specific character
    //                    charIdx = toNum(word.substring(d, d + 1));
    //                } else {
    //                    charIdx = 0; // Word is shorter than d, goes to the "empty" bucket
    //                }
    //                buckets.get(charIdx).add(word);
    //            }
    //
    //            // 3. Collect words back from buckets into the list
    //            ArrayList<String> nextPass = new ArrayList<>();
    //            for (ArrayList<String> bucket : buckets) {
    //                nextPass.addAll(bucket);
    //            }
    //            currentList = nextPass;
    //        }
    //        return currentList;
    //    }

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
            default -> -1;
        };
    }
}
