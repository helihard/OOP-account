public class App {
    public static void main(String[] args) throws Exception {
        
        Account savingsAccount = new Account("Namn Namnsson", 1000);
        Account salaryAccount = new Account("Test Tester", 25000);

        System.out.println(savingsAccount);
        System.out.println(salaryAccount);

        salaryAccount.deposit(6000);
        System.out.println(salaryAccount);

        savingsAccount.withdraw(500);
        System.out.println(savingsAccount);

        System.out.println(savingsAccount.getName());
        savingsAccount.setName("Test Tester");
        System.out.println(savingsAccount.getName());
    }
}
