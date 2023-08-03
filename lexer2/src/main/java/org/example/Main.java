package org.example;

import org.example.Front.Form;
import org.example.lexer.Tokens;

import java.util.List;

import static org.example.lexer.Lexer.lex;

public class Main {
    public static void main(String[] args) {
//        List<Tokens> tokens = lex("iac ()() \n )#dhajsyef \n asekhse");
//        for(Tokens t : tokens) {
//            System.out.println(t);
//        }
        Form form = new Form();
        form.initComponents();
    }
}