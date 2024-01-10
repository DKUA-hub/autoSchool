package module3;
import com.figure.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Figure[] figures = new Figure[10];
        for (int index = 0; index < figures.length; index++){
            Random random = new Random();
            int number = random.nextInt(3);
            switch (number){
                case(0):
                    figures[index] = new Square();
                    break;
                case(1):
                    figures[index] = new Circle();
                    break;
                case(2):
                    figures[index] = new Triangle();
                    break;
                default:
                    System.out.println("expected index in range 0..2. Provided index: " + index);
                    break;
            }
        }

        /*Figure[] sortedFigures = new Figure[10];
        sortedFigures[0] = figures[0];
        for (int index = 1; index < figures.length; index++){
            boolean isReordered = false;
            for (int indexSorted = 0; indexSorted < index; indexSorted++){
                if (figures[index].getArea() < sortedFigures[indexSorted].getArea()){
                    int reindex = index;
                    if (reindex < figures.length - 1){
                        do{
                           sortedFigures[reindex] = sortedFigures[reindex-1];
                           reindex--;
                        }while (reindex > indexSorted);
                    }
                    sortedFigures[indexSorted] = figures[index];
                    isReordered = true;
                    break;
                }
            }
            if (!isReordered) sortedFigures[index] = figures[index];
        }*/
        System.out.println("ORIG ARRAY");
        for (Figure figure : figures){
            System.out.printf("%-8s: area=%.3f%n", figure.getName(), figure.getArea());
        }

     /*   System.out.println("SORTED ARRAY");
        for (Figure figure : sortedFigures){
            System.out.printf("%-8s: area=%.3f%n", figure.getName(), figure.getArea());
        }*/
        System.out.println("SORTED ORIG ARRAY");
        Arrays.sort(figures, (figure1, figure2) -> Double.compare(figure1.getArea(), figure2.getArea()));
        for (Figure figure : figures){
            System.out.printf("%-8s: area=%.3f%n", figure.getName(), figure.getArea());
        }
    }
}
