package org.likz.proxy;

public class ForeignDBProxy implements DBConnect{

    private final ForeignDBConfig dbConfig;
    /**
     * isActive saves connection-status
     * dbName cached when method "connect" called
     */
    private String dbName;
    private boolean isActive;

    public ForeignDBProxy(ForeignDBConfig dbConfig){
        this.dbConfig = dbConfig;
        this.isActive = false;
        this.dbName = null;
    }

    @Override
    public void connect(String databaseName) {
        if(!isActive || !databaseName.equals(this.dbName)){
            this.dbName = databaseName;
            isActive = true;
            dbConfig.connect(databaseName);
        } else {
            System.out.println("Already connected to " + dbConfig.getUrl() + "/" + databaseName);
        }
    }
}
