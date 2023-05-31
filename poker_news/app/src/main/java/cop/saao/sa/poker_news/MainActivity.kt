package cop.saao.sa.poker_news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var dsljdlksjd = 0
    var sddsjhfdj  = ""
    var dlksjkdsjdslkdsj = {}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val kldsjlkds = BasicCalculator()
        val dsljds = jdsjsdlkjdskljds()
        val klsdjklds = kldsjlkds.sdkljdskljdskljds(5.01, 3.0, dsljds)

        val sdk = ksdjsdljdskl()
        val klsd = jkdshkjsdgdksjhds()
        val kdsk = sdk.sdkljdskljdskljds(24.0, 2.30, klsd)

        val kldsjhlkds = dslkjdklds()
        val kjsldhkjd = jdsjhkdsjhdsjkhds()
        val dsjlkdsj = kldsjhlkds.sdkljdskljdskljds(110.0, 22.0, kjsldhkjd)
        val kldjsklsd = kldsjhlkds.sdkjljds()
    }

    override fun onBackPressed() {
        val kldsjlkds = BasicCalculator()
        val dsljds = jdsjsdlkjdskljds()
        val klsdjklds = kldsjlkds.sdkljdskljdskljds(5.01, 3.0, dsljds)

        val sdk = ksdjsdljdskl()
        val klsd = jkdshkjsdgdksjhds()
        val kdsk = sdk.sdkljdskljdskljds(24.0, 2.30, klsd)

        val kldsjhlkds = dslkjdklds()
        val kjsldhkjd = jdsjhkdsjhdsjkhds()
        val dsjlkdsj = kldsjhlkds.sdkljdskljdskljds(110.0, 22.0, kjsldhkjd)
        val kldjsklsd = kldsjhlkds.sdkjljds()
        dlksjkdsjdslkdsj()}


}

interface sdkhjkdshfkj {
    fun fkdljfdlkjfdlkfdj(klsdjldksjds: Double, kldsjdslkjds: Double): Double
}

// Class representing addition operation
class jdsjsdlkjdskljds : sdkhjkdshfkj {
    override fun fkdljfdlkjfdlkfdj(klsdjldksjds: Double, kldsjdslkjds: Double): Double {
        return klsdjldksjds + kldsjdslkjds
    }
}

// Class representing subtraction operation
class sdkljlksdjdslkj : sdkhjkdshfkj {
    override fun fkdljfdlkjfdlkfdj(djsjhdskhds: Double, kldsjdslkjds: Double): Double {
        return djsjhdskhds - kldsjdslkjds
    }
}

// Class representing multiplication operation
class jkdshkjsdgdksjhds : sdkhjkdshfkj {
    override fun fkdljfdlkjfdlkfdj(klsdjldksjds: Double, kldsjdslkjds: Double): Double {
        return klsdjldksjds * kldsjdslkjds
    }
}

class jdsjhkdsjhdsjkhds : sdkhjkdshfkj {
    override fun fkdljfdlkjfdlkfdj(klsdjldksjds: Double, kldsjdslkjds: Double): Double {
        if (kldsjdslkjds == 0.0) {
            throw IllegalArgumentException("Cannot divide by zero.")
        }
        return klsdjldksjds / kldsjdslkjds
    }
}

// Interface for a calculator device
interface dslkjdslkjdskljds {
    fun sdkljdskljdskljds(a: Double, b: Double, operation: sdkhjkdshfkj): Double
}

// Class representing a basic calculator
class BasicCalculator : dslkjdslkjdskljds {
    override fun sdkljdskljdskljds(a: Double, b: Double, operation: sdkhjkdshfkj): Double {
        return operation.fkdljfdlkjfdlkfdj(a, b)
    }
}

class ksdjsdljdskl : dslkjdslkjdskljds {
    override fun sdkljdskljdskljds(sdjl: Double, ksdjklsdj: Double, kldsjkdslj: sdkhjkdshfkj): Double {
        return kldsjkdslj.fkdljfdlkjfdlkfdj(sdjl, ksdjklsdj)
    }
}

// Interface for a memory device
interface lsdjlkdsj {
    fun klksdds(jksdhjkds: Double)
    fun sdkjljds(): Double
}

class dslkjdklds : dslkjdslkjdskljds, lsdjlkdsj {
    private var jklsdjdsl: Double = 0.0

    override fun sdkljdskljdskljds(kdsk: Double, jksd: Double, klsdjldks: sdkhjkdshfkj): Double {
        val lksdjlkdsj = klsdjldks.fkdljfdlkjfdlkfdj(kdsk, jksd)
        klksdds(lksdjlkdsj)
        return lksdjlkdsj
    }

    override fun klksdds(jksdhjkds: Double) {
        jklsdjdsl = jksdhjkds
    }

    override fun sdkjljds(): Double {
        return jklsdjdsl
    }
}











