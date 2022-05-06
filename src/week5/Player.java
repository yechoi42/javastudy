package week5;

public class Player {
    PlayerLevel level;

    public Player() {
        this.level = new BeginnerLever();
    }

    public PlayerLevel getLevel() {
        return this.level;
    }

    public void upgradeLevel(PlayerLevel level)
    {
        this.level = level;
    }

    public void play(int jumpCount)
    {
        level.go(jumpCount);
    }
}

abstract class PlayerLevel {
    abstract void run();
    abstract void jump();
    abstract void turn();
    abstract void showLevelMessage();
    final public void go(int jumpCount) {
        showLevelMessage();
        run();
        for(int i =0 ; i< jumpCount; i++ ){
            jump();
        }
        turn();
    }
}

class BeginnerLever extends PlayerLevel {
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    public void jump() {
        System.out.println("Jump 할 줄 모르지롱.");
    }

    public void turn() {
        System.out.println("Turn 할 줄 모르지롱.");
    }

    public void showLevelMessage() {
        System.out.println("**** 초보자 레벨 ****");
    }
}

class AdvancedLevel extends PlayerLevel {
    public void run() {
        System.out.println("빨리 달립니다.");
    }

    public void jump() {
        System.out.println("높이 jump");
    }

    public void turn() {
        System.out.println("Turn 할 줄 모르지롱.");
    }

    public void showLevelMessage() {
        System.out.println("**** 중급자 레벨 ****");
    }
}

class SuperLevel extends PlayerLevel {
    public void run() {
        System.out.println("빛의 속도로 달립니다.");
    }

    public void jump() {
        System.out.println("아주 높이 jump");
    }

    public void turn() {
        System.out.println("한바퀴 돕니다");
    }

    public void showLevelMessage() {
        System.out.println("**** 고급 레벨 ****");
    }
}