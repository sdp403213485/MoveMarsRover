public class MoveMarsRover {
    //限位
    private static int limitX = -5;
    private static int limitY = 5;


    public MarsRover initStatus(int x,int y,String d){
        Position position = new Position(x,y,d);
        MarsRover marsRover = new MarsRover(position);
        return marsRover;
    }


    public MarsRover moveOrder(MarsRover marsRover,String moveOrder){
        for(int i = 0; i < moveOrder.length(); i++) {
            char c = moveOrder.charAt(i);

            //初始方向为N
            if (marsRover.getPosition().getDirection() == "N"){
                if (c == 'M'){
                    if(marsRover.getPosition().getX() < limitX || marsRover.getPosition().getY() >= limitY) {
                        return marsRover;
                    }
                    int y = marsRover.getPosition().getY();
                    marsRover.getPosition().setY(y+1);
                }else if (c == 'L'){
                    String d = marsRover.getPosition().getDirection();
                    marsRover.getPosition().setDirection("W");
                }else if (c == 'R'){
                    String d = marsRover.getPosition().getDirection();
                    marsRover.getPosition().setDirection("E");
                }
            //初始方向为S
            }else if (marsRover.getPosition().getDirection() == "S"){
                if (c == 'M'){
                    if(marsRover.getPosition().getX() < limitX || marsRover.getPosition().getY() > limitY) {
                        return marsRover;
                    }
                    int y = marsRover.getPosition().getY();
                    marsRover.getPosition().setY(y-1);
                }else if (c == 'L'){
                    String d = marsRover.getPosition().getDirection();
                    marsRover.getPosition().setDirection("E");
                }else if (c == 'R'){
                    String d = marsRover.getPosition().getDirection();
                    marsRover.getPosition().setDirection("W");
                }
            //初始方向为E
            }else if (marsRover.getPosition().getDirection() == "E"){
                if (c == 'M'){
                    if(marsRover.getPosition().getX() < limitX || marsRover.getPosition().getY() > limitY) {
                        return marsRover;
                    }
                    int x = marsRover.getPosition().getX();
                    marsRover.getPosition().setX(x+1);
                }else if (c == 'L'){
                    String d = marsRover.getPosition().getDirection();
                    marsRover.getPosition().setDirection("N");
                }else if (c == 'R'){
                    String d = marsRover.getPosition().getDirection();
                    marsRover.getPosition().setDirection("S");
                }
            //初始方向为W
            }else if (marsRover.getPosition().getDirection() == "W"){
                if (c == 'M'){
                    if(marsRover.getPosition().getX() <= limitX || marsRover.getPosition().getY() > limitY) {
                        return marsRover;
                    }
                    int x = marsRover.getPosition().getX();
                    marsRover.getPosition().setX(x-1);
                }else if (c == 'L'){
                    String d = marsRover.getPosition().getDirection();
                    marsRover.getPosition().setDirection("S");
                }else if (c == 'R'){
                    String d = marsRover.getPosition().getDirection();
                    marsRover.getPosition().setDirection("N");
                }
            }
        }
        return marsRover;
    }

}