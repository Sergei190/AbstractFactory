// Клиентский код
public class Main {
    public static void main(String[] args) {
        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        AnimalSound catSound = catFactory.createAnimalSound();

        cat.makeSound(); // Вывод: Мяу!
        catSound.playSound(); // Вывод: Мяу-мяу!

        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        AnimalSound dogSound = dogFactory.createAnimalSound();

        dog.makeSound(); // Вывод: Гав!
        dogSound.playSound(); // Вывод: Гав-гав!
    }
}
