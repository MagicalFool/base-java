package part02_stack;

import java.util.Stack;

/**
 * 字符串翻转
 */
public class ReverseWord {

  public static void main(String[] args) {
    String s = "hello world";

    Stack<String> strings = new Stack<>();
    char[] chars = s.toCharArray();

    for (int i = 0; i<chars.length;i++){
      strings.push(String.valueOf(chars[i]));
//      System.out.println( strings.pop());
    }
    for (int i = 0; i<chars.length;i++){
      System.out.println( strings.pop());
    }

  }

}
