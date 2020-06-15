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
                if (c == 'M'){
                    int y = marsRover.getY();
                    marsRover.setY(y+1);
                }else if (c == 'L'){
                    String d = marsRover.getDirection();
                    marsRover.setDirection("W");
                }else if (c == 'R'){
                    String d = marsRover.getDirection();
                    marsRover.setDirection("E");
                }
            }else if (marsRover.getDirection() == "S"){

            }else if (marsRover.getDirection() == "E"){

            }else if (marsRover.getDirection() == "W"){

            }

//            if (c == 'M'){
//                int y = marsRover.getY();
//                marsRover.setY(y+1);
//            }
        }
        return marsRover;
    }

}