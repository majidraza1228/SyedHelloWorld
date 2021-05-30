/*
Pass or Fail
You are given a string, attendance that represents a student’s class attendance
 throughout the semester. A student can be marked, A for absent, L, for late,
 or P for present. To get credit for the class, a student cannot miss more than one class and cannot come late to class twice in a row. Given the current students attendance record, return whether or not the student has passed the class.

Ex: Given the following attendance of a student…

attendance = "PLPAPPPA", return false.
attendance = "PLPLPLPALP", return true.
 */

public class DevByte121 {

    public static boolean passOrFail(String attendance) {
        int absences=0;

        for (int i =0;i<attendance.length();i++){

            if (attendance.charAt(i)=='A'){
                absences++;
            }
        }
        return absences <2 && attendance.indexOf("LLL")==-1;
    }


    public static void main(String[] args){

        System.out.println(passOrFail("PLPLPLPALP"));

    }

}
