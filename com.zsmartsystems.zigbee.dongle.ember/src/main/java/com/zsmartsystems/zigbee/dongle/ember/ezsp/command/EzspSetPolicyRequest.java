/**
 * Copyright (c) 2016-2020 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.ember.ezsp.command;

import com.zsmartsystems.zigbee.dongle.ember.ezsp.EzspFrameRequest;
import com.zsmartsystems.zigbee.dongle.ember.ezsp.structure.EzspDecisionId;
import com.zsmartsystems.zigbee.dongle.ember.ezsp.structure.EzspPolicyId;
import com.zsmartsystems.zigbee.dongle.ember.internal.serializer.EzspSerializer;

/**
 * Class to implement the Ember EZSP command <b>setPolicy</b>.
 * <p>
 * Allows the Host to change the policies used by the NCP to make fast decisions.
 * <p>
 * This class provides methods for processing EZSP commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class EzspSetPolicyRequest extends EzspFrameRequest {
    public static final int FRAME_ID = 0x55;

    /**
     * Identifies which policy to modify.
     * <p>
     * EZSP type is <i>EzspPolicyId</i> - Java type is {@link EzspPolicyId}
     */
    private EzspPolicyId policyId;

    /**
     *  The new decision for the specified policy.
     * <p>
     * EZSP type is <i>EzspDecisionId</i> - Java type is {@link EzspDecisionId}
     */
    private EzspDecisionId decisionId;

    /**
     * Serialiser used to serialise to binary line data
     */
    private EzspSerializer serializer;

    /**
     * Request constructor
     */
    public EzspSetPolicyRequest() {
        frameId = FRAME_ID;
        serializer = new EzspSerializer();
    }

    /**
     * Identifies which policy to modify.
     * <p>
     * EZSP type is <i>EzspPolicyId</i> - Java type is {@link EzspPolicyId}
     *
     * @return the current policyId as {@link EzspPolicyId}
     */
    public EzspPolicyId getPolicyId() {
        return policyId;
    }

    /**
     * Identifies which policy to modify.
     *
     * @param policyId the policyId to set as {@link EzspPolicyId}
     */
    public void setPolicyId(EzspPolicyId policyId) {
        this.policyId = policyId;
    }

    /**
     *  The new decision for the specified policy.
     * <p>
     * EZSP type is <i>EzspDecisionId</i> - Java type is {@link EzspDecisionId}
     *
     * @return the current decisionId as {@link EzspDecisionId}
     */
    public EzspDecisionId getDecisionId() {
        return decisionId;
    }

    /**
     *  The new decision for the specified policy.
     *
     * @param decisionId the decisionId to set as {@link EzspDecisionId}
     */
    public void setDecisionId(EzspDecisionId decisionId) {
        this.decisionId = decisionId;
    }

    @Override
    public int[] serialize() {
        // Serialize the header
        serializeHeader(serializer);

        // Serialize the fields
        serializer.serializeEzspPolicyId(policyId);
        serializer.serializeEzspDecisionId(decisionId);
        return serializer.getPayload();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(98);
        builder.append("EzspSetPolicyRequest [networkId=");
        builder.append(networkId);
        builder.append(", policyId=");
        builder.append(policyId);
        builder.append(", decisionId=");
        builder.append(decisionId);
        builder.append(']');
        return builder.toString();
    }
}
