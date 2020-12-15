public class Colour {
    float r;
    float g;
    float b;
    String colourModel;

    public Colour() {
    }

    public Colour(float red, float green, float blue, String model) {
        if (red < 0 || red > 255) {
            throw new IllegalArgumentException("Red value needs to be between 0 and 255.");
        } else if (green < 0 || green > 255) {
            throw new IllegalArgumentException("Green value needs to be between 0 and 255.");
        } else if (blue <0 || blue > 255) {
            throw new IllegalArgumentException("Blue value needs to be between 0 and 255.");
        } else if (!stringValidation(model)){
            throw new IllegalArgumentException("Colour model can only consist of letters.");
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

    public boolean stringValidation(String s) {
        s = s.toLowerCase();
        char[] charArray = s.toCharArray();
        for (char ch : charArray) {
            if (!(ch >= 'a' && ch <= 'z')) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        Colour that = (Colour) o;

        if (that == this) {
            return true;
        }

        if (that == null) {
            return false;
        }

        if (that.r != this.r){
            return false;
        } else if (that.g != this.g) {
            return false;
        } else if (that.b != this.b) {
            return false;
        } else if (!(that.colourModel.equals(this.colourModel))) {
            return false;
        }

        return true;
    }
}
