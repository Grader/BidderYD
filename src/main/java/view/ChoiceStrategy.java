package view;

import model.ListStrategies;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChoiceStrategy {

    public ChoiceStrategy() {
    }

    public String selectPosition () throws IOException {

        System.out.println("Please select a position for shows ");

        System.out.println(ListStrategies.FIRST_SPECIAL);
        System.out.println(ListStrategies.SECOND_SPECIAL);
        System.out.println(ListStrategies.THIRD_SPECIAL);
        System.out.println(ListStrategies.FIRST_GUARANTEE);
        System.out.println(ListStrategies.ENTRANCE_GUARANTEE);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String position = reader.readLine();

        System.out.println("You chose the position: " + position);

        return position;

    }
}
