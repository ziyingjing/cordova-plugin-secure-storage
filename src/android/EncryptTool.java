package com.crypho.plugins;

/**
 * Created by zhoujing on 9/23/21
 * Describe:
 */
public class EncryptTool {
    //加密过程
    //seed为加密种子，str为加密对象
    public static String encrypt(int seed,String str){
        byte[] bytes = str.getBytes();
        for(int i = 0;i<bytes.length;i++){
            bytes[i] += 1;
        }
        return new String(bytes);
    }

    //解密过程
    //seed为加密种子，str为解密对象
    public static String decryption(int seed,String str){
        byte[] bytes = str.getBytes();
        for(int i = 0;i<bytes.length;i++) {
            bytes[i] -= 1;
        }
        return new String(bytes);
    }

}
