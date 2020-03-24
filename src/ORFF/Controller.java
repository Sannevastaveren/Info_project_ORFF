package ORFF;

import java.util.HashMap;
import java.util.Map;

public class Controller {
    public Map<Integer,ORF> ORFs = new HashMap<>();

    private void run(){
        System.out.println("make this thing run shit");
    }
    public void addORF(ORF orf){
        System.out.println("adding ORF");
    }
    public void removeORF(ORF orf){
        System.out.println("removing ORF");
    }
}
