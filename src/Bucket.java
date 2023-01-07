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
        if (node != null) {
            // TODO: 지우고 이전 노드랑 다음 노드 연결하는 식으로 구현 해야 됨
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
        while (node.nextNode != null) {
            if (node.key == key) {
                return node;
            }
            node = node.nextNode;
        }

        return null;
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