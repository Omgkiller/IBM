import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;
public class Q2 {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        List<String> errorCodes = new LinkedList<>();
        int totalRecords = 0;
        boolean allValid = true;
        if (inputs.hasNext())
        {
            String input = inputs.next();
            totalRecords = Integer.valueOf(input.trim());
        }
        for (int i = 0; i<=totalRecords; i++)
        {
            String input = inputs.nextLine();
            String record[] = input.split(" ");
            if (record.length != 3)
            {
                continue;
            }
            boolean recordValid = Boolean.valueOf(record[1]);
            if (!recordValid)
            {
                allValid = false;
                errorCodes.add(record[2]);
            }
        }
        inputs.close();
        if (allValid)
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");  
            System.out.print(System.lineSeparator());
            System.out.print(String.join(" ", errorCodes));
        }
    }
}
