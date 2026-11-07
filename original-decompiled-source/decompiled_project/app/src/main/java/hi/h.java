package hi;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes2.dex */
public interface h extends j0, WritableByteChannel {
    h A(j jVar) throws IOException;

    h O(String str) throws IOException;

    h V(long j10) throws IOException;

    @Override // hi.j0, java.io.Flushable
    void flush() throws IOException;

    h write(byte[] bArr) throws IOException;

    h writeByte(int i10) throws IOException;

    h writeInt(int i10) throws IOException;

    h writeShort(int i10) throws IOException;
}
