/**
 * A continuación creamos una librería para hacer operaciones básicas
 * (Suma,Resta,Multiplicación,División) con control de errores
 * @author marcosfa
 * @version 1.0
 */
public class OperacionesBasicas {
    /**
     * creamos las diferentes opciones a elegir  + el resultado
     */
    private static Float resultado = null;
    static final int SUMA = 1;
    static final int RESTA = 2;
    static  final int MULTIPLICACION = 3;
    static  final  int DIVISION = 4;

    /**
     * Constructor por defecto en privado ya qu eno queremso crear un objeto de esta librería
     */
    private OperacionesBasicas(){};


    /**
     *
     * @param device Elección de operacion que se quiere realizar
     * @param num1 primer número de la operación
     * @param num2 segundo número de la operación
     * @return Float resultado una variable estatica que nos dá el resultado de la operación.
     */
    public static Float operar(int device, float num1,float num2){ //retornamos FLOAT para poder devolver null
        switch (device){
            case SUMA:
                try{
                    resultado = num1 + num2;

                }catch (Exception e){
                    System.out.println("ERROR EN LA SUMA");
                }
                break;
            case RESTA:
                try{
                   resultado = num1 - num2;

                }catch (Exception e){
                    System.out.println("ERROR EN LA RESTA");
                }
                break;
            case MULTIPLICACION:
                try{
                        resultado = num1 * num2;

                }catch (Exception e){
                    System.out.println("ERROR EN LA MULTIPLICACIÓN");
                }
                break;
            case DIVISION:
                try{
                        resultado =num1 / num2;
                }catch (Exception e){
                    System.out.println("ERROR EN LA DIVISIÓN");
                }
                break;
            default:
                System.out.println("NO HA SELECCIONADO LA OPCIÓN CORRECTA");
                break;
        }
        return resultado;

    }



}
