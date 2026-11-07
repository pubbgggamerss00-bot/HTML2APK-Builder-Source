package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.w;
import java.io.IOException;

/* loaded from: classes2.dex */
public interface p0 extends q0 {

    public interface a extends q0, Cloneable {
        w buildPartial();
    }

    void a(k kVar) throws IOException;

    int getSerializedSize();

    w.a newBuilderForType();

    byte[] toByteArray();
}
