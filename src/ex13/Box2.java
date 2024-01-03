package ex13;



public class Box2<T> {
    private Object[] elementData = new Object[5];
    private int size;

    public void add(T value){
        elementData[size++] = value;
    }

    public T get(int idx){
        return (T) elementData[idx];
    }

    public static void main(String[] args) {
       Box2<Integer> list2 = new Box2<>();

       list2.add(50);
       list2.add(100);

       int intvalue1 = list2.get(0);
       int intvalue2 = list2.get(1);

       System.out.println(intvalue1);
       System.out.println(intvalue2);

    }
}
