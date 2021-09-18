public class Cafe{
    //Constantes y atributos
    protected final static char CALIDAD_C = 'F';
    protected final static Double  PRECIO_BASE = 100.0;
    protected final static Integer PESO_BASE = 5;

    protected Double precioBase;
    protected char calidadC;
    protected Integer peso;

    //Constructores
    public Cafe(){
        //Codigo
        this(PRECIO_BASE, PESO_BASE, CALIDAD_C);
    }

    public Cafe(Double precioBase, Integer peso){
        //codigo
        this(precioBase, peso, CALIDAD_C);
    }

    public Cafe(Double precioBase, Integer peso, char calidadC){
        //codigo
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarCalidadC(calidadC);
    }

    //Metodos
    public void comprobarCalidadC(char calidadC){ 
        if(calidadC >= 65 && calidadC <=70 ){
            this.calidadC = calidadC;
        }else{
            this.calidadC = CALIDAD_C; 
        }
    } 
    public Double calcularPrecio(){
        // Código 
        Double adicion = 0.0;

        switch(calidadC){
            case 'A':
                adicion = adicion + 10.0;
            break;

            case 'B':
                adicion = adicion + 8.0;
            break;
            
            case 'C':
                adicion = adicion + 6.0;
            break;

            case 'D':
                adicion = adicion + 5.0;
            break;

            case 'E':
                adicion = adicion + 3.0;
            break;

            case 'F':
                adicion = adicion + 1.0;
            break;
            
        }

        if (peso >= 0 && peso < 19) {
            adicion += 10.0;            
        } else if (peso >= 20 && peso < 49){
            adicion += 50.0;            
        } else if (peso >= 50 && peso <= 79){
            adicion += 80.0;            
        } else if (peso >= 80 ){
            adicion += 100.0;            
        }
        return precioBase + adicion;
    }

    public Double getPrecioBase(){
        return precioBase;
    }

    public char getCalidadC(){
        return calidadC;
    }

    public Integer getPeso(){
        return peso;
    }

}