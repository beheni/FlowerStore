package flower.store;
import lombok.Getter;
import java.util.ArrayList;
public class FlowerBucket {
    @Getter
    private ArrayList<FlowerPack> pack_lst = new ArrayList<FlowerPack>();
    private double price;
    FlowerBucket(){
        price = 0;
    }
    public void add(FlowerPack pack) {
        pack_lst.add(pack);
        price += pack.getPrice();
    }
    public double getPrice() {
        return price;
    }

}
