package com.mutia.foodapps.model

import java.io.Serializable

// Order model, implements Serializable to pass via Intent
data class ModelListOrder(
    var image : Int,
    var Nama : String,
    var Tanggal : String,
    var Harga : String,
    var Item : String
) : Serializable