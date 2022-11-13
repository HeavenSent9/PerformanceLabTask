
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) throws IOException {

        File circFile = new File(args[0]);
        File pointFile = new File(args[1]);
        BufferedReader objCircle = new BufferedReader(new FileReader(circFile));
        BufferedReader objDot = new BufferedReader(new FileReader(pointFile));

        String[] centerArray = objCircle.readLine().split(" ");
        float centerCircleX = Float.parseFloat(centerArray[0]);
        float centerCircleY = Float.parseFloat(centerArray[1]);

        float radius = Float.parseFloat(objCircle.readLine());


        String[] dotArray;
        String line;
        while ((line = objDot.readLine()) != null) {
            dotArray = line.split(" ");
            float dotX = Float.parseFloat(dotArray[0]);
            float dotY = Float.parseFloat(dotArray[1]);
            if (radius == logic(dotX, dotY, centerCircleX, centerCircleY)) {
                System.out.println("0");
            } else if (Math.pow(dotX - centerCircleX, 2) + Math.pow(dotY - centerCircleY, 2) <=
                    Math.pow(radius, 2) &&
                    radius != logic(dotX, dotY, centerCircleX, centerCircleY)) {
                System.out.println("1");
            } else {
                System.out.println("2");
            }

        }
    }

    //основной метод
    public static float logic(float dotX, float dotY, float centerCircleX, float centerCircleY) {
        return (float) Math.pow(
                Math.pow(dotX - centerCircleX, 2) +
                        Math.pow(dotY - centerCircleY, 2), 0.5);
    }
}
