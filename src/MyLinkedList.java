// 연결 리스트 구현하기

public class MyLinkedList {
    private Node headNode;
    public int size = 0;

    public Object get(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node theNode = headNode;
        for (int i = 0; i < index; i++) {
            theNode = theNode.nextNode;
        }

        return theNode;
    }

    public void add(Object data) {
        Node newNode = new Node(data);

        if (headNode == null) {
            headNode = newNode;
        }
        else {
            Node lastNode = getLastNode();
            lastNode.nextNode = newNode;
        }

        size++;
    }

    private Node getLastNode() {
        Node lastNode = headNode;
        while (lastNode.nextNode != null) {
            lastNode = lastNode.nextNode;
        }

        return lastNode;
    }
}

class Node {
    public Object data;
    public Node nextNode;

    public Node(Object data) {
        this.data = data;
    }
}