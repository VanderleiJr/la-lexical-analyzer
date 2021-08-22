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
        //Criação e Abertura do arquivo de saída
        BufferedWriter outputFile = new BufferedWriter(new FileWriter(args[1]));
        
        while ((t=lex.nextToken()).getType() != Token.EOF) {
            //Se o tipo do token for 20 (ERRO), entra no if que categoriza o erro
            if(t.getType() == 20){
                outputFile.append("Linha " + t.getLine() + ": ");
                //Cadeia literal não fechada
                if(t.getText().equals("\"")){
                    outputFile.append("cadeia literal nao fechada\n");
                //Comentário não fechado
                } else if(t.getText().equals("{")){
                    outputFile.append("comentario nao fechado\n");
                //Símbolo não identificado
                } else {
                    outputFile.append(t.getText() + " - simbolo nao identificado\n");
                }
                //Após a impressão do erro, finaliza do WHILE
                break;
            //Caso nenhum erro seja encontrado, os dois modos de impressão são feitos
            } else {
                if(t.getType() > 2 && t.getType() < 7){
                    outputFile.append("<'" + t.getText() + "'," + LALexer.VOCABULARY.getDisplayName(t.getType()) + ">\n");
                } else {
                    outputFile.append("<'" + t.getText() + "','" + t.getText() + "'>\n");
                }
            }
        }  
    //Fecha o arquivo, salvando as modificações
    outputFile.close();
    }
}
