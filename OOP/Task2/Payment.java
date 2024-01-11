package Task2;

import java.text.DecimalFormat;

public class Payment {
    private final int MAX_GOODS = 100;
    private Item[] items;
    private int countGoods;

    public Payment() {
        this.items = new Item[MAX_GOODS];
        this.countGoods = 0;
    }

    public void addItem(Food itemName, int count) {
        if (countGoods < MAX_GOODS) {
            items[countGoods++] = new Item(itemName, count);
        } else {
            System.out.println("The max count of goods!");
        }
    }

    public void sumGoods() {
        double sum = 0;
        for (Item item : items) {
            if (item != null) {
                sum += item.getPrice() * item.getCount();
            }
        }
        DecimalFormat df = new DecimalFormat("#.##");
        String result = df.format(sum);
        System.out.println("The sum -> " + result+"$");
    }

    class Item {
        private Food name;
        private int count;

        public Item(Food name, int count) {
            super();
            this.name = name;
            this.count = count;
        }

        public Food getName() {
            return name;
        }

        public double getPrice() {
            return name.getPrice();
        }

        public int getCount() {
            return count;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Item item : items) {
            if (item != null) {
                builder.append("Product: ")
                        .append(item.getName())
                        .append(", count -> ")
                        .append(item.getCount())
                        .append(" price -> ").append(item.getPrice())
                        .append("$\n");
            }
        }
        return builder.toString();
    }
}
