package io.codelex.test;

import io.codelex.test.exercise2.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class BasketTest {

    @Test
    public void testBasketOfMushrooms() throws BasketFullException {
        Basket<Mushroom> basket = new Basket<>(new ArrayList<>());
        Mushroom mushroom = new Mushroom();
        basket.addToBasket(mushroom);
        Assertions.assertEquals(mushroom, basket.getBasket().get(0));
    }

    @Test
    public void testBasketOfApples() throws BasketFullException {
        Basket<Apple> basket = new Basket<>(new ArrayList<>());
        Apple apple = new Apple();
        basket.addToBasket(apple);
        Assertions.assertEquals(apple, basket.getBasket().get(0));
    }

    @Test
    public void testEmptyBasket() throws BasketEmptyException {
        Basket<Apple> basket = new Basket<>(new ArrayList<>());
        Apple apple = new Apple();
        BasketEmptyException thrown = Assertions.assertThrows(BasketEmptyException.class, () -> {
            basket.removeFromBasket(apple);
        });
        Assertions.assertEquals("Basket is empty!!!", thrown.getMessage());
    }

    @Test
    public void testFullBasket() {
        Basket<Apple> basket = new Basket<>(new ArrayList<>());
        Apple apple = new Apple();
        Mushroom mushroom = new Mushroom();
        BasketFullException thrown = Assertions.assertThrows(BasketFullException.class, () -> {
            basket.addToBasket(apple);
            basket.addToBasket(apple);
            basket.addToBasket(apple);
            basket.addToBasket(apple);
            basket.addToBasket(apple);
            basket.addToBasket(apple);
            basket.addToBasket(apple);
            basket.addToBasket(apple);
            basket.addToBasket(apple);
            basket.addToBasket(apple);
            basket.addToBasket(apple);
        });
        Assertions.assertEquals("Basket is full!!!", thrown.getMessage());
    }

}
