package m5;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a extends ByteArrayOutputStream {
    public final byte[] a() {
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        j.d("buf", bArr);
        return bArr;
    }
}
