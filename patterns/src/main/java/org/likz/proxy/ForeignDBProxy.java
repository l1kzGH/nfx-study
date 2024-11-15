package org.likz.proxy;

public class ForeignDBProxy implements DBConnect{

    private final ForeignDBConfig dbConfig;
    // пример *сохранения* поключения к бд
    // вместо этого, можно кешировать/сохранять различную информацию и получать её без переподключений/обращений к бд
    private boolean isActive;

    public ForeignDBProxy(ForeignDBConfig dbConfig){
        this.dbConfig = dbConfig;
        this.isActive = false;
    }

    @Override
    public void connect() {
        if(!isActive){
            isActive = true;
            dbConfig.connect();
        } else {
            System.out.println("Already connected!");
        }
    }
}
