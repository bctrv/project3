public class Main {
    public static void main(String[] args) {


        int amount = 100;
        int topup = 1100;

        if (topup >= 1000) {
            System.out.println(amount + topup + topup / 100);
        } else {
            System.out.println(amount + topup);
        }

    }
}