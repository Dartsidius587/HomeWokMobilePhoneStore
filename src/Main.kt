//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
	val store = Store()
	while (true) {
		
		println(
			"Добро пожаловать в магазин современных средств связи.\n" +
					"Пожалуйста выберите город для совершения дальнейших действий.\n" +
					"Либо вы можете покинуть нас, выбрав 0"
		)
		var i = 1
		store.listCity.forEach { println("${i++}. $it") }
		val city = readln()
		if (city !in ("0".."2")) {
			println("Не корректно выбран город.")
			continue
		}
		if (city == "0") break
		
		println("Выберете модель телефона, которую вы хотели бы купить")
		
		ModelPhone.infoListPhone(city, store)
		
		val number = readln().toInt()
		if (number !in (1..store.listPhone.size)) {
			println("Не коректно выбран телефон")
			continue
		}
		store.infoPhone(number - 1)
		
		println("Выберите действие которое вы хотели бы совершить:")
		when (city) {
			"1" -> println("1. Купить телефон.\n2. Отремонтировать телефон")
			"2" -> println("1. Купить телефон.")
		}
		
		when (val action = readln()) {
			"1", "2" -> store.buyPhone(city, action, number)
			else -> {
				println("Некорректное действие")
				continue
			}
		}
	}
}


