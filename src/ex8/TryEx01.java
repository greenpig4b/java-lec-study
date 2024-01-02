package ex8;

class CheckingUser extends RuntimeException{

}

class Customer{

    void checking(String id , String pw){

        if (pw.length() < 2){
            throw new RuntimeException("Customer: 패스워드 값은 2글자 보다 길어야합니다.");
        }
    }
}

class User{

    void checkUser(String id,String pw) throws  CheckingUser{
        if (id.length() < 4){
            throw new RuntimeException("User: 아이디 값은 4글자 보다 커야합니다");
        }

        Customer c1 = new Customer();
        c1.checking(id,pw);

    }

}

public class TryEx01 {
    public static void main(String[] args) {
        User u1 = new User();
        try {
            u1.checkUser("jihun","1");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        User u2 = new User();

        try {
            u2.checkUser("Rac","5132168");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
