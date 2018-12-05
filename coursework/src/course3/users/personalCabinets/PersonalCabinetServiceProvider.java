package course3.users.personalCabinets;

import course3.journeyEntities.Service;
import course3.users.personalCabinets.PersonalCabinet;

import java.util.ArrayList;
import java.util.List;

public class PersonalCabinetServiceProvider extends PersonalCabinet {
    public static int lastId = 0;
    private String website;
    private List<Service> services;

    {
        this.userId = ++lastId;
    }

    public PersonalCabinetServiceProvider(String email, String password, String name, String surname, String phoneNumber) {
        super(email, password, name, surname, phoneNumber);
        services = new ArrayList<>();
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void addService(Service service){
        services.add(service);
    }
}
