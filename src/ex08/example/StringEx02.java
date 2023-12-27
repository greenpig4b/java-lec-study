package ex08.example;

class Contract{
    private String url;
    private String username;
    private String password;

    public Contract(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username.toString().substring(9);
    }

    public String getPassword() {
        return password.toString().substring(9);
    }

}

public class StringEx02 {
    public static void main(String[] args) {
        // 문서
        // ? 뒤를 쿼리스트링이라고 한다.
        // 쿼리스트링은 키=값 형태의 데이터의 집합이다.
        // 키=값이 여러개일때는 &로 구분한다.

        String url = "http://www.naver.com?username=ssar&password=1234";
        String parse02[] = url.split("\\?|&");

        System.out.println(parse02.length);

        Contract s2 = new Contract(parse02[0],parse02[1],parse02[2]);

        System.out.println(s2.getUsername());
        System.out.println(s2.getPassword());

        // username값과, password값 찾아보기

    }
}
