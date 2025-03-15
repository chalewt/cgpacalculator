package library;

public class GradeReport {

    public double calculateGradePoint(String lg, int credit) {
        double gp;
        switch (lg) {
            case "A+" ->
                gp = 4 * credit;
            case "A" ->
                gp = 4 * credit;
            case "A-" ->
                gp = 3.75 * credit;
            case "B+" ->
                gp = 3.5 * credit;
            case "B" ->
                gp = 3 * credit;
            case "B-" ->
                gp = 2.75 * credit;
            case "C+" ->
                gp = 2.5 * credit;
            case "C" ->
                gp = 2 * credit;
            case "C-" ->
                gp = 1.75 * credit;
            case "D" ->
                gp = 1 * credit;
            case "F" ->
                gp = 0;
            default ->
                throw new IllegalArgumentException("Not a valid letter grade value.");
        }
        return gp;
    }

}
