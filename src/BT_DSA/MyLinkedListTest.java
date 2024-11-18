package BT_DSA;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        // Thêm phần tử vào danh sách
        myLinkedList.addFirst("Java");
        myLinkedList.addLast("Python");
        myLinkedList.add(1, "C++");

        // Hiển thị các phần tử
        System.out.println("Danh sách sau khi thêm phần tử:");
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i));
        }

        // Lấy phần tử đầu tiên và cuối cùng
        System.out.println("Phần tử đầu tiên: " + myLinkedList.getFirst());
        System.out.println("Phần tử cuối cùng: " + myLinkedList.getLast());

        // Kiểm tra phần tử
        System.out.println("Danh sách chứa 'Python': " + myLinkedList.contains("Python"));
        System.out.println("Danh sách chứa 'Ruby': " + myLinkedList.contains("Ruby"));

        // Xóa phần tử
        myLinkedList.remove(1);
        System.out.println("Danh sách sau khi xóa phần tử tại index 1:");
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i));
        }

        // Xóa toàn bộ danh sách
        myLinkedList.clear();
        System.out.println("Kích thước sau khi xóa toàn bộ: " + myLinkedList.size());
    }
}

