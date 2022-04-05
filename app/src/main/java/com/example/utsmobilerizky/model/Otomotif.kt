// Rizky Maulana
// Tema Otomotif

package com.example.utsmobilerizky.model

interface IOtomotif
{
    fun Nyalakan();
    fun Matikan();
    fun Operasikan();
    fun SetKecepatan(value : Float);
    fun GetKecepatan() : Float;
    fun GetJenisMesin() : String;
    fun GetJumlahBan() : Int;
    fun GetBahanBakar() : String;
    fun GetPembuat() : String;
    fun GetImage() : Int;
}

abstract class Otomotif : IOtomotif
{
    protected abstract val  _pembuat :  String;
    protected abstract val _jumlahBan : Int;
    protected abstract val _jenisMesin : String;
    protected abstract val _jenisBahanBakar : String;
    protected abstract val _image : Int;
    protected abstract var _statusKecepatan : Float;
}

class Mobil(
    pembuat : String,
    jumlahBan: Int = 4,
    jenisMesin: String,
    jenisBahanBakar: String = "Solar",
    statusKecepatan: Float = 0.0f,
    image : Int = 0) : Otomotif()
{
    override val _pembuat: String;
    override val _jumlahBan: Int;
    override val _jenisMesin: String;
    override val _jenisBahanBakar: String;
    override var _statusKecepatan: Float = 0.0f;
    override val _image: Int;

    init
    {
        _pembuat = pembuat;
        _jumlahBan = jumlahBan;
        _jenisMesin = jenisMesin;
        _jenisBahanBakar = jenisBahanBakar;
        _image = image;
    }

    // Fungsi override dari Otomotif
    override fun Nyalakan() : Unit
    {
        println("Mesin mobil menyala");
    }

    override fun Matikan() : Unit
    {
        println("Mesin mobil dimatikan");
    }

    override fun Operasikan() : Unit
    {
        println("Mobil dioperasikan");
    }

    override fun SetKecepatan(value : Float)
    {
        _statusKecepatan = value;
    }

    override fun GetKecepatan() : Float
    {
        return _statusKecepatan;
    }

    override fun GetJenisMesin() : String
    {
        return _jenisMesin;
    }

    override fun GetJumlahBan() : Int
    {
        return _jumlahBan;
    }

    override fun GetBahanBakar() : String
    {
        return _jenisBahanBakar;
    }

    override fun GetPembuat() : String
    {
        return _pembuat;
    }

    override fun GetImage(): Int {
        return _image;
    }
}


class SepedaMotor(
    pembuat : String,
    jumlahBan: Int,
    jenisMesin: String,
    jenisBahanBakar: String = "Solar",
    statusKecepatan: Float = 0.0f,
    image: Int = 0) : Otomotif()
{
    override val _pembuat: String;
    override val _jumlahBan: Int;
    override val _jenisMesin: String;
    override val _jenisBahanBakar: String;
    override var _statusKecepatan: Float = 0.0f;
    override val _image: Int;

    init
    {
        _pembuat = pembuat;
        _jumlahBan = jumlahBan;
        _jenisMesin = jenisMesin;
        _jenisBahanBakar = jenisBahanBakar;
        _image = image
    }

    // Fungsi override dari Otomotif
    override fun Nyalakan() : Unit
    {
        println("Sepeda motor menyala");
    }

    override fun Matikan() : Unit
    {
        println("Sepeda motor dimatikan");
    }

    override fun Operasikan() : Unit
    {
        println("Sepeda motor dioperasikan");
    }

    override fun SetKecepatan(value : Float)
    {
        _statusKecepatan = value;
    }

    override fun GetKecepatan() : Float
    {
        return _statusKecepatan;
    }

    override fun GetJenisMesin() : String
    {
        return _jenisMesin;
    }

    override fun GetJumlahBan() : Int
    {
        return _jumlahBan;
    }

    override fun GetBahanBakar() : String
    {
        return _jenisBahanBakar;
    }

    override fun GetPembuat() : String
    {
        return _pembuat;
    }

    override fun GetImage(): Int {
        return _image;
    }
}