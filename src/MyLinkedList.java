// 연결 리스트 구현하기

public class MyLinkedList {
    private Node headNode;

    public Object get(int index) {
        for (int i = 0; i < index; i++) {

        }

        return new Object();
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