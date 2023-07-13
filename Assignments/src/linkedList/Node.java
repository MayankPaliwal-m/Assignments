package linkedList;

public class Node {
    private String value;
    private Node nextNode;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value='" + value + '\'' +
                ", nextNode=" + nextNode +
                '}';
    }
}
