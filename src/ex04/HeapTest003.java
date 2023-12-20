package ex04;

class Monster{

    int level;
    String type;


    public Monster(int level, String type) {
        this.level = level;
        this.type = type;
    }

    public void LevelUpgrade(){
        level++;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "level=" + level +
                ", type='" + type + '\'' +
                '}';
    }
}


public class HeapTest003 {
    public static void main(String[] args) {
        Monster ms = new Monster(50,"돌");
        System.out.println(ms);

        ms.LevelUpgrade();
        System.out.println(ms);
    }
}
