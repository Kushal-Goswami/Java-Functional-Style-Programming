package org.example.finterfaces.supplier;

import java.util.function.Supplier;

class Configuration
{
    private String url;
    private int id;

    public Configuration(String url, int id) {
        this.url = url;
        this.id = id;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Configuration{" +
                "url='" + url + '\'' +
                ", id=" + id +
                '}';
    }
}
public class SupplierConfiguration {
    public static void main(String[] args) {

        Supplier<Configuration>defaultConfiguration=() ->new Configuration("http://localhost:8080", 1);

        Configuration config=defaultConfiguration.get();
        System.out.println(config);

    }
}
