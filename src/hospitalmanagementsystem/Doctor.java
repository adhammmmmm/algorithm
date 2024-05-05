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
public class Doctor {
    private int id;
    private String name;
    private String phone;
    private String specialization;

    public Doctor(int id, String name, String phone, String specialization) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.specialization = specialization;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getSpecialization() {
        return specialization;
    }
    
    public void disply(){
        System.out.println("ID: "+ id   +"  \tName: "+name +" \tphone: " +phone + "\tspecialization: " +specialization );
    }
    
    private static void merge(Doctor[] arr, int beg, int mid, int end) {
        int l = mid - beg + 1;
        int r = end - mid;
        Doctor LeftArray[] = new Doctor [l];
        Doctor RightArray[] = new Doctor [r];
        
        for (int i=0; i<l; ++i) {
            LeftArray[i] = arr[beg + i]; 
        }
        for (int j=0; j<r; ++j) {
            RightArray[j] = arr[mid + 1+ j]; 
        }
        int i = 0, j = 0;
        int k = beg;
        
        while (i<l&&j<r) {
            if (LeftArray[i].id <= RightArray[j].id ) {
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
    
    public static void sortById(Doctor[] arr, int beg, int end)
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
