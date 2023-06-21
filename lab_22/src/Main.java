
public class Main {

    public static void main(String[] args) {
        Razetka razetka = new Razetka();
        Phone phone = new Phone();
        Charger adapter = new Adapter(razetka);
        adapter.charger(phone);
    }
}