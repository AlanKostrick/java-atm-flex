
public class Atm {

	private int balance;
	private String requiredPin = "1234";

	public int getBalance() {

		return balance;
	}

	public String getRequiredPin() {
		return requiredPin;
	}

	public Atm(int balance) {
		this.balance = balance;
	}

	public void withdraw(int amount) {
		if (amount > balance) {
			balance -= 0;
			System.out.println("in-sufficient funds");
		} else if (amount % 10 != 0) {
			balance -= 0;
			System.out.println("please use multiples of 10");
		} else {
			balance -= amount;
		}

	}

	public void deposit(int amount) {
		balance += amount;

	}

	public boolean allowAccess(String enteredPin) {
		if (requiredPin.equals(enteredPin)) {
			return true;
		} else {
			return false;
		}

	}

}
