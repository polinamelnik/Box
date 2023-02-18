public class Box {
    String river;
    int size;
    int time;

    public Box() {
        river = "test river";
        size = 13;

        System.out.println("size = " + size + "sm");
        System.out.println("Box river = " + river);

        System.out.println(13 * 9 * 36);  //4212sm
        System.out.println("Result = (13*3) by Java");
    }

    public Box(String r) {
        river = r;

        System.out.println("size = " + size + "sm");
        System.out.println("Box river = " + river);

        System.out.println(19 * 12 * 132);
        System.out.println("Result = (*3) by Java");  //30096sm
    }

    public Box(String r, int s) {
        river = r;
        size = s;

        System.out.println("size = " + size + "sm");
        System.out.println("Box river = " + river);

        System.out.println(44 * 33 * 1452);     //2108304
        System.out.println("Result = (*3) by Java");
    }

    public Box(String r, int s, int t) {
        river = r;
        size = s;
        time = t;

        System.out.println("size = " + size + "sm");
        System.out.println("Box river = " + river);
        System.out.println("time = " + time);

        System.out.println(55 * 22 * 1210); //1464100
        System.out.println("Result = (*3) by Java");


    }
}





