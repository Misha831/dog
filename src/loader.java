public class loader {
    public static void main(String[] args) {
        String str = "Hi!";
        dog dog1 = new dog();
        System.out.printf("Вес собаки N1: %.2f %n", dog1.getWeight());
        dog1.feed(200.0);
        dog1.wooh();
        System.out.printf("Вес собаки N1 после кормежки: %.2f %n", dog1.getWeight());

    }
}
