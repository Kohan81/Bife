package Lab2;

/**
 * Create by Eugene
 * create on 20.10.2025
 * Program description
 */
public class Box {

    int height, width, depth;
    Box(int height, int width, int depth){

        this.height = height;
        this.width = width;
        this.depth = depth;
    };


    public static void main(String[] args) {

        Box box1 = new Box(2, 3, 4);
        System.out.println("The box is " + box1.height + "cm high, " + box1.width + "cm wide and " + box1.depth + "cm deep");
        System.out.println("The volume of the box is " + box1.volume(box1.height, box1.width, box1.depth) + " cms cubed ");
        System.out.println("The perimeter of the box is " + box1.perimeter(box1.height, box1.width, box1.depth) + " cms");
        System.out.println();

        Box box2 = new Box(4, 4, 4);
        System.out.println("The box is " + box2.height + "cm high, " + box2.width + "cm wide and " + box2.depth + "cm deep");
        System.out.println("The volume of the box is " + box2.volume(box2.height, box2.width, box2.depth) + " cms cubed ");
        System.out.println("The perimeter of the box is " + box2.perimeter(box2.height, box2.width, box2.depth) + " cms");
        System.out.println();

        Box box3 = new Box(20, 25, 30);
        System.out.println("The box is " + box3.height + "cm high, " + box3.width + "cm wide and " + box3.depth + "cm deep");
        System.out.println("The volume of the box is " + box3.volume(box3.height, box3.width, box3.depth) + " cms cubed ");
        System.out.println("The perimeter of the box is " + box3.perimeter(box3.height, box3.width, box3.depth) + " cms");
        System.out.println();
    }

    int perimeter(int height, int width, int depth) {
        return (4 * height + 4 * width + 4 * depth);
    }
    int volume(int height, int width, int depth) {
        return (height * width * depth);
    }

}//class
