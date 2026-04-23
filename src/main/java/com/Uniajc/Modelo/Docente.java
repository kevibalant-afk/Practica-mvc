package com.Uniajc.Modelo;

public class Docente {

        private int id;
        private String Name;
        private String LastName;
        private String Specialty;
    
        public Docente() { }
    
        public Docente(int id, String Name, String LastName, String Specialty) {
            this.id = id;
            this.Name = Name;
            this.LastName = LastName;
            this.Specialty = Specialty;
        }
    
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        public String getName() {
            return Name;
        }
    
        public void setName(String Name) {
            this.Name = Name;
        }
    
        public String getLastName() {
            return LastName;
        }
    
        public void setLastName(String LastName) {
            this.LastName = LastName;
        }
    
    
        public String getSpecialty() {
            return Specialty;
        }
    
        public void setSpecialty(String Specialty) {
            this.Specialty = Specialty;
        }

        

}
