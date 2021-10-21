package com.solvd.hospital2;

import java.time.LocalDateTime;

public interface Stayable {

    Boolean daysStay(LocalDateTime dateOfApplication, LocalDateTime now, Integer minDayStayHospital);

}
