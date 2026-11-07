package org.jf.dexlib2.writer.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public interface DexDataStore {
    void close() throws IOException;

    OutputStream outputAt(int i10);

    InputStream readAt(int i10);
}
