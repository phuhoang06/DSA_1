package BT_DSA;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();

        // Thêm phần tử
        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println("Size after adding elements: " + list.size());

        // Lấy phần tử
        System.out.println("Element at index 1: " + list.get(1));

        // Thêm phần tử vào vị trí chỉ định
        list.add(1, "C#");
        System.out.println("Element at index 1 after adding: " + list.get(1));

        // Xóa phần tử
        list.remove(2);
        System.out.println("Size after removing element: " + list.size());

        // Kiểm tra chứa phần tử
        System.out.println("List contains 'Java': " + list.contains("Java"));
        System.out.println("List contains 'Ruby': " + list.contains("Ruby"));

        // Sao chép danh sách
        MyList<String> clonedList = list.clone();
        System.out.println("Cloned list size: " + clonedList.size());
    }
}

