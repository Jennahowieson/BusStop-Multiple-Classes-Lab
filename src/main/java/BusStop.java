import java.util.ArrayList;

public class BusStop {
    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<Person>();
    }

    public int countQueue(){
        return this.queue.size();
    }

    public void addToQueue (Person person){
        this.queue.add(person);
    }

    public Person removePassengerFromQueue(){
        return this.queue.remove(0);
    }
}
