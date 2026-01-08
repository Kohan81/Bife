package PeopleSkillDemo;

/**
 * Created by Eugene
 * create on 20/11/2025
 * Program description:
 */
public class TestPerson {
    public static void main(String[] args) {

        Person me = new Person("Eugene", 44, "ec465395", "0851953713", 185);
        me.printPersonDetails();

        Person myFriend = new Person("John", 25, "12345678RA", "0871953713", 176);
        myFriend.printPersonDetails();

        Person bus = new Person();
        bus.printPersonDetails();

        Person aunt = new Person("Rosa", 52, "7456874TD", "0871636713", 162);
        aunt.printPersonDetails();

        myFriend.setAge(26);
        myFriend.setPhoneNumber("0871745719");
        myFriend.printPersonDetails();
    }
}
