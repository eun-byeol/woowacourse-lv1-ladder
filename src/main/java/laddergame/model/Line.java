package laddergame.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Line {
    private static final Random random = new Random();
    private final List<Boolean> line;

    public Line(int personCount) {
        this(makeLine(personCount));
    }

    public Line(List<Boolean> line) {
        validateLine(line);
        this.line = line;
    }

    private static List<Boolean> makeLine(int personCount) {
        List<Boolean> line = new ArrayList<>();
        line.add(random.nextBoolean());
        for (int i = 1; i < personCount - 1; i++) {
            line.add(makePoint(line, i));
        }
        return line;
    }

    private static boolean makePoint(List<Boolean> line, int i) {
        if (line.get(i - 1)) {
            return false;
        }
        return random.nextBoolean();
    }

    private static void validateLine(List<Boolean> line) {
        for (int i = 0; i < line.size() - 1; i++) {
            validatePoint(line, i);
        }
    }

    private static void validatePoint(List<Boolean> line, int i) {
        if (line.get(i) && line.get(i + 1)) {
            throw new IllegalArgumentException();
        }
    }

    public int getSize() {
        return line.size();
    }

    public List<Boolean> getLine() {
        return line;
    }
}
