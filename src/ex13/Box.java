package ex13;


public class Box {
    //오브젝트 쓰는 경우
    private int size;
    private Object[] elementData = new Object[5];

    public void add(Object value){
        elementData[size++] = value;
    }

    public Object get(int idx){
        return elementData[idx];
    }

    public static void main(String[] args) {
        Box list = new Box();

        list.add("500");  //바뀐부분
        list.add("100");  //바뀐부분
        list.add(200);

        Integer value1 = (Integer) list.get(0);
        Integer value2 = (Integer) list.get(1);
        Integer value3 = (Integer) list.get(2);
        Integer value4 = (Integer) list.get(3); // null


        System.out.println(value1);
    }
}
