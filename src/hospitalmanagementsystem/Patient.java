/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospitalmanagementsystem;

/**
 *
 * @author MAS
 */
public class Patient {
    public int ID;
    public String Name;
    public String Phone;
    public double Age;

    public Patient(int id, String name, String phone, double age) {
        this.ID = id;
        this.Name = name;
        this.Phone = phone;
        this.Age = age;
    } 
    
     public void disply(){
        System.out.println("ID: "+ ID +"  \tName: "+Name +" \tphone: "+Phone +"\tage: "+Age );
    }
    
      private static void merge(Patient[] arr, int beg, int mid, int end) {
        int l = mid - beg + 1;
        int r = end - mid;
        Patient LeftArray[] = new Patient [l];
        Patient RightArray[] = new Patient [r];
        
        for (int i=0; i<l; ++i) {
            LeftArray[i] = arr[beg + i]; 
        }
        for (int j=0; j<r; ++j) {
            RightArray[j] = arr[mid + 1+ j]; 
        }
        int i = 0, j = 0;
        int k = beg;
        
        while (i<l&&j<r) {
            if (LeftArray[i].ID <= RightArray[j].ID ) {
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
    
    public static void sortById(Patient[] arr, int beg, int end)
    { 
        if (beg<end)
        { 
            int mid = (beg+end)/2;
            sortById(arr, beg, mid);
            sortById(arr , mid+1, end);
            merge(arr, beg, mid, end);
        } 
    }
}
