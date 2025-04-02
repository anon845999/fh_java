import java.util.ArrayList;

public class Gen<t,e> {
    ArrayList<t> arrayList;
    private t value;
    private e next;
    private e before;

    public Gen() {
        arrayList = new ArrayList<>();
        value = null;
        next = null;
        before = null;

    }

    public void add(t t) {
        arrayList.add(t);

    }

    public e get(e type) {
        if(type instanceof String){
            StringBuilder sb = new StringBuilder();
            sb.append(type);
            sb.append("is a String!");
            return (e) sb.toString();
        }
        return this.next;
    }

}
