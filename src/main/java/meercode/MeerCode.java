/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package meercode;

import meercode.lexer.*;

import java.util.List;

import meercode.ast.*;
import meercode.parser.*;

public class MeerCode {
    
    public static void main(String[] args)
    {
        String filePath3AC = "";
        String codeFilePath = "";
        List<List<String>> tokens = Lexer.getTokenList(codeFilePath);
        AbstractSyntaxTree ast = Parser.parseTokens(tokens);
        ASTReader.convertTo3AC(ast, filePath3AC);
        Compiler.compile(filePath3AC);
    }
}
