package cf;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class i extends n {

    /* renamed from: d, reason: collision with root package name */
    public static final i[] f5440d = new i[357];

    /* renamed from: e, reason: collision with root package name */
    public static final i f5441e = q0(0);

    /* renamed from: f, reason: collision with root package name */
    public static final i f5442f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f5443g;

    /* renamed from: h, reason: collision with root package name */
    public static final i f5444h;

    /* renamed from: b, reason: collision with root package name */
    public final long f5445b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5446c;

    static {
        q0(1L);
        q0(2L);
        f5442f = q0(3L);
        f5443g = new i(Long.MAX_VALUE, false);
        f5444h = new i(Long.MIN_VALUE, false);
    }

    public i(long j10, boolean z10) {
        this.f5445b = j10;
        this.f5446c = z10;
    }

    public static i q0(long j10) {
        if (-100 > j10 || j10 > 256) {
            return new i(j10, true);
        }
        int i10 = ((int) j10) + 100;
        i[] iVarArr = f5440d;
        if (iVarArr[i10] == null) {
            iVarArr[i10] = new i(j10, true);
        }
        return iVarArr[i10];
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i) && ((int) ((i) obj).f5445b) == ((int) this.f5445b);
    }

    @Override // cf.b
    public final Object f0(gf.b bVar) throws IOException {
        bVar.f12056d.write(String.valueOf(this.f5445b).getBytes("ISO-8859-1"));
        return null;
    }

    @Override // cf.n
    public final float g0() {
        return this.f5445b;
    }

    public final int hashCode() {
        long j10 = this.f5445b;
        return (int) (j10 ^ (j10 >> 32));
    }

    @Override // cf.n
    public final int k0() {
        return (int) this.f5445b;
    }

    @Override // cf.n
    public final long l0() {
        return this.f5445b;
    }

    public final String toString() {
        return com.android.apksig.internal.apk.a.a(this.f5445b, "}", new StringBuilder("COSInt{"));
    }
}
