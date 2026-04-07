package pa.com.compra.serenity.cert.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class overproduction {

    public static final Target AddtoCart1 = Target.the("carrito1")
            .locatedBy("//div[@class=\"inventory_item\"][1]//button[1]");

    public static final Target AddtoCart2 = Target.the("carrito2")
            .locatedBy("//div[@class=\"inventory_item\"][2]//button[1]");

    public static final Target AddtoCart3 = Target.the("carrito3")
            .locatedBy("//div[@class=\"inventory_item\"][3]//button[1]");

    public static final Target AddtoCart4 = Target.the("carrito4")
            .locatedBy("//div[@class=\"inventory_item\"][4]//button[1]");

    public static final Target AddtoCart5 = Target.the("carrito5")
            .locatedBy("//div[@class=\"inventory_item\"][5]//button[1]");

    public static final Target Carrito = Target.the("carrito de compras")
            .locatedBy("//div[@class=\"shopping_cart_container\"]//a[1]");

    public static final Target Checkout = Target.the("boton de checkout")
            .locatedBy("//div[@class=\"cart_footer\"]//button[2]");
}
