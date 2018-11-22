public class InPlaceSorts
{
    public static void bubbleSort(String[] list1)
    {
        int swap = 1;
        while(swap != 0)
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
    public void insertionSort(int[] list1)
    {
        for(int i = 0; i < list1.length; i++)
        {
            for(int j = i; j > 0; j--)
            {
                if(list1[j - 1] > list1[j])
                {
                    int temp = list1[j];
                    list1[j - 1] = list1[j];
                    list1[j - 1] = temp;
                }
                else
                {
                    j = 0;
                }
            }
        }
    }
    public void mergeSort(int[] list1, int left, int mid, int right, int[] temp)
    {
        int i;
        int j;
        int k;

        i = left;
        j = mid + 1;
        k = left;
        while(i <= mid && j <= right)
        {
            if (list1[i] < list1[j])
            {
              list1[i] = temp[k];
              i++;
            }
            else
            {
                list1[j] = temp[k];
                j++;
            }
            k++;
        }
        while(i <= mid)
        {
            list1[i] = temp[k];
            i++;
            k++;
        }
        while(j <= right)
        {
            list1[j] = temp[k];
            j++;
            k++;
        }
        for(int l = 0; l < temp.length; l++)
        {

        }
    }
}
