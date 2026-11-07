package org.jf.dexlib2.writer.io;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public abstract class DeferredOutputStream extends OutputStream {
    public abstract void writeTo(OutputStream outputStream) throws IOException;
}
