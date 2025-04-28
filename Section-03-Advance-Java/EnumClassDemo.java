enum Food {
    //these all are objects of Food
    Biryani(200),
    Noodles(100),
    Chapathi,
    Dosa(50);

    private int price;

    private Food() {
        this.price=60;
    }

    private Food(int price) {
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnumClassDemo {
    public static void main(String[] args) {
        Food food=Food.Noodles;
        System.out.println(food);

        for (Food f: Food.values())
            System.out.println(f+" : "+f.getPrice());
    }
}