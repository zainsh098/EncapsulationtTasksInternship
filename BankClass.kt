package com.example.encapsulationtasks


fun main()
{
 // val immutable is used here to make the variable immutable not changed
    val bankAccount:BankAccount=BankAccount(1000.0)

    bankAccount.deposit(500.0)
    print("  ")
    bankAccount.withdraw(200.0)


    print( bankAccount.currentBalance())





}
class BankAccount(private var balance:Double ){




    fun deposit(amount:Double)
    {
        if(amount>0)
        {
            balance+=amount;
            println("amount deposited $amount")
            println("  ")

            println("Total Amount :  $balance")

        }
        else
        {
            println("invalid amount")

        }


    }

    fun withdraw(amount:Double){

        if(amount>0 && amount<=balance)
        {
            balance-=amount;

            println("amount withdrawn $amount")


        }




    }


    fun  currentBalance()
    {

        println("current balance is $balance")

    }

}