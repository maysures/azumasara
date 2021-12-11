package 实训七.第二题;

public class one {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int c = 0;
        int[] arr = {a,b,c};

        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        boolean check = true;

        if (args.length == 3 && (a+b)>c && (a+c)>b && (c+b)>a && (a-b)<c && (a-c)<b && (c-b)<a && (c-a)<b && (b-a)<c && (b-c)<a && a>0 && b>0 && c>0) {
            check = true;
        }else {
            check = false;
        }

        while (check == true) {
            System.out.println("三角形周长为:" + (a + b + c));

            double d = (double) a;
            double e = (double) b;
            double f = (double) c;
            double p = (d + e + f) / 2;
            double s = Math.sqrt(p * (p - d) * (p - e) * (p - f));
            System.out.println("三角形面积为:" + s);
            break;
        }
        while (check == false){
            System.out.println("你再想想,这到底是不是三角形");
            break;
        }
    }
}

