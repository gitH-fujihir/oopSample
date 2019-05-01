/**
 */
public class Prefecture {
    private String name = null;
    private int population = 0;
    private int area = 0;

    public Prefecture(String name, int population, int area){
        this.name = name;
        this.population = population;
        this.area = area;
    }

    public boolean isMiyagi(){
        String paramName = "宮城";
        return equealsName(paramName);
    }

    private boolean equealsName(String compareNname){
        return name.equals(compareNname);
    }

    public double getPoplurationDensity(){
        return (double) population / (double) area;
    }
}
