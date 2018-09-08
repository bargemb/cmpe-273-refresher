class GenericDemo<O> {

    O obj;
    GenericDemo(O obj){
        this.obj = obj;
    }
    public O get(){
        return this.obj;
    }
}

