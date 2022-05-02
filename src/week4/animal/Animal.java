package week4.animal;

/*
다형성(polymorphism)이란?
하나의 객체가 여러 가지 타입을 가질 수 있는 것
부모 클래스 타입의 참조 변수로 자식 클래스 타입의 인스턴스 참조
 */
public abstract class Animal {
    abstract void move();
}

class Human extends Animal {
    @Override
    void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void readBook() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    @Override
    void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunt() {
        System.out.println("호랑이가 사냥합니다.");
    }
}

class Eagle extends Animal {
    @Override
    void move() {
        System.out.println("독수리가 하늘을 날아갑니다.");
    }

    public void fly() {
        System.out.println("독수리가 날개를 쭉 펴고 날아갑니다.");
    }
}
