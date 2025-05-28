package Requests;


public class QueueRequests {

    private NoRequest first;
    private NoRequest last;
    private int size;

    public QueueRequests(){
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public void enqueue(Request request){
        if(this.isEmpty()){
            this.first = new NoRequest(request);
            this.last = this.first;
        }else{
            NoRequest current = this.first;
            NoRequest prev = null;
            while(current != null && request.getPriority().ordinal() <= current.getRequest().getPriority().ordinal()){
                prev = current;
                current = current.getNext();
            }

            if(prev == null){
                this.first = new NoRequest(request, this.first);
            }else if(prev == this.last){
                this.last.setNext(new NoRequest(request));
                this.last = this.last.getNext();
            }
            else{
                prev.setNext(new NoRequest(request, current));
            }
        }

        this.size++;
    }

    public Request dequeue(){
        if(this.isEmpty()){
            return null;
        }else{
            Request request = this.first.getRequest();
            if(this.size == 1){
                this.first = null;
                this.last = null;
            }else{
                this.first = this.first.getNext();
            }
            this.size--;
            return request;
        }
    }

    public void print() {
        NoRequest current = this.first;
        while(current != null){
            System.out.println(current.getRequest());
            current = current.getNext();
        }
    }



}

