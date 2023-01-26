Given a string containing only the characters ( ) { } [ ] determine if it is balanced.

The string is considered balanced if:

Open brackets are closed by the same type of brackets.
Open brackets are closed in the correct order.

Use Stack data structure for solution.

Examples:
   "()" -> true
   "((()))" -> true
   "[[]]" -> true
   "[({})]" -> true
   "[]{}()" -> true
   "()(){}{{}}[][[]]" -> true
   "({" -> false
   "(()" -> false
   "(}" -> false
   "[({(})]" -> false
   "{[}" -> false
   


   
