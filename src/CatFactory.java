// Конкретная фабрика для создания кошек
public class CatFactory implements AnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Cat();
    }

    @Override
    public AnimalSound createAnimalSound() {
        return new MeowSound();
    }
}
