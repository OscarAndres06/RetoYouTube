package com.youtube.Ul;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarCancionUl {

    public static Target TXT_MUSICA = Target.the("a Lista")
            .located(By.xpath("//a[@id='video-title']"));
}
