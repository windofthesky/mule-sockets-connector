/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.extension.socket.protocol;

import org.mule.extension.socket.api.socket.tcp.TcpProtocol;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MockTcpProtocol implements TcpProtocol {

  @Override
  public InputStream read(InputStream is) throws IOException {
    throw new UnsupportedOperationException("read");
  }

  @Override
  public void write(OutputStream os, InputStream data) throws IOException {
    throw new UnsupportedOperationException("write");
  }
}
