package BT_DSA;

public class MyLinkedList<E> {
    private Node<E> head;
    private int numNodes;

    public MyLinkedList() {
        head = null;
        numNodes = 0;
    }

    // Thêm phần tử vào đầu danh sách
    public void addFirst(E data) {
        Node<E> newNode = new Node<>(data);
        newNode.setNext(head);
        head = newNode;
        numNodes++;
    }

    // Thêm phần tử vào cuối danh sách
    public void addLast(E data) {
        Node<E> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<E> temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
        numNodes++;
    }

    // Thêm phần tử vào vị trí chỉ định
    public void add(int index, E data) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }
        if (index == 0) {
            addFirst(data);
        } else {
            Node<E> temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.getNext();
            }
            Node<E> newNode = new Node<>(data);
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
            numNodes++;
        }
    }

    // Xóa phần tử tại vị trí chỉ định
    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }
        Node<E> temp = head;
        if (index == 0) {
            head = head.getNext();
        } else {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.getNext();
            }
            Node<E> nodeToRemove = temp.getNext();
            temp.setNext(nodeToRemove.getNext());
            numNodes--;
            return nodeToRemove.getData();
        }
        numNodes--;
        return temp.getData();
    }

    // Lấy phần tử tại vị trí chỉ định
    public E get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }
        Node<E> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp.getData();
    }

    // Lấy kích thước danh sách
    public int size() {
        return numNodes;
    }

    // Kiểm tra danh sách có chứa phần tử hay không
    public boolean contains(E data) {
        Node<E> temp = head;
        while (temp != null) {
            if (temp.getData().equals(data)) {
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    // Lấy phần tử đầu tiên
    public E getFirst() {
        if (head == null) {
            return null;
        }
        return head.getData();
    }

    // Lấy phần tử cuối cùng
    public E getLast() {
        if (head == null) {
            return null;
        }
        Node<E> temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        return temp.getData();
    }

    // Xóa toàn bộ danh sách
    public void clear() {
        head = null;
        numNodes = 0;
    }
}
