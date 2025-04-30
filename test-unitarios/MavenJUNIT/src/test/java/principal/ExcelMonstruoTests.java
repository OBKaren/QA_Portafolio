package principal;

import annotations.Regression;
import annotations.Smoke;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import modelos.Monstruo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reader.ExcelReader;
import utilities.BaseTest;

import java.util.List;

public class ExcelMonstruoTests extends BaseTest {

    private List<Monstruo> listaMonstruo;

    @BeforeEach
    public void SetUp(){
        listaMonstruo = ExcelReader.obtenerListaMostruo();
    }

    @Test
    @Regression
    @Smoke
    @Description("Verifiar el nombre del primer monstruo")
    public void primerTest(){
        final var primerMonstruo = listaMonstruo.get(0);
        //System.out.printf("El nombre del 1 mostruo es : %s%n", primerMonstruo.getNombre());

        Assertions.assertEquals(primerMonstruo.getNombre(),"TOLOSA","1 Nombre hace match");
    }

    @Test
    @Regression
    @Smoke
    @Description("Verificar la longitud de la lista de monstruos")
    @Severity(SeverityLevel.CRITICAL)
    public void segundoTest(){
        final var n = listaMonstruo.size();
        //System.out.printf("El tamaño de la lista de mosntruos es: %d%n",n);
        Assertions.assertEquals(n, 14, "longitud incorrecta");

    }

    @Test
    @Regression
    @Smoke
    @Description("Verificar el nivel del tercer monstruo")
    @Severity(SeverityLevel.NORMAL)
    public void tercerTest(){
        final var tercerMonstruo = listaMonstruo.get(2);
        //System.out.printf("El nivel del tercer mostruo  es: %d%n",tercerMonstruo.getNivel());
        Assertions.assertEquals(tercerMonstruo.getNivel(),22,"nivel incorrecto");
    }

    @Test
    @Smoke
    @Description("Verificar el nombre, edad, peso, genero, tipo y nivel del ultimo monstruo")
    @Severity(SeverityLevel.BLOCKER)
    public void cuartoTest(){

        final var  ultimoMonstruo = listaMonstruo.get(listaMonstruo.size()-1);

        Assertions.assertAll(
                () -> Assertions.assertEquals(ultimoMonstruo.getNombre(),"LUCEMA"),
                () -> Assertions.assertEquals(ultimoMonstruo.getEdad(),"3"),
                () -> Assertions.assertEquals(ultimoMonstruo.getPeso(), 8.57),
                () -> Assertions.assertEquals(ultimoMonstruo.getGenero(),"MACHO"),
                () -> Assertions.assertEquals(ultimoMonstruo.getTipo(),"PLANTA"),
                () -> Assertions.assertEquals(ultimoMonstruo.getNivel(), 36)

        );

    }

}
