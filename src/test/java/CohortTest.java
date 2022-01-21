import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {
    Cohort cohortAlpha;
    Cohort cohortBravo;
    Cohort cohortCharlie;

    @Before
    public void init() {
        cohortAlpha = new Cohort();
        cohortBravo = new Cohort();
        cohortCharlie = new Cohort();

        Student Billy = new Student(10L, "Billy");
        Student Bob = new Student(20L,"Bob");

        Billy.addGrade(100);
        Billy.addGrade(40);

        Bob.addGrade(80);
        Bob.addGrade(90);
        cohortBravo.addStudent(Billy);
        cohortCharlie.addStudent(Billy);
        cohortCharlie.addStudent(Bob);
    }

    @Test
    public void addStudentTest() {
        assertEquals(1, cohortBravo.getStudents().size());
        assertEquals(2, cohortCharlie.getStudents().size());
    }

    @Test
    public void studentsListTest() {
        assertEquals(10, cohortCharlie.getStudents().get(0).getId());
        assertEquals(20, cohortCharlie.getStudents().get(1).getId());
    }

    @Test
    public void cohortAverageTest() {
        assertEquals(70, cohortBravo.getCohortAverage(), 0.5);
        assertEquals(77.5, cohortCharlie.getCohortAverage(), 0.5);
    }
}
