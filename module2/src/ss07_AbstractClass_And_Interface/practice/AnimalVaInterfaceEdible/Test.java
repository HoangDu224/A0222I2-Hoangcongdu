package ss07_AbstractClass_And_Interface.practice.AnimalVaInterfaceEdible;

public class Test {
    public static void main(String[] args) {
        LopAnimal[] animals = new LopAnimal[2];
        animals[0] = new LopTiger();
        animals[1] = new LopChicken();
        LopFruit[] fruits = new LopFruit[2];
        fruits[0] = new LopOrange();
        fruits[1] = new LopApple();
        for (LopAnimal a : animals) {
            System.out.println(a.makeSound());

            if (a instanceof LopChicken) {
                Edible edibler = (LopChicken) a;
                System.out.println(edibler.howToEat());
            }
        }
        for (LopFruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
