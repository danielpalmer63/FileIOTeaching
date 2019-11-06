package fileioteaching;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ApartmentList 
{
    private final ArrayList<Apartment> apartmentList;
    private String extra;
    private double price;
    private String link;
    private int numOfRooms;
    private int sqFt;
    
    public ApartmentList()
    {
        apartmentList = new ArrayList<>();
        addApartmentsToList();
    }
    
    private void addApartmentsToList()
    {
        try
        {
            int num = 0;
            final Scanner myScanner = new Scanner(new File("data.txt"));
            while(myScanner.hasNextLine())
            {
                for(int i = 0; i < 2; i++)
                {
                    String arr[] = myScanner.nextLine().split(" ", 6);
                    if (num%2 == 0)
                    {
                        String strPrice = arr[0].replaceAll("[$,]", "");
                        price = Double.parseDouble(strPrice);
                    
                        String strNumOfRooms = arr[2];
                        numOfRooms = Character.getNumericValue(strNumOfRooms.charAt(0));
                    
                        String strSqFt = arr[4].replaceAll("ft2", "");
                        sqFt = Integer.parseInt(strSqFt);
                    
                        String strExtra = arr[5];
                        extra = strExtra;
                    }
                    else
                    {
                        link = arr[0];
                    }
                    num++;
                }
                
                getApartmentList().add(new Apartment(price, sqFt, numOfRooms, link, extra));
            }
            System.out.println(getApartmentList());
        }
        catch(FileNotFoundException error)
        {
            System.out.println(error);
        } 
    }
    
    public ArrayList<Apartment> getApartmentList()
    {
        return apartmentList;
    }
}
