package week5;

/*
추상 클래스는 동작이 정의되어 있지 않은 추상 메소드를 포함하고 있으므로, 인스턴스를 생성할 수 없습니다.
추상 클래스는 먼저 상속을 통해 자식 클래스를 만들고,
만든 자식 클래스에서 추상 클래스의 모든 추상 메소드를 오버라이딩하고 나서야
비로소 자식 클래스의 인스턴스를 생성할 수 있게 됩니다.
 */
abstract class Car {
    public void startCar() {
        System.out.println("시동을 켭니다.");
    }
    abstract void drive();
    abstract void stop();
    public void turnOff(){
        System.out.println("시동을 끕니다.");
    }

    /*
    Hook 메서드
    추상메서드와는 다르게 에러가 나지 않고
    하위 클래스에서 재정의 하지 않더라도 에러가 나지 않습니다
     */
    public void wiper() {

    }

    /*
    final 키워드
    변수에 쓰이면 -> 상수
    메서드에 쓰이면 -> 재정의를 못하는 메서드
    클래스에 쓰이면 -> 상속이 안되는 클래스

    템플릿 메서드
    final로 선언하여 하위 클래스에서 재정의 할 수 없음
    왜냐, 코드의 흐름을 정의하는 메서드이기 때문

     */
    final public void run() {
        this.startCar();
        this.drive();
        this.wiper();
        this.stop();
        this.turnOff();
    }
}

class AICar extends Car {
    public AICar() {
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
    public void wiper() {
        System.out.println("비나 눈의 양에 따라 빠르기가 자동으로 조절됩니다.");
    }
}

class ManualCar extends Car {
    public ManualCar() {
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
    public void wiper(){
        System.out.println("사람이 빠르기를 조절합니다. ");
    }
}