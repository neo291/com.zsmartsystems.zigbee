/**
 * Copyright (c) 2016-2021 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.ember.ezsp.command;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.zsmartsystems.zigbee.dongle.ember.ezsp.EzspFrame;
import com.zsmartsystems.zigbee.dongle.ember.ezsp.EzspFrameTest;
import com.zsmartsystems.zigbee.dongle.ember.ezsp.structure.EmberStatus;

/**
 *
 * @author Simone Cattaneo
 *
 */
public class EzspGetMulticastTableEntryResponseTest extends EzspFrameTest {
    @Test
    public void testVersionWithoutNetworkIndex() {
        EzspFrame.setEzspVersion(4);

        EzspGetMulticastTableEntryResponse response = new EzspGetMulticastTableEntryResponse(
                getPacketData("02 80 FF 00 63 00 00 00 01"));
        System.out.println(response);

        assertEquals(2, response.getSequenceNumber());
        assertEquals(true, response.isResponse());
        assertEquals(EzspGetMulticastTableEntryResponse.FRAME_ID, response.getFrameId());
        assertEquals(EmberStatus.EMBER_SUCCESS, response.getStatus());
        assertEquals(1, response.getValue().getEndpoint());
        assertEquals(0, response.getValue().getMulticastId());
        assertEquals(0, response.getValue().getNetworkIndex());
    }

    @Test
    public void testVersionWithNetworkIndex() {
        EzspFrame.setEzspVersion(4);

        EzspGetMulticastTableEntryResponse response = new EzspGetMulticastTableEntryResponse(
                getPacketData("02 80 FF 00 63 00 00 00 01 02"));
        System.out.println(response);

        assertEquals(2, response.getSequenceNumber());
        assertEquals(true, response.isResponse());
        assertEquals(EzspGetMulticastTableEntryResponse.FRAME_ID, response.getFrameId());
        assertEquals(EmberStatus.EMBER_SUCCESS, response.getStatus());
        assertEquals(1, response.getValue().getEndpoint());
        assertEquals(0, response.getValue().getMulticastId());
        assertEquals(2, response.getValue().getNetworkIndex());
    }
}
