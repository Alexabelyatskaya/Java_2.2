public class Task_2_2 {
    public static void main(String[] args) {

        int account = 100;
        int transfer = 5000;
        int bonus = 0;

        if (transfer > 1000) {
            bonus = transfer / 100;
        }

        int sum = account + transfer + bonus;

        System.out.println("Баланс " + sum + ", бонус " + bonus + ".");
    }
}