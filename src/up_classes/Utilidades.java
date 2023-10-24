package up_classes;

import java.text.DateFormat;
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

    public static double convertStringToDouble(String str) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    public static Date convertStringToDate(String dateString) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(dateString);
        return date;
    }

    public static String convertDateToString(Date date) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(date);
    }

    public static String formatDate(Date Data) {
        if (Data == null) {
            Data = new Date();
        }
        SimpleDateFormat formatoTexto = new SimpleDateFormat("yyyy/MM/dd");
        return formatoTexto.format(Data);
    }

    public static String dateFormat(Date date, String pattern) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        return dateFormat.format(date);
    }

    /*
    public static int objectToInt(Object obj) {
        int NumInt = Integer.parseInt(objectToString(obj));
        return NumInt;
    }
     */
    public static int objectToInt(Object obj) {
        String strValue = objectToString(obj);
        if (strValue != null && !strValue.isEmpty()) {
            try {
                return Integer.parseInt(strValue);
            } catch (NumberFormatException e) {
                System.err.println("Erro na conversão para int: " + e.getMessage());
            }
        }
        return 0;
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
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date aux = null;
        try {
            aux = formatoDelTexto.parse(objectToString(obj));
        } catch (ParseException ex) {
        }
        return aux;
    }

    public static String extractNumber(String barcode) {
        StringBuilder numberBuilder = new StringBuilder();

        for (char c : barcode.toCharArray()) {
            if (Character.isDigit(c)) {
                numberBuilder.append(c);
            }
        }

        return numberBuilder.toString();
    }

    public static double parseFloatWithComma(String numberString) {
        String number = numberString.replace(",", ".");
        return Double.parseDouble(number);
    }

    public static Date convertLongToDate(long timestamp) {
        return new Date(timestamp);
    }

    public static int stringToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("A string nao e um numero valido: " + str);
        }
    }

    public static String intToString(int numero) {
        return String.valueOf(numero);
    }

    public static double stringToDouble(String str) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("A string nao e um numero valido: " + str);
        }
    }

    public static String doubleToString(double valor) {
        return Double.toString(valor);
    }
}
/**
 * 01000111 01101001 01101111 01110110 01100001 01101110 01101110 01101001
 */
