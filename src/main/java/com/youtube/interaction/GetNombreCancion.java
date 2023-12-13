package com.youtube.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import static com.youtube.Ul.DetalleCancionUl.LBL_NOMBRECANCION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetNombreCancion implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String nombreCancion = LBL_NOMBRECANCION.resolveFor(actor).getText();
        actor.remember("cancion", nombreCancion);

    }
    public static Performable getNombre() {
        return instrumented(GetNombreCancion.class);
    }
}
