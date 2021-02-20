package br.com.hcb.learn.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

  public static int MIN_CHARACTERS = 2;

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Map<Character, String> dictionary = new HashMap<>();

    String line = br.readLine();
    while (!line.equals(".")) {
      StringTokenizer st = new StringTokenizer(line);

      //Monta o dicionário da linha
      while (st.hasMoreTokens()) {
        String word = st.nextToken();
        if (word.length() < 3) {
          continue;
        }
        Character first = word.charAt(0);
        if (dictionary.get(first) == null) {
          dictionary.put(first, word);
        } else {
          if (shouldUpdate(line, dictionary.get(first), word)) {
            dictionary.put(first, word);
          }
        }
      }
      OutputHelper output = new OutputHelper();

      //Faz a abreviacao com base no dicionario montado
      String shortedLine = Arrays.stream(line.toLowerCase().split(" ")).map(s -> {
        Character key = s.charAt(0);
        String value = dictionary.get(key);
        if (value != null) {
          if (s.equals(value)) {
            s = key + ".";
            output.addSubstitutionCount(key);
          }
        }
        return s;
      }).collect(Collectors.joining(" "));

      output.setDictionary(dictionary);
      output.setLine(shortedLine);

      //Post abreviado
      System.out.println(output);

      //Limpando dicionário para o novo post
      dictionary.clear();
      line = br.readLine();
    }
  }

  public static boolean shouldUpdate(String line, String oldWord, String newWord) {
    long savedCharactersOld =
        Arrays.stream(line.split(" "))
            .filter(s -> s.equals(oldWord)).count() * (oldWord.length() - MIN_CHARACTERS);
    long savedCharactersNew =
        Arrays.stream(line.split(" "))
            .filter(s -> s.equals(newWord)).count() * (newWord.length() - MIN_CHARACTERS);
    return savedCharactersOld < savedCharactersNew;
  }
}

class OutputHelper {

  private String line;
  private final Set<Character> substitutionSet;
  private Map<Character, String> dictionary;

  public OutputHelper() {
    dictionary = new HashMap<>();
    substitutionSet = new HashSet<>();
    line = "";
  }

  public void setLine(String line) {
    this.line = line;
  }

  public void setDictionary(Map<Character, String> dictionary) {
    this.dictionary = dictionary;
  }

  @Override
  public String toString() {
    return line + "\n" +
        substitutionSet.size() + "\n" +
        this.printDictionary();
  }

  private String printDictionary() {
    return dictionary.keySet()
        .stream()
        .sorted()
        .map(key -> key + ". = " + this.dictionary.get(key))
        .collect(Collectors.joining("\n"));
  }

  public void addSubstitutionCount(Character character) {
    this.substitutionSet.add(character);
  }
}

