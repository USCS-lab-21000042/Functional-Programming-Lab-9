object  Q3 extends  App{
    class Accounts(name:String,balance:Int){
        var Name:String=this.name
        var Balance:Int=this.balance

        val Deposit=(amount:Int)=>{
            Balance=Balance+amount
            println(s"${Name} 's Current balance is after depositing ${Balance}")
        }

        val Withdraw=(amount:Int)=>{
            Balance=Balance-amount
            println(s"${Name} 's Current balance is after withdawing ${Balance}")
        }

        val Transefer=(amount:Int , receiver:Accounts)=>{
            Balance=Balance-amount
            receiver.Balance=receiver.Balance+amount
            println(s"${Name} 's Current balance is after transefing  ${Balance}")
            println(s"${receiver.Name} 's Current balance is  ${receiver.Balance}")
        }
    }
    var ac1=new Accounts("Account1",1000)
    var ac2=new Accounts("Account2",1000)
    ac1.Deposit(500)
    ac1.Withdraw(100)
    ac1.Transefer(400,ac2)
}
