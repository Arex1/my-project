package com.arex.designmode.singleton;

/**
 * Arex
 *
 * @author weiwei-gu
 * com.arex.designmode.singleton
 * 2019/10/22
 */
public class SingletonMode {

    public static void main(String[] args) {
        LazySingleton instance = LazySingleton.getInstance();
        LazySingleton safeInstance = LazySingleton.getSafeInstance();
        System.out.println(
                "" + instance
        );
        System.out.println(
                "" + safeInstance
        );
    }
}
