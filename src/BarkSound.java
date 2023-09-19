// Конкретная реализация звука собаки
public class BarkSound implements AnimalSound {
    @Override
    public void playSound() {
        System.out.println("Гав-гав!");
    }
}
