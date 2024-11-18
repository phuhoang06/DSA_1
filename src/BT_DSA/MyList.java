package BT_DSA;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    // Constructor không tham số
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // Constructor với dung lượng khởi tạo
    public MyList(int capacity) {
        if (capacity > 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Capacity must be greater than 0");
        }
    }

    // Thêm phần tử vào vị trí chỉ định
    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        ensureCapacity(size + 1);
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    // Thêm phần tử vào cuối danh sách
    public boolean add(E element) {
        ensureCapacity(size + 1);
        elements[size++] = element;
        return true;
    }

    // Lấy phần tử tại vị trí chỉ định
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) elements[index];
    }

    // Xóa phần tử tại vị trí chỉ định
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        E removedElement = (E) elements[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null; // Dọn dẹp phần tử cuối
        return removedElement;
    }

    // Kiểm tra danh sách có chứa phần tử không
    public boolean contains(E o) {
        return indexOf(o) >= 0;
    }

    // Tìm vị trí đầu tiên của phần tử
    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    // Lấy kích thước danh sách
    public int size() {
        return size;
    }

    // Đảm bảo dung lượng tối thiểu cho danh sách
    public void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = elements.length * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    // Xóa toàn bộ phần tử trong danh sách
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    // Sao chép danh sách
    public MyList<E> clone() {
        MyList<E> clonedList = new MyList<>(elements.length);
        clonedList.size = this.size;
        clonedList.elements = Arrays.copyOf(this.elements, this.size);
        return clonedList;
    }
}

