import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class OrderServiceTest {

    OrderService service = new OrderService();

    @Test
    public void return_correct_value_for_items_selected(){
        List<Item> itemsSelected = new ArrayList<>();
        Item itemSelected1 = new Item("Idli", 25);
        Item itemSelected2 = new Item("Butter Masala Dosa", 50);
        Item itemSelected3 = new Item("Filter Coffee", 10);
        assertThat(service.totalValueOfItemsSelected(itemsSelected), equalTo(85));

    }

    @Test
    public void return_zero_when_no_items_selected(){
        List<Item> itemsSelected = new ArrayList<>();
        assertThat(service.totalValueOfItemsSelected(itemsSelected), equalTo(0));
    }
}
