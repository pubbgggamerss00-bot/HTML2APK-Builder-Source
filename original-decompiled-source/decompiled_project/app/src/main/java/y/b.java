package y;

import android.os.Parcel;
import f3.t;
import f3.v;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public Parcel f33611a;

    public final void a(byte b10) {
        this.f33611a.writeByte(b10);
    }

    public final void b(float f10) {
        this.f33611a.writeFloat(f10);
    }

    public final void c(long j10) {
        long jB = t.b(j10);
        byte b10 = 0;
        if (!v.a(jB, 0L)) {
            if (v.a(jB, 4294967296L)) {
                b10 = 1;
            } else if (v.a(jB, 8589934592L)) {
                b10 = 2;
            }
        }
        a(b10);
        if (v.a(t.b(j10), 0L)) {
            return;
        }
        b(t.c(j10));
    }
}
