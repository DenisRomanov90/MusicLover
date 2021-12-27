fun main(args: Array<String>) {
    var vasya = Users("Вася", 100000,true)
    var ivan = Users("Иван", 0, true)
    var gena = Users("Геннадий", 1435,true)
    ivan.makePurchase(1000)
    vasya.makePurchase(545)
    gena.makePurchase(700)
}

