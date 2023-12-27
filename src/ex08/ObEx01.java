package ex08;
// 오브젝트
class Account extends Object{
    private String author;
    private int number;
    private int balance;

    public Account(String author, int number, int balance) {
        this.author = author;
        this.number = number;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "author='" + author + '\'' +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }

}
// 참조변수 == 참조변수 주소값 비교
// 자료형 변수 == 자료형 변수 값 비교
// 객체 주소값을 구할 시 equals로

public class ObEx01 {
    public static void main(String[] args) {
        Account account = new Account("홍길동",1111,1000);
        Account account2 = new Account("홍길동",1111,1000);
        System.out.println(account.toString());
        System.out.println(account.hashCode());
        System.out.println(account.getClass());

        //account -> equals() (오브잭트) (주소비교)
        //account.Tostring() -> equals() (주소비교 false 이면 값 비교)
        if (account.toString().equals(account2.toString())){
            System.out.println("같아요?");
        }


    }
}
