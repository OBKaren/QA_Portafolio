package modelos;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelSheet;


@ExcelSheet("monstruos")
public class Monstruo {

    @ExcelCellName("NOMBRE")
    private String nombre;

    @ExcelCellName("EDAD")
    private String edad;

    @ExcelCellName("PESO")
    private double peso;

    @ExcelCellName("GENERO")
    private String genero;

    @ExcelCellName("TIPO")
    private String tipo;

    @ExcelCellName("NIVEL")
    private int nivel;

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public String getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public String getGenero() {
        return genero;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        final var multilinea = """
                            {
                            nombre: %s
                            edad: %d
                            peso: %                }
                            genero: %s
                            tipo: %s
                            niivel: %d
                }
                """;
        return String.format(multilinea,nombre,edad, peso,genero,tipo,nivel);
    }
}
