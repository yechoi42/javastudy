package week4.animal;
import java.util.ArrayList;

/*
상속(Inheritance)을 쓰는 이유
- IS-A 관계
- 모듈화를 통한 재사용
- 코드 간결

상속의 단점 및 한계점
- 캡슐화가 깨지고 결합도가 높아짐
- 유연성, 확장성 떨어짐 : 컴파일 시점에 부모-자식 관계 결정돼 구현에 의존
- 다중 상속 문제, 클래스 폭발 문제
c.f. https://mangkyu.tistory.com/199

합성(Composition)이란?
- Has-A 관계
- 중복된 로직을 갖는 객체를 구현, 이 객체를 주입받아 중복 로직 호출
- 의존하는 객체를 교체하는 것이 비교적 쉬우므로 설계가 유연

 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        AnimalTest test = new AnimalTest();
        test.moveAnimal(hAnimal);
        test.moveAnimal(tAnimal);
        test.moveAnimal(eAnimal);

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        for(Animal animal : animalList) {
            animal.move();
        }

        test.testDownCasting(animalList);
    }
    public void moveAnimal(Animal animal) {
        animal.move();
    }

    /*
    다운캐스팅은 업캐스팅되어 고유의 특성을 잃은 자식 클래스의 객체를 다시 복구시키는것
     */
    public void testDownCasting(ArrayList<Animal> animalList) {
        for (Animal animal: animalList) {
            if (animal instanceof Human) {
                ((Human)animal).readBook();
            } else if (animal instanceof Tiger) {
                ((Tiger)animal).hunt();
            } else if (animal instanceof Eagle) {
                ((Eagle)animal).fly();
            }
        }
    }
}