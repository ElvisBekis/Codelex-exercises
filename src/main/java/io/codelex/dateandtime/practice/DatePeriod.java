package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class DatePeriod {
    private final LocalDate start;
    private final LocalDate end;

    DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    private boolean datePeriodOverlap(DatePeriod secondPeriod) {
        return this.start.isBefore(secondPeriod.end) && secondPeriod.start.isBefore(this.end);
    }

    private boolean datePeriodIncludes(DatePeriod secondPeriod) {
        return this.start.isBefore(secondPeriod.start) && this.end.isAfter(secondPeriod.end)
                || secondPeriod.start.isBefore(this.start) && secondPeriod.end.isAfter(this.end);
    }

    private boolean firstPeriodIncludesSecond(DatePeriod secondPeriod) {
        return this.start.isBefore(secondPeriod.start) && this.end.isAfter(secondPeriod.end);
    }

    private boolean secondPeriodOverlapsFirst(DatePeriod secondPeriod) {
        return this.start.isBefore(secondPeriod.end) && this.end.isAfter(secondPeriod.end);
    }

    public DatePeriod intersection(DatePeriod secondPeriod) {
        if (datePeriodOverlap(secondPeriod)) {
            if (datePeriodIncludes(secondPeriod)) {
                if (firstPeriodIncludesSecond(secondPeriod)) {
                    return this;
                } else {
                    return secondPeriod;
                }
            } else if (secondPeriodOverlapsFirst(secondPeriod)) {
                return new DatePeriod(this.start, secondPeriod.end);
            } else {
                return new DatePeriod(secondPeriod.start, this.end);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "DatePeriod{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}








