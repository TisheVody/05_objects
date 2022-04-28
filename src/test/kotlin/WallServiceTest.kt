import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        // arrange
        val testPost1 = Post(id = 0,
            0,
            0,
            0,
            0,
            "Тестим",
            0,
            0,
            false,
            0,
            0,
            0,
            0,
            0,
            "string",
            0,
            false,
            false,
            false,
            0,
            false,
            false,
            0,
            0
        )

        // assert
        assertTrue(WallService.add(testPost1).id != 0)
    }

    @Test
    fun update_true() {
        // arrange
        val testPost1 = Post(
            id = 0,
            0,
            0,
            0,
            0,
            "Тестим",
            0,
            0,
            false,
            0,
            0,
            0,
            0,
            0,
            "string",
            0,
            false,
            false,
            false,
            0,
            false,
            false,
            0,
            0
        )
        WallService.add(testPost1)

        val testPost2 = Post(
            id = 1,
            0,
            0,
            0,
            0,
            "updated",
            0,
            0,
            false,
            0,
            0,
            0,
            0,
            0,
            "string",
            0,
            false,
            false,
            false,
            0,
            false,
            false,
            0,
            0
        )

        // act
        val actualResultUpd = WallService.update(testPost2)

        // assert
        assertTrue(actualResultUpd)
    }

    @Test
    fun update_false() {
        // arrange
        val testPost1 = Post(
            id = 12345,
            0,
            0,
            0,
            0,
            "Тестим",
            0,
            0,
            false,
            0,
            0,
            0,
            0,
            0,
            "string",
            0,
            false,
            false,
            false,
            0,
            false,
            false,
            0,
            0
        )
        WallService.add(testPost1)

        val testPost2 = Post(
            id = 1,
            0,
            0,
            0,
            0,
            "updated",
            0,
            0,
            false,
            0,
            0,
            0,
            0,
            0,
            "string",
            0,
            false,
            false,
            false,
            0,
            false,
            false,
            0,
            0
        )

        // act
        val actualResultUpd = WallService.update(testPost2)

        // assert
        assertFalse(actualResultUpd)
    }
}
