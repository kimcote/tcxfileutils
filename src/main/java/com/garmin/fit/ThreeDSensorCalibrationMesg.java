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
import java.math.BigInteger;


public class ThreeDSensorCalibrationMesg extends Mesg {

    
    public static final int TimestampFieldNum = 253;
    
    public static final int SensorTypeFieldNum = 0;
    
    public static final int CalibrationFactorFieldNum = 1;
    
    public static final int CalibrationDivisorFieldNum = 2;
    
    public static final int LevelShiftFieldNum = 3;
    
    public static final int OffsetCalFieldNum = 4;
    
    public static final int OrientationMatrixFieldNum = 5;
    

    protected static final  Mesg threeDSensorCalibrationMesg;
    static {
        int field_index = 0;
        int subfield_index = 0;
        // three_d_sensor_calibration
        threeDSensorCalibrationMesg = new Mesg("three_d_sensor_calibration", MesgNum.THREE_D_SENSOR_CALIBRATION);
        threeDSensorCalibrationMesg.addField(new Field("timestamp", TimestampFieldNum, 134, 1, 0, "s", false, Profile.Type.DATE_TIME));
        field_index++;
        threeDSensorCalibrationMesg.addField(new Field("sensor_type", SensorTypeFieldNum, 0, 1, 0, "", false, Profile.Type.SENSOR_TYPE));
        field_index++;
        threeDSensorCalibrationMesg.addField(new Field("calibration_factor", CalibrationFactorFieldNum, 134, 1, 0, "", false, Profile.Type.UINT32));
        subfield_index = 0;
        threeDSensorCalibrationMesg.fields.get(field_index).subFields.add(new SubField("accel_cal_factor", 134, 1, 0, "g"));
        threeDSensorCalibrationMesg.fields.get(field_index).subFields.get(subfield_index).addMap(0, 0);
        subfield_index++;
        threeDSensorCalibrationMesg.fields.get(field_index).subFields.add(new SubField("gyro_cal_factor", 134, 1, 0, "deg/s"));
        threeDSensorCalibrationMesg.fields.get(field_index).subFields.get(subfield_index).addMap(0, 1);
        subfield_index++;
        field_index++;
        threeDSensorCalibrationMesg.addField(new Field("calibration_divisor", CalibrationDivisorFieldNum, 134, 1, 0, "counts", false, Profile.Type.UINT32));
        field_index++;
        threeDSensorCalibrationMesg.addField(new Field("level_shift", LevelShiftFieldNum, 134, 1, 0, "", false, Profile.Type.UINT32));
        field_index++;
        threeDSensorCalibrationMesg.addField(new Field("offset_cal", OffsetCalFieldNum, 133, 1, 0, "", false, Profile.Type.SINT32));
        field_index++;
        threeDSensorCalibrationMesg.addField(new Field("orientation_matrix", OrientationMatrixFieldNum, 133, 65535, 0, "", false, Profile.Type.SINT32));
        field_index++;
    }

    public ThreeDSensorCalibrationMesg() {
        super(Factory.createMesg(MesgNum.THREE_D_SENSOR_CALIBRATION));
    }

    public ThreeDSensorCalibrationMesg(final Mesg mesg) {
        super(mesg);
    }


    /**
     * Get timestamp field
     * Units: s
     * Comment: Whole second part of the timestamp
     *
     * @return timestamp
     */
    public DateTime getTimestamp() {
        return timestampToDateTime(getFieldLongValue(253, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD));
    }

