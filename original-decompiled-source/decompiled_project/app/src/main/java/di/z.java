package di;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public char[] f8084a;

    /* renamed from: b, reason: collision with root package name */
    public int f8085b;

    public final void a(int i10, int i11) {
        int i12 = i11 + i10;
        char[] cArr = this.f8084a;
        if (cArr.length <= i12) {
            int i13 = i10 * 2;
            if (i12 < i13) {
                i12 = i13;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i12);
            kotlin.jvm.internal.r.d(cArrCopyOf, "copyOf(...)");
            this.f8084a = cArrCopyOf;
        }
    }

    public final void b() {
        h hVar = h.f8017c;
        char[] array = this.f8084a;
        hVar.getClass();
        kotlin.jvm.internal.r.e(array, "array");
        synchronized (hVar) {
            try {
                int i10 = hVar.f8026b;
                if (array.length + i10 < g.f8013a) {
                    hVar.f8026b = i10 + array.length;
                    hVar.f8025a.addLast(array);
                }
                pg.f0 f0Var = pg.f0.f21461a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(String text) {
        kotlin.jvm.internal.r.e(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        a(this.f8085b, length);
        text.getChars(0, text.length(), this.f8084a, this.f8085b);
        this.f8085b += length;
    }

    public final void d(long j10) {
        c(String.valueOf(j10));
    }

    public final String toString() {
        return new String(this.f8084a, 0, this.f8085b);
    }
}
