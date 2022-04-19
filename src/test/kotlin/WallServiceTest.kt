import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        // arrange
        val testPost1 = Post(
            id = 0,
            0,
            0,
            "Тестим"
        )

        // assert
        assertTrue(WallService.add(testPost1).id = 0)
    }

    @Test
    fun update_true() {
        // arrange
        val testPost1 = Post(
            0,
            0,
            0,
            "Тестим"
        )
        WallService.add(testPost1)

        val testPost2 = Post(
            id = 1,
            0,
            0,
            "updated"
        )

        // act
        val actualResultUpd = WallService.update(testPost2)

        // assert
        assertEquals(true, actualResultUpd)
    }

    @Test
    fun update_false() {
        // arrange
        val testPost1 = Post(
            id = 12345,
            0,
            0,
            "Тестим"
        )
        WallService.add(testPost1)

        val testPost2 = Post(
            id = 1234,
            0,
            0,
            "updated"
        )

        // act
        val actualResultUpd = WallService.update(testPost2)

        // assert
        assertEquals(false, actualResultUpd)
    }
}
