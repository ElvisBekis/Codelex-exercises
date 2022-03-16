package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class DatePeriod {
    LocalDate start;
    LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }


    public boolean datePeriodOverlap(DatePeriod secondPeriod) {
        return this.start.isBefore(secondPeriod.end) && secondPeriod.start.isBefore(this.end);
    }

    public boolean datePeriodIncludes(DatePeriod secondPeriod) {
        return this.start.isBefore(secondPeriod.start) && this.end.isAfter(secondPeriod.end)
                || secondPeriod.start.isBefore(this.start) && secondPeriod.end.isAfter(this.end);
    }

    public DatePeriod intersection(DatePeriod secondPeriod) {
        if (datePeriodOverlap(secondPeriod)) {
            if (datePeriodIncludes(secondPeriod)) {
                if (this.start.isBefore(secondPeriod.start) && this.end.isAfter(secondPeriod.end)) {
                    return this;
                } else {
                    return secondPeriod;
                }
            } else if (this.start.isBefore(secondPeriod.end) && this.end.isAfter(secondPeriod.end)) {
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








