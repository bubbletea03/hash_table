/*
    한 노드가 key와 value로 이루어진
    연결 리스트.
 */
public class Bucket {
    private Node headNode;

    public int get(String key) {
        Node node = findNode(key);
        if (node == null) {
            return -1; // 키를 못 찾은 경우
        }
        return node.value;
    }

    public void remove(String key) {
        Node node = findNode(key);

        if (node == null) {
            return;
        }

        Node prevNode = findPrevNode(node);
        if (prevNode == null) {
            headNode = node.nextNode;
        } else {
            prevNode.nextNode = node.nextNode;
        }
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
    }

    private Node findNode(String key) {
        Node node = headNode;
        do {
            if (node.key == key) {
                return node;
            }
            node = node.nextNode;
        } while (node != null);

        return null;
    }

    // 노드를 매개변수로 받아 이전 노드를 반환한다.
    private Node findPrevNode(Node node) {
        if (node == headNode) {
            return null; // 이전 노드가 없으면 null 반환
        }

        Node prevNode = headNode;
        while (prevNode.nextNode != node) {
            prevNode = prevNode.nextNode;
        }

        return prevNode;
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