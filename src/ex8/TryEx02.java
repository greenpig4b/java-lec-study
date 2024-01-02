package ex8;

class TotalCheck extends RuntimeException{}

class Adress{

    void adressCheck(String a,String b) throws TotalCheck{
        if (b.length() < 40){
            throw new RuntimeException("주소의 최대 글자 수는 40이하입니다");
        }
    }
}

class Post{

    void postCheck(String c, String d) throws TotalCheck{
        if (c.length() > 30){
            throw new RuntimeException("다시 적으세요");
        }
        Adress a1 = new Adress();
        a1.adressCheck(c,d);
    }
}

public class TryEx02 {
    public static void main(String[] args) {
        Post p1 = new Post();

        try {
            p1.postCheck("글자수가 어디까지 늘어나야 경고가 뜬느지","dddd");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
