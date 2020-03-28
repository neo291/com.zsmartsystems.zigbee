/**
 * Copyright (c) 2016-2020 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.ember.ezsp.command;

import com.zsmartsystems.zigbee.dongle.ember.ezsp.EzspFrameResponse;
import com.zsmartsystems.zigbee.dongle.ember.ezsp.structure.EmberGpSinkTableEntry;
import com.zsmartsystems.zigbee.dongle.ember.ezsp.structure.EmberStatus;

/**
 * Class to implement the Ember EZSP command <b>gpSinkTableGetEntry</b>.
 * <p>
 * Retrieves the sink table entry stored at the passed index.
 * <p>
 * This class provides methods for processing EZSP commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class EzspGpSinkTableGetEntryResponse extends EzspFrameResponse {
    public static final int FRAME_ID = 0xDD;

    /**
     * An EmberStatus value indicating success or the reason for failure.
     * <p>
     * EZSP type is <i>EmberStatus</i> - Java type is {@link EmberStatus}
     */
    private EmberStatus status;

    /**
     * An EmberGpSinkTableEntry struct containing a copy of the requested sink entry.
     * <p>
     * EZSP type is <i>EmberGpSinkTableEntry</i> - Java type is {@link EmberGpSinkTableEntry}
     */
    private EmberGpSinkTableEntry entry;

    /**
     * Response and Handler constructor
     */
    public EzspGpSinkTableGetEntryResponse(int[] inputBuffer) {
        // Super creates deserializer and reads header fields
        super(inputBuffer);

        // Deserialize the fields
        status = deserializer.deserializeEmberStatus();
        entry = deserializer.deserializeEmberGpSinkTableEntry();
    }

    /**
     * An EmberStatus value indicating success or the reason for failure.
     * <p>
     * EZSP type is <i>EmberStatus</i> - Java type is {@link EmberStatus}
     *
     * @return the current status as {@link EmberStatus}
     */
    public EmberStatus getStatus() {
        return status;
    }

    /**
     * An EmberStatus value indicating success or the reason for failure.
     *
     * @param status the status to set as {@link EmberStatus}
     */
    public void setStatus(EmberStatus status) {
        this.status = status;
    }

    /**
     * An EmberGpSinkTableEntry struct containing a copy of the requested sink entry.
     * <p>
     * EZSP type is <i>EmberGpSinkTableEntry</i> - Java type is {@link EmberGpSinkTableEntry}
     *
     * @return the current entry as {@link EmberGpSinkTableEntry}
     */
    public EmberGpSinkTableEntry getEntry() {
        return entry;
    }

    /**
     * An EmberGpSinkTableEntry struct containing a copy of the requested sink entry.
     *
     * @param entry the entry to set as {@link EmberGpSinkTableEntry}
     */
    public void setEntry(EmberGpSinkTableEntry entry) {
        this.entry = entry;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(109);
        builder.append("EzspGpSinkTableGetEntryResponse [networkId=");
        builder.append(networkId);
        builder.append(", status=");
        builder.append(status);
        builder.append(", entry=");
        builder.append(entry);
        builder.append(']');
        return builder.toString();
    }
}
