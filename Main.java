import java.util.Stack;

public class Main {
    public static void main(String[] args){

        Stack<Integer> st =new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);

        System.out.println("peek of the stack is: " +st.peek());
        st.push(4);

        while(!st.isEmpty()){
            int temp = st.pop();
            System.out.println(temp);
        }
    }
}
