import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsTest {
    @Test
    public void ShouldDroppedOut() {
        GameManager gM = new GameManager( new SpeedyGame(false,3));
        boolean actual =  gM.isFailed(0);
        boolean expected = false;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void ShouldDroppedOut1() {
        GameManager gM = new GameManager( new SpeedyGame(false,3));
        boolean actual =  gM.isFailed(2);
        boolean expected = false;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void ShouldDroppedOut2() {
        GameManager gM = new GameManager( new SpeedyGame(true,3));
        boolean actual =  gM.isFailed(2);
        boolean expected = false;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void ShouldDroppedOut3() {
        GameManager gM = new GameManager( new SpeedyGame(false,3));
        boolean actual =  gM.isFailed(3);
        boolean expected = false;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void ShouldDroppedOut4() {
        GameManager gM = new GameManager( new SpeedyGame(false,3));
        boolean actual =  gM.isFailed(4);
        boolean expected = true;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void ShouldDroppedOut5() {
        GameManager gM = new GameManager( new SpeedyGame(true,3));
        boolean actual =  gM.isFailed(4);
        boolean expected = false;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void ShouldDroppedOutRounds() {
        GameManager gM = new GameManager( new SpeedyGame(true,4));
        int actual =  gM.round(new int[]{1, 2, 4,1,5});
        int expected = 5;
        Assertions.assertEquals(expected,actual);
    }
}