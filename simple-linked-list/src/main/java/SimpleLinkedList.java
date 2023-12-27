import java.lang.reflect.Array;
import java.util.NoSuchElementException;

class SimpleLinkedList<T> {
    static class Node<T>{
        T data ;
        Node<T> next;
        Node(T data){
            this.data = data;
            this.next = null;
        }
    }
    Node<T> head = new Node<T>(null);
    SimpleLinkedList() {
    }

    SimpleLinkedList(T[] values) {
        for (T value : values) {
            this.push(value);
        }
    }

    void push(T value) {
        Node<T> temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node<T>(value);

    }

    T pop() {
        if (this.head.next == null){
            throw new NoSuchElementException();
        }
        Node<T> temp = this.head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        Node<T> ret = temp.next;
        temp.next = null;
        return ret.data;
    }

    void reverse() {
        SimpleLinkedList<T> rev  = new SimpleLinkedList<>();
        while (this.size()>0){
            rev.push(this.pop());
        }
        head = rev.head;
    }

    T[] asArray(Class<T> clazz) {
        T[] arr = (T[]) Array.newInstance(clazz,size());
        Node<T> temp = head.next;
        int siz = size();
        for (int i = 0;i<siz;i++){
            arr[siz-i-1] = temp.data;
            temp = temp.next;
        }
        return arr;
    }

    int size() {
        Node<T> temp = head;
        int i = 0;
        while (temp.next!=null){
            i+=1;
            temp = temp.next;
        }
        return i;
    }
}
