import org.example.Calculator
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class CalculatorTest {
    private lateinit var calculator: Calculator

    @BeforeEach
    fun setUp() {
        calculator = Calculator()
    }




    // Pruebas de suma
    @Test
    fun `suma de dos numeros positivos`() {
        assertEquals(8.0, calculator.add(5.0, 3.0))
    }

    @Test
    fun `suma de numeros negativos`() {
        assertEquals(-2.0, calculator.add(-1.0, -1.0))
    }

    @Test
    fun `suma con cero`() {
        assertEquals(5.0, calculator.add(5.0, 0.0))
    }




    // Pruebas de resta
    @Test
    fun `resta de numeros positivos`() {
        assertEquals(2.0, calculator.subtract(5.0, 3.0))
    }

    @Test
    fun `resta que da negativo`() {
        assertEquals(-2.0, calculator.subtract(3.0, 5.0))
    }




    // Pruebas de multiplicación
    @Test
    fun `multiplicacion de positivos`() {
        assertEquals(15.0, calculator.multiply(5.0, 3.0))
    }

    @Test
    fun `multiplicacion por cero`() {
        assertEquals(0.0, calculator.multiply(5.0, 0.0))
    }

    @Test
    fun `multiplicacion de negativos`() {
        assertEquals(6.0, calculator.multiply(-2.0, -3.0))
    }




    // Pruebas de división
    @Test
    fun `division normal`() {
        assertEquals(2.5, calculator.divide(5.0, 2.0))
    }

    @Test
    fun `division por cero`() {
        assertThrows(ArithmeticException::class.java) {
            calculator.divide(5.0, 0.0)
        }
    }


}