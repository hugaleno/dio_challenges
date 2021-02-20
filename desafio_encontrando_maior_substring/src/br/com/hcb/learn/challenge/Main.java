package br.com.hcb.learn.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

  static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  static PrintWriter out = new PrintWriter(System.out);

  public static void main(String[] args) throws IOException {

    String line1, line2, smallest, biggest;
    while ((line1 = in.readLine()) != null) {
      if (line1.length() == 0) {
        break;
      }
      line2 = in.readLine();
      if (line1.length() > line2.length()) {
        smallest = line2;
        biggest = line1;
      } else {
        smallest = line1;
        biggest = line2;
      }

      int minLength = smallest.length();

      int matchPos, matchLength = 0;
      for (int i = 0; i < minLength; i++) {
        matchPos = i + 1;
        while (biggest.contains(smallest.substring(i, matchPos))) {
          if ((matchPos - i) > matchLength) {
            matchLength = matchPos - i;
          }
          if (matchPos >= minLength) {
            break;
          }
          matchPos++;
        }
      }
      out.println(matchLength);
    }
    out.close();

  }
}
