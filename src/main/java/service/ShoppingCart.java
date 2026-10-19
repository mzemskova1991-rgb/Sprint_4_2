package service;

import model.Discountable;
import model.Food;

public class ShoppingCart {
    private Food[] food;

    public ShoppingCart(Food[] food) {
        this.food = food;
    }

    //получить общую сумму товаров в корзине без скидки,
    public double sumWithOutDiscount() {
        double sum = 0;
        for (Food food : food) {
            sum += food.getAmount() * food.getPrice();
        }
        return sum;
    }

    //получить общую сумму товаров в корзине со скидкой,
    public double sumWithDiscount() {
        double sum = 0;
        for (Food food : food) {
            sum += food.getAmount() * food.getPrice() * (100 - food.getDiscount()) / 100.0;
        }
        return sum;
    }

    //получить общую сумму всех вегетарианских продуктов в корзине без скидки.
    public double sumAllVegetarian() {
        double sum = 0;
        for (Food food : food) {
            if (food.isVegetarian()) {
                sum += food.getAmount() * food.getPrice();
            }
        }
        return sum;
    }
}