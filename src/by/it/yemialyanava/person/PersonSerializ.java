package by.it.yemialyanava.person;

import java.io.Serializable;

public class PersonSerializ implements Serializable {
        private static final long serialversionUID = 1;
        private String name;
        private String lastName;
        private String birthday;
        private String race;
        private String passport;

        public String getRace() {
            return race;
        }

        public void setRace(String race) {
            this.race = race;
        }

        public void setName(String name){
            this.name = name;
        }

        public String getName(){
            return name;
        }

        public void setLastName(String lastName){
            this.lastName = lastName;
        }

        public String getLastName(){
            return lastName;
        }

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }
}
