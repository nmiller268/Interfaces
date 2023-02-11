public class Rectangle{
    double width;
    double height;
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    public String toString()
    {
        return "Width: "+width+" Height: "+height;
    }

}