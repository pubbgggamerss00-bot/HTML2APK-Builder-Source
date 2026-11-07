package hi;

import java.io.IOException;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public interface i extends l0, ReadableByteChannel {
    boolean A0(long j10, j jVar) throws IOException;

    int D(z zVar) throws IOException;

    String F(long j10) throws IOException;

    String S(Charset charset) throws IOException;

    boolean Y(long j10) throws IOException;

    String a0() throws IOException;

    j m(long j10) throws IOException;

    long m0(j0 j0Var) throws IOException;

    byte readByte() throws IOException;

    int readInt() throws IOException;

    short readShort() throws IOException;

    void skip(long j10) throws IOException;

    void u0(long j10) throws IOException;

    g w();

    long z0() throws IOException;
}
