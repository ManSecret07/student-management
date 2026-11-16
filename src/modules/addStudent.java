static void addStudent() {

    if (studentCount >= students.length) {
        JOptionPane.showMessageDialog(null,
            "Student record is full.");
        return;
    }

    int id = Integer.parseInt(
        JOptionPane.showInputDialog("Input Student ID:"));

    int check = findStudent(id);

    if (check == -1) {

        String name = JOptionPane.showInputDialog(
            "Input Name:");

        float score = Float.parseFloat(
            JOptionPane.showInputDialog("Input Score:"));

        students[studentCount].id = id;
        students[studentCount].name = name;
        students[studentCount].score = score;

        studentCount++;

        JOptionPane.showMessageDialog(null,
            "Add student successfully.");

    } else {

        JOptionPane.showMessageDialog(null,
            "Student ID Already Exist");
    }
}