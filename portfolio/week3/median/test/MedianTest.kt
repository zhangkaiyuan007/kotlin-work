// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    "Median is the only value when size=1" {
        median(listOf(4.2f)) shouldBe (4.2f plusOrMinus tolerance)
    }

    "Median is the mean of both values when size=2" {
        median(listOf(7.0f, 2.0f)) shouldBe (4.5f plusOrMinus tolerance)
    }

    "Median is the middle value of sorted data when size=3" {
        median(listOf(9.0f, 1.0f, 2.0f)) shouldBe (2.0f plusOrMinus tolerance)
    }

    "Median is the mean of the two middle values of sorted data when size=4" {
        median(listOf(10.0f, 3.0f, 1.0f, 4.0f)) shouldBe (3.5f plusOrMinus tolerance)
    }
})
