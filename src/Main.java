public class Main {
    public static void main(String[] args) {
        cycle();
    }

    private static void cycle() {
        for (int r : new Randoms(90, 100)) {
            System.out.println("Случайное число: " + r);
            if (r == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }

}
