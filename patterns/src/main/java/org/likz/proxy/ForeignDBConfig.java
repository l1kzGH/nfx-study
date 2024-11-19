package org.likz.proxy;

public class ForeignDBConfig implements DBConnect{

    private final String url;

    public ForeignDBConfig(String url) {
        this.url = url;
    }

    @Override
    public void connect(String databaseName) {
        System.out.println("Connected to " + url + "//" + databaseName);
    }

    public String getUrl() {
        return url;
    }
}
