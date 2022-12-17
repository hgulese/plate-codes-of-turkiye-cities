package com.huseyinilker.platecode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            var plate = findViewById<EditText>(R.id.editTextNumber).text.toString()
            plateCode(plate)
        }
    }

    private fun plateCode(plate: String) {
        when (plate) {
            "01" -> findViewById<TextView>(R.id.textView).text = "ADANA"
            "02" -> findViewById<TextView>(R.id.textView).text = "ADIYAMAN"
            "03" -> findViewById<TextView>(R.id.textView).text = "AFYON"
            "04" -> findViewById<TextView>(R.id.textView).text = "AĞRI"
            "05" -> findViewById<TextView>(R.id.textView).text = "AMASYA"
            "06" -> findViewById<TextView>(R.id.textView).text = "ANKARA"
            "07" -> findViewById<TextView>(R.id.textView).text = "ANTALYA"
            "08" -> findViewById<TextView>(R.id.textView).text = "ARTVİN"
            "09" -> findViewById<TextView>(R.id.textView).text = "AYDIN"
            "10" -> findViewById<TextView>(R.id.textView).text = "BALIKESİR"
            "11" -> findViewById<TextView>(R.id.textView).text = "BİLECİK"
            "12" -> findViewById<TextView>(R.id.textView).text = "BİNGÖL"
            "13" -> findViewById<TextView>(R.id.textView).text = "BİTLİS"
            "14" -> findViewById<TextView>(R.id.textView).text = "BOLU"
            "15" -> findViewById<TextView>(R.id.textView).text = "BURDUR"
            "16" -> findViewById<TextView>(R.id.textView).text = "BURSA"
            "17" -> findViewById<TextView>(R.id.textView).text = "ÇANAKKALE"
            "18" -> findViewById<TextView>(R.id.textView).text = "ÇANKIRI"
            "19" -> findViewById<TextView>(R.id.textView).text = "ÇORUM"
            "20" -> findViewById<TextView>(R.id.textView).text = "DENİZLİ"
            "21" -> findViewById<TextView>(R.id.textView).text = "DİYARBAKIR"
            "22" -> findViewById<TextView>(R.id.textView).text = "EDİRNE"
            "23" -> findViewById<TextView>(R.id.textView).text = "ELAZIĞ"
            "24" -> findViewById<TextView>(R.id.textView).text = "ERZİNCAN"
            "25" -> findViewById<TextView>(R.id.textView).text = "ERZURUM"
            "26" -> findViewById<TextView>(R.id.textView).text = "ESKİŞEHİR"
            "27" -> findViewById<TextView>(R.id.textView).text = "GAZİANTEP"
            "28" -> findViewById<TextView>(R.id.textView).text = "GİRESUN"
            "29" -> findViewById<TextView>(R.id.textView).text = "GÜMÜŞHANE"
            "30" -> findViewById<TextView>(R.id.textView).text = "HAKKARİ"
            "31" -> findViewById<TextView>(R.id.textView).text = "HATAY"
            "32" -> findViewById<TextView>(R.id.textView).text = "ISPARTA"
            "33" -> findViewById<TextView>(R.id.textView).text = "İÇEL"
            "34" -> findViewById<TextView>(R.id.textView).text = "İSTANBUL"
            "35" -> findViewById<TextView>(R.id.textView).text = "İZMİR"
            "36" -> findViewById<TextView>(R.id.textView).text = "KARS"
            "37" -> findViewById<TextView>(R.id.textView).text = "KASTAMONU"
            "38" -> findViewById<TextView>(R.id.textView).text = "KAYSERİ"
            "39" -> findViewById<TextView>(R.id.textView).text = "KIRKLARELİ"
            "40" -> findViewById<TextView>(R.id.textView).text = "KIRŞEHİR"
            "41" -> findViewById<TextView>(R.id.textView).text = "KOCAELİ"
            "42" -> findViewById<TextView>(R.id.textView).text = "KONYA"
            "43" -> findViewById<TextView>(R.id.textView).text = "KÜTAHYA"
            "44" -> findViewById<TextView>(R.id.textView).text = "MALATYA"
            "45" -> findViewById<TextView>(R.id.textView).text = "MANİSA"
            "46" -> findViewById<TextView>(R.id.textView).text = "KAHRAMANMARAŞ"
            "47" -> findViewById<TextView>(R.id.textView).text = "MARDİN"
            "48" -> findViewById<TextView>(R.id.textView).text = "MUĞLA"
            "49" -> findViewById<TextView>(R.id.textView).text = "MUŞ"
            "50" -> findViewById<TextView>(R.id.textView).text = "NEVŞEHİR"
            "51" -> findViewById<TextView>(R.id.textView).text = "NİĞDE"
            "52" -> findViewById<TextView>(R.id.textView).text = "ORDU"
            "53" -> findViewById<TextView>(R.id.textView).text = "RİZE"
            "54" -> findViewById<TextView>(R.id.textView).text = "SAKARYA"
            "55" -> findViewById<TextView>(R.id.textView).text = "SAMSUN"
            "56" -> findViewById<TextView>(R.id.textView).text = "SİİRT"
            "57" -> findViewById<TextView>(R.id.textView).text = "SİNOP"
            "58" -> findViewById<TextView>(R.id.textView).text = "SİVAS"
            "59" -> findViewById<TextView>(R.id.textView).text = "TEKİRDAĞ"
            "60" -> findViewById<TextView>(R.id.textView).text = "TOKAT"
            "61" -> findViewById<TextView>(R.id.textView).text = "TRABZON"
            "62" -> findViewById<TextView>(R.id.textView).text = "TUNCELİ"
            "63" -> findViewById<TextView>(R.id.textView).text = "ŞANLIURFA"
            "64" -> findViewById<TextView>(R.id.textView).text = "UŞAK"
            "65" -> findViewById<TextView>(R.id.textView).text = "VAN"
            "66" -> findViewById<TextView>(R.id.textView).text = "YOZGAT"
            "67" -> findViewById<TextView>(R.id.textView).text = "ZONGULDAK"
            "68" -> findViewById<TextView>(R.id.textView).text = "AKSARAY"
            "69" -> findViewById<TextView>(R.id.textView).text = "BAYBURT"
            "70" -> findViewById<TextView>(R.id.textView).text = "KARAMAN"
            "71" -> findViewById<TextView>(R.id.textView).text = "KIRIKKALE"
            "72" -> findViewById<TextView>(R.id.textView).text = "BATMAN"
            "73" -> findViewById<TextView>(R.id.textView).text = "ŞIRNAK"
            "74" -> findViewById<TextView>(R.id.textView).text = "BARTIN"
            "75" -> findViewById<TextView>(R.id.textView).text = "ARDAHAN"
            "76" -> findViewById<TextView>(R.id.textView).text = "IĞDIR"
            "77" -> findViewById<TextView>(R.id.textView).text = "YALOVA"
            "78" -> findViewById<TextView>(R.id.textView).text = "KARABÜK"
            "79" -> findViewById<TextView>(R.id.textView).text = "KİLİS"
            "80" -> findViewById<TextView>(R.id.textView).text = "OSMANİYE"
            "81" -> findViewById<TextView>(R.id.textView).text = "DÜZCE"

            else -> findViewById<TextView>(R.id.textView).text = "Please enter a valid license plate code."
        }
    }
}