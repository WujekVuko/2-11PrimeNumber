package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: ");
        int a = in.nextInt();
        boolean b = false;
        for (int i = 2; i <= Math.sqrt(a); i++) {
                if(a%i == 0){b = true;}
        }
        if(b == false){System.out.println(a +" to liczba pierwsza.");}
        else{System.out.print(a + " to nie liczba pierwsza.");}
    }
}
