package atm.sonect.com.myapplication;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Example implements Parcelable {

    private String url;
    private String name;
    private String gender;
    private String culture;
    private String born;
    private String died;
    private List<String> titles = null;
    private List<String> aliases = null;
    private String father;
    private String mother;
    private String spouse;
    private List<String> allegiances = null;
    private List<String> books = null;
    private List<String> povBooks = null;
    private List<String> tvSeries = null;
    private List<String> playedBy = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Parcelable.Creator<Example> CREATOR = new Creator<Example>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Example createFromParcel(Parcel in) {
            return new Example(in);
        }

        public Example[] newArray(int size) {
            return (new Example[size]);
        }

    };

    protected Example(Parcel in) {
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.gender = ((String) in.readValue((String.class.getClassLoader())));
        this.culture = ((String) in.readValue((String.class.getClassLoader())));
        this.born = ((String) in.readValue((String.class.getClassLoader())));
        this.died = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.titles, (java.lang.String.class.getClassLoader()));
        in.readList(this.aliases, (java.lang.String.class.getClassLoader()));
        this.father = ((String) in.readValue((String.class.getClassLoader())));
        this.mother = ((String) in.readValue((String.class.getClassLoader())));
        this.spouse = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.allegiances, (java.lang.String.class.getClassLoader()));
        in.readList(this.books, (java.lang.String.class.getClassLoader()));
        in.readList(this.povBooks, (java.lang.String.class.getClassLoader()));
        in.readList(this.tvSeries, (java.lang.String.class.getClassLoader()));
        in.readList(this.playedBy, (java.lang.String.class.getClassLoader()));
        this.additionalProperties = ((Map<String, Object>) in.readValue((Map.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     */
    public Example() {
    }

    /**
     * @param books
     * @param born
     * @param aliases
     * @param url
     * @param father
     * @param mother
     * @param died
     * @param spouse
     * @param tvSeries
     * @param name
     * @param allegiances
     * @param povBooks
     * @param playedBy
     * @param gender
     * @param titles
     * @param culture
     */
    public Example(String url, String name, String gender, String culture, String born, String died, List<String> titles, List<String> aliases, String father, String mother, String spouse, List<String> allegiances, List<String> books, List<String> povBooks, List<String> tvSeries, List<String> playedBy) {
        super();
        this.url = url;
        this.name = name;
        this.gender = gender;
        this.culture = culture;
        this.born = born;
        this.died = died;
        this.titles = titles;
        this.aliases = aliases;
        this.father = father;
        this.mother = mother;
        this.spouse = spouse;
        this.allegiances = allegiances;
        this.books = books;
        this.povBooks = povBooks;
        this.tvSeries = tvSeries;
        this.playedBy = playedBy;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCulture() {
        return culture;
    }

    public void setCulture(String culture) {
        this.culture = culture;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public String getDied() {
        return died;
    }

    public void setDied(String died) {
        this.died = died;
    }

    public List<String> getTitles() {
        return titles;
    }

    public void setTitles(List<String> titles) {
        this.titles = titles;
    }

    public List<String> getAliases() {
        return aliases;
    }

    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getSpouse() {
        return spouse;
    }

    public void setSpouse(String spouse) {
        this.spouse = spouse;
    }

    public List<String> getAllegiances() {
        return allegiances;
    }

    public void setAllegiances(List<String> allegiances) {
        this.allegiances = allegiances;
    }

    public List<String> getBooks() {
        return books;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }

    public List<String> getPovBooks() {
        return povBooks;
    }

    public void setPovBooks(List<String> povBooks) {
        this.povBooks = povBooks;
    }

    public List<String> getTvSeries() {
        return tvSeries;
    }

    public void setTvSeries(List<String> tvSeries) {
        this.tvSeries = tvSeries;
    }

    public List<String> getPlayedBy() {
        return playedBy;
    }

    public void setPlayedBy(List<String> playedBy) {
        this.playedBy = playedBy;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(url);
        dest.writeValue(name);
        dest.writeValue(gender);
        dest.writeValue(culture);
        dest.writeValue(born);
        dest.writeValue(died);
        dest.writeList(titles);
        dest.writeList(aliases);
        dest.writeValue(father);
        dest.writeValue(mother);
        dest.writeValue(spouse);
        dest.writeList(allegiances);
        dest.writeList(books);
        dest.writeList(povBooks);
        dest.writeList(tvSeries);
        dest.writeList(playedBy);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return 0;
    }

}