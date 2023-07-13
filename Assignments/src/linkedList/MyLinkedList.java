package linkedList;

public class MyLinkedList {
    private Node currentNode;

    public void addElement(String value) {
        if(currentNode == null){
            Node node = new Node();
            node.setValue(value);
            currentNode = node;
        }else {
            Node lastNode = currentNode;
            while (lastNode.getNextNode() != null){
                lastNode = lastNode.getNextNode();
            }
            Node newNode = new Node();
            newNode.setValue(value);
            lastNode.setNextNode(newNode);
        }
    }

    public Node getCurrentNode() {
        return currentNode;
    }

    public void setCurrentNode(Node currentNode) {
        this.currentNode = currentNode;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "currentNode=" + currentNode +
                '}';
    }
}
