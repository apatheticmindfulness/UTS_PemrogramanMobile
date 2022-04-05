package com.example.utsmobilerizky.data

import com.example.utsmobilerizky.R
import com.example.utsmobilerizky.model.Otomotif
import com.example.utsmobilerizky.model.Mobil
import com.example.utsmobilerizky.model.SepedaMotor

class Datasource
{
    fun loadOtomotif() : List<Otomotif>
    {
        return listOf<Otomotif>(
            SepedaMotor("Super Cub", 2, "V8", "Solar", image = R.drawable.supercub),
            Mobil("BMW", 4, "BMW Engine", "Solar", image= R.drawable.bmw),
            SepedaMotor("Ducati", 2, "Ducati Engine", "Solar", image = R.drawable.ducati),
            Mobil("Lada", 4, "Old Lada Engine", "Solar", image= R.drawable.lada),
            SepedaMotor("Triump", 2, "V8", "Solar", image = R.drawable.triumph),
            Mobil("Mercedes", 4, "Mercedes Engine", "Solar", image= R.drawable.mercedes),
            Mobil("Toyota", 2, "Toyota Engine", "Solar", image = R.drawable.toyota),
            Mobil("Mustang", 4, "Mustang Engine", "Solar", image= R.drawable.mustang),
            Mobil("VW", 4, "VW Engine", "Solar", image= R.drawable.vw),
            Mobil("Bugatti", 4, "Bugatti Engine", "Solar", image = R.drawable.bugatti)
        )
    }
}