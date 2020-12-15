public class Colour {
    float r;
    float g;
    float b;
    String colourModel;

    public Colour() {
    }

    public Colour(float red, float green, float blue, String model) {
        if (red < 0 || red > 255) {
            throw new IllegalArgumentException("Red value needs to be between 0 and 255");
        } else if (green < 0 || green > 255) {
            throw new IllegalArgumentException("Green value needs to be between 0 and 255");
        } else if (blue <0 || blue > 255) {
            throw new IllegalArgumentException("Blue value needs to be between 0 and 255");
        }
        this.r = red;
        this.g = green;
        this.b = blue;
        this.colourModel = model;

    }

    public final float getR() {
        return this.r;
    }

    public final float getG() {
        return this.g;
    }

    public final float getB() {
        return this.b;
    }

    public final String getModel() {
        return this.colourModel;
    }
}
