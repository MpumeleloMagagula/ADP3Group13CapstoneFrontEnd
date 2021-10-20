package za.ac.cput.factory.person;
        /*
        * Doctor Factory
        * Name :Mpumelelo Magagula
        * Student Number:218136021
        * Description: This entity display all the records of doctors working in the clinic and their occupation level and status.
        * Date:November 2021
        * Font-End
        * */

import za.ac.cput.entity.person.Doctor;
import za.ac.cput.util.GenericHelper;

public class DoctorFactory {
    public static Doctor build(String firstName, String lastName, String emailAddress, String contactNumber){
        //Generating doctor ID
        String id = GenericHelper.IDGenerator();

        //checking the values
        if (firstName.isEmpty() || lastName.isEmpty() || emailAddress.isEmpty() || contactNumber.isEmpty()){
            return null;
        }

        return  new Doctor.Builder().setFirstName(firstName).setLastName(lastName).setEmailAddress(emailAddress).setContactNumber(contactNumber).Build();
    }


}
