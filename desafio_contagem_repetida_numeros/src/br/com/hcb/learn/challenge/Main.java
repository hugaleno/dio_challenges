package br.com.hcb.learn.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    SortedMap<Integer, Integer> countMap = new TreeMap<>();
    List<Integer> numberList = new ArrayList<>();
    int numValues = sc.nextInt();

    while (numValues-- > 0) {
      numberList.add(sc.nextInt());
    }

    numberList.forEach(number -> countMap.compute(number, (key, value) -> value == null ? 1 : value + 1));
    countMap.forEach((key, value) -> System.out.printf("%d aparece %d vez(es)\n", key, value));

    sc.close();
  }
}
