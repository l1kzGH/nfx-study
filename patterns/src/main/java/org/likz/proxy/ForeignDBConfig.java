package org.likz.proxy;

public class ForeignDBConfig implements DBConnect{

    private final String databaseName;
    private final String url;

    public ForeignDBConfig(String databaseName, String url) {
        this.databaseName = databaseName;
        this.url = url;
    }

    @Override
    public void connect() {
        System.out.println("Connected to " + url + "//" + databaseName);
    }
}
