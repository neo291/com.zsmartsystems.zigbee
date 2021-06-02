/**
 * Copyright (c) 2016-2021 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.ember.ezsp.command;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import com.zsmartsystems.zigbee.TestUtilities;
import com.zsmartsystems.zigbee.dongle.ember.ezsp.EzspFrame;
import com.zsmartsystems.zigbee.dongle.ember.ezsp.EzspFrameTest;
import com.zsmartsystems.zigbee.dongle.ember.ezsp.structure.EmberMulticastTableEntry;

/**
 *
 * @author Simone Cattaneo
 *
 */
public class EzspSetMulticastTableEntryRequestTest extends EzspFrameTest {
    @Test
    public void testVersion() throws Exception {
        EzspFrame.setEzspVersion(4);
        EzspSetMulticastTableEntryRequest request = new EzspSetMulticastTableEntryRequest();
        TestUtilities.setField(EzspFrame.class, request, "sequenceNumber", 2);
        EmberMulticastTableEntry emberMulticastTableEntry = new EmberMulticastTableEntry();
		emberMulticastTableEntry.setEndpoint(1);
		emberMulticastTableEntry.setMulticastId(0);
		emberMulticastTableEntry.setNetworkIndex(0);
        request.setIndex(0);
        request.setValue(emberMulticastTableEntry);
        System.out.println(request);

        assertTrue(Arrays.equals(getPacketData("02 00 64 00 00 00 01 00"), request.serialize()));
    }
}
