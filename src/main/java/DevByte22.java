/*
sentence1 = "the quick", sentence2 = "brown fox", return ["the", "quick", "brown", "fox"]
sentence1 = "the tortoise beat the haire", sentence2 = "the tortoise lost to the haire", return ["beat", "to", "lost"]
sentence1 = "copper coffee pot", sentence2 = "hot coffee pot", return ["copper", "hot"]


 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DevByte22 {

    public static List<String> removeDuplicates(String s1, String s2) {
        String[] tokens1 = s1.split(" ");
        String[] tokens2 = s2.split(" ");

        Set<String> duplicateChecker = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        filterDuplicates(duplicateChecker, duplicates, tokens1);
        filterDuplicates(duplicateChecker, duplicates, tokens2);

        List<String> soln = new ArrayList<>();
        for (String token : tokens1) {
            if (!duplicates.contains(token)) soln.add(token);
        }

        for (String token: tokens2) {
            if (!duplicates.contains(token)) soln.add(token);
        }
        return soln;

    }

    private static void filterDuplicates(Set<String> checker, Set<String> duplicates, String[] tokens) {
        for (String token : tokens) {
            if (checker.contains(token)) duplicates.add(token);
            checker.add(token);
        }


    }

    public static void main(String[] args){

        String s1="the tortoise beat the haire";
        String s2="the tortoise lost to the haire";

        System.out.println(removeDuplicates(s1,s2));

    }

}
