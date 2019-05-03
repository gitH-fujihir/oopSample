public class PrefDensity {

    public static void main(String[] args) {
        Prefecture[] prefs = {
                new Prefecture("青森",1278000,9646),
                new Prefecture("宮城",2323000,7285),
                new Prefecture("秋田",996000,11610)
        };

        for(Prefecture pref : prefs){
            if(pref.isMiyagi()){
                System.out.println(pref.getPoplurationDensity());
            }
        }
    }
}
