import java.util.List;

public class TeachJava4 {
    public static void main(String[] args) {

        MyListGeneric<Integer> mytest = new MyListGeneric<>();
        mytest.add(5);

        MyListGeneric<String> mytest2 = new MyListGeneric<>();
    }

}


class MyList {
    private List<String> values;

    void add(String value) {
        values.add(value);
    }

    void remove(String value) {
        values.remove(value);
    }
}

class MyListGeneric<T> {
    private List<T> values;

    void add(T value) {
        values.add(value);
    }

    void remove(T value) {
        values.remove(value);
    }

    T get(int index) {
        return values.get(index);
    }
}



