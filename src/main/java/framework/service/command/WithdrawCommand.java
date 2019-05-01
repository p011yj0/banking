package framework.service.command;

import framework.service.AccountService;

public class WithdrawCommand implements Command {

    private AccountService accountService;
    private String accountNumber;
    private Double amount;

    public WithdrawCommand(AccountService accountService, String accountNumber, Double amount) {
        this.accountService = accountService;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    @Override
    public void execute() {
        accountService.withdraw(accountNumber, amount);
    }
}
