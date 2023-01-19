package Company;

public class Main {
    public static void main(String[] args) {
        BankDetails details = new BankDetails();
        details.setBillNumber("123456789");
        details.setCorrespondenceBill("987654321");
        details.setBikNumber("12345");
        details.setBankName("Sber");
        details.setCity("Moscow");
        Company company = new Company("QWERTY", details);
            //some code

        details.setBillNumber("0123456789");
        System.out.println(company);

        BankDetails copy = new BankDetails(details.getBillNumber(),
                details.getCorrespondenceBill(), details.getBikNumber(),
                details.getBankName(), details.getCity());
        System.out.println(copy);

    }
}
