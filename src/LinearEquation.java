import java.text.DecimalFormat;

public class LinearEquation {
    DecimalFormat formatter = new DecimalFormat("#.##");
    //instance variables
    private int X1;
    private int Y1;
    private int X2;
    private int Y2;

    //Creates an object
    public LinearEquation(int x1, int y1, int x2, int y2){
        X1=x1;
        Y1=y1;
        X2=x2;
        Y2=y2;
    }

    //Calculates and returns distance
    public double distance(){
        double distance = Math.sqrt(Math.pow(X2-X1,2)+Math.pow(Y2-Y1,2));
        return Double.parseDouble(formatter.format(distance));
    }

    //calculates and returns the slope
    public double slope(){
        double slope = (Y2-Y1)/(X2-X1);
        return slope;
    }
}