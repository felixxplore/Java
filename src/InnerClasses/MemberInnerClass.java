package InnerClasses;


class BankAccount{
    private  String accountNUmber;
    private double balance;

    public BankAccount(String accountNUmber,double balance){
        this.accountNUmber=accountNUmber;
        this.balance=balance;
    }

    public class Transaction{
        private String type;
        private double amount;

        public Transaction(String type,double amount){
            this.type=type;
            this.amount=amount;
        }

        public void execute(){
            if(type.equals("deposit")){
                balance+=amount;
                System.out.println("deposited "+ amount+"in "+ accountNUmber+" now avaialable balance is  :" +balance);
            }else if(type.equals("withdraw") && balance>=amount){
                balance-=amount;
                System.out.println(amount+" withdraw from "+accountNUmber+" now balance is : "+ balance);
            }else{
                System.out.println("Insufficient fund for withdraw : "+accountNUmber);
            }
        }
    }
}

public class MemberInnerClass {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount("12345",1000);
        BankAccount.Transaction deposit=b1.new Transaction("deposit",200);
        deposit.execute();
        BankAccount.Transaction withdraw=b1.new Transaction("withdraw",100);
        withdraw.execute();
    }
}
