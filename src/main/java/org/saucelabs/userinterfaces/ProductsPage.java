package org.saucelabs.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductsPage {

    public static final Target PRODUCT_TITTLE = Target.the("Inventory panel tittle")
            .located(By.className("product_label"));
}
