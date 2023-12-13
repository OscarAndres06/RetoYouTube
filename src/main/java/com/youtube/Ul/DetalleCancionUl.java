package com.youtube.Ul;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class DetalleCancionUl {

    public static Target LBL_NOMBRECANCION= Target.the("Nombre cancion")
            .located(By.xpath("//a[@id='video-title']"));

    public static Target TXT_CLICK= Target.the("Reproducir")
            .located(By.xpath("//a[@id='video-title']"));
}
