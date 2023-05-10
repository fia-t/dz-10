import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication();
        try {
            bankApplication.process("accountId000", 50, "USD");
        } catch (exceptions.WrongAccountException e) {
            System.out.println(e.getMessage());
        } catch (exceptions.WrongCurrencyException e) {
            System.out.println(e.getMessage());
        } catch (exceptions.WrongOperationException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(String.format("Дякуємо, що скористалися нашим сервісом%n"));
        }

        try {
            bankApplication.process("accountId003", 250, "HRV");
        } catch (exceptions.WrongAccountException e) {
            System.out.println(e.getMessage());
        } catch (exceptions.WrongCurrencyException e) {
            System.out.println(e.getMessage());
        } catch (exceptions.WrongOperationException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(String.format("Дякуємо, що скористалися нашим сервісом%n"));
        }

        try {
            bankApplication.process("accountId001", 50, "EUR");
        } catch (exceptions.WrongAccountException e) {
            System.out.println(e.getMessage());
        } catch (exceptions.WrongCurrencyException e) {
            System.out.println(e.getMessage());
        } catch (exceptions.WrongOperationException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(String.format("Дякуємо, що скористалися нашим сервісом%n"));
        }

        try {
            bankApplication.process("accountId001", 50, "USD");
        } catch (exceptions.WrongAccountException e) {
            System.out.println(e.getMessage());
        } catch (exceptions.WrongCurrencyException e) {
            System.out.println(e.getMessage());
        } catch (exceptions.WrongOperationException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(String.format("Дякуємо, що скористалися нашим сервісом%n"));
        }

        try {
            bankApplication.process("accountId001", 1000, "USD");
        } catch (exceptions.WrongAccountException e) {
            System.out.println(e.getMessage());
        } catch (exceptions.WrongCurrencyException e) {
            System.out.println(e.getMessage());
        } catch (exceptions.WrongOperationException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(String.format("Дякуємо, що скористалися нашим сервісом%n"));
        }

        try {
            bankApplication.process("accountId005", 50, "HRV");
        } catch (exceptions.WrongAccountException e) {
            System.out.println(e.getMessage());
        } catch (exceptions.WrongCurrencyException e) {
            System.out.println(e.getMessage());
        } catch (exceptions.WrongOperationException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(String.format("Дякуємо, що скористалися нашим сервісом%n"));
        }


    }
}
