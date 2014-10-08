package decorator;

/**
 * Created by Lukas Rubikas on 14.10.8.
 */
public abstract class ServiceDecorator implements Service {

    protected Service service;

    public ServiceDecorator(Service newService) {
        this.service = newService;
    }

    public String getDescription() {
        return service.getDescription();
    }

    public double getCost(){
        return service.getCost();
    }

}
