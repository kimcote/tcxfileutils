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


public class ObdiiDataMesg extends Mesg {

    
    public static final int TimestampFieldNum = 253;
    
    public static final int TimestampMsFieldNum = 0;
    
    public static final int TimeOffsetFieldNum = 1;
    
    public static final int PidFieldNum = 2;
    
    public static final int RawDataFieldNum = 3;
    
    public static final int PidDataSizeFieldNum = 4;
    
    public static final int SystemTimeFieldNum = 5;
    
    public static final int StartTimestampFieldNum = 6;
    
    public static final int StartTimestampMsFieldNum = 7;
    

    protected static final  Mesg obdiiDataMesg;
    static {
        // obdii_data
        obdiiDataMesg = new Mesg("obdii_data", MesgNum.OBDII_DATA);
        obdiiDataMesg.addField(new Field("timestamp", TimestampFieldNum, 134, 1, 0, "s", false, Profile.Type.DATE_TIME));
        
        obdiiDataMesg.addField(new Field("timestamp_ms", TimestampMsFieldNum, 132, 1, 0, "ms", false, Profile.Type.UINT16));
        
        obdiiDataMesg.addField(new Field("time_offset", TimeOffsetFieldNum, 132, 1, 0, "ms", false, Profile.Type.UINT16));
        
        obdiiDataMesg.addField(new Field("pid", PidFieldNum, 13, 1, 0, "", false, Profile.Type.BYTE));
        
        obdiiDataMesg.addField(new Field("raw_data", RawDataFieldNum, 13, 1, 0, "", false, Profile.Type.BYTE));
        
        obdiiDataMesg.addField(new Field("pid_data_size", PidDataSizeFieldNum, 2, 1, 0, "", false, Profile.Type.UINT8));
        
        obdiiDataMesg.addField(new Field("system_time", SystemTimeFieldNum, 134, 1, 0, "", false, Profile.Type.UINT32));
        
        obdiiDataMesg.addField(new Field("start_timestamp", StartTimestampFieldNum, 134, 1, 0, "", false, Profile.Type.DATE_TIME));
        
        obdiiDataMesg.addField(new Field("start_timestamp_ms", StartTimestampMsFieldNum, 132, 1, 0, "ms", false, Profile.Type.UINT16));
        
    }

    public ObdiiDataMesg() {
        super(Factory.createMesg(MesgNum.OBDII_DATA));
    }

    public ObdiiDataMesg(final Mesg mesg) {
        super(mesg);
    }


    /**
     * Get timestamp field
     * Units: s
     * Comment: Timestamp message was output
     *
     * @return timestamp
     */
    public DateTime getTimestamp() {
        return timestampToDateTime(getFieldLongValue(253, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD));
    }

