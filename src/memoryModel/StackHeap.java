package memoryModel;

import java.util.Stack;

public class StackHeap {
    public static void main(String[] args) {

        // Check for balanced brackets in an expression:{}()[]

        String string="({aaa}(45){[ ]})";
        System.out.println(isCorrect(string));
    }

    private static boolean isCorrect(String string) {
        Stack<Character>stack=new Stack<>();

        for (int i = 0; i <string.length() ; i++) {
            char element=string.charAt(i);
            if(element=='('||element=='['||element=='{'){
                stack.push(element);
                continue;
            }

            switch (element){
                case ')':
                    if(stack.empty()||stack.pop()!='('){
                        return false;
                    }
                    break;
                case ']':  if(stack.empty()||stack.pop()!='['){
                    return false;
                }
                    break;
                case '}':  if(stack.empty()||stack.pop()!='{'){
                    return false;
                }
                    break;
            }

        }
        return stack.isEmpty();
    }
}
