package com.youtube.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.Keys;

import static com.youtube.Ul.IniciarUl.TXT_BUSCAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IniciarTasks implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://www.youtube.com/")

        );
    }
    public static IniciarTasks on() {
        return  instrumented(IniciarTasks.class);};
}
