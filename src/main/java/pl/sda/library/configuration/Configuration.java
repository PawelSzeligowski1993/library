
package pl.sda.library.configuration;

public class Configuration {

    private static Configuration instance;

    private Configuration() {
    }


    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }
}