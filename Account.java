static class Account implements Comparable<Account> { // A nested class to implement Comparable 
       String name;
       int accountNumber;
       public Account(String nm, int acn) { // // Constructor to initialise Account class with name and account number 
          name = nm; 
          accountNumber = acn;
       }
      @Override // Override method to compare the validity of account numbers 
      public int compareTo(Account account) { 
      if (this.accountNumber > account.accountNumber) return 1; // Valid account number  
      else if (this.accountNumber < account.accountNumber) return -1; // Invalid account number 
      else return 0; // Return nothing 
      }
}
