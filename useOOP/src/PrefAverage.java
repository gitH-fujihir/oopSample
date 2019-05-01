public class PrefAverage {

    public static void main(String[] args) {
	// write your code here
        Prefecture[] prefs = {
                new Prefecture("青森",1278000,9646),
                new Prefecture("宮城",2323000,11610),
                new Prefecture("青森",996000,7285)
        };

        for(Prefecture pref : prefs){
            if(pref.isMiyagi()){
                System.out.println(pref.getPoplurationDensity());
            }
        }
    }
}
