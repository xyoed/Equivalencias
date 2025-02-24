package com.ar.edgarglienke.equivalencias

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val listaDatos = mapOf(
        "6004" to "9562",
        "6056" to "4206",
        "6068" to "9615",
        "6071" to "9625",
        "6072" to "9624",
        "6073" to "9623",
        "6074" to "9622",
        "6075" to "9591",
        "6099" to "9649",
        "6064" to "9619",
        "6106" to "9655",
        "6113" to "9661",
        "6123" to "9664",
        "6126" to "5067",
        "6127" to "9673",
        "6128" to "9672",
        "6136" to "9677",
        "6150" to "9689",
        "6155" to "9697",
        "6158" to "9694",
        "6169" to "9709",
        "6178" to "9713",
        "6190" to "9727",
        "6212" to "9744",
        "6213" to "9743",
        "6236" to "9759",
        "6250" to "9771",
        "6257" to "9777",
        "6311" to "9346",
        "6324" to "9357",
        "6340" to "9371",
        "6372" to "9398",
        "6392" to "4468",
        "6244" to "9764",
        "6351" to "9380",
        "6379" to "9404",
        "6385" to "5062",
        "6393" to "9414",
        "6399" to "4467",
        "6400" to "9422",
        "6445" to "9461",
        "6449" to "9379",
        "6502" to "9510",
        "6507" to "9514",
        "6521" to "9526",
        "6608" to "9116",
        "6642" to "9147",
        "6655" to "9150",
        "6073" to "0",
        "6672" to "9198",
        "6692" to "9188",
        "6774" to "9262",
        "6775" to "9231",
        "6807" to "9294",
        "6871" to "9015",
        "6881" to "9021",
        "6787" to "9275",
        "6882" to "9022",
        "6885" to "9025",
        "6922" to "9046",
        "6958" to "9066",
        "6931" to "9048",
        "6991" to "4428",
        "7000" to "4440",
        "7005" to "4437",
        "7007" to "4438",
        "7008" to "5096",
        "7015" to "4398",
        "7018" to "4401",
        "7021" to "5041",
        "7022" to "0",
        "7023" to "4387",
        "7027" to "4391",
        "7028" to "5110",
        "7029" to "4392",
        "7030" to "0",
        "7031" to "0",
        "7032" to "0",
        "7033" to "4396",
        "7034" to "4397",
        "7035" to "5101",
        "7036" to "4420",
        "7037" to "4421",
        "7038" to "5127",
        "7042" to "5072",
        "7043" to "4404",
        "7044" to "4405",
        "7045" to "4406",
        "7048" to "4409",
        "7130" to "5018",
        "7563" to "5069",
        "7055" to "4413",
        "7058" to "4379",
        "7062" to "4515",
        "7064" to "5192",
        "7065" to "5185",
        "7066" to "4375",
        "7067" to "4376",
        "7068" to "4377",
        "7072" to "4370",
        "7073" to "4371",
        "7104" to "4453",
        "7510" to "5124",
        "7512" to "4425",
        "7514" to "5129",
        "7542" to "0",
        "7551" to "5097",
        "7561" to "4579",
        "7562" to "5061",
        "7563" to "5069",
        "7631" to "5105",
        "7640" to "5169",
        "7567" to "5077",
        "7014" to "5111",
        "0" to "7641",
        "7644" to "5166",
        "7668" to "5193",
        "7674" to "5198",
        "7747" to "4602",
        "9084" to "4234",
        "9104" to "4251",
        "9108" to "4280",
        "9128" to "4278",
        "9142" to "4292",
        "9147" to "4297",
        "9109" to "4259",
        "9138" to "4288",
        "9166" to "4316",
        "9590" to "0",
        "9562" to "6004",
        "4206" to "6056",
        "9615" to "6068",
        "9625" to "6071",
        "9624" to "6072",
        "9623" to "6073",
        "9622" to "6074",
        "9591" to "6075",
        "9649" to "6099",
        "9619" to "6064",
        "9655" to "6106",
        "9661" to "6113",
        "9664" to "6123",
        "5067" to "6126",
        "9673" to "6127",
        "9672" to "6128",
        "9677" to "6136",
        "9689" to "6150",
        "9697" to "6155",
        "9694" to "6158",
        "9709" to "6169",
        "9713" to "6178",
        "9727" to "6190",
        "9744" to "6212",
        "9743" to "6213",
        "9759" to "6236",
        "9771" to "6250",
        "9777" to "6257",
        "9346" to "6311",
        "9357" to "6324",
        "9371" to "6340",
        "9398" to "6372",
        "4468" to "6392",
        "9764" to "6244",
        "9380" to "6351",
        "9404" to "6379",
        "5062" to "6385",
        "9414" to "6393",
        "4467" to "6399",
        "9422" to "6400",
        "9461" to "6445",
        "9379" to "6449",
        "9510" to "6502",
        "9514" to "6507",
        "9526" to "6521",
        "9116" to "6608",
        "9147" to "6642",
        "9150" to "6655",
        "0" to "6073",
        "9198" to "6672",
        "9188" to "6692",
        "9262" to "6774",
        "9231" to "6775",
        "9294" to "6807",
        "9015" to "6871",
        "9021" to "6881",
        "9275" to "6787",
        "9022" to "6882",
        "9025" to "6885",
        "9046" to "6922",
        "9066" to "6958",
        "9048" to "6931",
        "4428" to "6991",
        "4440" to "7000",
        "4437" to "7005",
        "4438" to "7007",
        "5096" to "7008",
        "4398" to "7015",
        "4401" to "7018",
        "5041" to "7021",
        "0" to "7022",
        "4387" to "7023",
        "4391" to "7027",
        "5110" to "7028",
        "4392" to "7029",
        "0" to "7030",
        "0" to "7031",
        "0" to "7032",
        "4396" to "7033",
        "4397" to "7034",
        "5101" to "7035",
        "4420" to "7036",
        "4421" to "7037",
        "5127" to "7038",
        "5072" to "7042",
        "4404" to "7043",
        "4405" to "7044",
        "4406" to "7045",
        "4409" to "7048",
        "5018" to "7130",
        "5069" to "7563",
        "4413" to "7055",
        "4379" to "7058",
        "4515" to "7062",
        "5192" to "7064",
        "5185" to "7065",
        "4375" to "7066",
        "4376" to "7067",
        "4377" to "7068",
        "4370" to "7072",
        "4371" to "7073",
        "4453" to "7104",
        "5124" to "7510",
        "4425" to "7512",
        "5129" to "7514",
        "0" to "7542",
        "5097" to "7551",
        "4579" to "7561",
        "5061" to "7562",
        "5069" to "7563",
        "5105" to "7631",
        "5169" to "7640",
        "5077" to "7567",
        "5111" to "7014",
        "5193" to "7668",
        "5198" to "7674",
        "4602" to "7747",
        "4234" to "9084",
        "4251" to "9104",
        "4280" to "9108",
        "4278" to "9128",
        "4292" to "9142",
        "4297" to "9147",
        "4259" to "9109",
        "4288" to "9138",
        "4316" to "9166",
        "0" to "9590",
        "7641" to "0",
        "7644" to "0",
        "0" to "7641",
        "0" to "7644"


        // Agrega más datos si es necesario
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextNumber = findViewById<EditText>(R.id.editTextNumber)
        val buttonSearch = findViewById<Button>(R.id.buttonSearch)
        val textViewResult = findViewById<TextView>(R.id.textViewResult)

        buttonSearch.setOnClickListener {
            val input = editTextNumber.text.toString().trim()
            val result = listaDatos[input]
            if (result != null) {
                textViewResult.text = "Resultado: $input = $result"
            } else {
                textViewResult.text = "No se encontró ningún resultado para $input"
            }
        }
    }
}

