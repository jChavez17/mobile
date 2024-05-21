package starter.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginView {
    public static Target userName = Target.the("userName")
            .located(AppiumBy.accessibilityId("test-Username"));

    public static Target password = Target.the("password")
            .located(AppiumBy.accessibilityId("test-Password"));
    public static Target btnSubmit = Target.the("login")
            .located(AppiumBy.accessibilityId("test-LOGIN"));



}