    /**
     * Set timestamp field
     * Units: s
     * Comment: Whole second part of the timestamp
     *
     * @param timestamp
     */
    public void setTimestamp(DateTime timestamp) {
        setFieldValue(253, 0, timestamp.getTimestamp(), Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get sensor_type field
     * Comment: Indicates which sensor the calibration is for
     *
     * @return sensor_type
     */
    public SensorType getSensorType() {
        Short value = getFieldShortValue(0, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return SensorType.getByValue(value);
    }

    /**
     * Set sensor_type field
     * Comment: Indicates which sensor the calibration is for
     *
     * @param sensorType
     */
    public void setSensorType(SensorType sensorType) {
        setFieldValue(0, 0, sensorType.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get calibration_factor field
     * Comment: Calibration factor used to convert from raw ADC value to degrees, g,  etc.
     *
     * @return calibration_factor
     */
    public Long getCalibrationFactor() {
        return getFieldLongValue(1, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set calibration_factor field
     * Comment: Calibration factor used to convert from raw ADC value to degrees, g,  etc.
     *
     * @param calibrationFactor
     */
    public void setCalibrationFactor(Long calibrationFactor) {
        setFieldValue(1, 0, calibrationFactor, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get accel_cal_factor field
     * Units: g
     * Comment: Accelerometer calibration factor
     *
     * @return accel_cal_factor
     */
    public Long getAccelCalFactor() {
        return getFieldLongValue(1, 0, Profile.SubFields.THREE_D_SENSOR_CALIBRATION_MESG_CALIBRATION_FACTOR_FIELD_ACCEL_CAL_FACTOR);
    }

    /**
     * Set accel_cal_factor field
     * Units: g
     * Comment: Accelerometer calibration factor
     *
     * @param accelCalFactor
     */
    public void setAccelCalFactor(Long accelCalFactor) {
        setFieldValue(1, 0, accelCalFactor, Profile.SubFields.THREE_D_SENSOR_CALIBRATION_MESG_CALIBRATION_FACTOR_FIELD_ACCEL_CAL_FACTOR);
    }

    /**
     * Get gyro_cal_factor field
     * Units: deg/s
     * Comment: Gyro calibration factor
     *
     * @return gyro_cal_factor
     */
    public Long getGyroCalFactor() {
        return getFieldLongValue(1, 0, Profile.SubFields.THREE_D_SENSOR_CALIBRATION_MESG_CALIBRATION_FACTOR_FIELD_GYRO_CAL_FACTOR);
    }

    /**
     * Set gyro_cal_factor field
     * Units: deg/s
     * Comment: Gyro calibration factor
     *
     * @param gyroCalFactor
     */
    public void setGyroCalFactor(Long gyroCalFactor) {
        setFieldValue(1, 0, gyroCalFactor, Profile.SubFields.THREE_D_SENSOR_CALIBRATION_MESG_CALIBRATION_FACTOR_FIELD_GYRO_CAL_FACTOR);
    }

    /**
     * Get calibration_divisor field
     * Units: counts
     * Comment: Calibration factor divisor
     *
     * @return calibration_divisor
     */
    public Long getCalibrationDivisor() {
        return getFieldLongValue(2, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set calibration_divisor field
     * Units: counts
     * Comment: Calibration factor divisor
     *
     * @param calibrationDivisor
     */
    public void setCalibrationDivisor(Long calibrationDivisor) {
        setFieldValue(2, 0, calibrationDivisor, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get level_shift field
     * Comment: Level shift value used to shift the ADC value back into range
     *
     * @return level_shift
     */
    public Long getLevelShift() {
        return getFieldLongValue(3, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set level_shift field
     * Comment: Level shift value used to shift the ADC value back into range
     *
     * @param levelShift
     */
    public void setLevelShift(Long levelShift) {
        setFieldValue(3, 0, levelShift, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    public Integer[] getOffsetCal() {
        
        return getFieldIntegerValues(4, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        
    }

    /**
     * @return number of offset_cal
     */
    public int getNumOffsetCal() {
        return getNumFieldValues(4, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get offset_cal field
     * Comment: Internal calibration factors, one for each: xy, yx, zx
     *
     * @param index of offset_cal
     * @return offset_cal
     */
    public Integer getOffsetCal(int index) {
        return getFieldIntegerValue(4, index, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set offset_cal field
     * Comment: Internal calibration factors, one for each: xy, yx, zx
     *
     * @param index of offset_cal
     * @param offsetCal
     */
    public void setOffsetCal(int index, Integer offsetCal) {
        setFieldValue(4, index, offsetCal, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    public Float[] getOrientationMatrix() {
        
        return getFieldFloatValues(5, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        
    }

    /**
     * @return number of orientation_matrix
     */
    public int getNumOrientationMatrix() {
        return getNumFieldValues(5, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get orientation_matrix field
     * Comment: 3 x 3 rotation matrix (row major)
     *
     * @param index of orientation_matrix
     * @return orientation_matrix
     */
    public Float getOrientationMatrix(int index) {
        return getFieldFloatValue(5, index, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set orientation_matrix field
     * Comment: 3 x 3 rotation matrix (row major)
     *
     * @param index of orientation_matrix
     * @param orientationMatrix
     */
    public void setOrientationMatrix(int index, Float orientationMatrix) {
        setFieldValue(5, index, orientationMatrix, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

}
