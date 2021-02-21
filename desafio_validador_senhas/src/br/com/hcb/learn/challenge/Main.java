package br.com.hcb.learn.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public final static int MIN = 6;
  public final static int MAX = 32;
  public final static String UNALLOWEDPATTERN = "[^a-zA-Z0-9]";
  public final static String UPPERCASEPATTERN = "[A-Z]";
  public final static String LOWERCASEPATTERN = "[a-z]";
  public final static String NUMBERPATTERN = "[0-9]";


  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String password;
    while ((password = br.readLine()) != null) {
      if (password.length() == 0) {
        break;
      }
      if (isPasswordValid(password)) {
        System.out.println("Senha valida.");
      } else {
        System.out.println("Senha invalida.");
      }
    }
  }

  public static boolean isPasswordValid(String password){
    boolean isLengthValid = isLengthValid(password);
    boolean hasInvalidChars = hasInvalidChars(password);
    boolean hasAnUpperCaseChar = hasAnUpperCaseChar(password);
    boolean hasALowerCaseChar = hasALowerCaseChar(password);
    boolean hasANumberChar = hasANumberChar(password);

    return isLengthValid
        && !hasInvalidChars
        && hasAnUpperCaseChar
        && hasALowerCaseChar
        && hasANumberChar;
  }

  public static boolean isLengthValid(String password){
    return password.length() >= MIN && password.length() <= MAX;
  }

  public static boolean hasInvalidChars(String password){
    return check(UNALLOWEDPATTERN, password);
  }

  public static boolean hasAnUpperCaseChar(String password){
    return check(UPPERCASEPATTERN,password);
  }

  public static boolean hasALowerCaseChar(String password){
   return check(LOWERCASEPATTERN, password);
  }

  public static boolean hasANumberChar(String password){
    return check(NUMBERPATTERN,password);
  }

  private static boolean check(String pattern, String password){
    Pattern p = Pattern.compile(pattern);
    Matcher matcher = p.matcher(password);

    return matcher.find();
  }

}
