import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsTest {
    @Test
    public void PotentiallyDroppedOut() {
        int[] speedOfPlayer = {5, 0, 2, 10, 3, 1};
        int[] actual = Statistics.droppedOut(speedOfPlayer);
        int[] expected = {5, 10};
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void ShouldGuaranteedRemain() {
        int[] speedOfPlayer = {5, 0, 2, 10, 3, -1};
        int[] actual = Statistics.remain(speedOfPlayer);
        int[] expected = {0,2,3,-1};
        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void ShouldSumDroppedOut() {
        int[] speedOfPlayer = {5, 0, 2, 10, 3, 1};
        int actual = Statistics.alldroppedOut(speedOfPlayer);
        int expected = 2;
        Assertions.assertEquals(expected,actual);
        }

    @Test
    public void ShouldGreenLight () {
        boolean actual = Main.greenLight();
        boolean expected = false;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void ShouldOptionsMaxSpeed() {
        int actual = Statistics.maxSpeed;
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }
}