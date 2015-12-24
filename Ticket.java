package ru.stetsenko;

import java.io.*;
import java.util.Arrays;

/**
 * Created by Alesha on 19.11.2015.
 */
public class Ticket {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("text.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("tickets.txt"));

        String string = bufferedReader.readLine();
        String[] strings = string.split(" ");
        System.out.println("Исходные билетики " + '\n' + Arrays.toString(strings));
        
        bufferedWriter.write("Номера счастливых билетиков: ");
        for (int i=0; i<strings.length; i++) {
            Integer numberOfTicket = Integer.valueOf(strings[i]);
            if(((numberOfTicket/100000%10)+(numberOfTicket/10000%10)+(numberOfTicket/1000%10)) == ((numberOfTicket/100%10)+(numberOfTicket/10%10)+(numberOfTicket%10))){
                bufferedWriter.write(numberOfTicket.toString() + ' ');
            }
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
