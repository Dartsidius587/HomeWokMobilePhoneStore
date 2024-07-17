class Store() : City(), Phone {
	
	val listPhone = mutableListOf(
		ModelPhone("Samsung", 56700.35),
		ModelPhone("Sony", 78000.25),
		ModelPhone("Apple", 120000.75),
		ModelPhone("Xiaomi", 37500.55)
	)
	
	override fun infoPhone(i: Int) {
		println(
			"Телефон ${listPhone[i].model} был куплен в количестве ${listPhone[i].count} ед.\n" +
					"Общая сумма покупок составила: ${listPhone[i].sumPrice} руб."
		)
	}
	
	override fun buyPhone(city: String, action: String, number: Int) {
		if (city == "1") {
			when (action) {
				"1" -> {
					println("Телефон ${listPhone[number - 1].model} куплен.")
					listPhone[number - 1].count++
					listPhone[number - 1].sumPrice += pricePhone(listPhone[number - 1].price, city)
				}
				
				"2" -> println("Телефон ${listPhone[number - 1]} отремонтирован.")
			}
			
		} else {
			println("Телефон ${listPhone[number - 1].model} куплен.")
			listPhone[number - 1].count++
			listPhone[number - 1].sumPrice += listPhone[number - 1].price
		}
	}
}

