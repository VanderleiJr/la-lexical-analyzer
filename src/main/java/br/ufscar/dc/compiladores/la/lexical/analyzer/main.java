package br.ufscar.dc.compiladores.la.lexical.analyzer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

public class main {
    public static void main(String args[]) throws IOException{
        CharStream cs = CharStreams.fromFileName(args[0]);
        LALexer lex = new LALexer(cs);

        Token t = null;
        //String tokenName;
        BufferedWriter outputFile = new BufferedWriter(new FileWriter(args[1]));
        
        while ((t=lex.nextToken()).getType() != Token.EOF) {
            //tokenName = LALexer.VOCABULARY.getSymbolicName(t.getType());
            
            if(t.getType() == 20){
                outputFile.append("Linha " + t.getLine() + ": ");
                if(t.getText().equals("\"")){
                    outputFile.append("cadeia literal nao fechada\n");
                } else if(t.getText().equals("{")){
                    outputFile.append("comentario nao fechado\n");
                } else {
                    outputFile.append(t.getText() + " - simbolo nao identificado\n");
                }
                break;
            } else {
                if(t.getType() > 2 && t.getType() < 7){
                    outputFile.append("<'" + t.getText() + "'," + LALexer.VOCABULARY.getDisplayName(t.getType()) + ">\n");
                } else {
                    outputFile.append("<'" + t.getText() + "','" + t.getText() + "'>\n");
                }
            }
        }  
    outputFile.close();
    }
}
