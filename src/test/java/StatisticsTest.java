import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsTest {
    @Test
    public void ShouldDroppedOut() {
        SpeedyGame sG = new SpeedyGame( false, 3);
        boolean actual =  sG.isFailed(0);
        boolean expected = false;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void ShouldDroppedOut1() {
        SpeedyGame sG = new SpeedyGame( false, 3);
        boolean actual =  sG.isFailed(2);
        boolean expected = false;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void ShouldDroppedOut2() {
        SpeedyGame sG = new SpeedyGame( true, 3);
        boolean actual =  sG.isFailed(2);
        boolean expected = false;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void ShouldDroppedOut3() {
        SpeedyGame sG = new SpeedyGame( false, 3);
        boolean actual =  sG.isFailed(3);
        boolean expected = false;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void ShouldDroppedOut4() {
        SpeedyGame sG = new SpeedyGame( false, 3);
        boolean actual =  sG.isFailed(4);
        boolean expected = true;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void ShouldDroppedOut5() {
        SpeedyGame sG = new SpeedyGame( true, 3);
        boolean actual =  sG.isFailed(4);
        boolean expected = false;
        Assertions.assertEquals(expected,actual);
    }
}