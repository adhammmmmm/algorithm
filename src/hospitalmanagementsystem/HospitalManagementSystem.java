/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hospitalmanagementsystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MAS
 */
public class HospitalManagementSystem {

    public Hospital[] Hospitals;
    public Doctor[] Doctors;
    public Patient[] Patients;
     
    public HospitalManagementSystem(){
 
        /*  Hospitals Avalible */
        
        this.Hospitals = new Hospital[6];
        this.Hospitals[0] = new Hospital("El shamla Hospital            ", "Shibin  ");
        this.Hospitals[1] = new Hospital("Ain Shams Specialized Hospital", "Cairo   ");
        this.Hospitals[2] = new Hospital("Alexandria Psychiatric Centre ", "Doki    ");
        this.Hospitals[3] = new Hospital("Al-Hekma Neurology            ", "Mansoura");
        this.Hospitals[4] = new Hospital("57357 hospital                ", "Cairo   ");
        this.Hospitals[5] = new Hospital("Zagazig General Hospital      ", "Zagazig ");
       
       
                
        /* Doctors Avalible */
        this.Doctors = new Doctor[8]; 
        this.Doctors[0] = new Doctor(111, "Ahmed", "0102345678", "Anatomy");
        this.Doctors[1] = new Doctor(110, "Mahmoud", "0102345612", "Anesthesia");
        this.Doctors[2] = new Doctor(107, "awad", "0102345619", "cardiology / cardiac surgery");
        this.Doctors[3] = new Doctor(120, "Amr", "0102345623", "Dentistry");
        this.Doctors[4] = new Doctor(136, "sherif", "0102345636", "Dermatology");
        this.Doctors[5] = new Doctor(143, "malek", "0102345628", "Ear, nose and throat");
        this.Doctors[6] = new Doctor(100, "ali", "0102345638", "Anatomy");
        this.Doctors[7] = new Doctor(118, "muhamed", "0102345698", "Gastroenterology");

      
        /* Patients Avalible */
        this.Patients = new Patient[7];   
        this.Patients[0] = new Patient(110  , "Ahmed", "0102345678",5);
        this.Patients[1] = new Patient(112  , "shaker", "0102322222", 20);
        this.Patients[2] = new Patient(101  , "Amr", "01023584930", 30);
        this.Patients[3] = new Patient(41   , "Adham", "01028472838", 40);
        this.Patients[4] = new Patient(81   , "Bedo", "0102345612", 36);
        this.Patients[5] = new Patient(111  , "bahaa", "0102345648", 39);
        this.Patients[6] = new Patient(119  , "sega3ii", "0102345657", 19);
        
      
                
        /* disply Before sort */
     
      displyHospitals();
       System.out.println("--------------------------------------------------/n");
      displyDoctors();
       System.out.println("--------------------------------------------------");
      displyPatients();
       System.out.println("--------------------------------------------------");
    
       System.out.println("\t\tDisply After Sort!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        
        
      sortHospitals();
      sortDoctors();       
      sortPatients();
       
      
      displyHospitals();
       System.out.println("--------------------------------------------------");
      displyDoctors();
       System.out.println("--------------------------------------------------");
      displyPatients();
       System.out.println("--------------------------------------------------");
     
    
      searchDoctorsBySpeciality("Anatomy"); 
       System.out.println("--------------------------------------------------");
      
      searchPatientByID(111);  
      searchPatientByID(81); 
      searchPatientByID(1100);
      searchPatientByID(119);
       System.out.println("--------------------------------------------------");
    
        
    }
    
    /* search doctor By Specialiity  */
    
     public void searchDoctorsBySpeciality(String s){
         boolean isExist = false;
         System.out.println(s+"'s Doctors:");
       for(int i= 0; i<Doctors.length; i++){
            if(Doctors[i].getSpecialization().equals(s))
            {
                isExist = true;
                Doctors[i].disply();
            }
        }
       if(!isExist)
       {
           System.out.println("Not found!");
       }
       
     }

     
      /* search Patient By ID  */
     
      public void searchPatientByID(int id){
         boolean isExist = false;
         System.out.println("Patient with id: "+ id);
       for(int i= 0; i<Patients.length; i++){
            if(Patients[i].ID == id)
            {
                isExist = true;
                Patients[i].disply();
            }
        }
       if(!isExist)
       {
           System.out.println("Not found!");
       }
       
     }

    public void sortHospitals(){
        Hospital.sortByName(this.Hospitals,0, this.Hospitals.length -1);
    }
    public void displyHospitals(){
        System.out.println("Hospitals: ");
        for(int i= 0; i<Hospitals.length; i++){
            Hospitals[i].disply();
        }
    }
    
    public void displyDoctors(){
        System.out.println("Doctors: ");
        for(int i= 0; i<Doctors.length; i++){
            Doctors[i].disply();
        }
    }
    
      public void displyPatients(){
        System.out.println("Patients: ");
        for(int i= 0; i<Patients.length; i++){
           Patients[i].disply();
        }
    }
      
     public void sortDoctors(){
        Doctor.sortById(this.Doctors,0, this.Doctors.length -1);
    }
     
      public void sortPatients(){
        Patient.sortById(this.Patients,0, this.Patients.length -1);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      HospitalManagementSystem managementSys = new HospitalManagementSystem();
      //
     
    
      
    }
    
}
