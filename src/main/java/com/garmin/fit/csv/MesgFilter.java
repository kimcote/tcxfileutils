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


package com.garmin.fit.csv;

import com.garmin.fit.*;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Listens to incoming mesg definitions and data messages and filters
 * them by name - Once filtered the messages are passed along to whoever
 * is listening.
 *
 */
public class MesgFilter implements MesgListener, MesgDefinitionListener {
    private ArrayList<MesgListener> mesgListeners = new ArrayList<MesgListener>();
    private ArrayList<MesgDefinitionListener> mesgDefListeners = new ArrayList<MesgDefinitionListener>();
    private HashSet<String> mesgDefinitionsToOutput;
    private HashSet<String> mesgDefinitionsToIgnore;
    private HashSet<String> mesgToOutput;
    private HashSet<String> mesgToIgnore;
    private boolean outputMesgDefinitions;
    private boolean outputMesg;

    public MesgFilter() {
        this.outputMesgDefinitions = true;
        this.outputMesg = true;
    }

    public void addListener(MesgListener mesgListener) {
        if ((mesgListener != null) && !mesgListeners.contains(mesgListener)) {
            mesgListeners.add(mesgListener);
        }
    }

    public void addListener(MesgDefinitionListener mesgDefinitionListener) {
        if ((mesgDefinitionListener != null) && !mesgDefListeners.contains(mesgDefinitionListener)) {
            mesgDefListeners.add(mesgDefinitionListener);
        }
    }

    public void setMesgDefinitionsToOutput(HashSet<String> inputMesgDefinitionsToOutput) {
        if(mesgDefinitionsToIgnore != null) {
            throw new UnsupportedOperationException("Setting both an include filter and an exclude filter not supported.");
        }

        this.mesgDefinitionsToOutput = inputMesgDefinitionsToOutput;
        if(this.mesgDefinitionsToOutput.contains("none")) {
            this.outputMesgDefinitions = false;
        }
    }

    public void setMesgDefinitionsToIgnore(HashSet<String> inputMesgDefinitionsToIgnore) {
        if(mesgDefinitionsToOutput != null) {
            throw new UnsupportedOperationException("Setting both an include filter and an exclude filter not supported.");
        }

        this.mesgDefinitionsToIgnore = inputMesgDefinitionsToIgnore;
        if(this.mesgDefinitionsToIgnore.contains("none")) {
            this.outputMesgDefinitions = false;
        }
    }

    public void setDataMessagesToOutput(HashSet<String> inputMesgToOutput) {
        this.mesgToOutput = inputMesgToOutput;
        if(this.mesgToOutput.contains("none")) {
            this.outputMesg = false;
        }
    }

    public void setDataMessagesToIgnore(HashSet<String> inputMesgToIgnore) {
        this.mesgToIgnore = inputMesgToIgnore;
        if(this.mesgToIgnore.contains("none")) {
            this.outputMesg = false;
        }
    }

    public void onMesgDefinition(MesgDefinition mesgDef) {
        boolean outputDefinition = true;
        Mesg mesg = Factory.createMesg(mesgDef.getNum());

        if(!this.outputMesgDefinitions) {
            outputDefinition = false;
        } else {
            if(this.mesgDefinitionsToOutput != null && !this.mesgDefinitionsToOutput.isEmpty()) {
                if(this.mesgDefinitionsToOutput.contains(mesg.getName())) {
                    outputDefinition = true;
                } else {
                    outputDefinition = false;
                }
            } else if(this.mesgDefinitionsToIgnore != null && !this.mesgDefinitionsToIgnore.isEmpty()) {
                if(this.mesgDefinitionsToIgnore.contains(mesg.getName())) {
                    outputDefinition = false; // ignore definitions in ignore list
                } else {
                    outputDefinition = true;
                }
            } // else if no include or exclude list set, output the definition
        }

        if(outputDefinition) {
            for (MesgDefinitionListener mesgListener : mesgDefListeners) {
                mesgListener.onMesgDefinition(mesgDef);
            }
        }
    }

    public void onMesg(Mesg mesg) {
        boolean outputMessage = true;

        if(!this.outputMesg) {
            outputMessage = false;
        } else {
            if(this.mesgToOutput != null && !this.mesgToOutput.isEmpty()) {
                if(this.mesgToOutput.contains(mesg.getName())) {
                    outputMessage = true;
                } else {
                    outputMessage = false;
                }
            } else if(this.mesgToIgnore != null && !this.mesgToIgnore.isEmpty()) {
                if(this.mesgToIgnore.contains(mesg.getName())) {
                    outputMessage = false;
                } else {
                    outputMessage = true;
                }
            } // else if no include or exclude list set, output the message
        }

        if(outputMessage) {
            for (MesgListener mesgListener : mesgListeners) {
                mesgListener.onMesg(mesg);
            }
        }
    }
}
