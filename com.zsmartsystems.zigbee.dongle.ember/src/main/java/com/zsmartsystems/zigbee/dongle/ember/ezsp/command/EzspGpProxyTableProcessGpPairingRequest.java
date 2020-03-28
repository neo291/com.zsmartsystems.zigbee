/**
 * Copyright (c) 2016-2020 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.ember.ezsp.command;

import com.zsmartsystems.zigbee.IeeeAddress;
import com.zsmartsystems.zigbee.dongle.ember.ezsp.EzspFrameRequest;
import com.zsmartsystems.zigbee.dongle.ember.ezsp.structure.EmberGpAddress;
import com.zsmartsystems.zigbee.dongle.ember.ezsp.structure.EmberKeyData;
import com.zsmartsystems.zigbee.dongle.ember.internal.serializer.EzspSerializer;

/**
 * Class to implement the Ember EZSP command <b>gpProxyTableProcessGpPairing</b>.
 * <p>
 * Update the GP Proxy table based on a GP pairing.
 * <p>
 * This class provides methods for processing EZSP commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class EzspGpProxyTableProcessGpPairingRequest extends EzspFrameRequest {
    public static final int FRAME_ID = 0xC9;

    /**
     * The options field of the GP Pairing command.
     * <p>
     * EZSP type is <i>uint32_t</i> - Java type is {@link int}
     */
    private int options;

    /**
     * The target GPD.
     * <p>
     * EZSP type is <i>EmberGpAddress</i> - Java type is {@link EmberGpAddress}
     */
    private EmberGpAddress addr;

    /**
     * The communication mode of the GP Sink.
     * <p>
     * EZSP type is <i>uint8_t</i> - Java type is {@link int}
     */
    private int commMode;

    /**
     * The network address of the GP Sink.
     * <p>
     * EZSP type is <i>uint16_t</i> - Java type is {@link int}
     */
    private int sinkNetworkAddress;

    /**
     * The group ID of the GP Sink.
     * <p>
     * EZSP type is <i>uint16_t</i> - Java type is {@link int}
     */
    private int sinkGroupId;

    /**
     * The alias assigned to the GPD.
     * <p>
     * EZSP type is <i>uint16_t</i> - Java type is {@link int}
     */
    private int assignedAlias;

    /**
     * The IEEE address of the GP Sink.
     * <p>
     * EZSP type is <i>EmberEUI64</i> - Java type is {@link IeeeAddress}
     */
    private IeeeAddress sinkIeeeAddress;

    /**
     * The key to use for the target GPD.
     * <p>
     * EZSP type is <i>EmberKeyData</i> - Java type is {@link EmberKeyData}
     */
    private EmberKeyData gpdKey;

    /**
     * Serialiser used to serialise to binary line data
     */
    private EzspSerializer serializer;

    /**
     * Request constructor
     */
    public EzspGpProxyTableProcessGpPairingRequest() {
        frameId = FRAME_ID;
        serializer = new EzspSerializer();
    }

    /**
     * The options field of the GP Pairing command.
     * <p>
     * EZSP type is <i>uint32_t</i> - Java type is {@link int}
     *
     * @return the current options as {@link int}
     */
    public int getOptions() {
        return options;
    }

    /**
     * The options field of the GP Pairing command.
     *
     * @param options the options to set as {@link int}
     */
    public void setOptions(int options) {
        this.options = options;
    }

    /**
     * The target GPD.
     * <p>
     * EZSP type is <i>EmberGpAddress</i> - Java type is {@link EmberGpAddress}
     *
     * @return the current addr as {@link EmberGpAddress}
     */
    public EmberGpAddress getAddr() {
        return addr;
    }

    /**
     * The target GPD.
     *
     * @param addr the addr to set as {@link EmberGpAddress}
     */
    public void setAddr(EmberGpAddress addr) {
        this.addr = addr;
    }

    /**
     * The communication mode of the GP Sink.
     * <p>
     * EZSP type is <i>uint8_t</i> - Java type is {@link int}
     *
     * @return the current commMode as {@link int}
     */
    public int getCommMode() {
        return commMode;
    }

    /**
     * The communication mode of the GP Sink.
     *
     * @param commMode the commMode to set as {@link int}
     */
    public void setCommMode(int commMode) {
        this.commMode = commMode;
    }

    /**
     * The network address of the GP Sink.
     * <p>
     * EZSP type is <i>uint16_t</i> - Java type is {@link int}
     *
     * @return the current sinkNetworkAddress as {@link int}
     */
    public int getSinkNetworkAddress() {
        return sinkNetworkAddress;
    }

    /**
     * The network address of the GP Sink.
     *
     * @param sinkNetworkAddress the sinkNetworkAddress to set as {@link int}
     */
    public void setSinkNetworkAddress(int sinkNetworkAddress) {
        this.sinkNetworkAddress = sinkNetworkAddress;
    }

    /**
     * The group ID of the GP Sink.
     * <p>
     * EZSP type is <i>uint16_t</i> - Java type is {@link int}
     *
     * @return the current sinkGroupId as {@link int}
     */
    public int getSinkGroupId() {
        return sinkGroupId;
    }

    /**
     * The group ID of the GP Sink.
     *
     * @param sinkGroupId the sinkGroupId to set as {@link int}
     */
    public void setSinkGroupId(int sinkGroupId) {
        this.sinkGroupId = sinkGroupId;
    }

    /**
     * The alias assigned to the GPD.
     * <p>
     * EZSP type is <i>uint16_t</i> - Java type is {@link int}
     *
     * @return the current assignedAlias as {@link int}
     */
    public int getAssignedAlias() {
        return assignedAlias;
    }

    /**
     * The alias assigned to the GPD.
     *
     * @param assignedAlias the assignedAlias to set as {@link int}
     */
    public void setAssignedAlias(int assignedAlias) {
        this.assignedAlias = assignedAlias;
    }

    /**
     * The IEEE address of the GP Sink.
     * <p>
     * EZSP type is <i>EmberEUI64</i> - Java type is {@link IeeeAddress}
     *
     * @return the current sinkIeeeAddress as {@link IeeeAddress}
     */
    public IeeeAddress getSinkIeeeAddress() {
        return sinkIeeeAddress;
    }

    /**
     * The IEEE address of the GP Sink.
     *
     * @param sinkIeeeAddress the sinkIeeeAddress to set as {@link IeeeAddress}
     */
    public void setSinkIeeeAddress(IeeeAddress sinkIeeeAddress) {
        this.sinkIeeeAddress = sinkIeeeAddress;
    }

    /**
     * The key to use for the target GPD.
     * <p>
     * EZSP type is <i>EmberKeyData</i> - Java type is {@link EmberKeyData}
     *
     * @return the current gpdKey as {@link EmberKeyData}
     */
    public EmberKeyData getGpdKey() {
        return gpdKey;
    }

    /**
     * The key to use for the target GPD.
     *
     * @param gpdKey the gpdKey to set as {@link EmberKeyData}
     */
    public void setGpdKey(EmberKeyData gpdKey) {
        this.gpdKey = gpdKey;
    }

    @Override
    public int[] serialize() {
        // Serialize the header
        serializeHeader(serializer);

        // Serialize the fields
        serializer.serializeUInt32(options);
        serializer.serializeEmberGpAddress(addr);
        serializer.serializeUInt8(commMode);
        serializer.serializeUInt16(sinkNetworkAddress);
        serializer.serializeUInt16(sinkGroupId);
        serializer.serializeUInt16(assignedAlias);
        serializer.serializeEmberEui64(sinkIeeeAddress);
        serializer.serializeEmberKeyData(gpdKey);
        return serializer.getPayload();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(267);
        builder.append("EzspGpProxyTableProcessGpPairingRequest [networkId=");
        builder.append(networkId);
        builder.append(", options=");
        builder.append(options);
        builder.append(", addr=");
        builder.append(addr);
        builder.append(", commMode=");
        builder.append(commMode);
        builder.append(", sinkNetworkAddress=");
        builder.append(String.format("%04X", sinkNetworkAddress));
        builder.append(", sinkGroupId=");
        builder.append(String.format("%04X", sinkGroupId));
        builder.append(", assignedAlias=");
        builder.append(String.format("%04X", assignedAlias));
        builder.append(", sinkIeeeAddress=");
        builder.append(sinkIeeeAddress);
        builder.append(", gpdKey=");
        builder.append(gpdKey);
        builder.append(']');
        return builder.toString();
    }
}
