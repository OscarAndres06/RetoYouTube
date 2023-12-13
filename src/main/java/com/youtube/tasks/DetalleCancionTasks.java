package com.youtube.tasks;

import com.youtube.interaction.GetNombreCancion;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.youtube.Ul.DetalleCancionUl.LBL_NOMBRECANCION;
import static com.youtube.Ul.DetalleCancionUl.TXT_CLICK;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DetalleCancionTasks implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                GetNombreCancion.getNombre(),
                Click.on(TXT_CLICK)
        );
    }
    public static DetalleCancionTasks on() {
        return  instrumented(DetalleCancionTasks.class);};
}
