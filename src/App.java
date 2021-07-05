import java.util.Scanner;
import java.util.ArrayList;
public class App {
    public static void main_add_friend(AddressBook book){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入好友类型（家人、朋友、同学）：");
        String type = input.next();
        System.out.print("请输入好友名字：");
        String name = input.next();
        System.out.print("请输入好友电话：");
        String phone_num = input.next();
        book.add_friend(name, phone_num, type);
    }
    
    public static void search_friend(AddressBook book){
        Scanner input = new Scanner(System.in);
        System.out.println("1、通过姓名查找电话号码");
        System.out.println("2、通过电话号码查找姓名");
        System.out.println("3、分组查找");
        System.out.print("请输入你选择的查找方式：");
        int choice = input.nextInt();
        switch(choice){
            case 1:
                System.out.print("请输入姓名：");
                String name1 = input.next();
                ArrayList<String> nums1 = book.get_num(name1);
                System.out.println("查到的电话号码：");
                for(String num : nums1){
                    System.out.println(num);
                }
                break;
            case 2:
                System.out.print("请输入电话号码：");
                String num2 = input.next();
                String name2 = book.get_name(num2);
                if(name2 != null){
                    System.out.println("查到的姓名："+name2);
                }else{
                    System.out.println("查无此人");
                }
                break;
            case 3:
                System.out.print("请输入分组（家人、朋友、同学）：");
                String type3 = input.next();
                System.out.print("请输入姓名：");
                String name3 = input.next();
                String num3 = book.get_friend(type3, name3);
                System.out.println("查到的电话号码：" + num3);
                break;
        }
    }
    public static void main(String[] args) throws Exception {
        AddressBook addressBook = new AddressBook();
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        System.out.println("欢迎使用通讯录。");
        do{
            System.out.println("请输入你要进行的操作：");
            System.out.println("1、查看所有好友");
            System.out.println("2、添加好友");
            System.out.println("3、查找好友");
            System.out.println("4、退出");
            int choice = input.nextInt();
            switch(choice){
                case 1:
                    addressBook.show_all_friends();
                    break;
                case 2:
                    main_add_friend(addressBook);
                    break;
                case 3:
                    search_friend(addressBook);
                    break;
                default:
                    exit = true;
                    break;
            }
        }while(!exit);
        input.close();
    }
}
