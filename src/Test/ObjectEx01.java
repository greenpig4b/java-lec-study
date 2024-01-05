package Test;

import java.util.ArrayList;
import java.util.Vector;

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
        Vector<String> v1 = new Vector<>();

        box1.add("벨류값",000);


        v1.add("ddd");


        for (String q : v1){

        }


        ///-----------------------------------------


        for (Object element : box1.elementData) {
            try {
                // Check if the element is not null
                if (element != null) {
                    // Print the element, casting it back to its original type
                    System.out.println(element + " 값이 들어가있습니다");
                } else {
                    // Print a message for null values
                    System.out.println("값이없어");
                }
            } catch (ClassCastException e) {
                // Handle the case where the casting fails
                System.out.println("Casting failed: " + e.getMessage());
            } catch (Exception e) {
                // Handle other exceptions
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
    }
}





