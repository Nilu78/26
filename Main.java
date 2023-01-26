import java.util.Stack;
  class Main {
public static void main(String[] args) {
    //TESTS
        System.out.println(isBalanced("()")) ; //- true
        System.out.println(isBalanced("((()))")) ; //- true
        System.out.println(isBalanced("([[{{}}]])")) ; //- true
        System.out.println(isBalanced("()(){}{{}}[][[]]")) ; //- true
        System.out.println(isBalanced("[{()}]")); // - true
        System.out.println(isBalanced("({}{}([{}]))"));// - true
        System.out.println(isBalanced("[({(})]")) ; // false
        System.out.println(isBalanced("{[}") );//- false
        System.out.println(isBalanced("({")) ; //- false
    
  

}



  public static boolean isBalanced(String str){
Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (c == ')' && top != '(') {
                    return false;
                } else if (c == ']' && top != '[') {
                    return false;
                } else if (c == '}' && top != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();

  }   
}