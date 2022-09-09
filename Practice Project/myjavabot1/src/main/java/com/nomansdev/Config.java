package com.nomansdev;

import io.github.cdimascio.dotenv.Dotenv;

public class Config {
    private static final Dotenv DOT_ENV = Dotenv.configure().ignoreIfMissing().load();

    public static String getKey(String key) {
        return DOT_ENV.get(key.toUpperCase());
    }
}
