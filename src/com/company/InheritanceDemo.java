import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        Worker w1, w2, w3;
        SalaryWorker s1, s2, s3;
        ArrayList<Worker> workerList = new ArrayList<Worker>();

        workerList.add(new Worker("000001", "Kenneth", "Wagner", "Mr.", 1995, 22.25));
        workerList.add(new Worker("000002", "Carolena", "Wagner", "Mrs.", 1965, 21.50));
        workerList.add(new Worker("000003", "Drew", "Salmons", "Ms.", 1999, 14.35));
        workerList.add(new SalaryWorker("000004", "Tom", "Wulf", "Mr.", 1950, (200000/(52*7*24)), 200000));
        workerList.add(new SalaryWorker("000005", "George", "Washington", "Mr.", 2000, (500000/(52*7*24)), 500000));
        workerList.add(new SalaryWorker("000006", "Abraham", "Lincoln", "Mrs.", 1973, (1000000/(52*7*24)), 1000000));

        for(Worker i : workerList)
        {
            System.out.println("Week 1");
            System.out.println(i.displayWeeklyPay(40));
        }


        for(Worker i : workerList)
        {
            System.out.println("Week 2");
            System.out.println(i.displayWeeklyPay(50));
        }


        for(Worker i : workerList)
        {
            System.out.println("Week 3");
            System.out.println(i.displayWeeklyPay(40));
        }
    }
}