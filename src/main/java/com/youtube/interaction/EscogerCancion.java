package com.youtube.interaction;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;

import static com.youtube.Ul.IniciarUl.TXT_BUSCAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EscogerCancion implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> ListaCanciones = TXT_BUSCAR.resolveAllFor(actor);

        for (int i=0;i<ListaCanciones.size();i++){
            System.out.println(i+" : "+ListaCanciones.get(i).getText());
        }

            ListaCanciones.removeIf(elemento -> !elemento.getText().toLowerCase().contains(GetNombreCancion.getNombre().toString()));
        for (int i=0;i<ListaCanciones.size();i++){
            System.out.println(i+" : "+ListaCanciones.get(i).getText());
        }

        Random random = new Random();
        int indexrandon = random.nextInt(ListaCanciones.size());

        String NombreCancion = ListaCanciones.get(indexrandon).getText(); // Cambia el índice si es necesario
        actor.remember("NombreCancion", NombreCancion);
        System.out.println("NombreCancion: " + NombreCancion);

        ListaCanciones.get(indexrandon).click();

    }
    public static Performable click() {

        return instrumented(EscogerCancion.class);
    }
}
