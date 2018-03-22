package alexis;
import java.util.ArrayList;
import java.util.Vector;

public class Programax {
    //private Declarax s1;
    private ArrayList<Declarax> s1;
    private Statx s2;
    public Programax(ArrayList<Declarax> st1, Statx st2) {
        s1 = st1;
        s2 = st2;
        
    }
    
    public ArrayList<Declarax> getDeclaration() {return s1;}
    
    public Statx getStatement() {return s2;}
    
}
