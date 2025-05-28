package Requests;

public class NoRequest {

    private Request request;
    private NoRequest next;

    public NoRequest(Request request) {
        this.request = request;
        this.next = null;
    }

    public NoRequest(Request request, NoRequest next) {
        this.request = request;
        this.next = next;
    }

    public Request getRequest() {
        return request;
    }
    public NoRequest getNext() {
        return next;
    }
    public void setNext(NoRequest next) {
        this.next = next;
    }

}
