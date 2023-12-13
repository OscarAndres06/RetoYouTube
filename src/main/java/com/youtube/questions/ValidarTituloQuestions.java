package com.youtube.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.youtube.Ul.NombreUl.TXT_NOMBRE;

public class ValidarTituloQuestions implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String cancion = TXT_NOMBRE.resolveFor(actor).getText();
        String cancionInicial = actor.recall("cancion");


        return cancion.equals(cancion);
    }

    public static Question<Boolean> from(){
        return new ValidarTituloQuestions();
    }
}
