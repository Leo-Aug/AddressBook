import java.util.ArrayList;
public interface AddressBookInterface {
    public void show_all_friends();
    public void add_friend(String name, String phone_num, String type);
    public String get_name(String phone_num);
    public ArrayList<String> get_num(String name);
    public String get_friend(String type, String name);
}
