package io.github.fortibbrine.base64coder.utils;

import java.util.Base64;

public class Base64Util {

    private Base64.Encoder encoder = Base64.getEncoder();
    private Base64.Decoder decoder = Base64.getDecoder();

    public String encode(String str) {
        return encoder.encodeToString(str.getBytes());
    }

    public String decode(String str) {
        return new String(decoder.decode(str));
    }

}
