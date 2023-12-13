package com.youtube.Ul;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class IniciarUl {

    public static Target TXT_BUSCAR = Target.the("a buscar")
            .located(By.xpath("//input[@id='search']"));
}
