public class MoveMarsRover {


    public MarsRover initStatus(int x,int y,String d){
        MarsRover marsRover = new MarsRover();
        marsRover.setX(x);
        marsRover.setY(y);
        marsRover.setDirection(d);

        return marsRover;
    }


    public MarsRover moveOrder(MarsRover marsRover,String moreOrder){
        for(int i = 0; i < moreOrder.length(); i++) {
            char c = moreOrder.charAt(i);
            if (marsRover.getDirection() == "N"){

            }else

//            if (c == 'M'){
//                int y = marsRover.getY();
//                marsRover.setY(y+1);
//            }
        }
        return marsRover;
    }

}