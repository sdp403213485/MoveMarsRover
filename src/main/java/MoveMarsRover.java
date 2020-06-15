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
            //初始方向为N
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
            //初始方向为S
            }else if (marsRover.getDirection() == "S"){
                if (c == 'M'){
                    int y = marsRover.getY();
                    marsRover.setY(y-1);
                }else if (c == 'L'){
                    String d = marsRover.getDirection();
                    marsRover.setDirection("E");
                }else if (c == 'R'){
                    String d = marsRover.getDirection();
                    marsRover.setDirection("W");
                }
            //初始方向为E
            }else if (marsRover.getDirection() == "E"){
                if (c == 'M'){
                    int x = marsRover.getX();
                    marsRover.setX(x+1);
                }else if (c == 'L'){
                    String d = marsRover.getDirection();
                    marsRover.setDirection("N");
                }else if (c == 'R'){
                    String d = marsRover.getDirection();
                    marsRover.setDirection("S");
                }
            //初始方向为W
            }else if (marsRover.getDirection() == "W"){
                if (c == 'M'){
                    int x = marsRover.getX();
                    marsRover.setX(x-1);
                }else if (c == 'L'){
                    String d = marsRover.getDirection();
                    marsRover.setDirection("S");
                }else if (c == 'R'){
                    String d = marsRover.getDirection();
                    marsRover.setDirection("N");
                }
            }
        }
        return marsRover;
    }

}