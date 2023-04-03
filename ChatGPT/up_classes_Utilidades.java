package com.example.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static Date stringToDate(String str) {
        Date date = null;
        try {
            date = dateFormat.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static String formatDate(Date date) {
        if (date == null) {
            date = new Date();
        }
        return dateFormat.format(date);
    }

    public static int objectToInt(Object obj) {
        return Integer.parseInt(objectToString(obj));
    }

    public static double objectToDouble(Object obj) {
        return Double.parseDouble(objectToString(obj));
    }

    public static boolean objectToBoolean(Object obj) {
        String str = objectToString(obj);
        return Boolean.parseBoolean(str);
    }

    public static String objectToString(Object obj) {
        return obj != null ? obj.toString() : "";
    }

    public static Date objectToDate(Object obj) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = dateFormat.parse(objectToString(obj));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}

/**
Aqui estão as melhorias feitas no código:

Renomeou o pacote e a classe para seguir as convenções de nomenclatura padrão.
Adicionada uma constante para o formato de data para evitar a criação de uma nova instância de SimpleDateFormat toda vez que uma data precisa ser formatada ou analisada.
Usei nomes de variáveis mais descritivos para facilitar a leitura do código.
Verificação nula desnecessária removida e e.printStackTrace() adicionado para melhor tratamento de erros.
Método objectToBoolean simplificado chamando diretamente Boolean.parseBoolean.
Método objectToString simplificado usando um operador ternário.
Inicialização variável desnecessária removida em objectToInt e objectToDouble.
/*