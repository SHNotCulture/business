package com.business.util;

/** MD5加密类 */
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MD5 {
    private final static String[] hexDigits = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };

    private static String byteArrayToHexString(byte[] b) {
        StringBuffer resultSb = new StringBuffer();
        for (int i = 0; i < b.length; i++) {
            resultSb.append(byteToHexString(b[i]));
        }
        return resultSb.toString();
    }
    private static String byteToHexString(byte b) {
        int n = b;
        if (n < 0)
            n = 256 + n;
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigits[d1] + hexDigits[d2];
    }
    public static String MD5Encode(String origin) {
        String resultString = null;
        try {
            resultString = new String(origin);
            MessageDigest md = MessageDigest.getInstance("MD5");
            resultString = byteArrayToHexString(md.digest(resultString.getBytes()));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return resultString;
    }
    public static String monthHOUR(Integer m){
        SimpleDateFormat sdf_hh = new SimpleDateFormat("yyyyMMddHH");
        String str = "";
        Date myDate = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(myDate);
        c.add(Calendar.HOUR, m);
        myDate = c.getTime();
        str = sdf_hh.format(myDate);
        return str;
    }
    //对key值进行加上时间的加密
    public static String doMd5(String key){
        String date1=MD5.monthHOUR(0);
        String key1=MD5.MD5Encode(key+date1);
        return key1;
    }
//    public static void main(String[] args) {
//        String key="BDmlp48liikpom9hj7eczwj7aduGh7io";
//        String date1=MD5.monthHOUR(0);
//        String key1=MD5.MD5Encode(key+date1);
//        System.out.println(key1);
//    }
}
