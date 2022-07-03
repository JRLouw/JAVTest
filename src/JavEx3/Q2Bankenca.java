package JavEx3;

public class Q2Bankenca {
        //hiding class data
        public double balance=50 ;
        public void setBalance(double balance) {
            //validation logic
            this.balance = this.balance + balance ;
        }
        public double getBalance() {
            //add validation logic
            return balance ;
        }
    }
