object Q5 extends App {
  class Accounts(val name: String, val balance: Double) {
    // Using val instead of var for immutable properties
    override def toString: String = s"Account($name, $balance)"
  }

  val checkNegative = (list: List[Accounts]) => {
    val out = list.filter(_.balance < 0).map(_.name)
    println(s"Accounts with negative balances: ${out}")
    // out.foreach(println)
  }

  val getTotal = (list: List[Accounts]) => {
    val out = list.map(_.balance).sum
    println(s"Total balance of all accounts: $out")
  }

  def applyInterest(account: Accounts): Accounts = {
    if (account.balance >= 0)
      new Accounts(account.name, account.balance * 1.05)
    else
      new Accounts(account.name, account.balance * 1.1)
  }

  def applyInterestToAccounts(accounts: List[Accounts]): List[Accounts] = {
    accounts.map(applyInterest)
  }

  val list = List(new Accounts("ac1", 100), new Accounts("ac2", -200), new Accounts("ac3", 300))

  val listWithInterest = applyInterestToAccounts(list)
  checkNegative(list)
  getTotal(list)
  println(applyInterestToAccounts(list))
}
