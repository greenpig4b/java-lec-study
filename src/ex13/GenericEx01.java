package ex13;

public class GenericEx01<T> {

    // 제네릭을 쓰는 예제

    private void printMessage(T message) {
        System.out.println(message);
    }

    private int calculateSum(int a, int b) {
        return a + b;
    }

    //오브젝트 배열

    private Object[] elementData = new Object[5];

    // 배열에 값넣기
    int size;
    public void add(T value){
        elementData[size++] = value;
    }

    // 배열에 값 뽑아오기
    public T get(int idx){
        return (T) elementData[idx];
    }

    public static void main(String[] args) {

        //String
        GenericEx01<String> g1 = new GenericEx01<>();
        g1.printMessage("타입에 따라서 값이 달라져야합니다");

        //Integer
        GenericEx01<Integer> n1 = new GenericEx01<>();
        System.out.println(n1.calculateSum(5,10));

        //Integer 배열
        GenericEx01<Integer> e1 = new GenericEx01<>();

        e1.add(5);

        System.out.println(e1.get(0));

    }
}
