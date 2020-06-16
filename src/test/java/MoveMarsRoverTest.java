import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MoveMarsRoverTest {
    @Test
    public void should_return_0_1_N_when_input_M_with_init_0_0_N(){
        //given
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        Position position = new Position(0,1,"N");
        //when
        MarsRover ExpectedResult = new MarsRover(position);
        MarsRover marsRover = moveMarsRover.initStatus(0, 0, "N");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "M");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void should_return_0_0_W_when_input_L_with_init_0_0_N(){
        //given
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        Position position = new Position(0,0,"W");
        //when
        MarsRover ExpectedResult = new MarsRover(position);
        MarsRover marsRover = moveMarsRover.initStatus(0, 0, "N");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "L");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void should_return_0_0_E_when_input_R_with_init_0_0_N(){
        //given
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        Position position = new Position(0,0,"E");
        //when
        MarsRover ExpectedResult = new MarsRover(position);
        MarsRover marsRover = moveMarsRover.initStatus(0, 0, "N");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "R");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void should_returen_0_Minus1_N_when_input_M_with_init_0_0_S(){
        //given
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        Position position = new Position(0,-1,"S");
        //when
        MarsRover ExpectedResult = new MarsRover(position);
        MarsRover marsRover = moveMarsRover.initStatus(0, 0, "S");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "M");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void should_returen_0_0_E_when_input_L_with_init_0_0_S(){
        //given
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        Position position = new Position(0,0,"E");
        //when
        MarsRover ExpectedResult = new MarsRover(position);
        MarsRover marsRover = moveMarsRover.initStatus(0, 0, "S");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "L");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void should_returen_0_0_W_when_input_R_with_init_0_0_S(){
        //given
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        Position position = new Position(0,0,"W");
        //when
        MarsRover ExpectedResult = new MarsRover(position);
        MarsRover marsRover = moveMarsRover.initStatus(0, 0, "S");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "R");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void should_returen_1_0_E_when_input_M_with_init_0_0_E(){
        //given
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        Position position = new Position(1,0,"E");
        //when
        MarsRover ExpectedResult = new MarsRover(position);
        MarsRover marsRover = moveMarsRover.initStatus(0, 0, "E");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "M");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void should_returen_0_0_N_when_input_L_with_init_0_0_E(){
        //given
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        Position position = new Position(0,0,"N");
        //when
        MarsRover ExpectedResult = new MarsRover(position);
        MarsRover marsRover = moveMarsRover.initStatus(0, 0, "E");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "L");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void should_returen_0_0_S_when_input_R_with_init_0_0_E(){
        //given
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        Position position = new Position(0,0,"S");
        //when
        MarsRover ExpectedResult = new MarsRover(position);
        MarsRover marsRover = moveMarsRover.initStatus(0, 0, "E");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "R");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void should_returen_negative_1_0_N_when_input_M_with_init_0_0_W(){
        //given
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        Position position = new Position(-1,0,"W");
        //when
        MarsRover ExpectedResult = new MarsRover(position);
        MarsRover marsRover = moveMarsRover.initStatus(0, 0, "W");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "M");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void should_returen_0_0_S_when_input_L_with_init_0_0_W(){
        //given
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        Position position = new Position(0,0,"S");
        //when
        MarsRover ExpectedResult = new MarsRover(position);
        MarsRover marsRover = moveMarsRover.initStatus(0, 0, "W");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "L");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void should_returen_0_0_N_when_input_R_with_init_0_0_W(){
        //given
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        Position position = new Position(0,0,"N");
        //when
        MarsRover ExpectedResult = new MarsRover(position);
        MarsRover marsRover = moveMarsRover.initStatus(0, 0, "W");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "R");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void should_returen_0_2_E_when_input_MMR_with_init_0_0_N(){
        //given
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        Position position = new Position(0,2,"E");
        //when
        MarsRover ExpectedResult = new MarsRover(position);
        MarsRover marsRover = moveMarsRover.initStatus(0, 0, "N");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "MMR");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void should_returen_1_2_S_when_input_MMRMLRR_with_init_0_0_N(){
        //given MMRMLRR
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        Position position = new Position(1,2,"S");
        //when
        MarsRover ExpectedResult = new MarsRover(position);
        MarsRover marsRover = moveMarsRover.initStatus(0, 0, "N");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "MMRMLRR");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void should_returen_negative_5_5_N_when_input_M_with_init_negative_5_5_N(){
        //given
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        Position position = new Position(-5,5,"N");
        //when
        MarsRover ExpectedResult = new MarsRover(position);
        MarsRover marsRover = moveMarsRover.initStatus(-5, 5, "N");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "M");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void should_returen_negative_5_5_E_when_input_M_with_init_negative_5_5_N(){
        //given
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        Position position = new Position(-5,5,"E");
        //when
        MarsRover ExpectedResult = new MarsRover(position);
        MarsRover marsRover = moveMarsRover.initStatus(-5, 5, "N");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "R");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void should_returen_negative_5_5_N_when_input_M_with_init_negative_5_4_N(){
        //given
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        Position position = new Position(-5,5,"N");
        //when
        MarsRover ExpectedResult = new MarsRover(position);
        MarsRover marsRover = moveMarsRover.initStatus(-5, 4, "N");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "M");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void should_returen_negative_5_4_S_when_input_M_with_init_negative_5_5_S(){
        //given
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        Position position = new Position(-5,4,"S");
        //when
        MarsRover ExpectedResult = new MarsRover(position);
        MarsRover marsRover = moveMarsRover.initStatus(-5, 5, "S");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "M");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void should_returen_negative_4_5_E_when_input_M_with_init_negative_5_5_E(){
        //given4
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        Position position = new Position(-4,5,"E");
        //when
        MarsRover ExpectedResult = new MarsRover(position);
        MarsRover marsRover = moveMarsRover.initStatus(-5, 5, "E");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "M");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void should_returen_negative_5_5_N_when_input_L_with_init_negative_5_5_E(){
        //given4
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        Position position = new Position(-5,5,"N");
        //when
        MarsRover ExpectedResult = new MarsRover(position);
        MarsRover marsRover = moveMarsRover.initStatus(-5, 5, "E");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "L");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void should_returen_negative_5_5_N_when_input_LM_with_init_negative_5_5_E(){
        //given4
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        Position position = new Position(-5,5,"N");
        //when
        MarsRover ExpectedResult = new MarsRover(position);
        MarsRover marsRover = moveMarsRover.initStatus(-5, 5, "E");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "LM");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void should_returen_negative_5_5_W_when_input_M_with_init_negative_5_5_W(){
        //given4
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        Position position = new Position(-5,5,"W");
        //when
        MarsRover ExpectedResult = new MarsRover(position);
        MarsRover marsRover = moveMarsRover.initStatus(-5, 5, "W");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "M");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void should_returen_negative_5_5_W_when_input_ML_with_init_negative_5_5_W(){
        //given4
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        Position position = new Position(-5,5,"W");
        //when
        MarsRover ExpectedResult = new MarsRover(position);
        MarsRover marsRover = moveMarsRover.initStatus(-5, 5, "W");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "M");
        //then
        assertEquals(result,ExpectedResult);
    }

    @Test
    public void should_returen_negative_5_5_W_when_input_RM_with_init_negative_5_5_W(){
        //given4
        MoveMarsRover moveMarsRover = new MoveMarsRover();
        Position position = new Position(-5,5,"N");
        //when
        MarsRover ExpectedResult = new MarsRover(position);
        MarsRover marsRover = moveMarsRover.initStatus(-5, 5, "W");
        MarsRover result = moveMarsRover.moveOrder(marsRover, "RM");
        //then
        assertEquals(result,ExpectedResult);
    }
}
