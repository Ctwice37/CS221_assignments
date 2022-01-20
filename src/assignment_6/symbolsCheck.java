package assignment_6;

/*
Design a Balanced Symbols Check operator, it should do the following:


Read a mathematical expression from the user

Check and report whether the expression is balanced

{, }, (, ), [, ] are the only symbols considered for the check. All other characters can be ignored.
*/


public class symbolsCheck {

    private static final int INITIAL_CAPACITY = 10;
    private int capacity;
    private int size;
    private String [] exp;
    private int size = 0;

    public symbolsCheck(){
        exp = new String[INITIAL_CAPACITY];
        capacity = INITIAL_CAPACITY;
    }


public boolean Balanced(String exp){
    Integer curlyBrace = null;
    Integer squareBracket = null;
    Integer parentheses = null;

    for(int i = 0; i < exp.length(); i++){

    }



}







}
