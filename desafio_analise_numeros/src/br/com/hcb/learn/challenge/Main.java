package br.com.hcb.learn.challenge;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    Map<String, Integer> helperMap = new HashMap<>();
    helperMap.put("pairNumber", 0);
    helperMap.put("oddNumber", 0);
    helperMap.put("positiveNumber", 0);
    helperMap.put("negativeNumber", 0);

    int number;
    for (int i = 0; i < 5; i++) {
      number = leitor.nextInt();
      if (number > 0) {
        helperMap.put("positiveNumber", helperMap.get("positiveNumber") + 1);
      } else if (number < 0) {
        helperMap.put("negativeNumber", helperMap.get("negativeNumber") + 1);
      }
      if (Math.abs(number) % 2 == 0) {
        helperMap.put("pairNumber", helperMap.get("pairNumber") + 1);
      } else {
        helperMap.put("oddNumber", helperMap.get("oddNumber") + 1);
      }
    }

    System.out.println(helperMap.get("pairNumber") + " valor(es) par(es)");
    System.out.println(helperMap.get("oddNumber") + " valor(es) impar(es)");
    System.out.println(helperMap.get("positiveNumber") + " valor(es) positivo(s)");
    System.out.println(helperMap.get("negativeNumber") + " valor(es) negativo(s)");

    leitor.close();
  }
}
