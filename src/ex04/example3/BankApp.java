package ex04.example3;

import ex04.example3.model.Account;
import ex04.example3.model.User;

public class BankApp {


    // 고객 3명 만들기
    User a1 = new User(1,"own","own@naver.com");
    User a2 = new User(2,"two","two@naver.com");
    User a3 = new User(3,"three","three@naver.com");

    //계좌 3개 만들기
     Account u1 = new Account(1,1000L,1111);
     Account u2 = new Account(2,1000L,1111);
     Account u3 = new Account(3,1000L,1111);
}
