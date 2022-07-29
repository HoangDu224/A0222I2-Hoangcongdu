package ss04_Class_And_Object.excercise.LopFan;

public class LopFan {
    private boolean on;
    private double radius;
    private int speed;
    private String color;

    public LopFan(boolean on, double radius, int speed, String color) {
        this.on = on;
        this.radius = radius;
        this.speed = speed;
        this.color = color;
    }

    public LopFan() {
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getSpeed() {
        switch (this.speed) {
            case 1:
                return "slow";
            case 2:
                return "Medium";
            case 3:
                return "Fast";
            default:
                return "speed khong hop le";
        }
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (this.on == false) {
            return "Speed: " + this.getSpeed() + "\nColor: " + this.getColor() + "\nradius: " + this.getRadius() + "\nFan is off";
        } else {
            return "Speed: " + this.getSpeed() + "\nColor: " + this.getColor() + "\nradius: " + this.getRadius() + "\nFan is on";
        }
    }
}
