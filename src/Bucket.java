/*
    한 노드가 key와 value로 이루어진
    연결 리스트
 */
public class Bucket {
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

    public Object remove(int index) {

    }

    public void add(String key, int value) {
        Node newNode = new Node(key, value);

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
    public String key;
    public int value; // value는 편의상 int로 하겠습니다.
    public Node nextNode;

    public Node(String key, int value) {
        this.key = key;
        this.value = value;
    }
}