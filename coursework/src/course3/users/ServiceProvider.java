package course3.users;

import course3.journeyEntities.Service;
import course3.users.personalCabinets.PersonalCabinet;
import course3.users.personalCabinets.PersonalCabinetServiceProvider;

import java.util.ArrayList;
import java.util.List;

public class ServiceProvider {
    PersonalCabinet personalCabinet;
    List<Service> services;

    public ServiceProvider(PersonalCabinetServiceProvider personalCabinet) {
        this.personalCabinet = personalCabinet;
        services = new ArrayList<>();
    }

    public void addService (Service service){
        services.add(service);
    }

    public void updatePersonalCabinet(PersonalCabinetServiceProvider personalCabinet){
        this.personalCabinet = personalCabinet;
    }
}
