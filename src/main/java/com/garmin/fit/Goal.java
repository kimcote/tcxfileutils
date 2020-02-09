////////////////////////////////////////////////////////////////////////////////
// The following FIT Protocol software provided may be used with FIT protocol
// devices only and remains the copyrighted property of Garmin Canada Inc.
// The software is being provided on an "as-is" basis and as an accommodation,
// and therefore all warranties, representations, or guarantees of any kind
// (whether express, implied or statutory) including, without limitation,
// warranties of merchantability, non-infringement, or fitness for a particular
// purpose, are specifically disclaimed.
//
// Copyright 2020 Garmin Canada Inc.
////////////////////////////////////////////////////////////////////////////////
// ****WARNING****  This file is auto-generated!  Do NOT edit this file.
// Profile Version = 21.22Release
// Tag = production/akw/21.22.00-0-g5065eaa
////////////////////////////////////////////////////////////////////////////////


package com.garmin.fit;


public enum Goal {
    TIME((short)0),
    DISTANCE((short)1),
    CALORIES((short)2),
    FREQUENCY((short)3),
    STEPS((short)4),
    ASCENT((short)5),
    ACTIVE_MINUTES((short)6),
    INVALID((short)255);

    protected short value;

    private Goal(short value) {
        this.value = value;
    }

    public static Goal getByValue(final Short value) {
        for (final Goal type : Goal.values()) {
            if (value == type.value)
                return type;
        }

        return Goal.INVALID;
    }

    /**
     * Retrieves the String Representation of the Value
     * @return The string representation of the value
     */
    public static String getStringFromValue( Goal value ) {
        return value.name();
    }

    public short getValue() {
        return value;
    }


}
