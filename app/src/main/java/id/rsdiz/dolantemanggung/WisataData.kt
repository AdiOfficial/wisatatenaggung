package id.rsdiz.dolantemanggung

object WisataData {
    private val wisataNames = arrayOf(
        "Wisata Alam Posong",
        "Embung Kledung",
        "Pasar Papringan Ngadiprono",
        "Pikatan Water Park",
        "Umbul Jumprit",
        "Situs Liyangan",
        "Alam Sewu",
        "Embung Tlogopucang",
        "Curug Surodipo",
        "Taman Kartini Temanggung"
    )
    private val wisataDetails = arrayOf(
        "Wisata alam posong kledung temanggung, merupakan sebuah tempat wisata alam di temanggung yang baru di populerkan beberapa bulan yang lalu. Tempat ini menyuguhkan keindahan khas alam pegunungan yang begitu memanjakan mata karena lokasinya yang begitu strategis yaitu berada di padang safana kledung.Padang safana kledung ini merupakan belahan tengah tengah antara gunung sindoro dan gunung sumbing yang nampak indah jika di lihat dari dari kawasan wisata alam posong. Apabila anda berkunjung ke tempat pada waktu sore hari dan kebetulan cuacanya cerah maka anda di suduhkan dengan pemandangan golden sunset dengan pancaran sinar yang membelah kedua gunung tersebut. Selain menyuguhkan pemandangan khas pegunungan dan golden sunset, wisata alam ini juga menyediakan gazebo bagi pengunjung agar semkain nyaman saat menikmati indahnya panorama di sekitaran wisata alam posong. Dan bagi anda yang ingin mencoba susana lain dari wisata ini, anda juga bisa mencoba fliying fox di sekitaran area. Anda akan menikmati sensai meluncur di sejuknya udara pegunungan yang di hiasi dengan hijaunya pepohonan dan area perkebunan masyrakat sekitar.",
        "Salah satu wisata terbaru di temanggung yang patut anda kunjungi adalah embung kledung. Wisata alam embung kledung ini mempunyai panorama alam yang luar biasa indahnya. Embung kledung merupakan sebuah bak penampungan air hujan. Bak tersebut di fungsikan sebagai cadangan air untuk perkebunan di sekitar embung. Seiring dengan berjalanya waktu, kini embung kledung dimanfaat menjadi tempat wisata terbaru di temanggung. Ditempat ini anda akan menikmati embung dengan latar gunung sindoro dan sumbing yang indah. Ditambah lagi dengan adanya perkebunanan milik penduduk di sekitar area wisata tersebut akan membuat anda betah berlama-lama disini.",
        "Pasar Papringan Ngadiprono atau Pasar Papringan adalah pasar tradisional unik yang berlokasi di Dusun Ngadiprono, Desa Ngadimulyo, Kecamatan Kedu, Kabupaten Temanggung, Jawa Tengah. Pasar yang digagas oleh Singgih Susilo Kartono ini dibuka hanya pada hari Minggu Wage dan Minggu Pon mulai pukul 06:00 sampai dengan 12:00 WIB setiap bulannya. Dikatakan unik karena pasar ini digelar di bawah rerimbunan rumpun bambu, alat tukar menggunakan \"uang keping bambu\", dan hanya menjual makanan. Namun demikian, meskipun hanya buka pada dua hari pasaran itu, pengunjungnya cukup ramai, bahkan kadang ada pengunjung dari luar Temanggung datang ke situ dengan alasan tujuan wisata, karena tempatnya yang asri dan sejuk. Tahun 2019, keberadaan Pasar Papringan Ngadiprono mengantarkan Singgih Kartono menerima penghargaan Kick Andy Hero's.",
        "Temanggung mempunyai wisata air yang terkenal yaitu Pikatan Waterpark. Tempat wisata ini merupakan waterpark modern yang tetap mengusung tema alam. Dinginnya air pegunungan ditemani semilir angin serta pemandangan hijau dari pohon-pohon kelapa yang tinggi menjulang adalah hal yang ditawarkan wisata ini. Tahukah Anda? Lokasi Pikatan Waterpark Temanggung ini menyimpan cerita sejarah. Mungkin bagi Anda yang belum pernah mengunjungi Temanggung, masih asinh dengan waterpark ini, namun sedikit terngiang di pikiran tentang nama Pikatan sebagai mark tempat wisata air tersebut.",
        "Wisata Umbul Jumprit merupakan tempat wisata yang ada di Desa Tegalrejo, Kecamatan Ngadirejo, Temanggung. Dari sekian banyak tempat wisata yang keren di Temanggung ternyata terdapat wisata alam yang tidak kalah dari tempat lain. Tidak banyak yang tahu tempat wisata yang memukau satu ini, pasalnya tempat ini oleh masyarakat sekitar banyak dihubungkan dengan hal mistis, padahal tidak demikian. Wisata Umbul Jumprit menjadi tempat suci bagi umat Budha di Indonesia. Setiap berlangsung upacara Trisuci Waisak di Candi Borobudur, air keberkahan selalu diambil dari umbul tersebut. Wisata ini merupakan salah satu destinasi wisata di Temanggung yang semakin hari semakin meningkat peminatnya, banyak wisatawan yang datang ke tempat ini untuk menjawab semua keingintahuan mereka terhadap tempat yang penuh sejarah dan banyak berhubungan dengan ritual diberbagai tempat. Banyak wisatawan datang ke tempat ini untuk menikmati pemandian di Umbul Jumprit maupun berziarah ke makam ki Jumprit. Tempat ini diresmikan oleh pemerintah pada tanggal 18 Januari 1987 sebagai wanawisata di Temanggung dan dibuka secara umum.",
        "Tiga unit sisa bangunan berhasil ditemukan di Situs Liyangan di Dusun Liyangan, Desa Purbasari, Kecamatan Ngadirejo, Kabupaten Temanggung, Jawa Tengah, belum lama ini. Itu adalah temuan kesekian Tim Penelitian Situs Liyangan Balai Arkeologi DI Yogyakarta yang telah memulai penelitian di sana sejak 2010 hingga 2018. Penemuan pertama pada 2010, kedua 2012, dan ketiga 2018 yang menjadwalkan penelitian 18 Oktober – 4 November 2018. Bentuk temuannya berupa ijuk, bambu, dan kayu yang sudah berujud arang. Semua sisa bangunan yang baru digali di bagian permukaan itu semula ditemukan terkubur material vulkanik Gunung Sindoro yang meletus hebat pada abad 11 Masehi. Yang menarik, situs yang diperkirakan dihuni sejak peradaban abad 2 Masehi dan berakhir abad 11 Masehi itu masih awet, meskipun lapuk.",
        "Wisata Alam Sewu di Ngadirejo Temanggung Jawa Tengah adalah salah satu tempat wisata yang berada di desa ngadirejo, kabupaten temanggung, provinsi jawa tengah, negara indonesia. Wisata Alam Sewu di Ngadirejo Temanggung Jawa Tengah adalah tempat wisata yang ramai dengan wisatawan pada hari biasa maupun hari liburan. Tempat ini sangat indah dan bisa memberikan sensasi yang berbeda dengan aktivitas kita sehari hari. Wisata Alam Sewu di Ngadirejo Temanggung Jawa Tengah memiliki pesona keindahan yang sangat menarik untuk dikunjungi. Sangat di sayangkan jika anda berada di kota temanggung tidak mengunjungi wisata alam  yang mempunyai keindahan yang tiada duanya tersebut. Wisata Alam Sewu di Ngadirejo Temanggung Jawa Tengah sangat cocok untuk mengisi kegiatan liburan anda, apalagi saat liburan panjang seperti libur nasional, ataupun hari ibur lainnya.  Keindahan Wisata Alam Sewu di Ngadirejo Temanggung Jawa Tengah ini sangatlah baik bagi anda semua yang berada di dekat  atau di kejauhan untuk merapat mengunjungi tempat  Wisata Alam Sewu di Ngadirejo Temanggung Jawa Tengah di kota temanggung.",
        "Embung Tlogopucang merupakan salah satu dari beberapa danau buatan yang dibangun oleh pemerintah daerah Temanggung di daerah Kandangan. Keberadaannya lebih dikenal sebagai lokasi foto daripada tempat wisata karena cukup indah untuk diabadikan ketimbang dinikmati suasananya. Fungsi embung ini hampir sama seperti embung lainnya untuk mengatasi kekurangan pasokan air pada musim kemarau. Pemandangan Embung Tlogopucang terlihat menarik meskipun tidak terlalu luas. Bentuk embung yang tidak simetris dan berlekuk-lekuk mengikuti kontur tanah memberikan kesan unik dan tidak kaku. Bila kondisi cuaca sedang cerah akan terlihat gugusan gunung yang menjadi latar kolam buatan ini yaitu Gunung Sumbing, Gunung Sindoro, dan Gunung Prau Dieng. Disarankan datang ke tempat ini pada pagi hari karena berpoensi cerah ketimbang saat sore untuk menikmati matahari terbenam. Fasilitas pendukung wisata di tempat ini tidak sersedia karena belum serius dikembangnya menjadi obyek wisata seperti embung-embung lain di daerah Temanggung.",
        "Menghabiskan waktu bersantai di tempat yang memiliki kesan natural dan menyejukan bisa menjadi obat pelipur hati dan pikiran yang ampuh. Tempat yang satu ini cocok bagi para pencari kedamaian alam. Tempat itu bernama Curug Trocoh atau yang disebut juga dengan nama lain Curug Surodipuro. Air terjun ini merupakan satu diantara banyaknya tempat eksotis yang ada di Temanggung. Curug ini terletak di Desa Tawangsari Kecamatan Wonoboyo dan termasuk dalam wilayah Kabupaten Temanggung, Provinsi Jawa Tengah. Nama Curug Trocoh sendiri memiliki arti selalu mengeluarkan air yang termasuk istilah dalam bahasa Jawa. Nama itu sesuai karena memang air terjun ini tak henti-hentinya mengalirkan air, termasuk ketika musim kemarau panjang melanda tempat ini tak pernah surut airnya. Sedangkan nama lain Curug Surodipuro berasal dari nama salah satu panglima Perang Diponegoro, yaitu Kyai Surodipuro. Walaupun belum ada bukti sejarah secara pasti mengenai keberadaan curug tersebut, akan tetapi menurut warga sekitar terdapat Makam Kyai Surodipuro di kawasan tersebut. Selain itu, tempat wisata yang menawan ini pernah menjadi tempat bersejarah. Tempat ini pernah digunakan oleh Pangeran Diponegoro sebagai salah satu tempat untuk mengatur siasat perjuangan melawan Belanda dalam perang gerilya yang berlangsung tahun 1925-1930 itu. Air terjun ini memiliki tinggi sekitar 120 meter dari puncak sampai ke dasarnya. Di sekitar lokasi ari terjun ini dikelilingi oleh tebing bebatuan berbentuk setengah lingkaran. Dengan keadaan sekitarnya yang juga ditumbuhi berbagai tumbuhan yang tumbuh di tepian bebatuan menambah keindahannya yang alami. Keunikan lainnya juga ialah terdapat 5 terjunan bertingkat yang berjarak 20 meter antara satu dengan yang lainnya. Airnya yang jernih dan segar semakin menambah keistimewaan tempat ini. Curug Trocoh tidak hanya menawarkan keindahan alam sekitarnya, pengunjung juga bisa menghilangkan kepenatan dan menjadikannya tempat untuk bersantai serta berelaksasi. Selain dijadikan tempat bersantai oleh para wisatawan, lokasi ini juga sering digunakan oleh para pengunjung yang sengaja datang untuk bermeditasi. Mereka sering bermeditasi di gua-gua sekitar Watu Godheg yang berada tak jauh dari air terjun. Keindahan, legenda, serta keistimewaan lainnya patut menjadikan lokasi ini sebagai destinasi wisata yang sayang untuk dilewatkan.",
        "Wisata Taman Kartini di Kowangan Temanggung Jawa Tengah merupakan tempat wisata yang harus anda kunjungi karena pesona keindahannya tidak ada duanya. Penduduk lokal daerah Wisata Taman Kartini di Kowangan Temanggung Jawa Tengah juga sangat ramah tamah terhadap wisatawan lokal maupun wisatawan asing. Wisata Taman Kartini di Kowangan Temanggung Jawa Tengah memiliki Lokasinya yang sangat strategis ini, membuat objek wisata ini mudah untuk dikunjungi.  Anda bisa menikmati beragam fasilitas yang disediakan di sini, seperti lapangan tenis, kolam renang, lapangan bola basket, panggung Kesenian, dan lain sebagainya. Tak hanya itu, Anda juga bisa menikmati hidangan saat lapar dan mampir ke rumah makan pujasera yang ada di sini. Menikmati liburan di tempat ini baik dengan keluarga, teman, maupun pasangan akan memberikan kesan menyenangkan serta tak terlupakan. Taman Kartini ini menyediakan banyak sekali sarana permainan yang terbilang lengkap serta banyak tempat yang dapat dijadikan latar unik untuk sekedar berfoto. Banyaknya arena permainan juga pasti akan membuat anak-anak betah untuk berlama-lama menghabiskan waktu bermain di taman kartini ini. Tidak hanya menjadi tempat rekreasi dan bermain anak, tempat ini juga dapat digunakan sebagai tempat olahraga. Anak muda juga terkadang terlihat di taman ini untuk sekedar berkumpul bersama kawan-kawannya, berolah raga mencari suasana yang berbeda. Anda juga bisa menikmati wahana tontonan di Bioskop Multidimensi Andromedia, sebagai wahana terbaru di sini karena baru dibuka sejak 3 tahun yang lalu."
    )
    private val wisataImage = intArrayOf(
        R.drawable.posong,
        R.drawable.embung_kledung,
        R.drawable.pasar_papringan,
        R.drawable.pikatan,
        R.drawable.umbul_jumprit,
        R.drawable.situs_liyangan,
        R.drawable.alam_sewu,
        R.drawable.embung_tlogopucang,
        R.drawable.curug_surodipo,
        R.drawable.taman_kartini
    )
    private val wisataRating = floatArrayOf(
        4.4f, 4.4f, 4.5f, 4.2f, 4.4f, 4.2f, 4.1f, 4.0f, 4.4f, 4.1f
    )
    private val wisataHargaTiket = arrayOf(
        "Rp.7000,-",
        "Rp.4000,-",
        "Satu uang koin bambu = Rp.2000,-",
        "Hari Biasa Rp.7500, Hari Libur Rp.10.000,-",
        "Rp.5000,-",
        "Rp.6000 - Rp.8000",
        "Rp.5000,-",
        "Rp.5000,-",
        "Rp.3000,-",
        "-"
    )
    private val wisataAlamat = arrayOf(
        "Jalan Raya Parakan Wonosobo Km. 9, Kec. Temanggung, Jawa Tengah.",
        "Jalan Raya Parakan – Wonosobo, Kledung, Area Sawah, Tlahap, Kledung, Kabupaten Temanggung, Jawa Tengah.",
        "Desa Ngadiprono, Kecamatan Kedu, Kabupaten Temanggung, Jawa Tengah.",
        "Jl. Raya Pikatan, RT/RW 005/005, Desa Mudal, Kecamatan Temanggung, Kabupaten Temanggung Jawa Tengah.",
        "Jalan Ngadirejo, Purbosari, Temanggung, Temanggung, Jawa Tengah",
        "Dusun Liyangan, Area Sawah, Purbosari, Kec. Ngadirejo, Kabupaten Temanggung, Jawa Tengah",
        "Area Sawah, Giripurno, Kec. Ngadirejo, Kabupaten Temanggung, Jawa Tengah",
        "Tlogopucang, Kandangan, Hutan, Tlogopucang, Temanggung, Kabupaten Temanggung, Jawa Tengah 56281",
        "Hutan, Tawangsari, Wonoboyo, Kabupaten Temanggung, Jawa Tengah",
        "Jl. Secang - Temanggung No.119, Kauman, Kowangan, Kec. Temanggung, Kabupaten Temanggung, Jawa Tengah"
    )
    private val wisataBuka = arrayOf(
        "Setiap Hari (03.00 - 17.00 WIB)",
        "Setiap Hari (05.30 - 18.00 WIB)",
        "Setiap Minggu Wage & Minggu Pon",
        "Setiap Hari (07.00 - 17.00 WIB)",
        "Setiap Hari (08.00 - 16.00 WIB)",
        "Setiap Hari (08.00 - 18.00 WIB)",
        "Setiap Hari (24 Jam)",
        "Setiap Hari (06.00 - 18.00 WIB)",
        "Setiap Hari (07.00 - 16.00 WIB)",
        "Setiap Hari (24 Jam)"
    )
    val listData: ArrayList<Wisata>
        get() {
            val list = arrayListOf<Wisata>()
            for (position in wisataNames.indices) {
                val wisata = Wisata()
                wisata.name = wisataNames[position]
                wisata.alamat = wisataAlamat[position]
                wisata.buka = wisataBuka[position]
                wisata.hargaTiket = wisataHargaTiket[position]
                wisata.photo = wisataImage[position]
                wisata.rating = wisataRating[position]
                wisata.detail = wisataDetails[position]
                list.add(wisata)
            }
            return list
        }
}