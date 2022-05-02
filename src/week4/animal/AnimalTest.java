package week4.animal;
import java.util.ArrayList;

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