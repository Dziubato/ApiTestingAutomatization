public class Card {

    public String idList;
    public String id;

    private String name;
    private String key = "208d6c954a57eea3e3be05ad647d3567";
    private String token = "26550fe83216c260a212677bdc47af3c6cacfa3d4553eaac53d68ad81b866a2f";

    public String getId() {return id;}

    public String getIdList() {return idList;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getKey() {
        return key;
    }

    public String getToken() {
        return token;
    }
}
