public class Task15 {
    public static void main(String[] args) {
        int[] orders = {1000, -230, 12312, 0, 24241};

        for (int order : orders) {
            try {
                processOrder(order);
            } catch (InvalidOrderAmountException e) {
                System.out.println("Некорректная сумма заказа: " + order + "!");
            }
        }
    }

    public static void processOrder(int order) throws InvalidOrderAmountException {
        if (order <= 0) throw new InvalidOrderAmountException();
        else System.out.println("Заказ обработан: " + order);
    }
}

class InvalidOrderAmountException extends Exception {

}