package ah;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class d extends ByteArrayOutputStream {
    public final byte[] h() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        r.d(buf, "buf");
        return buf;
    }
}
