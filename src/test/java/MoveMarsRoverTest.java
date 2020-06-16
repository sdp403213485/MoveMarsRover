import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MoveMarsRoverTest {
    @Test
    public void Begin_Derection_N_OrderIs_M(){
        //given
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        //when
        MarsRover ExpectedResult = new MarsRover(0,1,"N");
        MarsRover marsRover = moveMarsRover.initStatus(0, 0, "N");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "M");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void Begin_Derection_N_OrderIs_L(){
        //given
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        //when
        MarsRover ExpectedResult = new MarsRover(0,0,"W");
        MarsRover marsRover = moveMarsRover.initStatus(0, 0, "N");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "L");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void Begin_Derection_N_OrderIs_R(){
        //given
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        //when
        MarsRover ExpectedResult = new MarsRover(0,0,"E");
        MarsRover marsRover = moveMarsRover.initStatus(0, 0, "N");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "R");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void Begin_Derection_S_OrderIs_M(){
        //given
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        //when
        MarsRover ExpectedResult = new MarsRover(0,-1,"S");
        MarsRover marsRover = moveMarsRover.initStatus(0, 0, "S");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "M");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void Begin_Derection_S_OrderIs_L(){
        //given
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        //when
        MarsRover ExpectedResult = new MarsRover(0,0,"E");
        MarsRover marsRover = moveMarsRover.initStatus(0, 0, "S");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "L");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void Begin_Derection_S_OrderIs_R(){
        //given
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        //when
        MarsRover ExpectedResult = new MarsRover(0,0,"W");
        MarsRover marsRover = moveMarsRover.initStatus(0, 0, "S");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "R");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void Begin_Derection_E_OrderIs_M(){
        //given
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        //when
        MarsRover ExpectedResult = new MarsRover(1,0,"E");
        MarsRover marsRover = moveMarsRover.initStatus(0, 0, "E");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "M");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void Begin_Derection_E_OrderIs_L(){
        //given
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        //when
        MarsRover ExpectedResult = new MarsRover(0,0,"N");
        MarsRover marsRover = moveMarsRover.initStatus(0, 0, "E");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "L");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void Begin_Derection_E_OrderIs_R(){
        //given
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        //when
        MarsRover ExpectedResult = new MarsRover(0,0,"S");
        MarsRover marsRover = moveMarsRover.initStatus(0, 0, "E");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "R");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void Begin_Derection_W_OrderIs_M(){
        //given
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        //when
        MarsRover ExpectedResult = new MarsRover(-1,0,"W");
        MarsRover marsRover = moveMarsRover.initStatus(0, 0, "W");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "M");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void Begin_Derection_W_OrderIs_L(){
        //given
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        //when
        MarsRover ExpectedResult = new MarsRover(0,0,"S");
        MarsRover marsRover = moveMarsRover.initStatus(0, 0, "W");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "L");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void Begin_Derection_W_OrderIs_R(){
        //given
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        //when
        MarsRover ExpectedResult = new MarsRover(0,0,"N");
        MarsRover marsRover = moveMarsRover.initStatus(0, 0, "W");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "R");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void Begin_Derection_N_order_MMR(){
        //given
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        //when
        MarsRover ExpectedResult = new MarsRover(0,2,"E");
        MarsRover marsRover = moveMarsRover.initStatus(0, 0, "N");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "MMR");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void Begin_Derection_N_order_MMRMLRR(){
        //given MMRMLRR
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        //when
        MarsRover ExpectedResult = new MarsRover(1,2,"S");
        MarsRover marsRover = moveMarsRover.initStatus(0, 0, "N");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "MMRMLRR");
        //then
        assertEquals(result,ExpectedResult);
    }
}
