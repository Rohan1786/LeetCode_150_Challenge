import java.util.Stack;

class Solution { 
    public int evalRPN(String[] tokens) { 
        Stack<Integer> st = new Stack<>(); 
        
        for(String name: tokens) { 
            
            if(name.matches("-?\\d+")){ 
                st.push(Integer.parseInt(name)); 
            } else { 
                
                int b = st.pop(); 
                int a = st.pop(); 
                 
                if(name.equals("+")){ 
                    st.push(a + b); 
                } else if(name.equals("-")){ 
                    st.push(a - b); 
                } else if(name.equals("*")){ 
                    st.push(a * b); 
                } else if(name.equals("/")){ 
                    st.push(a / b); 
                } 
            } 
        } 
        return st.pop(); 
    } 
}
