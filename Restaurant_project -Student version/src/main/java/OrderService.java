import java.util.List;

public class OrderService {

    public int totalValueOfItemsSelected(List<Item> items){
        if(null == items || items.isEmpty())
            return 0;
        else
            return items.stream().map(Item::getPrice).mapToInt(Integer::intValue).sum();
    }
}
