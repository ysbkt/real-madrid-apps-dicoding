package com.dicoding.realmadridcf.Model;

import java.util.ArrayList;
import java.util.List;

public class PlayerData {

    private static String[] playerName = {
        "Thibaut Courtois",
        "Raphaël Varane",
        "Sergio Ramos",
        "Marcelo",
        "Dani Carvajal",
        "Casemiro",
        "Luka Modric",
        "Toni Kroos",
        "Eden Hazard",
        "Marco Asensio",
        "Karim Benzema"
    };

    private static String[] playerNation = {
        "Belgium",
        "France",
        "Spain",
        "Brazil",
        "Spain",
        "Brazil",
        "Croatia",
        "German",
        "Belgium",
        "Spain",
        "France"
    };

    private static String[] playerPosition = {
        "Goalkeeper",
        "Defender",
        "Defender",
        "Defender",
        "Defender",
        "Midfielder",
        "Midfielder",
        "Midfielder",
        "Forward",
        "Forward",
        "Forward"
    };

    private static String[] playerBorn = {
        "Bree, 11 May 1992",
        "Lille, 25 April 1993",
        "Camas, 30 Maret 1986",
        "Rio de Jeneiro, 12 May 1988",
        "Leganes, 11 Januari 1992",
        "Sao Paulo, 23 Februari 1992",
        "Zadar, 9 September 1985",
        "Greifswald, 4 Januari 1990",
        "La Louviere, 7 Januari 1991",
        "Palma, 21 Januari 1996",
        "Lyon, 19 Desember 1987"
    };

    private static String[] playerDescription = {
        "Thibaut Nicolas Marc Courtois lahir di Bree, Belgia, 11 Mei 1992 umur 28 tahun adalah seorang pemain sepak bola asal Belgia yang bermain sebagai penjaga gawang untuk Real Madrid dan tim nasional Belgia.",
        "Raphaël Varane adalah seorang pemain sepak bola Prancis yang saat ini bermain untuk Real Madrid CF sebagai bek tengah atau gelandang bertahan.",
        "Sergio Ramos merupakan seorang pemain sepak bola asal Spanyol yang bermain pada posisi bertahan. Saat ini ia bermain untuk klub Spanyol, Real Madrid yang bermain di La Liga. Ia juga bermain untuk tim nasional Spanyol.",
        "Marcelo Vieira da Silva Júnior adalah seorang pemain sepak bola Brasil yang bermain untuk Real Madrid dan tim nasional sepak bola Brasil. Marcelo konon berbakat dengan kemampuan teknis yang besar, tendangan keras, dan passing yang baik. Posisi utamanya sebagai bek kiri, tetapi dia juga bisa beroperasi sebagai sayap kiri. Pemain yang berteknik tinggi, kemampuan yang jarang dimiliki oleh seorang bek kiri.",
        "Daniel Carvajal Ramos adalah seorang pemain sepak bola Spanyol yang saat ini bermain untuk Real Madrid sebagai bek kanan. Produk asli akademi Real Madrid, dia sempat bergabung ke Leverkusen karena gagal menembus tim utama Los Blancos pada awal musim 2012–13",
        "Carlos Henrique Casemiro, atau hanya Casemiro  adalah pemain sepak bola Brasil yang bermain untuk Real Madrid sebagai gelandang tengah.",
        "Luka Modric adalah pemain sepak bola profesional berkebangsaan Kroasia yang bermain sebagai gelandang untuk Real Madrid di La Liga Spanyol dan tim nasional Kroasia. Modric sebelumnya telah bermain untuk klub Dinamo Zagreb, Zrinjski, Inter Zaprešić dan Tottenham Hotspur[3] sebelum bergabung dengan Real Madrid pada tahun 2012. Dan mendapat penghargaan dari FIFA sebagai pemain terbaik di Piala Dunia 2018 Di Russia,selain itu ia juga menjadi The Best FIFA Men's Player tahun 2018.",
        "Toni Kroos merupakan seorang pemain sepak bola Jerman, yang berposisi sebagai gelandang sentral. Saat ini ia bermain untuk Real Madrid C.F. Ia juga bermain untuk tim nasional Jerman. Toni Kroos berhasil menyandang gelar sebagai Playmaker Terbaik Dunia 2014 versi International Federation of Football History and Statistics (IFFHS).",
        "Eden Hazard  merupakan seorang pemain sepak bola berkebangsaan Belgia yang bermain untuk klub Real Madrid di Liga Spanyol mulai bulan Juni 2019 dan timnas Belgia. Ia dapat bermain pada posisi gelandang serang dan Gelandang sayap. Hazard dikenal sebagai seorang pemain yang memiliki kreatiftas, kecepatan, dan kemampuan teknik yang baik. Setelah memulai karier sepak bola dari tahun 1995 hingga 2005 dengan klub lokal Royal Stade Brainois dan Tubize di Belgia, Hazard melakukan debut karier profesional bersama Lille saat masih berusia 16 tahun pada bulan November 2007. Pada musim pertamanya, ia berhasil meraih penghargaan Pemain Muda Ligue 1 Terbaik, yang menjadikannya sebagai pemain non-Prancis peraih penghargaan tersebut. Pada musim 2010–11, Hazard menjadi salah satu pemain kunci Lille saat meraih gelar juara double: Ligue 1 dan Coupe de France serta berhasil merdapatkan penghargaan Pemain Ligue 1 Terbaik, yang menjadikannya sebagai pemain termuda peraih penghargaan tersebut. Hazard pertama kali membela timnas senior Belgia pada pertandingan menghadapi Luksemburg, bulan November 2008 saat masih berusia 17 tahun. Ia mencetak gol pertamanya untuk timnas senior Belgia pada pertandingan menghadapi Kazakhstan, bulan Oktober 2011.",
        "Marco Asensio Willemsen  adalah pemain sepak bola profesional Spanyol yang bermain untuk sebagai gelandang serang untuk Real Madrid dan tim nasional Spanyol.",
        "Karim Mustofa Benzema adalah seorang pemain sepak bola profesional Prancis keturunan Aljazair yang saat ini bermain untuk tim La Liga Spanyol, Real Madrid. Dia bermain sebagai penyerang yang dapat difungsikan juga sebagai pemain sayap dan terkenal karena kemampuan teknik, gaya permainan, dan kemampuannya dalam mencetak gol. Ia dideskripsikan sebagai seorang penyerang bertalenta hebat yang tangguh dan mengagumkan dan seorang penuntas serangan yang efektif di kotak penalti."
    };