    /**
     * Set timestamp field
     * Units: s
     * Comment: Timestamp message was output
     *
     * @param timestamp
     */
    public void setTimestamp(DateTime timestamp) {
        setFieldValue(253, 0, timestamp.getTimestamp(), Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get timestamp_ms field
     * Units: ms
     * Comment: Fractional part of timestamp, added to timestamp
     *
     * @return timestamp_ms
     */
    public Integer getTimestampMs() {
        return getFieldIntegerValue(0, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set timestamp_ms field
     * Units: ms
     * Comment: Fractional part of timestamp, added to timestamp
     *
     * @param timestampMs
     */
    public void setTimestampMs(Integer timestampMs) {
        setFieldValue(0, 0, timestampMs, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    public Integer[] getTimeOffset() {
        
        return getFieldIntegerValues(1, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        
    }

    /**
     * @return number of time_offset
     */
    public int getNumTimeOffset() {
        return getNumFieldValues(1, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get time_offset field
     * Units: ms
     * Comment: Offset of PID reading [i] from start_timestamp+start_timestamp_ms. Readings may span accross seconds.
     *
     * @param index of time_offset
     * @return time_offset
     */
    public Integer getTimeOffset(int index) {
        return getFieldIntegerValue(1, index, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set time_offset field
     * Units: ms
     * Comment: Offset of PID reading [i] from start_timestamp+start_timestamp_ms. Readings may span accross seconds.
     *
     * @param index of time_offset
     * @param timeOffset
     */
    public void setTimeOffset(int index, Integer timeOffset) {
        setFieldValue(1, index, timeOffset, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get pid field
     * Comment: Parameter ID
     *
     * @return pid
     */
    public Byte getPid() {
        return getFieldByteValue(2, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set pid field
     * Comment: Parameter ID
     *
     * @param pid
     */
    public void setPid(Byte pid) {
        setFieldValue(2, 0, pid, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    public Byte[] getRawData() {
        
        return getFieldByteValues(3, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        
    }

    /**
     * @return number of raw_data
     */
    public int getNumRawData() {
        return getNumFieldValues(3, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get raw_data field
     * Comment: Raw parameter data
     *
     * @param index of raw_data
     * @return raw_data
     */
    public Byte getRawData(int index) {
        return getFieldByteValue(3, index, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set raw_data field
     * Comment: Raw parameter data
     *
     * @param index of raw_data
     * @param rawData
     */
    public void setRawData(int index, Byte rawData) {
        setFieldValue(3, index, rawData, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    public Short[] getPidDataSize() {
        
        return getFieldShortValues(4, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        
    }

    /**
     * @return number of pid_data_size
     */
    public int getNumPidDataSize() {
        return getNumFieldValues(4, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get pid_data_size field
     * Comment: Optional, data size of PID[i].  If not specified refer to SAE J1979.
     *
     * @param index of pid_data_size
     * @return pid_data_size
     */
    public Short getPidDataSize(int index) {
        return getFieldShortValue(4, index, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set pid_data_size field
     * Comment: Optional, data size of PID[i].  If not specified refer to SAE J1979.
     *
     * @param index of pid_data_size
     * @param pidDataSize
     */
    public void setPidDataSize(int index, Short pidDataSize) {
        setFieldValue(4, index, pidDataSize, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    public Long[] getSystemTime() {
        
        return getFieldLongValues(5, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        
    }

    /**
     * @return number of system_time
     */
    public int getNumSystemTime() {
        return getNumFieldValues(5, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get system_time field
     * Comment: System time associated with sample expressed in ms, can be used instead of time_offset.  There will be a system_time value for each raw_data element.  For multibyte pids the system_time is repeated.
     *
     * @param index of system_time
     * @return system_time
     */
    public Long getSystemTime(int index) {
        return getFieldLongValue(5, index, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set system_time field
     * Comment: System time associated with sample expressed in ms, can be used instead of time_offset.  There will be a system_time value for each raw_data element.  For multibyte pids the system_time is repeated.
     *
     * @param index of system_time
     * @param systemTime
     */
    public void setSystemTime(int index, Long systemTime) {
        setFieldValue(5, index, systemTime, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get start_timestamp field
     * Comment: Timestamp of first sample recorded in the message.  Used with time_offset to generate time of each sample
     *
     * @return start_timestamp
     */
    public DateTime getStartTimestamp() {
        return timestampToDateTime(getFieldLongValue(6, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD));
    }

    /**
     * Set start_timestamp field
     * Comment: Timestamp of first sample recorded in the message.  Used with time_offset to generate time of each sample
     *
     * @param startTimestamp
     */
    public void setStartTimestamp(DateTime startTimestamp) {
        setFieldValue(6, 0, startTimestamp.getTimestamp(), Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get start_timestamp_ms field
     * Units: ms
     * Comment: Fractional part of start_timestamp
     *
     * @return start_timestamp_ms
     */
    public Integer getStartTimestampMs() {
        return getFieldIntegerValue(7, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set start_timestamp_ms field
     * Units: ms
     * Comment: Fractional part of start_timestamp
     *
     * @param startTimestampMs
     */
    public void setStartTimestampMs(Integer startTimestampMs) {
        setFieldValue(7, 0, startTimestampMs, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

}
