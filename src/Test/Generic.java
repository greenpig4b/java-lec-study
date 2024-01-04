package Test;


class Box2<T>{
    public Object[] arr = new Object[5];
    public int size;

    public void add(T value){
        arr[size++] = value;
    }

    public T get(int idx){
        return (T)arr[idx];

    }
}


public class Generic {
    public static void main(String[] args) {
        Box2<Integer> b2 = new Box2<>();

        b2.add(100);
        b2.add(1000);
        b2.add(0);
        b2.add(200);

        System.out.println(b2.get(1));

    }
}
