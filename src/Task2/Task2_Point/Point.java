package Task2.Task2_Point;


public class Point {

    private final String PointName;
    static int id = 0;

    private float x;
    private float y;

    private float xSpeed;
    private float ySpeed;

    private float xAccel;
    private float yAccel;

    private float time;
    private float S; // distance

    Point() {
        this.PointName = "id" + id;
        id++;

        this.x = 0;
        this.y = 0;
    }

    Point(float x, float y) {
        this.PointName = "id" + id;
        id++;

        this.x = x;
        this.y = y;
    }

    Point(float x, float y, float xSpeed, float ySpeed) {
        this.PointName = "id" + id;
        id++;

        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    Point(float x, float y, float xSpeed, float ySpeed, float xAccel, float yAccel) {
        this.PointName = "id" + id;
        id++;

        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.xAccel = xAccel;
        this.yAccel = yAccel;
    }

    //Getters
    float GetXCoord() { return x; }
    float GetYCoord() { return y; }

    float GetTime() { return time; }
    float GetS() { return S;}
    float GetXSpeed() { return xSpeed; }
    float GetYSpeed() { return ySpeed; }

    float GetXAccel() { return xAccel; }
    float GetYAccel() { return yAccel; }


    //Setters
    void SetXCoord(float x) { this.x = x; }
    void SetYCoord(float y) { this.y = y; }

    void SetTime(float time) { this.time = time; }
    void SetS(float S) { this.S = S;}

    void SetXSpeed(float xSpeed) { this.xSpeed = xSpeed; }
    void SetYSpeed(float ySpeed) { this.ySpeed = ySpeed; }

    void SetXAccel(float xAccel) { this.xAccel = xAccel; }
    void SetYAccel(float yAccel) { this.yAccel = yAccel; }

    @Override
    public String toString() {
        return "--------------------------------\n" +
                PointName + "\n" +
                "X = " + x + "; Y = " + y + "; Distance = " + S + "\n" +
                "xSpeed = " + xSpeed + "; ySpeed = " + ySpeed + "\n" +
                "xAcceleration = " + xAccel + "; yAcceleration = " + yAccel + "\n" +
                "--------------------------------\n";

    }
}
