public class CafeExportacion extends Cafe{
    //Constantes y Atributos
    private final static Integer CIF_BASE = 20;

    private Integer cif;
    private Boolean verde;

    //Constructor
    public CafeExportacion(){
        //Codigo
        this(PRECIO_BASE, PESO_BASE, CALIDAD_C, CIF_BASE, false);
    }

    public CafeExportacion(Double precioBase, Integer peso){
        //Codigo
        this(precioBase, peso, CALIDAD_C, CIF_BASE, false);
    }

    public CafeExportacion(Double precioBase, Integer peso, char calidadC, Integer cif, Boolean verde){
        //Codigo
        super(precioBase, peso, calidadC);
        this.cif = cif;
        this.verde = verde;
    }

    //Metodos
    public Double calcularPrecio(){
        //Codigo
        Double adicion = super.calcularPrecio();
        if (cif > 40) {
            adicion += precioBase * 0.3;
        }

        if (verde){
            adicion += 50.0;
        }

        return adicion;
    }
}
