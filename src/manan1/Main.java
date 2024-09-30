package manan1;
import java.util.Stack;
public class Main {
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
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        System.out.println(stack.pop());

    }
}
class QueueUsingStack{
    private Stack<Integer> first;
    private Stack<Integer> second;
    public QueueUsingStack(){
        first = new Stack<>();
        second = new Stack<>();
    }
    public void add(int item){
        first.push(item);
    }
    public int remove() throws Exception {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;
    }
    public int peak() throws Exception {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int peeked = second.peek();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return peeked;
    }
        public boolean isEmpty(){
            return first.isEmpty();
        }
    }
