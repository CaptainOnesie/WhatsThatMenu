package menu.fish.whatsthatmenu.model;

/**
 * Holds information about menu items to be displayed.
 */

public class DataItem {
    private String itemId;
    private String itemName;
    private String description;
    private String category;
    private int sortPos;
    private double price;
    private String image;

    /**
     * No-args constructor.
     */
    public DataItem() {

    }

    /**
     * Fully-defined constructor that creates a new instance of the container class with instantiated fields.
     * @param itemId The ID of the item in the list, or in the database or whatever
     * @param itemName The name of the item.
     * @param description A short description of the item.
     * @param category The category the menu item falls into.
     * @param sortPos The positioning of the item in the eventual sorted list.
     * @param price The price of the menu item.
     * @param image A URL to the image, or the name of the image locally stored.
     */
    public DataItem(String itemId, String itemName, String description, String category, int sortPos, double price, String image) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.description = description;
        this.category = category;
        this.sortPos = sortPos;
        this.price = price;
        this.image = image;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getSortPos() {
        return sortPos;
    }

    public void setSortPos(int sortPos) {
        this.sortPos = sortPos;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "DataItem{" +
                "itemId='" + itemId + '\'' +
                ", itemName='" + itemName + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", sortPos=" + sortPos +
                ", price=" + price +
                ", image='" + image + '\'' +
                '}';
    }
}
