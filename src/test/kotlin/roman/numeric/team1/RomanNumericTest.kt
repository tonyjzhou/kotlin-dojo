package roman.numeric.team1

import kotlin.test.assertEquals
import org.junit.Test

class RomanNumericTest {
    @Test
    fun test_convertNumberToRoman_1_equals_I() {
        val number = 1
        val expected = "I"
        val answer = convertNumberToRoman(number)

        assertEquals(answer, expected)
    }
}
