package java_basic_ch7;

class Product {
    private int price;
    private int bonusPoint;

    Product(int price) {
        this.price = price;
        this.bonusPoint = (int)(price*0.1);
    }

    public int getPrice() {
        return price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }
}

class Tv extends Product {
    Tv() {
       super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio extends Product {
    Audio() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}

class Buyer {
    private int money;
    private int bonusPoint;
    private Product[] items;
    private int n;

    {
        money = 1000;
        bonusPoint = 0;
        n = 0;
        items = new Product[10];
    }

    void buy(Product p) {
        if (p.getPrice() > money){
            System.out.println("돈이 없습니다.");
            return;
        } else {
            money -= p.getPrice();
            bonusPoint += p.getBonusPoint();
            items[n++] = p;
            System.out.println(p.toString() + "을(를) 구매했습니다!");
        }
    }

    void summary() {
        int totalPrice = 0;
        int totalBonusPoint = 0;
        String cart = "";

        for (int i = 0; i < n; i++) {
            totalPrice += items[i].getPrice();
            totalBonusPoint += items[i].getBonusPoint();
            cart = cart + items[i].toString() + ", ";
        }
        cart = cart.substring(0, cart.length() - 2);

        System.out.println("total price: " + totalPrice);
        System.out.println("total bonus point: " + totalBonusPoint);
        System.out.println("cart: " + cart);
    }
}

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.summary();
    }
}
