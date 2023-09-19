// Конкретная фабрика для создания собак
public class DogFactory implements AnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Dog();
    }

    @Override
    public AnimalSound createAnimalSound() {
        return new BarkSound();
    }
}
