public class Friend {
    private String name;
    private String phone_num;
    private String type;
    
    public Friend(String name, String phone_num, String type) {
        this.name = name;
        this.phone_num = phone_num;
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone_num() {
        return phone_num;
    }
    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    
}
