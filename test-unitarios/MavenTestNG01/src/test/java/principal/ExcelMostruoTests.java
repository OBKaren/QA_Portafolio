package principal;

import modelos.Monstruo;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reader.ExcelReader;
import utilities.BaseTest;

import java.util.List;

public class ExcelMostruoTests extends BaseTest {

    private List<Monstruo> listaMonstruo;

    @BeforeMethod
    public void SetUp(){
        listaMonstruo = ExcelReader.obtenerListaMostruo();
    }

    @Test
    public void primerTest(){
        final var primerMonstruo = listaMonstruo.get(0);
        //System.out.printf("El nombre del 1 mostruo es : %s%n", primerMonstruo.getNombre());
        Assert.assertEquals(primerMonstruo.getNombre(), "TOLOSA","1 Nombre hace match");
    }

    @Test
    public void segundoTest(){
        final var n = listaMonstruo.size();
        //System.out.printf("El tamaño de la lista de mosntruos es: %d%n",n);
        Assert.assertEquals(n, 14, "longitud incorrecta");

    }

    @Test
    public void tercerTest(){
        final var tercerMonstruo = listaMonstruo.get(2);
        //System.out.printf("El nivel del tercer mostruo  es: %d%n",tercerMonstruo.getNivel());
        Assert.assertEquals(tercerMonstruo.getNivel(),22,"nivel incorrecto");
    }

    @Test
    public void cuartoTest(){

        final var  ultimoMonstruo = listaMonstruo.get(listaMonstruo.size()-1);

        softAssert.assertEquals(ultimoMonstruo.getNombre(),"LUCENA","nombre incorrecto");
        softAssert.assertEquals(ultimoMonstruo.getEdad(),"3","edad incorrecta");
        softAssert.assertEquals(ultimoMonstruo.getPeso(), 8.57, "peso incorrecto");
        softAssert.assertEquals(ultimoMonstruo.getGenero(),"MACHO","genero incorrecto");
        softAssert.assertEquals(ultimoMonstruo.getTipo(),"PLANTA","tipo incorrecto");
        softAssert.assertEquals(ultimoMonstruo.getNivel(),36,"nivel iincorrecto");

        softAssert.assertAll();
    }
}
