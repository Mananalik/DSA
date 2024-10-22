package manan1;
import java.util.ArrayList;
import java.util.Stack;
public class Main {
    public static void main(String[] args) throws Exception{
//        Stack<Integer> stack = new Stack<>();
//        stack.push(5);
//        System.out.println(stack.pop());
//        String s = "()";
//        System.out.println(minAddToMakeValid(s));
        Heap<Integer> heap = new Heap<>();
        heap.insert(34);
        heap.insert(45);
        heap.insert(22);
        heap.insert(89);
        heap.insert(76);
        ArrayList List = heap.heapSort();
        System.out.println(List);
    }

//    static boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//
//        for(char ch: s.toCharArray()){
//            if(ch=='(' || ch=='{' || ch=='[' ){
//                stack.push(ch);
//            }else{
//                if(ch==')'){
//                    if(stack.isEmpty() || stack.pop()!='('){
//                        return false;
//                    }
//                }
//                if(ch=='}'){
//                    if(stack.isEmpty() || stack.pop()!='{'){
//                        return false;
//                    }
//                }
//                if(ch==']'){
//                    if(stack.isEmpty() || stack.pop()!='['){
//                        return false;
//                    }
//                }
//            }
//        }
//        return stack.isEmpty();
//    }
//static int minAddToMakeValid(String s) {
//    Stack<Character> stack = new Stack<>();
//    for(char ch: s.toCharArray()){
//        if(ch==')'){
//            if(!stack.isEmpty() && stack.peek()==')'){
//                stack.pop();
//            }else{
//                stack.push(ch);
//            }
//        }else{
//            stack.push(ch);
//        }
//    }
//    return stack.size();
//}
    //       LL list = new LL();
//       list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.display();
//        manan.Binarysearchcode.DLL list = new manan.Binarysearchcode.DLL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(99);
//        list.insert(8,65);
//        list.display();
//        manan.BinarySearchDuplicate.CLL list = new manan.BinarySearchDuplicate.CLL();
//        list.insert(23);
//        list.insert(3);
//        list.insert(19);
//        list.insert(75);
//        list.display();
//        int x=0;
//        int y=0;
//        int z=0;
//        int arr[] = {x,y,z};
//        System.out.println(Arrays.toString(arr));

}
//class QueueUsingStack{
//    private Stack<Integer> first;
//    private Stack<Integer> second;
//    public QueueUsingStack(){
//        first = new Stack<>();
//        second = new Stack<>();
//    }
//    public void add(int item){
//        first.push(item);
//    }
//    public int remove() throws Exception {
//        while (!first.isEmpty()) {
//            second.push(first.pop());
//        }
//        int removed = second.pop();
//        while (!second.isEmpty()) {
//            first.push(second.pop());
//        }
//        return removed;
//    }
//    public int peak() throws Exception {
//        while (!first.isEmpty()) {
//            second.push(first.pop());
//        }
//        int peeked = second.peek();
//        while (!second.isEmpty()) {
//            first.push(second.pop());
//        }
//        return peeked;
//    }
//        public boolean isEmpty(){
//            return first.isEmpty();
//        }
//    }
