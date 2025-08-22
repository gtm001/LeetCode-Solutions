class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            Character ch = s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){ // handels opening bracket
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.peek();
                if((ch==')' && top=='(') || (ch=='}' && top=='{') || (ch==']' && top=='[')){ // handels closing bracket
                stack.pop(); 
                    }
                    else{
                        return false;
                        }
                    }
                 }
        return stack.isEmpty();
    }
        
    }
        
    
