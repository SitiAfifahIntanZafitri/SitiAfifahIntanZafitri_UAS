package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Anjing;
import simple.example.hewanpedia.model.Buaya;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Kapuas", "Kalimantan",
                "Sungai ini berasal dari kalimantan,ini adalah sungai terpanjang di Indonesia dengan panjang 1.178 kilometer.", R.drawable.s1));
        kucings.add(new Kucing("Sungai Brito", "Kalimantan Tengah",
                "Sungai ini sering dijuluki dengan nama sungai cina,dan sungai banjar.Sungai inilah tempat dilaksanakannya pasar apung.", R.drawable.s2));
        kucings.add(new Kucing("sungai Mamberomo", "Papua",
                "Sungai ini merupakan sungai terpanjang di papua,panjangnya mencapai 670km.Sungai ini adalah sungaipenghasil listrik terbesar di indonesia.", R.drawable.s3));
        kucings.add(new Kucing("Sungai Digul", "papua",
                "Sungai ini mempunyai panjang mencapai 562km,sungai ini mempunyai ciri khas yaitu berbelok-belok seperti ular,sungai ini sangat subur dan dikelilingi oleh perumahan penduduk desa.", R.drawable.s4));
        kucings.add(new Kucing("Sungai Brantas", "Jawa",
                "Sungai ini mempunyai panjang mencapai 320km,sungai ini mempunyai sebuah jembatan yang sangat besar ditengah-tengah aliran sungai.", R.drawable.s5));
        kucings.add(new Kucing("Sungai Begawan Solo", "Solo",
                "Sungai ini merupakan Sun gai terpanjang di pulau jawa,panjangnya mencapai 548km,ini adalah sungai yang sangat melegenda. ", R.drawable.s6));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("Rinjani", "Lombok",
                "Gunung ini adalah gunung tertinggi di Pulau Lombok,yang mencapai ketinggian 3726mdpl,dia mempunyai danau yang bernama segara anak.", R.drawable.b1));
        anjings.add(new Anjing("Bukit Siman", "Kalimantan ",
                "Bukit ini adalah salah satu destinasi,bukit ini masih asri,san sangat rindang.", R.drawable.b2));
        anjings.add(new Anjing("Bukit Anak Dara", "Lombok",
                "Bukit ini dijuluki sebagai surga sunset karena anda bisa menemukan sunset yang sangat indah disini. ", R.drawable.c1));
        anjings.add(new Anjing("Batu idung", "Lombok",
                "BUkit ini nerada di jembatan kembar,jalur untuk kesini sangatlah ekstrim,namun akan terbayar oleh suasananya.", R.drawable.c4));
        anjings.add(new Anjing("Bukit Merese", "Lombok",
                "Bukit ini berada di Lombok Tengah,disini kita bisa menyaksikan keindahan sunset yang ditemani oleh aliran ombak.)", R.drawable.c5));
        anjings.add(new Anjing("Shiba", "Jepang",
                "BUkit ini terdapat di Lombok timur yang mempunyai keindahan dan ditambah lagi dengan keimdahan hamparan jagung yang indah dan eksotis.", R.drawable.c6));
        return anjings;
    }

    private static List<Buaya>initDataBuaya(Context ctx) {
        List<Buaya> buayas = new ArrayList<>();
        buayas.add(new Buaya("Air Terjun Jarakan", "Jawa Timur",
                "Air Terjun ini mempunyai ketinggian sekitar 100meter,dan mempunyai pemandian kecil yang digunakan untuk berendam atau sekedar mencuci badan.", R.drawable.d4));
        buayas.add(new Buaya("Air Terjun gerojoan Sewu", "Jawa Tengah",
                "Air Terjun ini mempunyai banyak titik.Banyak sekali titik air terjun yang dapat dinikmati disini,tinggi air terjun ini 80km.", R.drawable.d1));
        buayas.add(new Buaya("Air Terjun Bantang Kapas", "Riau",
                "Air Terjun Bantang Kapas mempunyai tinggi 133meter.", R.drawable.d2));
        buayas.add(new Buaya("Air Terjun sipiso-piso", "Sumatera Utara",
                "Air Terjun ini mengalir dari tebing yang sangat tinggi dan antara pulau pinus yang indah.Tingginya mencapai 120 meter.", R.drawable.d3));
        buayas.add(new Buaya("Air Terjun Coban Sewu", "JAwa Timur",
                "Air Terjun ini mempunyai ketinggian 180 meter dan dinamai sewu karena tidak hanya mengalir dari 1 sumber namun dari beberapa titik berbeda.", R.drawable.d5));
        buayas.add(new Buaya("Air Terjun Torean", "Lombok",
                "Air Terjun ini berda dibawah kaki gunung rinjani,yang mempunyai keindahan yang airnya jatuh dari bagian-bagian tebing. ", R.drawable.d6));
        return buayas;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataBuaya(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
