package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<>();
        int i = 0;
        while(sc.hasNext()) {
            if (i%2 != 0) {
                deque.addFirst(sc.nextInt());
                sb.insert(0,((deque.getFirst()) + " "));
            }else{
                sc.nextInt();
            }
            i++;
        }
        sb.setLength(sb.length() - 1);
        System.out.print(sb);
    }
}
