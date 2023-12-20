package ex04;

class Account {
    private int regNumber;
    private  String name;
    private int balance;
    private int rerole;

    private int age;

    public void setAge(int age){
        if(age < 0){
            this.age = 0;
        }
        else{
            this.age = age;
        }

    }

    public int getAge(){
        return age;
    }

    public int getRegNumber(){
        return regNumber;
    }




    public void setRegNumber(int regNumber){
        this.regNumber = regNumber;
    }




    public int getRerole(){ //꺼내와라
        return rerole;
    }

    public void setRerole(int rerole){ //입력값을 저장해라
        this.rerole = rerole;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getBalance(){
        return balance;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }




}

public class AccountTest{
    public static void main(String[] args) {
        Account obj = new Account();
        obj.setName("Tom");
        obj.setBalance(10000);
        obj.setRerole(852858145);
        obj.setRegNumber(55);
        obj.setAge(20);

        System.out.println("이름은 " +obj.getName() + "통장잔고는 " + obj.getBalance() + "원 입니다");
        System.out.println("리롤값은 " + obj.getRerole());
        System.out.println("셋 넘버값은 " + obj.getRegNumber());
        System.out.println("나이는 " + obj.getAge());
    }
}