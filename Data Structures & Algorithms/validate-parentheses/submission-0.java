class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack  = new Stack<>();

        HashMap<Character, Character> map = new HashMap<>();

        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for(char c : s.toCharArray()){

            //opening bracket
            if(!map.containsKey(c)){
                stack.push(c);
            }

            //closing bracket
            else{
                if(stack.isEmpty()){
                    return false;
                }

               char top = stack.pop();

               if (top != map.get(c)) {
                return false;
               }
            }

        }
        return stack.isEmpty();

        
    }
}
