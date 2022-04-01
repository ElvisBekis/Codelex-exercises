package io.codelex.test.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {

    private T content;

    public Basket(List<T> basket) {
        this.basket = basket;
    }

    int BASKET_LIMIT = 10;
    int currentState = 0;

    List<T> basket;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public List<T> getBasket() {
        return basket;
    }

    public void setBasket(List<T> basket) {
        this.basket = basket;
    }

    public void addToBasket(T content) throws BasketFullException {
        this.basket.add(content);
        currentState++;
        if (currentState > BASKET_LIMIT) {
            throw new BasketFullException("Basket is full!!!");
        }
    }

    public void removeFromBasket(T content) throws BasketEmptyException {
        this.basket.remove(content);
        currentState--;
        if (currentState < 0) {
            throw new BasketEmptyException("Basket is empty!!!");
        }
    }

    @Override
    public String toString() {
        return "Basket{" +
                "basket=" + basket +
                '}';
    }
}
