public class StackArr {
    int[] Stack;
    int top;

    StackArr(int size){
        Stack = new int[size];
        top = -1;
    }

    public void push(int val){
        top++;
        Stack[top] = val;
    }

    public void display(){
        for(int i= top; i>=0; i--){
            System.out.println(Stack[i] +" ");
        }
    }




    static void main(String[] args){
        StackArr st =new StackArr(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        st.display();
    }
}