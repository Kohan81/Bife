package Lecture2_Variables;

/**
 * Create by Eugene
 * create on 20.10.2025
 * Program description
 */
public class Me2 {
    public static void main(String[] args) {
        // Переменные с личными данными
        String name = "Eugene Kokhanevych";
        String phoneExt = "Ext. 24243";
        String email = "eugen.k@example.com";
        int heightFeet = 5, heightInches = 9;
        int weight = 86;

        String addressLine1 = "Room L142";
        String addressLine2 = "Ulster University";
        String addressLine3 = "Cromore Road";
        String addressLine4 = "Coleraine";
        String addressLine5 = "BT52 1SA";

        // Вывод с использованием табуляции и переходов строк
        System.out.println("\tName:\t\t" + name + "\t\tAddress:\t" + addressLine1);
        System.out.println("\t\t\t\t\t\t\t\t\t\t" + addressLine2);
        System.out.println("\tPhone:\t\t" + phoneExt + "\t\t\t\t" + addressLine3);
        System.out.println("\temail:\t\t" + email + "\t\t" + addressLine4);
        System.out.println("\tHeight:\t\t" + heightFeet + "'" + heightInches + "\""
                + "\t\t\t\t\tWeight:\t" + weight + " kgs");
    }

}//class
