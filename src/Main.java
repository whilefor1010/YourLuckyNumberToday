public class Main {
    public static void main(String[] args) {

        int a = 1; // Начальное значение диапазона - "от"
        int b = 10;// Конечное значение диапазона - "до"

        int luckyNumber = a + (int) (Math.random() * b); // Генерация числа от 1 до 10

        System.out.println("Your lucky number " + luckyNumber);

    }
}