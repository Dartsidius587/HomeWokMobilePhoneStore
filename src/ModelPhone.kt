data class ModelPhone(val model: String, val price: Double, var count: Int = 0, var sumPrice: Double = 0.0) {
	override fun toString() = "Телефон: $model, цена: $price"
	
	companion object {
		fun infoListPhone(city: String, store: Store) {
			var i = 1
			when (city) {
				"1" -> store.listPhone.forEach {
					println(
						"${i++}. Модель: ${it.model}, цена: ${
							store.pricePhone(
								it.price,
								city
							)
						}"
					)
				}
				
				"2" -> store.listPhone.forEach { println("${i++} $it") }
			}
		}
	}
}
