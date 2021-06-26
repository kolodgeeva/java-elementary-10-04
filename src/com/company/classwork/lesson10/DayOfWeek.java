package com.company.classwork.lesson10;

import java.util.EnumSet;
import java.util.Set;

public enum DayOfWeek {
  MONDAY,
  TUESDAY,
  WEDNESDAY,
  THURSDAY,
  FRIDAY,
  SATURDAY,
  SUNDAY;

  public static Set<DayOfWeek> WORK_DAYS =
      EnumSet.of(MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY);

  public static Set<DayOfWeek> WEEKEND = EnumSet.of(SUNDAY);

  public boolean isWorkDay() {
    return WORK_DAYS.contains(this);
  }

  public boolean isWeekend() {
    return WEEKEND.contains(this);
  }


}
