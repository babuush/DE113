public class Bicycle {
    private String ownerName;
    private String tagNo; // Adding tag number as a new attribute

    // Constructor
    public Bicycle() {
        ownerName = "";
        tagNo = ""; // Initializing tag number to 0 by default
    }

    // Getter method for ownerName
    public String getOwnerName() {
        return ownerName;
    }

    // Setter method for ownerName
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // Getter method for tagNo
    public String getTagNo() {
        return tagNo;
    }

    // Setter method for tagNo
    public void setTagNo(String tagNo) {
        this.tagNo = tagNo;
    }
}
