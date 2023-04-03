
package up_classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilidades {
    public static boolean isNumeric(String Numero) {
        try {
            Integer.valueOf(Numero);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    
    public static Date StringtoDate(String Data) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date x = null;
        try {
            x = sdf.parse(Data);
        } catch (ParseException ex) {
            
        }
        return x;
    }
    
    public static String formatDate(Date Data) {
        if (Data == null) {
            Data = new Date();
        }
        SimpleDateFormat formatoTexto = new SimpleDateFormat("yyyy/MM/dd");
        return formatoTexto.format(Data);
    }
    
    public static int objectToInt(Object obj) {
        int NumInt = Integer.parseInt(objectToString(obj));
        return NumInt;
    }
    
    public static double objectToDouble(Object obj) {
        String str = obj.toString();
        double NumDoule = Double.parseDouble(str);
        return NumDoule;
    }
    
    public static boolean objectToBoolean(Object obj) {
        String CadBool = objectToString(obj);
        Boolean bool = Boolean.valueOf(CadBool);
        return bool;
    }
    
    public static String objectToString(Object obj) {
        String str = "";
        if (obj != null) {
            str = obj.toString();
        }
        return str;
    }
    
    public static Date objectToDate(Object obj) {
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
        Date aux = null;
        try {
            aux = formatoDelTexto.parse(objectToString(obj));
        } catch (ParseException ex) {
        }
        return aux;
    }
}
