package net.ken.springinitstep.biz.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class Console {
    private String manufacturer;
    private String model;
    private Date release;

    public Console() {
    }

    public Console(String manufacturer, String model, Date release) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.release = release;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getRelease() {
        return release;
    }

    public void setRelease(Date release) {
        this.release = release;
    }
}
