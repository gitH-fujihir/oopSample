/**
 */
public class PrefDensity {
    public static void main(String[] args) {
        //0:青森、1:宮城、2:秋田　のデータを入れる。
        String[] prefNames = {"青森", "宮城", "秋田"};
        int[] prefPop = {1278000, 2323000, 996000};//人口
        int[] prefArea = {9646,7285,11610};//面積㎢

        double density = 0.0;
        for(int i = 0; i < prefNames.length; i++){
            if(prefNames[i].equals("宮城")){
                density = (double)prefPop[i] / (double)prefArea[i];
            }
        }

        System.out.println(density);
    }
}
