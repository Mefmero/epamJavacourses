package ex7_1;

public class ex7_1 {

    public static void main(String[] args)  {
        Sync sync = new Sync();
        sync.setI(0);

        RWL.Dict account = new RWL.Dict();
        account.put(1001,23_804.95);
        account.put(1002,3_804.56);
        account.put(1003,7_804.32);
        account.put(1004,303_501.23);
        account.put(1005,8_120.89);

        transactions tran[] = new transactions[5];
            tran[0]= new transactions(1001,1003,300.12);
            tran[1]= new transactions(1004,1002,421.12);
            tran[2]= new transactions(1001,1004,802.12);
            tran[3]= new transactions(1005,1003,500.12);
            tran[4]= new transactions(1001,1002,360.12);

        Thread t1 = new Thread(new concurrent.Task(tran,account,sync));
        Thread t2 = new Thread(new concurrent.Task(tran,account,sync));

        t1.start();
        t2.start();

//        while (sync.getI() < tran.length) {
//
//        }

       account.Print();

    }

    }