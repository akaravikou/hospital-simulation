package com.solvd.hospital2.documentation;

import com.solvd.hospital2.personal_info.AnswerException;

public interface Receiptable {

    String takeMedication(String medication) throws AnswerException;

}
