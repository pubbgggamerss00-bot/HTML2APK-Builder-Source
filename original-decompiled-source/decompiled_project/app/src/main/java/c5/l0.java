package c5;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public final class l0 extends Writer {

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f4946b = new StringBuilder(128);

    /* renamed from: a, reason: collision with root package name */
    public final String f4945a = "FragmentManager";

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        h();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        h();
    }

    public final void h() {
        StringBuilder sb = this.f4946b;
        if (sb.length() > 0) {
            Log.d(this.f4945a, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                h();
            } else {
                this.f4946b.append(c10);
            }
        }
    }
}
