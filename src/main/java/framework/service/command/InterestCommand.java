package framework.service.command;

import framework.service.AccountService;

public class InterestCommand implements Command {

    private AccountService accountService;

    public InterestCommand(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public void execute() {
        accountService.addInterest();
    }
}
