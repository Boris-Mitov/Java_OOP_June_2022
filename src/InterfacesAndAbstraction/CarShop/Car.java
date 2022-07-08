package InterfacesAndAbstraction.CarShop;

import java.io.Serializable;

public interface Car extends Serializable {
    int TIRES = 4; //public static final by default

    String getModel();
    String getColor();
    Integer getHorsePower();
    String countryProduced();

}
