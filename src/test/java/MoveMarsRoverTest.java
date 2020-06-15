import org.junit.Test;

import java.lang.ref.SoftReference;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class MoveMarsRoverTest {
    @Test
    public void shoud_M(){
        //given
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        //when
        MarsRover ExpectedResult = new MarsRover(0,1,"N");
        MarsRover marsRover = moveMarsRover.initStatus(0, 0, "N");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "M");
        //then
        assertEquals(result,ExpectedResult);
        //assertSame(result,ExpectedResult);
    }
}
