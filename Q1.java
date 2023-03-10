import java.util.Scanner;
public class Q1
{
    static final String Yes = "Yes";
    static final String No = "No";
    public static void main(String [] aStrings)
    {
        Scanner inputs = new Scanner(System.in);
        int TotalTSNum = Integer.valueOf(inputs.next());
        inputs.nextLine();
        String[] hasSizes = inputs.nextLine().split(" ");
        int requestNum = Integer.valueOf(inputs.nextLine());
        String[] requestSizes = inputs.nextLine().split(" ");
        inputs.close();
        if (TotalTSNum < requestNum)
        {
           System.out.print(No);
           return;
        }
        for (int i = 0; i<requestSizes.length; i++)
        {
            boolean contains = false;
            for (int j =0; j<hasSizes.length; j++)
            {
                if (requestSizes[i].equals(hasSizes[j]))
                {
                    contains = true;
                    break;
                }
            }
            if (!contains)
            {
                System.out.print(No);
                return;
            }
        }
        System.out.print(Yes);
    }
}