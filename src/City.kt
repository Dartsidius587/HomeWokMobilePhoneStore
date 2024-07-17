abstract class City {
	
	val listCity = listOf(
		"Москва", "Мурманск"
	)
	
	fun pricePhone(price: Double, city: String) = when (city) {
		"1" -> price + 750.0
		"2" -> price
		else -> 0.0
	}
	
}