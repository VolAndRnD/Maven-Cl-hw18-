import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsTest {
    @Test
    public void ShouldDroppedOut() {
        Game sG = new Game( false);
        boolean actual =  sG.isFailed(2);
        boolean expected = true;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void ShouldDroppedOut1() {
        Game sG = new Game( true);
        boolean actual =  sG.isFailed(2);
        boolean expected = false;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void ShouldDroppedOut2() {
        Game sG = new Game( false);
        boolean actual =  sG.isFailed(0);
        boolean expected = false;
        Assertions.assertEquals(expected,actual);
    }


}