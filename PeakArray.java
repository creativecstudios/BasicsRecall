package Arrays;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.ElementTraversal;

public class PeakArray {


    public static void main(String [] args)
    {
        int [] arr ={10,20,15,2,23,90,67};
        List<Integer> Element = ElementInPeak(arr);
        System.out.println(Element);
    }

    public static List<Integer> ElementInPeak(int[] arr)
    {
        List<Integer> Element = new ArrayList<>();

        int n = arr.length;
        if(n == 1)
        {
            Element.add(arr[0]);
            return Element;
        }

        if(arr[0] > arr[1])
        {
            Element.add(arr[0]);
            return Element;
        }

        for(int i = 1; i < n - 1; i++)
        {
            if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1])
            {
                Element.add(arr[i]);
            }
        }

        if(arr[n - 1] > arr[n - 2])
        {
            Element.add(arr[n - 1]);
        }
        return Element;
    }
    }
    
    

