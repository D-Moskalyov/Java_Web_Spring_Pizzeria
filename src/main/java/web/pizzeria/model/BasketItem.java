package web.pizzeria.model;

public class BasketItem {
    int count = 1;
    Good good;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }

    public int incCount() {
        return ++count;
    }
}