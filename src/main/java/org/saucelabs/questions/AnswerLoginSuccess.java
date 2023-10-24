package org.saucelabs.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static org.saucelabs.userinterfaces.ProductsPage.PRODUCT_TITTLE;

public class AnswerLoginSuccess implements Question<Boolean> {

    public static AnswerLoginSuccess response() {
        return new AnswerLoginSuccess();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(PRODUCT_TITTLE).viewedBy(actor).asBoolean();
    }
}
