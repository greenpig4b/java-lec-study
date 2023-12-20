package ex04;

public class Television {
    int channel;  //채널번호
    int volume;   // 볼륨
    boolean onoff;  // 전원상태

    public static void main(String[] args) {
        Television tv = new Television();

        tv.channel = 7;
        tv.volume = 10;
        tv.onoff = true;

        Television yourTv = new Television();

        yourTv.channel = 9;
        yourTv.volume = 12;
        yourTv.onoff = true;

        System.out.println(tv.channel + " " + tv.volume + " " + tv.onoff);
        System.out.println(yourTv.channel + " " + yourTv.volume + " " + yourTv.onoff);
    }
}

