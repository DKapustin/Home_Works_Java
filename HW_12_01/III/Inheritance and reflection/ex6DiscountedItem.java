package com.company;

import java.util.Objects;

public class DiscountedItem extends Item{
    private double discount;
    public DiscountedItem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }
    public boolean equals(Object otherObject) {
        if (this == otherObject)
        {
            return true;
        }
        if (otherObject == null)
            return false;
        if (otherObject instanceof DiscountedItem) {
            if (!(discount == ((DiscountedItem) otherObject).discount)) {
                return false;
            }
        }
        return super.equals(otherObject);
    }

    public int hashCode() {
        return Objects.hash(description, price);
    }
}