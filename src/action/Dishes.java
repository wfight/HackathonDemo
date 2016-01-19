package action;

public class Dishes implements java.io.Serializable {

    private static final long serialVersionUID = 7267443685899765151L;
    private Integer dishid; //菜品ID
    private String name;//菜品名称
    private Integer price; //菜品单价
    private Integer number;

    private Integer amount;//单个菜品 X购买数量的总金额
    private String url;//菜品图片地址

    public Dishes() {
    }

    /**
     * @return the dishid
     */
    public Integer getDishid() {
        return dishid;
    }

    /**
     * @param dishid the dishid to set
     */
    public void setDishid(Integer dishid) {
        this.dishid = dishid;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * @return the number
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * @return the amount
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }
}
