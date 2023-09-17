package com.example.demo.controller;

import org.apache.commons.codec.binary.Hex;

import java.security.SecureRandom;

public class Salt {
    public static String generateSalt() {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        return Hex.encodeHexString(salt);
    }
}
