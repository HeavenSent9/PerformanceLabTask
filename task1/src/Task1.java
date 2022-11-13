public class Task1 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Введите 2 аргумента");
            System.exit(0);
        }

        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        if (n <= 0 || m <= 0) {
            System.out.println("Неверные данные");
            System.exit(0);
        }

        StringBuilder result = new StringBuilder();
        int i = 1;
        do {
            result.append(i);
            i = 1 + (i + m - 2) % n;
        } while (i != 1);
        System.out.println(result);
    }
}
