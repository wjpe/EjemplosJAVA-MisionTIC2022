public class CafeNacional extends Cafe{
    //Constantes y Atributos
    private final static Boolean TOSTADO = false;
    private boolean tostado;

    //Constructor
    public CafeNacional(){
        //codigo
        this(PRECIO_BASE, PESO_BASE, CALIDAD_C, TOSTADO);
    }
    
    public CafeNacional(Double precioBase, Integer peso){
        //codigo
        this(precioBase, peso, CALIDAD_C, TOSTADO);
    }

    public CafeNacional(Double precioBase, Integer peso, char calidadC, boolean tostado){
        //codigo
        super(precioBase, peso, calidadC);
        this.tostado= tostado;
    }

    //Metodos
    public Double calcularPrecio(){
        //Codigo
        Double adicion = super.calcularPrecio();
        if (tostado == true){
            adicion += 50.0;
        }
        return adicion;
    }
}
