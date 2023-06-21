
public class Adapter implements Charger{
    Razetka razetka;

    public Adapter(Razetka razetka) {
        this.razetka = razetka;
    }

    @Override
    public void charger(Phone phone) {
        razetka.charger();
        System.out.println("Адаптер преобразуется напряжение");
        phone.charger();
    }
}