package debit.service;

import framework.entity.Account;
import framework.entity.Customer;
import framework.entity.Transaction;
import framework.service.notification.EmailNotification;
import framework.service.notification.Observable;


public class CompanyAccountEmailNotification extends EmailNotification {

    public void update(Observable observable, Object arg) {
        Account account = (Account)observable;
        Double amount = (Double)arg;

        Customer company = account.getCustomer();
        String email = company.getAddress().getEmail();

        StringBuilder message = new StringBuilder();
        if(amount == null) {
            message.append("You don't have sufficient balance to make the withdraw");
        }   else {
            Transaction lastTransaction = account.getAllTransactions().get(account.getAllTransactions().size() - 1);
            message.append("Account number: " + account.getAccountNumber());
            message.append(" " + lastTransaction.getDescription());
            message.append(" amount: " + lastTransaction.getAmount());
            message.append(" at " + lastTransaction.getDate());
        }
        
        sendEmail("donotreply@bank.com", email, message.toString());

    }
}
