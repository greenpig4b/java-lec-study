package ex01;

public class LightEx01 {
    public static void main(String[] args) {
        final double LIGHT_SPEED = 3e5;
        double distance;
        int x = 5;

        distance = LIGHT_SPEED * 365 * 24 * 60 * 60;
        System.out.println("빛이 1년 동안 가는 거리 : " + distance + "km.");
    }
}
