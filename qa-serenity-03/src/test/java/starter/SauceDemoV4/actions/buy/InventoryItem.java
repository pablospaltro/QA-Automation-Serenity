package starter.SauceDemoV4.actions.buy;

import net.serenitybdd.screenplay.targets.Target;

public class InventoryItem {

    public static final Target ITEM_NAME_ELEMENT = Target
            .the("Inventory item name")
            .locatedBy(".inventory_item_name");
}
