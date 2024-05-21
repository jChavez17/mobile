package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class Logged {
    public static Target tituloProducto = Target.the("titulo")
            .located(AppiumBy.xpath("//android.widget.TextView[@text='PRODUCTS']"));
}
