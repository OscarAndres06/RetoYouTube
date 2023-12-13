package com.youtube.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.youtube.Ul.IniciarUl.TXT_BUSCAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarCancionTasks implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Grupo miramar").into(TXT_BUSCAR).thenHit(Keys.ENTER)

        );
    }


    public static SeleccionarCancionTasks on() {
        return  instrumented(SeleccionarCancionTasks.class);};
}
