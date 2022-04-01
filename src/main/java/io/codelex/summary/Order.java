package io.codelex.summary;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Order {

    private List<SellableThing> itemList;

    public Order() {
        this.itemList = new ArrayList<>();
    }

    public List<SellableThing> getItemList() {
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getClass().getSimpleName().equals("ItemPacking")) {
                itemList.add(itemList.get(i));
                itemList.remove(i);
            }
        }
        return itemList;
    }

    public void setItemList(List<SellableThing> itemList) {
        this.itemList = itemList;
    }

    public void addItem(SellableThing item) throws BadFoodException {
        if (item instanceof FoodItem) {
            if (((FoodItem) item).bestBefore.compareTo(LocalDate.now()) < 0) {
                throw new BadFoodException("Food has expired!!!");
            }
        }
        itemList.add(item);
    }

    public String printList() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < getItemList().size(); i++) {
            list.add(getItemList().get(i).returnName());
        }
        return String.join(", ", list);
    }
}
