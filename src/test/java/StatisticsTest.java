import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsTest {



    @Test
    public void PotentiallyDroppedOut() {
        int[] speedOfPlayer = {5, 0, 2, 10, 3, 1};
        int[] actual = Statistics.potentiallyDroppedOut(speedOfPlayer);
        int[] expected = {5, 2, 10, 3, 1};
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void ShouldGuaranteedRemain() {
        int[] speedOfPlayer = {5, 0, 2, 10, 3, 1};
        int[] actual = Statistics.guaranteedRemain(speedOfPlayer);
        int[] expected = {0};
        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void ShouldSumDroppedOut() {
        int[] speedOfPlayer = {5, 0, 2, 10, 3, 1};
        int actual = Statistics.alldroppedOut(speedOfPlayer);
        int expected = 2;
    }
    @Test
    public void ShouldDroppedOut() {
        int[] speedOfPlayer = {5, 0, 2, 10, 3, 1};
        int[] actual = Statistics.MAX_SPEED(speedOfPlayer);
        int[] expected = {5,10};
        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void ShouldOptionsMaxSpeed() {
        int actual = Main.optionsMaxSpeed();
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldNamesPlayers () {
        String[] nameSpeed = {"Ivan 5", "Anna 7", "Masha 2", "Alina 3", "Andrew 1", "Kolya 0"};
        String[] actual = Statistics.listName(nameSpeed);
        String[] expected = { "Masha", "Alina", "Andrew", "Kolya"};
    }
}