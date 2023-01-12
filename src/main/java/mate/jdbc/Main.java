package mate.jdbc;

import mate.jdbc.dao.ManufacturerDao;
import mate.jdbc.lib.Injector;
import mate.jdbc.model.Manufacturer;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.jdbc.dao");

    public static void main(String[] args) {

        ManufacturerDao manufacturerDao = (ManufacturerDao) injector
                .getInstance(ManufacturerDao.class);
        System.out.println(manufacturerDao.getAll());
        Manufacturer newManufacturer = new Manufacturer();
        newManufacturer.setCountry("Corea");
        newManufacturer.setName("KIA");
        System.out.println(manufacturerDao.create(newManufacturer));
        Manufacturer updateManufacturer = new Manufacturer();
        updateManufacturer.setName("Wolkswagen");
        updateManufacturer.setId(11L);
        updateManufacturer.setCountry("Germany");
        System.out.println(manufacturerDao.update(updateManufacturer));
        System.out.println(manufacturerDao.delete(2L));
        System.out.println(manufacturerDao.get(2L));
    }
}
