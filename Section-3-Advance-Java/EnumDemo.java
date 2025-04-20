enum Status {
    Pending, //0
    Running, //1
    Failed, //2
    Success; //3
}

public class EnumDemo {
    public static void main(String[] args) {
        Status s=Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal());

        Status[] sArr=Status.values();
        for (Status st: sArr)
            System.out.println(st+" : "+st.ordinal());

        s=Status.Failed;
        switch (s) {
            case Pending:
                System.out.println("Please wait...");
                break;
            case Running:
                System.out.println("All good...");
                break;
            case Failed:
                System.out.println("Something is wrong...");
                break;
            default:
                System.out.println("Done...");
        }
    }
}