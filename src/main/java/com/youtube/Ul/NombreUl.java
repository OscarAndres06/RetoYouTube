package com.youtube.Ul;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class NombreUl {

    public static Target TXT_NOMBRE= Target.the("Nombre cancion selecionada")
            .located(By.xpath("//a[@id='video-title']"));
}
