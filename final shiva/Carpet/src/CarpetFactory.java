/**
 * This class implements the factory design pattern
 */

public class CarpetFactory {
    public Carpet getItem(String item, String size){
        if(item == null){
            return null;
        }
        if(item.equalsIgnoreCase("Traditional")) {
            Carpet g= new Traditional();
            ((Traditional) g).selectSize(size);
            return g;
        }
        else if(item.equalsIgnoreCase("Modern")){
            Carpet g= new Modern();
            ((Modern) g).selectSize(size);
            return g;
        }
        else if(item.equalsIgnoreCase("Designer")) {
            Carpet g= new Designer();
            ((Designer) g).selectSize(size);
            return g;
        }
        return null;
    }
}