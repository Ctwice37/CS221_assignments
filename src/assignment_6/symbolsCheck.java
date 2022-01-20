package assignment_6;

/*
Design a Balanced Symbols Check operator, it should do the following:


Read a mathematical expression from the user

Check and report whether the expression is balanced

{, }, (, ), [, ] are the only symbols considered for the check. All other characters can be ignored.
*/


//import java.util.ArrayList;
//import java.util.Stack;
//
//public class symbolsCheck{
//    Stack<String> sequence = new ArrayList();
//    public boolean Balanced(String exp) {
//
//        Integer curlyBrace = 0;
//        Integer squareBracket = 0;
//        Integer parentheses = 0;
//        int index = 0;
//
//        for (int i = 0; i < exp.length(); i++) {
//
//            if ((String.valueOf(exp.charAt(i)).equals("}") && curlyBrace == 0) || (String.valueOf(exp.charAt(0)).equals(")") && parentheses == 0)|| (String.valueOf(exp.charAt(0)).equals("]") && squareBracket == 0))
//                return false;
//            else if(String.valueOf(exp.charAt(i)).equals("{" || "(" || "["))
//                expression[index++] = String.valueOf(exp.charAt(i));
//            else if()
//


//            if (String.valueOf(exp.charAt(i)).equals("{" || "(" || "[")) {
//                top++;
//                expression[index] = String.valueOf(exp.charAt(i));
//            }
//            expression[index] = String.valueOf(exp.charAt(i));

//
//        }
//        return true;
//    }
//}




//if (String.valueOf(exp.charAt(i)).equals("{"||"}"||"("||")"||"["||"]")) {

//if (String.valueOf(exp.charAt(i)).equals("}"|| ")"||"]")) {

//String.valueOf(exp.charAt(i - 1)).equals("{")
// || String.valueOf(exp.charAt(i - 1)).equals("[")
//|| String.valueOf(exp.charAt(i - 1)).equals("(")