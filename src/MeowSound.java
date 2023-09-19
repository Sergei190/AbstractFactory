// Конкретная реализация звука кошки
public class MeowSound implements AnimalSound {
    @Override
    public void playSound() {
        System.out.println("Мяу-мяу!");
    }
}
