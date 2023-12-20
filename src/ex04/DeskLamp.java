package ex04;

public class DeskLamp {
    public boolean isOn;
    //인스턴스 변수 정의

    //매서드 정의
    public void turnon() { isOn = true;}
    public void turnoff(){ isOn = false;}

    public String toString(){
        return "현재 상태는" + (isOn == true ? "켜짐":"꺼짐");
    }
}
