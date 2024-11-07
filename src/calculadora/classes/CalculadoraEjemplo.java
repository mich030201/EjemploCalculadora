package calculadora.classes;
/**
 * La clase CalculadoraEjemplo implementa una calculadora básica que permite realizar
 * operaciones aritméticas como suma, resta, multiplicación y división.
 * Los atributos de la clase incluyen dos operandos y el resultado de la operación.
 * <p>
 * @author Miguel
 * @version 1.0
 * @since 2024-11-07
 * @see <a href="https://docs.oracle.com/en/java/">Java Documentation</a>
 */
public class CalculadoraEjemplo {

    // Atributos de la clase
    private double operando1;
    private double operando2;
    private double resultado;

    /**
     * Constructor de la clase CalculadoraEjemplo que inicializa los operandos.
     * 
     * @param operando1 Primer número de la operación
     * @param operando2 Segundo número de la operación
     */
    public CalculadoraEjemplo(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    /**
     * Realiza la suma de operando1 y operando2.
     * 
     * @return El resultado de la suma
     */
    public double sumar() {
        resultado = operando1 + operando2;
        return resultado;
    }

    /**
     * Realiza la resta de operando1 y operando2.
     * 
     * @return El resultado de la resta
     */
    public double restar() {
        resultado = operando1 - operando2;
        return resultado;
    }

    /**
     * Realiza la multiplicación de operando1 y operando2.
     * 
     * @return El resultado de la multiplicación
     */
    public double multiplicar() {
        resultado = operando1 * operando2;
        return resultado;
    }

    /**
     * Realiza la división de operando1 entre operando2. 
     * Verifica que operando2 no sea cero para evitar divisiones por cero.
     * 
     * @return El resultado de la división
     * @throws ArithmeticException si operando2 es cero
     */
    public double dividir() throws ArithmeticException {
        if (operando2 == 0) {
            throw new ArithmeticException("División por cero no permitida.");
        }
        resultado = operando1 / operando2;
        return resultado;
    }

    /**
     * Método principal para probar las operaciones de la calculadora.
     * Crea una instancia de la calculadora y muestra los resultados de cada operación.
     * 
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        CalculadoraEjemplo calculadora = new CalculadoraEjemplo(10, 5);

        System.out.println("Suma: " + calculadora.sumar());
        System.out.println("Resta: " + calculadora.restar());
        System.out.println("Multiplicación: " + calculadora.multiplicar());
        try {
            System.out.println("División: " + calculadora.dividir());
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }
}