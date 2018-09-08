class MyMultithread extends Thread {

    public int first;
    public int second;
    public MyMultithread(int a, int b){
        this.first = a;
        this.second = b;
    }
    public int multiply(){
        return this.first * this.second;
    }
    public void run(){
        System.out.println(multiply());
    }
}
