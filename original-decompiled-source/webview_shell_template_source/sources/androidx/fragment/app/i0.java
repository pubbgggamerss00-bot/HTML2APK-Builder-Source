package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i0 extends Writer {

    /* renamed from: t, reason: collision with root package name */
    public final StringBuilder f1143t = new StringBuilder(128);
    public final String s = "FragmentManager";

    public final void a() {
        StringBuilder sb = this.f1143t;
        if (sb.length() > 0) {
            Log.d(this.s, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i6, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            char c7 = cArr[i6 + i8];
            if (c7 == '\n') {
                a();
            } else {
                this.f1143t.append(c7);
            }
        }
    }
}
