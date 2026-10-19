package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food implements Discountable {

    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        return colour.equals(Colour.RED) ? Discount.RED_APPLE : 0;
    }
}  // <-- закрывающая скобка класса должна быть ПОСЛЕ метода