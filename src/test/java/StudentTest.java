import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void createStudentTest() {
        Student Reza = new Student(1L,"Reza");
        Student Chris = null;
        assertNull(Chris);
        assertNotNull(Reza);
    }

    @Test
    public void StudentFieldsTest() {
        Student Reza = new Student(1L, "Reza" );
        assertSame(1L, Reza.getId());
        assertSame("Reza", Reza.getName());
        assertSame(0, Reza.getGrades().size());
    }

    @Test
    public void addTestGrade() {
        Student Reza = new Student(1L, "Reza" );
        Reza.addGrade(90);
        assertSame(90, Reza.getGrades().get(0));
        Reza.addGrade(100);
        assertSame(100, Reza.getGrades().get(1));
    }

    @Test
    public void averageTestGrade() {
        Student Reza = new Student(1L, "Reza" );
        Reza.addGrade(90);
        Reza.addGrade(100);
        assertEquals(95, Reza.getGradeAverage(), 0);

    }
}
