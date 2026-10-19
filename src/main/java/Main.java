import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        // Инициализация данных
        Meat meat = new Meat(5, 100);
        Apple redApples = new Apple(10, 50, Colour.RED);
        Apple greenApples = new Apple(8, 60, Colour.GREEN);

        // Создай массив продуктов из этих элементов и проинициализируй корзину с помощью созданного массива.
        Food[] food = {meat, redApples, greenApples};
        ShoppingCart cart = new ShoppingCart(food);

        // Посчитай и выведи на экран значения для созданной корзины
        System.out.printf("Общая сумма без скидки: %.2f%n", cart.sumWithOutDiscount());
        System.out.printf("Общая сумма со скидкой: %.2f%n", cart.sumWithDiscount());
        System.out.printf("Вегетарианские продукты без скидки", cart.sumWithOutDiscount());
    }
}