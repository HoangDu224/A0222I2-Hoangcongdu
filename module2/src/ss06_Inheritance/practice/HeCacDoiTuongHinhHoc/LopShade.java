package ss06_Inheritance.practice.HeCacDoiTuongHinhHoc;

public class LopShade {
    public String color = "green";
    public boolean filled = true;

    public LopShade() {
    }

    ;

    public LopShade(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        if (filled) {
            return "LopShade{" +
                    "color='" + color + '\'' +
                    ",  filled" +
                    '}';
        } else {
            return "LopShade{" +
                    "color='" + color + '\'' +
                    ",  not filled" +
                    '}';
        }
    }
}
