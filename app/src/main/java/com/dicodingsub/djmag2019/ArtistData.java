package com.dicodingsub.djmag2019;

import java.util.ArrayList;

public class ArtistData {
    private static String[] artistNames ={
            "Dimitri Vegas & Like Mike",
            "Martin Garrix",
            "David Guetta",
            "Armin Van Buuren",
            "Marshmello",
            "Don Diablo",
            "Oliver Heldens",
            "Tiesto",
            "Afrojack",
            "Steve Aoki"
    };

    private static String[] artistDetails = {
            "Dimitri Vegas & Like Mike are Belgian DJs and are record production duos, composed of brothers Dimitri Thivaios and Michael Thivaios. They were ranked No. 1 in 2015 and 2019 , Born in Belgium, Dimitri and Michael Thivaios are of Greek origin.The brothers grew up in the Flemish town of Willebroek. They began to make their first steps as DJ's reportedly at a young age.Very quickly, they made several appearances in small clubs and were resident BeatFM radio DJs. Dimitri then left Flanders in 1999 and began touring Europe. He lived in Mallorca and then in Halkidiki, Greece before moving to Ibiza in 2003, where he was a resident in major clubs such as Privilege and Space.In 2017, Dimitri Vegas married Belgian-born DJ and producer MATTN in Ibiza.",
            "Martijn Gerard Garritsen professionally known as Martin Garrix, is a Dutch DJ and record producer from Amstelveen. His most known singles are Animals,In the Name of Love,and Scared to be Lonely. He was ranked number one on DJ Mag's Top 100 DJs list for three consecutive years (2016, 2017, and 2018).He has performed at music festivals such as Coachella, Electric Daisy Carnival, Ultra Music Festival, Tomorrowland, and Creamfields. In 2014 he headlined the 1st edition of Ultra South Africa making this his first major festival. In the same year he became the youngest DJ to headline 2014 Ultra Music Festival at the age of 17. He was a resident DJ at Spain's Hï Ibiza (2017) and Ushuaïa Ibiza (2016 and 2018). He founded the label Stmpd Rcrds in 2016, months after leaving Spinnin' Records and before signing with Sony Music.",
            "Pierre David Guetta is a French DJ, music programmer, record producer and songwriter. He has sold over nine million albums and thirty million singles worldwide.In 2011, Guetta was voted as the number one DJ in the DJ Mag Top 100 DJs poll.In 2013, Billboard crowned When Love Takes Over as the number one dance-pop collaboration of all time. Born and raised in Paris, he released his first album, Just a Little More Love, in 2002. Later, he released Guetta Blaster (2004) and Pop Life (2007). Guetta achieved mainstream success with his 2009 album One Love which included the hit singles When Love Takes Over, Gettin' Over You, Sexy Bitch and Memories, the first three of which reached number one in the United Kingdom. The 2011 follow-up album, Nothing but the Beat, continued this success, containing the hit singles Where Them Girls At, Little Bad Girl , Without You, Titanium and Turn Me On. He has been called the grandfather of EDM",
            "Armin Jozef Jacobus Daniël van Buuren OON is a Dutch DJ, record producer and remixer from South Holland. Since 2001, he has hosted A State of Trance, a weekly radio show, which is broadcast to nearly 40 million listeners in 84 countries on over 100 FM radio stations. According to Djs And Festivals, the radio show propelled him to stardom and helped cultivate an interest in trance music around the world.",
            "Christopher Comstock (born May 19, 1992), known professionally as Marshmello, is an American electronic music producer and DJ. He first gained international recognition by releasing remixes of songs by American DJ duo Jack Ü and Russian-German DJ Zedd. He is best known for the songs Silence, Wolves, Friends, and Happier, all of which have been certified multi-platinum in several countries and appeared in the Top 30 of the Billboard Hot 100.",
            "Don Pepijn Schipper better known by his stage name Don Diablo, is a Dutch DJ, record producer, musician and songwriter of electronic dance music from Coevorden. He is known for his electronic style of production and vocalizing in most of his songs. He is one of the pioneers of the future house genre and was ranked sixth in the Top 100 DJs – 2019 list by DJ Mag.He was also ranked number one Producer of the Year by 1001Tracklists. In 2016, he was ranked the number one Future House Artist of the Year on Beatpor",
            "Olivier J. L. Heldens (born 1 February 1995), better known by his stage name Oliver Heldens, is a Dutch DJ and electronic music producer from Rotterdam He is regarded as a pioneer of the future house genre propelling it to international attention and chart successes including Gecko (Overdrive), Last All Night (Koala), The Right Song, Fire in My Soul and Turn Me On. He also produces bass house songs under the alias HI-LO, which comes from Oli H in reversed form, and runs the label Heldeep Records. Through December 2019, he is the 346th most streamed artist on Spotify, with over a billion cumulative streams.",
            "Tijs Michiel Verwest OON better known by his stage name Tiësto is a Dutch DJ and record producer from Breda , Netherlands. He was named the Greatest DJ of All Time ,  by Mix magazine in a poll voted by the fans. In 2013, he was voted by DJ Mag readers as the best DJ of the last 20 years. He is also regarded as the Godfather of EDM by many sources. In 1997, he founded the label Black Hole Recordings with Arny Bink, where he released the Magik and In Search of Sunrise CD series. Tiësto met producer Dennis Waakop Reijers in 1998 the two have worked together extensively since then",
            "Nick van de paul Wall professionally known as Afrojack, is a Dutch DJ, music programmer, record producer, and remixer from Spijkenisse. In 2007 he founded the record label Wall Recordings his debut album Forget the World was released in 2014. Afrojack regularly features as one of the ten best artists in the Top 100 DJs published by DJ Mag. He is also the CEO of LDH Europe",
            "Steven Hiroyuki Aoki is an American musician, DJ, record producer and music executive. In 2012, Pollstar designated Aoki as the highest grossing dance artist  in North America from tours. He has collaborated with artists such as will.i.am, Afrojack, LMFAO, Linkin Park, Iggy Azalea, Lil Jon, blink-182, Laidback Luke, BTS, Monsta X, Louis Tomlinson, Backstreet Boys, Rise Against, Vini Vici, Lauren Jauregui, and Fall Out Boy and is known for his remixes of artists such as Kid Cudi. Aoki has released several Billboard-charting studio albums as well, notably Wonderland, which was nominated for Grammy Award for Best Dance/Electronica Album in 2013. He is the founder of the Steve Aoki Charitable Fund, which raises money for global humanitarian relief organizations. In 2019, Aoki published a memoir, Blue: The Color of Noise"
    };

    private static int[] artistImages = {
            R.drawable.dvlm,
            R.drawable.martingarrix,
            R.drawable.davidguetta,
            R.drawable.avb,
            R.drawable.marshmello,
            R.drawable.don,
            R.drawable.oh,
            R.drawable.tiesto,
            R.drawable.afrojack,
            R.drawable.steve
    };

    static ArrayList<Artist> getListData(){
        ArrayList<Artist> list = new ArrayList<>();
        for (int position = 0; position < artistNames.length; position++){
            Artist artist = new Artist();
            artist.setName(artistNames[position]);
            artist.setDetail(artistDetails[position]);
            artist.setPhoto(artistImages[position]);
            list.add(artist);
        }
        return list;
    }
}
