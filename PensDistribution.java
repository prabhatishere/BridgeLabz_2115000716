class PensDistribution {
    public static void main(String[] args) {
        int pens = 14, students = 3; // Assigning the values to the variables pens and students as 14 and 3 respectively
        int pensPerStudent = pens / students; // Calculate pens per student by doing pens/students
        int remainingPens = pens % students; // Calculate remaining pens by doing modulus of pens with students
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens); // Print the pen per student and not distributed pens
    }
}