    private static String[] playerImage = {
        "https://www.realmadrid.com/img/vertical_220px/courtois_380x501_20200731123145.jpg",
        "https://www.realmadrid.com/img/vertical_220px/varane_380x501_20200731123137.jpg",
        "https://www.realmadrid.com/img/vertical_220px/ramos_380x501_20200731123136.jpg",
        "https://www.realmadrid.com/img/vertical_220px/marcelo_380x501_20200731123138.jpg",
        "https://www.realmadrid.com/img/vertical_220px/carvajal_380x501_20200731123134.jpg",
        "https://www.realmadrid.com/img/vertical_220px/casemiro_380x501_20200731123142.jpg",
        "https://www.realmadrid.com/img/vertical_220px/modric_380x501_20200731123142.jpg",
        "https://www.realmadrid.com/img/vertical_220px/kroos_380x501_20200731123139.jpg",
        "https://www.realmadrid.com/img/vertical_220px/hazard_380x501_20200731123148.jpg",
        "https://www.realmadrid.com/img/vertical_220px/asensio_380x501_20200731123127.jpg",
        "https://www.realmadrid.com/img/vertical_220px/benzema_380x501_20200731123143.jpg"
    };

    private static String[][] playerImages = {
        {"https://tmssl.akamaized.net/images/portrait/originals/108390-1572942947.jpg", "https://cdn2.tstatic.net/kaltim/foto/bank/images/kiper-real-madrid-thibaut-courtois_2.jpg", "https://www.thesun.co.uk/wp-content/uploads/2020/07/NINTCHDBPICT000592247441-e1593616847220.jpg", "https://blue.kumparan.com/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1533820121/hvruljwhd6nji8d4fzpz.jpg"},
        {"https://upload.wikimedia.org/wikipedia/commons/c/cc/Rapha%C3%ABl_Varane_2018_%28cropped%29.jpg","https://assets.pikiran-rakyat.com/crop/3x0:1079x1038/x/photo/2020/08/03/3636162266.jpg","https://upload.wikimedia.org/wikipedia/commons/thumb/8/86/Rapha%C3%ABl_Varane_in_Real_Madrid.jpg/310px-Rapha%C3%ABl_Varane_in_Real_Madrid.jpg","https://akcdn.detik.net.id/visual/2020/08/08/britain-soccer-champions-league_169.jpeg?w=650"},
        {"https://www.gstatic.com/tv/thumb/persons/1053911/1053911_v9_ba.jpg", "https://images.daznservices.com/di/library/GOAL/cd/d7/sergio-ramos-real-madrid_1udzxpur3empl13c1y70bl1388.jpg?t=-321096990&quality=100", "https://bolaskor.com/media/19/4a/21/194a21b8d6f9bb3ef297e3ab22cb1af4.jpg", "https://en.as.com/en/imagenes/2020/06/12/football/1591962741_558402_noticia_normal.jpg"},
        {"https://besthqwallpapers.com/Uploads/12-9-2018/65502/marcelo-4k-portrait-brazilian-football-player-real-madrid.jpg", "https://images.fullhdwallpaper.net/wp-content/uploads/2018/01/rare-pics-of-Marcelo-Vieira.jpg", "https://www.sentinelassam.com/wp-content/uploads/2019/03/mar.jpg", "https://images.sportsgalleries.net/wp-content/uploads/2018/02/Marcelo-Vieira-hd-image.jpg"},
        {"https://upload.wikimedia.org/wikipedia/commons/f/f9/Daniel_Carvajal.jpg", "https://ligalaga.id/wp-content/uploads/2020/07/Dani-Carvajal-Real-Madrid.jpg", "https://i.pinimg.com/originals/49/83/9a/49839a097b88d14907c432dec12f573f.jpg", "https://images.daznservices.com/di/library/GOAL/43/de/dani-carvajal-real-madrid_5clf9duxov7c1uhfpapvn9wvv.jpg?t=1971219440&quality=100"},
        {"https://images.daznservices.com/di/library/GOAL/2a/3b/casemiro-real-madrid-2020_1tla2w33m2j6012jeg15r2nuuo.jpg?t=-1118091201&quality=100", "https://upload.wikimedia.org/wikipedia/commons/8/87/20180610_FIFA_Friendly_Match_Austria_vs._Brazil_Casemiro_850_1575.jpg", "https://ligalaga.id/wp-content/uploads/2020/07/Casemiro-Real-Madrid.jpg", "https://cdns.klimg.com/bola.net/library/upload/21/2018/03/casemiro_26503c7.jpg"},
        {"https://upload.wikimedia.org/wikipedia/commons/e/e9/ISL-HRV_%287%29.jpg", "https://images.daznservices.com/di/library/omnisport/b7/9e/luka-modric_1h4g7ver0mzzc1b3xvqkl9coz1.jpg?t=1957622455&quality=100", "https://en.as.com/futbol/imagenes/2019/10/22/internacional/1571728548_504797_1571728747_noticia_normal.jpg", "https://cdns.klimg.com/bola.net/library/upload/20/2017/01/luka-modric_5e31c52.jpg"},
        {"https://assets.skor.id/crop/556x428:5010x3711/x/photo/2020/07/13/3817710871.jpg", "https://images.daznservices.com/di/library/GOAL/4b/b8/toni-kroos-real-madrid-2019-20_cjnj2so4sy0x1nwsx78gbb4r6.jpg?t=-828134317&quality=100", "https://static.independent.co.uk/s3fs-public/thumbnails/image/2020/01/12/19/gettyimages-1199055425.jpg", "https://bodyartguru.com/wp-content/uploads/2020/01/Toni-Kroos.jpg"},
        {"https://sportstar.thehindu.com/third-party/opta/article28667212.ece/ALTERNATES/LANDSCAPE_1200/edenhazard-cropped172qf48i7f7ad12kszt3ahoygijpg", "https://en.as.com/futbol/imagenes/2020/04/25/primera/1587844763_353150_1587901540_noticia_normal.jpg", "https://images.daznservices.com/di/library/GOAL/1/97/eden-hazard-real-madrid-composite_1tco2k1nd59yl18nguc6e09r0l.jpg?t=584142771&quality=60&w=1200&h=800", "https://cdn.vox-cdn.com/thumbor/LiPVCZelw9hkYv1bOAvDFQV85Ws=/1400x1400/filters:format(jpeg)/cdn.vox-cdn.com/uploads/chorus_asset/file/19401429/1181922656.jpg.jpg"},
        {"https://asset.indosport.com/article/image/q/80/254837/asensio-169.jpg?w=750&h=423", "https://i.guim.co.uk/img/media/7a11ddad002c34f8fad99818c0a5268be4db56ed/312_122_2789_1674/master/2789.jpg?width=1200&height=1200&quality=85&auto=format&fit=crop&s=2d57ab7489289cfde23443b6fb6c5591", "https://en.as.com/futbol/imagenes/2019/02/26/copa_del_rey/1551178125_735131_1551178302_noticia_normal.jpg", "https://img.bleacherreport.net/img/images/photos/003/703/519/hi-res-411f546f18884c727f01dc1ff5df91bf_crop_north.jpg?1508859325&w=3072&h=2048"},
        {"https://s.france24.com/media/display/09c6d682-092d-11ea-becd-005056bff430/w:1280/p:16x9/17-11-2019-benzema-reuters-susana-vera.webp", "https://img.bleacherreport.net/img/images/photos/003/844/989/hi-res-8a8f90b0d1260d899093fb43c207c4e5_crop_north.jpg?1577720957&w=3072&h=2048", "https://cdn.newsapi.com.au/image/v1/35f0d8520e70ec140679936707bee545", "https://images.daznservices.com/di/library/omnisport/d3/66/karimbenzema-cropped_kkrscxq9uqm010zhfj52q60u9.jpg?t=-881009918&quality=60&w=1200&h=800"},
    };

    public static ArrayList<Player> getListData() {
        ArrayList<Player> list = new ArrayList<>();
        for (int position = 0; position < playerName.length; position++) {
            Player player = new Player();
            player.setName(playerName[position]);
            player.setNational(playerNation[position]);
            player.setPosition(playerPosition[position]);
            player.setBorn(playerBorn[position]);
            player.setDescription(playerDescription[position]);
            player.setImage(playerImage[position]);
            player.setImages(playerImages[position]);
            list.add(player);
        }

        return list;
    }
}
