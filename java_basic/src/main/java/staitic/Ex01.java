package staitic;

class StaticEx01{
    String  m;
    int d;

    public StaticEx01(String m, int d) {
        this.m = m;
        this.d = d;
    }

    public String getM() {
        return m;
    }

    public int getD() {
        return d;
    }

}

public class Ex01 {
    public static void main(String[] args) {
        StaticEx01 newEW = new StaticEx01("가나",5);
        System.out.println(newEW.getM());
        System.out.println("안녕하세요");
    }
}
