package ex04.example.model;

public class Account {
public    final int id; //계좌번호 4자리 (제약조건)
public    long balance;
public    int userId; //

    public Account(int id, long balance, int userId) {
        this.id = id;
        this.balance = balance;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", userId=" + userId +
                '}';
    }


}
//내용