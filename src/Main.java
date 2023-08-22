public class Main {
    public static void main(String[] args) {
        int price = 10150;
        int mile = 20;
        int bonus = 0;


        if (price > 0) {
            bonus = (price / mile);
        } else {
            System.out.println("Вы не совершили покупку");
        }

        System.out.println(bonus);

    }
}