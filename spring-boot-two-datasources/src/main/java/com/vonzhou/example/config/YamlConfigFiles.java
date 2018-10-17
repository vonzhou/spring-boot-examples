package com.vonzhou.example.config;


public final class YamlConfigFiles {

    private final static String CONFIG_FILE_NAMES = "classpath:/db.yml,classpath:/db2.yml";

    public static String getYamlConfigNames() {
        return CONFIG_FILE_NAMES;
    }

    public static String[] getConfigFileNames() {
        return CONFIG_FILE_NAMES.split(",");
    }
}
