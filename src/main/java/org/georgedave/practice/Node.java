package org.georgedave.practice;

public class Node {

    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getValue() {
        return  value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void addNode(Node node) {
        if (node.getValue()>value) {
            if (right == null) {
                right = node;
            } else {
                right.addNode(node);
            }
        } else {
            if (left == null) {
                left = node;
            } else {
                left.addNode(node);
            }
        }
    }


}
