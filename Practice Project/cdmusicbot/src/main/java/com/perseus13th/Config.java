package com.perseus13th;

import io.github.cdimascio.dotenv.Dotenv;

public class Config {
    private static final Dotenv ENV_FILE = Dotenv.configure().ignoreIfMissing().load();

    public static String getValue(String key) {
        return ENV_FILE.get(key.toUpperCase());
    }
}
