package Test;


class Box{
    //오브젝트 쓰는 경우
    public int size;
    public Object[] elementData = new Object[5];

    public void add(Object value, Object value2){
        elementData[size++] = "{"+value+","+value2+"}";
    }

    public Object get(int idx){
        return elementData[idx];
    }

}

public class ObjectEx01 {
    public static void main(String[] args) {
        Box box1 = new Box();

        box1.add(50,5);
        box1.add("감자",50);

        System.out.println(box1.get(0));
        System.out.println(box1.get(1));
    }
}
