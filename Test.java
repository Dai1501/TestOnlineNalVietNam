/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class Test {
    public static int countVietnameseWords(String input) {
        Set<String> result = new HashSet<>();
        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == 'w'){
                result.add(input.substring(i, i+1));
            } else if (input.charAt(i) == 'a' && i < input.length() - 1){
                if (input.charAt(i + 1) == 'w' || input.charAt(i + 1) == 'a'){
                    result.add(input.substring(i, i+2));
                }
            }
            else if (input.charAt(i) == 'd' && i < input.length() - 1){
                if (input.charAt(i + 1) == 'd'){
                    result.add(input.substring(i, i+2));
                }
            } else if (input.charAt(i) == 'e' && i < input.length() - 1){
                if (input.charAt(i + 1) == 'e'){
                    result.add(input.substring(i, i+2));
                }
            } else if (input.charAt(i) == 'o' && i < input.length() - 1){
                if (input.charAt(i + 1) == 'w' || input.charAt(i + 1) == 'o'){
                    result.add(input.substring(i, i+2));
                }
            }
        }
        return result.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(countVietnameseWords(input));
    }
}

