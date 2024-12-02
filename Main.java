import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\XobliteHD\\Desktop\\prog\\jav\\input.txt"; // Replace with your file path if necessary
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split the line by 3 spaces
                String[] parts = line.split("   ");
                if (parts.length == 2) { // Ensure the line has exactly two numbers
                    array1.add(Integer.parseInt(parts[0].trim()));
                    array2.add(Integer.parseInt(parts[1].trim()));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        // Convert to arrays if needed

        array1.sort(null);
        array2.sort(null);
        
        int x=0;
        int y=0;
        for (int i=0 ; i<array1.size() ; i++)
        {
            for(int j=0 ; j<array1.size() ; j++)
            {
                if(array1.get(i).equals(array2.get(j))){
                    y++;
                }
                x+=(array1.get(i)*y);
                y=0;
            }
        }
        System.out.printf("total distance is: %d%n",x);
    }
}
