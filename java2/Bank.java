
public class Bank {
    public static void main(String[] args) {
    	Exercise bank = new Exercise("Noida", 1.2f);
        SBI sbiBranch = new SBI("Kanpur",1.0f,"121");
        BOI boiBranch = new BOI("Delhi",1.5f,"863");
        ICICI iciciBranch = new ICICI("Gwalior",2.0f,"765");
        bank.getDetails();
        sbiBranch.getDetails();
        boiBranch.getDetails();
        iciciBranch.getDetails();
    }
}
