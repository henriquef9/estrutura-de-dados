package Requests;

public class Request {
    private String name;
    private Priority priority;

    public Request(String name, Priority priority) {
        this.name = name;
        this.priority = priority;
    }
    public String getName() {
        return name;
    }
    public Priority getPriority() {
        return priority;
    }

    @Override
    public String toString(){
        return "{ name: "+this.name+", priority: "+this.priority+" }";
    }

}
