import java.util.*;



public class CDataType<T> implements IData {
    int helperindex;

    T data;
    Object[] dataarray; //Object for mixed DataTpes
    Object[] dataarryoposite;

    public CDataType(String... input) {
        dataarray = new Object[input.length];
        dataarryoposite = new Object[input.length];

        for(int i = 0; i < input.length; i++){
            dataarray[i] = parseData(input[i]);
            dataarryoposite[i] = null;
        }


    }
    private Object parseData(String value) {
        try {
            // Try to parse as Integer
            return Integer.parseInt(value);
        } catch (NumberFormatException e1) {
            try {
                // Try to parse as Double
                return Double.parseDouble(value);
            } catch (NumberFormatException e2) {
                // Otherwise treat as String
                try {
                    return Float.parseFloat(value);
                } catch (NumberFormatException e3) {
                    try{

                        return value.charAt(0);
                    } catch (NumberFormatException e4) {
                        try {

                            return Boolean.parseBoolean(value);
                        } catch (Exception e) {
                            return value;
                        }
                    }
                }
            }
        }
    }

    public void swapping(){
        if(dataarray != null && dataarryoposite != null && dataarray.length == dataarryoposite.length){
           //here I wanna put the dataarray in opposite direction
            helperindex = dataarray.length;

           //loop for initiating helperarray, beginning from the last to first index of dataarray
           for(int i=0; i<dataarray.length; i++){
               if(helperindex > 0){
                   dataarryoposite[i] = dataarray[helperindex-1];
               }
               helperindex--;
           }
            for(Object t : dataarray){
                System.out.println("Original: "+t);
            }
           if(dataarryoposite != null){
               for(Object t : dataarryoposite){
                   System.out.println("Opposite: "+t + " DataType: " + t.getClass().getName());
               }
           }
        }
        else{
            return;
        }
    }





}
