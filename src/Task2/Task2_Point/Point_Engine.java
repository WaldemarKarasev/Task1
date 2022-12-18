package Task2.Task2_Point;

public class Point_Engine {

    //move to
    public static void MoveTo(Point point, float xTarget, float yTarget, float time) {
        if (point.GetXCoord() == 0 && point.GetYCoord() == 0)
            point.SetS((float) Math.sqrt(Math.pow(xTarget, 2) + Math.pow(yTarget, 2)));
        else if (point.GetXCoord() == 0) {
            point.SetS((float) Math.sqrt(Math.pow(xTarget, 2) + Math.pow(yTarget - point.GetYCoord(), 2)));
        } else {
            point.SetS((float) Math.sqrt(Math.pow(xTarget - point.GetXCoord(), 2) + Math.pow(yTarget - point.GetYCoord(), 2)));
        }

        point.SetTime(time);
        Speed(point, xTarget,  yTarget);
        Acceleration(point, point.GetXSpeed(), point.GetYSpeed());

        point.SetXCoord(xTarget);
        point.SetYCoord(yTarget);

        System.out.println("Coordinates of this point: " + "(" + point.GetXCoord() + "," + point.GetYCoord() + ")");

    }


    //speed
    private static void Speed(Point point, float xTarget, float yTarget) {
        point.SetXSpeed((xTarget - point.GetXCoord())/point.GetTime());
        point.SetYSpeed((yTarget - point.GetYCoord())/point.GetTime());
        System.out.println("The velocity of the point is: (Vx, Vy) = (" + point.GetXSpeed() + ", " + point.GetYSpeed() + ")");
    }


    //acceleration
    private static void Acceleration(Point point, float xVelocity, float yVelocity) {
        point.SetXSpeed((xVelocity - point.GetXSpeed())/point.GetTime());
        point.SetYSpeed((yVelocity - point.GetYSpeed())/point.GetTime());
        System.out.println("The acceleration of the point is: (Vx, Vy) = (" + point.GetXSpeed() + ", " + point.GetYSpeed() + ")");
    }

    //distance between
    public static float DistanceBetween(Point point1, Point point2) {
        return (float)Math.sqrt(Math.pow(point1.GetXCoord() - point2.GetYCoord(), 2) + Math.pow(point1.GetYCoord() - point2.GetYCoord(), 2));
    }

    //iscrossing
    public static boolean isCrosing(Point point1, Point point2) {
        boolean isCross = false;

        return isCross;
    }

}