package manan1;

public class DLL {
    private Node head;

    public DLL() {
    }

    public void insertFirst(int val) {
        Node node = new Node(this, val);
        node.next = this.head;
        node.prev = null;
        if (this.head != null) {
            this.head.prev = node;
        }

        this.head = node;
    }

    public void display() {
        Node node = this.head;

        Node last;
        for(last = null; node != null; node = node.next) {
            System.out.print(node.val + "->");
            last = node;
        }

        System.out.println("END");
        System.out.println("Print in reverse");

        while(last != null) {
            System.out.print(last.val + "->");
            last = last.prev;
        }

        System.out.println("Start");
    }

    public void insertLast(int val) {
        Node node = new Node(this, val);
        Node last = this.head;
        node.next = null;
        if (this.head == null) {
            node.prev = null;
            this.head = node;
        } else {
            while(last.next != null) {
                last = last.next;
            }

            last.next = node;
            node.prev = last;
        }
    }

    public Node find(int value) {
        Node node = this.head;

        do {
            if (node == null) {
                return null;
            }
        } while(node.val != value);

        return node;
    }

    public void insert(int after, int val) {
        Node p = this.find(after);
        if (p == null) {
            System.out.println("does not exist");
        } else {
            Node node = new Node(this, val);
            node.next = p.next;
            p.next = node;
            node.prev = p;
            if (node.next != null) {
                node.next.prev = node;
            }

        }
    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(DLL var1, int val) {
            this.val = val;
        }

        public Node(DLL var1, int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}

