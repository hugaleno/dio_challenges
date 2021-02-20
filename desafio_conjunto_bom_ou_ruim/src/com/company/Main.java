package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    List<String> group = new ArrayList<>();
    String line;
    int tamGroup = Integer.parseInt(br.readLine());
    do {
      line = br.readLine();
      if (tamGroup-- > 0) {
        group.add(line);
      } else {
        tamGroup = Integer.parseInt(line);
        if (isBadGroup(group)) {
          System.out.println("Conjunto Ruim");
        } else {
          System.out.println("Conjunto Bom");
        }
        group.clear();
        if (tamGroup == 0) {
          break;
        }
      }
    } while (line != null);
  }

  public static boolean isBadGroup(List<String> group) {
    for (int i = 0; i < group.size(); i++) {
      for (int j = 0; j < group.size(); j++) {
        if (i == j) {
          continue;
        }
        if (group.get(j).startsWith(group.get(i))) {
          return true;
        }
      }
    }
    return false;
  }
}
