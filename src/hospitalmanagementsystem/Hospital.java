 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospitalmanagementsystem;

import java.util.List;

/**
 *
 * @author MAS
 */
public class Hospital {
    private String name;
    private String location;
    
    public Hospital(String name, String location){
        this.name = name;
        this.location = location;
    }

     public void disply(){
        System.out.println("name: "+ name +"\tLocation: "+location);
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
    
    
    private static void merge(Hospital[] arr, int beg, int mid, int end) {
        int l = mid - beg + 1;
        int r = end - mid;
        Hospital LeftArray[] = new Hospital [l];
        Hospital RightArray[] = new Hospital [r];
        
        for (int i=0; i<l; ++i) {
            LeftArray[i] = arr[beg + i]; 
        }
        for (int j=0; j<r; ++j) {
            RightArray[j] = arr[mid + 1+ j]; 
        }
        int i = 0, j = 0;
        int k = beg;
        
        while (i<l&&j<r) {
            if (LeftArray[i].name.compareTo( RightArray[j].name ) <= 0 ) {
                arr[k] = LeftArray[i];
                i++;
            }
            else {
                arr[k] = RightArray[j];
                j++; 
            }
            k++; 
        }
       while (i<l)
       { 
           arr[k] = LeftArray[i];
            i++;
            k++; 
       }
        while (j<r) {
            arr[k] = RightArray[j];
            j++;
            k++; 
        } 
    }
    
    public static void sortByName(Hospital[] arr, int beg, int end)
    { 
        if (beg<end)
        { 
            int mid = (beg+end)/2;
            sortByName(arr, beg, mid);
            sortByName(arr , mid+1, end);
            merge(arr, beg, mid, end);
        } 
    }
    
    
}
