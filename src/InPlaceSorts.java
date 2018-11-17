public class InPlaceSorts
{
    public static void bubbleSort(String[] list1)
    {
        int swap = 1;
        while( swap != 0)
        {
            for(swap = 0; swap < list1.length; swap++)
            {
                for(int i =0; i < list1.length -1; i++)
                {
                    if(list1[i].compareTo(list1[i + 1]) < 0);
                    {
                        String temp = list1[i];
                        list1[i] = list1[i + 1];
                        list1[i + 1] = temp;
                    }
                }
            }
        }
    }
    public static void selectionSort(double[] list1)
    {
        int
    }
}
