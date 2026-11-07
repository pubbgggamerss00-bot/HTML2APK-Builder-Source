package org.bouncycastle.cms;

import java.io.IOException;

/* loaded from: classes2.dex */
interface MACProvider {
    byte[] getMAC();

    void init() throws IOException;
}
