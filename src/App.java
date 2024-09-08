public class App {
    public static void main(String[] args) throws Exception {
        
        Account savingsAccount = new Account("Namn Namnsson", 1000.00);
        Account salaryAccount = new Account(25000.00);
        Account funAccount = new Account();

        salaryAccount.setName("Test Tester");
        funAccount.setName("Test Tester");

        System.out.println(salaryAccount);

        funAccount.deposit(6000.00);
        System.out.println(funAccount);

        savingsAccount.withdraw(500.00);
        System.out.println(savingsAccount);

        System.out.println(savingsAccount.getName());

        savingsAccount.setName("Test Testsson");
        System.out.println(savingsAccount.getName());

        System.out.println(salaryAccount);
        System.out.println(savingsAccount);
        System.out.println(funAccount);
    }
}
