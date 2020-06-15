import org.junit.Test;

import java.lang.ref.SoftReference;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class MoveMarsRoverTest {
    @Test
    public void N_order_M(){
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

    @Test
    public void N_order_L(){
        //given
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        //when
        MarsRover ExpectedResult = new MarsRover(0,0,"W");
        MarsRover marsRover = moveMarsRover.initStatus(0, 0, "N");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "L");
        //then
        assertEquals(result,ExpectedResult);
        //assertSame(result,ExpectedResult);
    }

    @Test
    public void N_order_R(){
        //given
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        //when
        MarsRover ExpectedResult = new MarsRover(0,0,"E");
        MarsRover marsRover = moveMarsRover.initStatus(0, 0, "N");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "R");
        //then
        assertEquals(result,ExpectedResult);
        //assertSame(result,ExpectedResult);
    }
}
