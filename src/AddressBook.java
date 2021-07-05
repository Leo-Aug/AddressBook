import java.util.ArrayList;
public class AddressBook implements AddressBookInterface {
    private ArrayList<Friend> friend_list;

    public AddressBook(){
        friend_list = new ArrayList<Friend>();
        //初始化
        friend_list.add(new Friend("f1", "00000000000", "家人"));
        friend_list.add(new Friend("f2", "11111111111", "朋友"));
        friend_list.add(new Friend("f3", "22222222222", "同学"));
        friend_list.add(new Friend("f1", "33333333333", "朋友"));
    }


    @Override
    public void add_friend(String name, String phone_num, String type) {
        // TODO Auto-generated method stub
        friend_list.add(new Friend(name, phone_num, type));
    }

    @Override
    public String get_friend(String type, String name) {
        // TODO Auto-generated method stub
        String num = null;
        for(Friend f : friend_list){
            if(f.getType().equals(type) && f.getName().equals(name)){
                num = f.getPhone_num();
            }
        }
        return num;
    }

    @Override
    public String get_name(String phone_num) {
        // TODO Auto-generated method stub
        String name = null;
        for(Friend f : friend_list){
            if(f.getPhone_num().equals(phone_num)){
                name = f.getName();
            }
        }
        return name;
    }

    @Override
    public ArrayList<String> get_num(String name) {
        // TODO Auto-generated method stub
        ArrayList<String> nums = new ArrayList<String>();
        for(Friend f : friend_list){
            if(f.getName().equals(name)){
                nums.add(f.getPhone_num());
            }
        }
        return nums;
    }

    @Override
    public void show_all_friends() {
        // TODO Auto-generated method stub
        for(Friend f :friend_list){
            System.out.println("类型: "+f.getType()+" 姓名: "+f.getName()+" 电话号码: "+f.getPhone_num());
        }
    }
}
