import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsTest {
    @Test
    public void ShouldDroppedOut() {
        int[] speedOfPlayer = {5, 0, 2};
        int[] actual = Statistics.droppedOut(speedOfPlayer);
        int[] expected = {5};
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void ShouldRemainOut1() {
        int[] speedOfPlayer = {2, 8, 0, 10, 9};
        int[] actual = Statistics.remain(speedOfPlayer);
        int[] expected = {2,0};
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void ShouldDroppedOut1() {
        int[] speedOfPlayer = {4,6,1,2,3};
        int[] actual = Statistics.droppedOut(speedOfPlayer);
        int[] expected = {4,6};
        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void ShouldSumDroppedOut1() {
        int[] speedOfPlayer = {8, 0, 4,6,1,4};
        int actual = Statistics.alldroppedOut(speedOfPlayer);
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldRemain2() {
        int[] speedOfPlayer = {9, 0, 2, 10, 3, -1};
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
    public void ShouldOptionsMaxSpeed() {
        int actual = Statistics.maxSpeed;
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }
}