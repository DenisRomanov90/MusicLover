class Users(val name: String, var Purchases: Int, var musicLover: Boolean) {

    public fun makePurchase (price: Int){
        var kopeyka: Int = price*100
        var discount : Double = 0.0
        var rubl : Int
        if (Purchases in 0..1_000){
            if (musicLover){
                discount = (kopeyka * 0.01)
            }
            rubl = (discount/100).toInt()
            kopeyka = (discount % 100).toInt()
            println("$name ваша  скидка составила $rubl рублей $kopeyka копеек")
        }
        else if (Purchases in 1_001..10_000){
            rubl = 100
            if (musicLover){
                discount = (kopeyka - 10000).toDouble()
                discount = (discount * 0.01)
                rubl = (discount/100).toInt()
                kopeyka = (discount % 100).toInt()
            }
            kopeyka = (discount % 100).toInt()
            println("$name ваша  скидка составила $rubl рублей $kopeyka копеек")
        }
        else {
            discount = kopeyka * 0.05
            if (musicLover){
                discount -= (discount * .01)
            }
            rubl = (discount/100).toInt()
            kopeyka = (discount % 100).toInt()
            println("$name ваша  скидка составила $rubl рублей $kopeyka копеек")
        }
    }

}