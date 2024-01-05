package ex14.example1;


import java.time.LocalDateTime;

// Data Transfer Object
class JoinDTO{
    private String userName;  //  ID =ssar
    private String passWord;  //
    private String email;  //

    public JoinDTO(String userName, String passWord, String email) {
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getEmail() {
        return email;
    }
}

class Member{
    private int No;
    private String userName;  //  ID =ssar
    private String passWord;  //
    private String email;  //
    private LocalDateTime createdAt;

    // 스레드 백터 제네릭

    public void memberInput(JoinDTO joinDTO){
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.No = No++;
        LocalDateTime.now();
    }

    public int getNo() {
        return No;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

}




public class CopyEx05 {
    public static void main(String[] args) {
        JoinDTO d1 = new JoinDTO("ssar","1234","ssar@nate.com");
        JoinDTO d2 = new JoinDTO("cos","1234","cos@nate.com");
        //d1 을 맴버에 옮긴다

        Member m1 = new Member();

        m1.memberInput(d1);

        System.out.println(d1.getEmail());
        System.out.println(m1.getEmail());




        //LocalDateTime now = LocalDateTime.now();

        //System.out.println(now);
        // now.plusDays(1);



    }
}
