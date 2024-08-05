public class Simple_interest {
    public static void main(String[] arg)
    {
        int principal_ammount=1000, interest_rate=7, time=2;
        float simple_interest=(float) principal_ammount*interest_rate*time/100;
        float totel_ammount=principal_ammount+simple_interest;
        System.out.println("simple interest of (principal_ammount = "+principal_ammount+", interest_rate = " + interest_rate+", time (in years) = "+time+") is "+simple_interest+" and total ammount is "+totel_ammount);
    }
}
