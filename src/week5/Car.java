package week5;

/*
추상 클래스는 동작이 정의되어 있지 않은 추상 메소드를 포함하고 있으므로, 인스턴스를 생성할 수 없습니다.
추상 클래스는 먼저 상속을 통해 자식 클래스를 만들고,
만든 자식 클래스에서 추상 클래스의 모든 추상 메소드를 오버라이딩하고 나서야
비로소 자식 클래스의 인스턴스를 생성할 수 있게 됩니다.
 */
abstract class Car {
    abstract void startCar();
    abstract void drive();
    abstract void stop();
    abstract void turnOff();
    abstract void run();
}

class AICar extends Car {
    public AICar() {
    }

    @Override
    void startCar() {
     System.out.println("시동을 켭니다.");
    }

    @Override
    void drive() {
        System.out.println("자율 주행합니다.");
    }

    @Override
    void stop() {
        System.out.println("스스로 멈춥니다.");
    }

    @Override
    void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    @Override
    void run() {
        this.startCar();
        this.drive();
        this.stop();
        this.turnOff();
    }
}

class ManualCar extends Car {
    public ManualCar() {
    }

    @Override
    void startCar() {
        System.out.println("시동을 켭니다.");
    }

    @Override
    void drive() {
        System.out.println("사람이 운전다.");
    }

    @Override
    void stop() {
        System.out.println("브레이크로 정지합니다.");
    }

    @Override
    void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    @Override
    void run() {
        this.startCar();
        this.drive();
        this.stop();
        this.turnOff();
    }
}