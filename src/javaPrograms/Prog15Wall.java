package javaPrograms;

public class Prog15Wall {

    public static void main(String[] args) {
        Prog15Wall wall = new Prog15Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }

    double width, height;

    public Prog15Wall() {
    }
    public Prog15Wall(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (height < 0) {
            this.height = 0;
        }else{
            this.height=height;
        }
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        }else{
            this.width=width;
        }

    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        }else{
            this.height=height;
        }

    }
    public double getArea() {
        return getHeight() * getWidth();

    }
}


