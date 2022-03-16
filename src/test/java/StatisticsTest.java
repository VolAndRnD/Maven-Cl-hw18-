import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsTest {
    @Test
    public void ShouldDroppedOut() {
        int[] speedOfPlayer = {5, 7, 2, 3, 1, 0};
        Statistics statistics = new Statistics(false);
        statistics.maxSpeed = 3;
        int[] actual = statistics.droppedOut(speedOfPlayer);
        int[] expected = {5,7};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void ShouldDroppedOut1() {
        int[] speedOfPlayer = {4,6,1,2,3};
        Statistics statistics = new Statistics(false);
        statistics.maxSpeed = 2;
        int[] actual = statistics.droppedOut(speedOfPlayer);
        int[] expected = {4,6,3};
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void ShouldRemainOut() {
        int[] speedOfPlayer = {5, 7, 2, 3, 1, 0};
        Statistics statistics = new Statistics(false);
        statistics.maxSpeed = 3;
        int[] actual = statistics.remain(speedOfPlayer);
        int[] expected = {2, 3, 1, 0};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void ShouldRemainOut1() {
        int[] speedOfPlayer = {2, 8, 0, 10, 9};
        Statistics statistics = new Statistics(false);
        statistics.maxSpeed = 8;
        int[] actual = statistics.remain(speedOfPlayer);
        int[] expected = {2, 8, 0};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldSumDroppedOut() {
        int[] speedOfPlayer = {5, 7, 2, 3, 1, 0};
        Statistics statistics = new Statistics(false);
        statistics.maxSpeed = 3;
        int actual = statistics.alldroppedOut(speedOfPlayer);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldSumDroppedOut1() {
        int[] speedOfPlayer = {8, 0, 5,6,1,4};
        Statistics statistics = new Statistics(false);
        statistics.maxSpeed = 4;
        int actual = statistics.alldroppedOut(speedOfPlayer);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNamesPlayers() {
        String[] nameSpeed = {"Ivan 4", "Anna 8", "Masha 0", "Alina 3", "Andrew 1", "Kolya 0"};
        Statistics statistics = new Statistics(false);
        statistics.maxSpeed = 3;
        String[] actual = statistics.listName(nameSpeed);
        String[] expected = {"Masha", "Alina", "Andrew", "Kolya"};
    }
    @Test
    public void ShouldNamesPlayers1() {
        String[] nameSpeed = {"Ivan 2", "Anna 5", "Masha 7", "Alina 4", "Andrew 3", "Kolya 0"};
        Statistics statistics = new Statistics(false);
        statistics.maxSpeed = 4;
        String[] actual = statistics.listName(nameSpeed);
        String[] expected = {"Ivan", "Alina", "Andrew", "Kolya"};
    }
}