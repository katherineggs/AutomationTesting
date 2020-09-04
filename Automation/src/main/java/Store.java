import java.util.List;

public class Store {
    List<Builder> builders;

    public Store(List<Builder> builders){
        this.builders = builders;
    }

    public void work(){
        builders.forEach(d ->d.buildCar());
    }
}
