package com.youtube.stepDefinition;

import com.youtube.questions.ValidarTituloQuestions;
import com.youtube.tasks.DetalleCancionTasks;
import com.youtube.tasks.IniciarTasks;
import com.youtube.tasks.SeleccionarCancionTasks;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ReproducirYouTuberStepDefinition {

    @Before
    public void satupActor() {
        setTheStage(new OnlineCast());
    }

    @Dado("el usuario abre el navegador e ingresa a YouTube")
    public void elUsuarioAbreElNavegadorEIngresaAYouTube() {
        theActorCalled("buscar").wasAbleTo(
                IniciarTasks.on()
        );
      
    }
    @Cuando("el usuario escoge una cancion aleatoriamente")
    public void elUsuarioEscogeUnaCancionAleatoriamente() {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarCancionTasks.on(),
                DetalleCancionTasks.on()
        );
      
    }
    @Entonces("el usuario visualiza la cancion escogida")
    public void elUsuarioVisualizaLaCancionEscogida() {
        theActorInTheSpotlight().should(
                seeThat(
                        ValidarTituloQuestions.from(),
                        Matchers.equalTo(true)
                ));
    }



}
