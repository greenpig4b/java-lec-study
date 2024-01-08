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
    private int no;
    private String userName;  //  ID =ssar
    private String passWord;  //
    private String email;  //
    private LocalDateTime createdAt;

    @Override
    public String toString() {
        return "Member{" +
                "no=" + no +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", email='" + email + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }

    public Member(int No, JoinDTO i) {
        this.no = no;
        this.userName = i.getUserName();
        this.passWord = i.getPassWord();
        this.email = i.getEmail();
        this.createdAt = LocalDateTime.now();
    }

}

public class CopyEx05 {
    public static void main(String[] args) {
        JoinDTO d1 = new JoinDTO("ssar","1234","ssar@nate.com");
        JoinDTO d2 = new JoinDTO("cos","1234","cos@nate.com");
        JoinDTO d3 = new JoinDTO("ddol","1234","ddol@nate.com");
        //d1 을 맴버에 옮긴다
        Member m1 = new Member(1,d1);
        Member m2 = new Member(2,d2);
        Member m3 = new Member(3,d3);

        //System.out.println(now);
        // now.plusDays(1);
        //LocalDateTime now = LocalDateTime.now();

        Member[] members = {m1, m2, m3};

        for (Member s : members) {
            System.out.println(s);
        }

    }
}
