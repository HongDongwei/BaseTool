package com.example.tool;

import java.io.File;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Android Studio.
 * User: hongdw
 * Date: 2020/2/11
 * Time: 16:52
 */
public class MD5Utils {
    /**
     * md5加密
     * @param info
     * @return
     */
    public static String getMD5(String info)
    {
        try
        {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(info.getBytes("UTF-8"));
            byte[] encryption = md5.digest();

            StringBuffer strBuf = new StringBuffer();
            for (int i = 0; i < encryption.length; i++)
            {
                if (Integer.toHexString(0xff & encryption[i]).length() == 1)
                {
                    strBuf.append("0").append(Integer.toHexString(0xff & encryption[i]));
                }
                else
                {
                    strBuf.append(Integer.toHexString(0xff & encryption[i]));
                }
            }

            return strBuf.toString();
        }
        catch (NoSuchAlgorithmException e)
        {
            return "";
        }
        catch (UnsupportedEncodingException e)
        {
            return "";
        }
    }

 public static String encryptMD5File2String(File file){
     if (!file.isFile()) {
         return null;
     }
     MessageDigest digest = null;
     FileInputStream in = null;
     byte buffer[] = new byte[1024];
     int len;
     try {
         digest = MessageDigest.getInstance("MD5");
         in = new FileInputStream(file);
         while ((len = in.read(buffer, 0, 1024)) != -1) {
             digest.update(buffer, 0, len);
         }
         in.close();
     } catch (Exception e) {
         e.printStackTrace();
         return null;
     }
     BigInteger bigInt = new BigInteger(1, digest.digest());
     return bigInt.toString(16);
 }

}
