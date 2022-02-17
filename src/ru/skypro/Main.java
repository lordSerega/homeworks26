package ru.skypro;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList(List.of("abc", "abc", "dfg", "ggg"));


        printOddNumbers(nums);
        printEvenUniqueSortedNumbers(nums);
        printUniqueWords(words);
        printCountDoubles(words);

    }

    private static void printCountDoubles(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println("Дублей " + (words.size() - uniqueWords.size()));
    }

    private static void printUniqueWords(List<String> words) {
        System.out.println("Уникальные слова : ");
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
    }

    private static void printEvenUniqueSortedNumbers(List<Integer> nums) {
        Set<Integer> uniqueTreeSet = new TreeSet<>(nums);
        System.out.println("Четные числа: ");
        for (int num : uniqueTreeSet) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

    }

    private static void printOddNumbers(List<Integer> nums) {
        System.out.println("Нечетные числа: ");
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

    }
}
