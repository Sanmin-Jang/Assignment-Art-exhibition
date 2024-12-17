public class Main {
    public static void main(String[] args) {
        //creating artists
        Artist artist1=new Artist("Pablo Picasso","love");
        Artist artist2=new Artist("Vincent Van Gogh","art");

        //creating artworks
        Artwork artwork1=new Artwork("Les Demoiselles d’Avignon",artist1,56.8);
        Artwork artwork2=new Artwork("The Potato Eaters ",artist2,689.8);

        //showing artists on the console
        System.out.println(artist1.toString()+"\n"+artist2.toString());

        //artists and artwork comparison which was presented on the classes "Artist" and "Artwork"
        System.out.println("Artist comparison: " + artist1.equals(artist2));
        System.out.println("Artwork comparison: " + artwork1.equals(artwork2));

        //adding Gallery name and maximum of the artworks that this gallery should have
        Gallery gallery1=new Gallery("Astana art gallery",3);

        //adding artworks through the code on the class "Gallery"
        gallery1.add(artwork1);
        gallery1.add(artwork2);

        //displaying all the artworks in the gallery from the code in the class "Gallery"
        gallery1.display();



    }
}
//creating class Artist
class Artist {
    private String name;
    private String genre;

    //constructor
    public Artist(String name,  String genre) {
        setValues(name,genre);

    }

    //setting all values
    public void setValues(String name, String genre) {
        this.name = name;
        this.genre = genre;

    }

    //getting this values
    public String getValues() {
        return name +  " " + genre;
    }

    //tostring method for having sample how to present it on the console
    @Override
    public String toString() {
        return "Artists {" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }

    //method equals to compare artist if they equal or not
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Artist artist = (Artist) obj;
        return name.equals(artist.name);
    }
}
//creatin class Artwork
class Artwork {
    private String title;
    private Artist artist;
    private double price;

    //constructor
    public Artwork(String title, Artist artist, double price ) {
        setValues(title, artist, price);

    }

    //setting method
    public void setValues(String title, Artist artist, double price ) {
        this.title = title;
        this.artist = artist;
        this.price = price;
    }

    //getting method
    public String getValues() {
        return title + " " + artist + " " + price;
    }

    // also tostring method for sample
    @Override
    public String toString() {
        return "Artworks {" +
                "title='" + title + '\'' +
                ", artist=" + artist +
                ", price $=" + price +
                '}';
    }

    //also equal method for comparison two artworks
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Artwork artwork = (Artwork) obj;
        return title.equals(artwork.title);
    }
}
//creating class Gallery
class Gallery {
    private String name;
    private Artwork[] artwork_s;
    private int artwork_counter;

    //constructor with array of artworks in the class "Artwork"
    // and the max of artworks that gallery should have
    public Gallery(String name, int maximum_Artworks) {
        this.name = name;
        artwork_s = new Artwork[maximum_Artworks];
        this.artwork_counter = 0;
    }

    //adding artworks or arrays to the Gallery
    // and if the length of array smaller than given artworks, so it will display that gallery full
    public void add(Artwork artwork) {
        if (artwork_counter < artwork_s.length)
            artwork_s[artwork_counter++] = artwork;
        else
            System.out.println("Gallery already full");
    }

    //just displaying all artworks or arrays that gallery have
    public void display() {
        System.out.println("Gallery name: "+name);
        for(int i = 0; i < artwork_counter; i++) {
            System.out.println(artwork_s[i]);
        }
    }
}