package manan1;

public class CLL {
    private Node head;
    private Node tail;

    public CLL() {
        this.head = this.head;
        this.tail = this.tail;
    }

    public void insert(int val) {
        Node node = new Node(this, val);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            node.next = this.head;
            this.tail = node;
        }
    }

    public void delete(int val) {
        Node node = this.head;
        if (node != null) {
            if (node.val == val) {
                this.head = this.head.next;
                this.tail.next = this.head;
            } else {
                do {
                    Node n = node.next;
                    if (n.val == val) {
                        node.next = n.next;
                        break;
                    }

                    node = node.next;
                } while(node != this.head);

            }
        }
    }

    public void display() {
        Node node = this.head;
        if (this.head != null) {
            do {
                System.out.print(node.val + "->");
                node = node.next;
            } while(node != this.head);
        }

    }

    private class Node {
        int val;
        Node next;

        public Node(CLL var1, int val) {
            this.val = val;
        }
    }
}
