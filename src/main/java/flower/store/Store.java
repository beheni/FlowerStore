package flower.store;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


public class Store {
    @Getter@Setter
    private List<Flower> flower_assortment = new ArrayList<>();

    public void addFlower(Flower flower){
        flower_assortment.add(flower);
    }
    public boolean search(Flower wanted_flower){
        for (Flower flower: flower_assortment){
            if (wanted_flower.getType().equals(flower.getType()) &&
                    wanted_flower.getColor().equals(flower.getColor()) &&
                            wanted_flower.getPrice() == flower.getPrice()){
            return true;}
        }
        return false;
    }
}
