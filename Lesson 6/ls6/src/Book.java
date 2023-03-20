public class Book {
    String ad;
    String movzu;
    int sehife;

    public Book(){}

    public Book(String ad,String movzu,int sehife){
        this.ad=ad;
        this.movzu=movzu;
        this.sehife=sehife;
    }

    public String getInfo(){
        String str = "Ad: " + ad +
                     "\nMovzu: " + movzu +
                     "\nSehife: " + sehife;
        return str;
    }

}
