package io.aturanj.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/encode-and-decode-tinyurl/
 */
public class EncodeAndDecodeTinyUrl {

    private final int baseOfEncodeDecode = 62;
    private final String charSet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    private Map<String, String> urlPairs = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {

        var shortUrl = "http://tinyurl.com/" + getBase62();
        urlPairs.put(shortUrl, longUrl);

        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return urlPairs.get(shortUrl);
    }

    private String getBase62() {

        int min = 0;
        int max = 9999999;
        int randomNumber = min + (int) (Math.random() * ((max - min) + 1));

        StringBuilder encodedUrl = new StringBuilder();
        var charsetArray = charSet.toCharArray();

        while (randomNumber > 0) {

            int index = randomNumber % baseOfEncodeDecode;

            randomNumber /= baseOfEncodeDecode;

            encodedUrl.append(charsetArray[index]);
        }

        return encodedUrl.toString();
    }

    public static void main(String[] args) {

        EncodeAndDecodeTinyUrl encodeAndDecodeTinyUrl = new EncodeAndDecodeTinyUrl();
        var shortUrl = encodeAndDecodeTinyUrl.encode("https://leetcode.com/problems/encode-and-decode-tinyurl/");
        var longUrl = encodeAndDecodeTinyUrl.decode(shortUrl);

        System.out.println("shortUrl = " + shortUrl);
        System.out.println("longUrl = " + longUrl);
    }
}
