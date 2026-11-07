package ff;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes2.dex */
public interface j extends Closeable {
    void b0(int i10) throws IOException;

    byte[] c0(int i10) throws IOException;

    boolean g() throws IOException;

    long getPosition() throws IOException;

    void p0(byte[] bArr) throws IOException;

    int peek() throws IOException;

    int read() throws IOException;

    int read(byte[] bArr) throws IOException;

    void s(int i10, byte[] bArr) throws IOException;
}
