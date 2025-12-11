package GeometricObjects;
import java.util.Date;

public class GeometricObject {
    private String colour = "white";
    private boolean filled;
    private Date dateCreated;

    public GeometricObject(){
        this.dateCreated = new Date();
    }

    public GeometricObject(String colour, boolean filled){
        this.dateCreated = new Date();
        this.colour = colour;
        this.filled = filled;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {

        //Idk what this method is or how it works, tab suggestion gave it to me. Gonna test. Write another method later
        return super.toString();
    }
}
