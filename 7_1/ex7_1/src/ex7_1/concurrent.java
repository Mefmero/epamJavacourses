package ex7_1;

public class concurrent {

    static class Task implements Runnable {
        transactions[] tran;
        RWL.Dict account;
        Sync sync = new Sync();

        @Override
        public void run() {
            System.out.println("I'm thread 1");
            if (sync.getI()<6) {
                tran[sync.getI()].transaction(account);
                sync.setI(sync.getI()+1);
            }
            else {
                System.exit(0);
            }
        }


        Task(transactions[] tran, RWL.Dict account,Sync sync){
            this.account=account;
            this.tran=tran;
            this.sync=sync;
        }
    }

}

class Sync{
    public int i;
    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }
}