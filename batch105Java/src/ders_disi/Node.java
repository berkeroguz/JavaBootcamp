package ders_disi;

public class Node {

    int value;
    Node right;
    Node left;

    public Node(int val) {
        this.value = val;
        right = null;
        left = null;
    }

    public void add(int val) {
        if (val < value) {
            if (left == null) {
                left= new Node(val);
            } else {
                left.add(val);
            }
        } else {
            if (right == null) {
                right= new Node(val);
            } else {
                right.add(val);
            }
        }
    }
}
