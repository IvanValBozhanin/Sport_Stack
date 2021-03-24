package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        Stack<Character> st = new Stack<>();
        for(int i=0 ; i<s.length() ; ++i){
            if(s.charAt(i) == 'L' && !st.empty() && st.peek() == 'R'){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        System.out.println(st.size());
    }
}
