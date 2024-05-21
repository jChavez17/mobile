package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.ui.Logged;

public class LoggedQuestion implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return Logged.tituloProducto.resolveFor(actor).getText();
    }

    public static Question<String> value()
    {
        return new LoggedQuestion();
    }
}
