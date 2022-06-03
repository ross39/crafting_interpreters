package com.craftinginterpreters.lox;

class Token {

    /*
     * This is where the error handling goes, for now we are only showing the line number but we
     * will need to include the column and length as well at some stage 
     */
    final TokenType type;
    final String lexme;
    final Object literal; 
    final int line;

    Token(TokenType type, String lexme, Object literal, int line) {
        this.type = type;
        this.lexme = lexme; 
        this.literal = literal; 
        this.line = line;
    }

    public String toString(){
        return type + " " + lexme + " " + literal;
    }
}
