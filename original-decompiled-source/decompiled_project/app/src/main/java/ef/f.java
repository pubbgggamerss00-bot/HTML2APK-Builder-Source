package ef;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes2.dex */
public interface f extends Closeable {
    boolean g() throws IOException;

    long getPosition() throws IOException;

    long length() throws IOException;

    int read() throws IOException;

    int read(byte[] bArr, int i10, int i11) throws IOException;

    void seek(long j10) throws IOException;
}
