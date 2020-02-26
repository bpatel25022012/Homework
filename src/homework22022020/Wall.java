package homework22022020;


public class Wall {
    double width;// variable declaration

    double height;

    // creat constructor


    public Wall(double width, double height) {

        // if statement fo width and height

        if (width < 0) {
            width = 0;
        }

        if (height < 0) {
            height = 0;
        }

        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width < 0) {
            width = 0;
        }
        this.width = width;
    }

    public void setHeight(double height) {
        if (height < 0) {
            height = 0;
        }
        this.height = height;
    }

    public double getArea() {
        return getWidth() * getHeight();
    }

    // declaration of main method

    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setWidth(5.00);
        wall.setHeight(-1.5);
        System.out.println("width=" + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }

}