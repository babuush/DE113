package circle;

public class Circle {
    private double radius;

    /**
     * Constructs a Circle object with a default radius of 1.0
     */
    public Circle() {
        this(1.0);
    }

    /**
     * Constructs a Circle object with the specified radius.
     *
     * @param radius the radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Returns a string representation of the Circle object.
     *
     * @return a string representation of the circle, including its radius
     */

    public String toString() {
        return "Circle[radius=" + radius + "]";
    }

    /**
     * Returns the radius of the circle.
     *
     * @return the radius of the circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the radius of the circle to the specified value.
     *
     * @param radius the new radius value
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates and returns the area of the circle.
     *
     * @return the area of the circle
     */
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Calculates and returns the circumference of the circle.
     *
     * @return the circumference of the circle
     */
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
