package c2;

import java.util.List;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f4593a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4594b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4595c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4596d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4597e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4598f;

    /* renamed from: g, reason: collision with root package name */
    public final long f4599g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4600h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4601i;

    /* renamed from: j, reason: collision with root package name */
    public final long f4602j;

    /* renamed from: k, reason: collision with root package name */
    public final List<e> f4603k;

    /* renamed from: l, reason: collision with root package name */
    public final long f4604l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4605m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4606n;

    /* renamed from: o, reason: collision with root package name */
    public b0 f4607o;

    public b0() {
        throw null;
    }

    public b0(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15) {
        this.f4593a = j10;
        this.f4594b = j11;
        this.f4595c = j12;
        this.f4596d = z10;
        this.f4597e = f10;
        this.f4598f = j13;
        this.f4599g = j14;
        this.f4600h = z11;
        this.f4601i = i10;
        this.f4602j = j15;
        this.f4604l = 0L;
        this.f4605m = z12;
        this.f4606n = z12;
    }

    public final void a() {
        b0 b0Var = this.f4607o;
        if (b0Var == null) {
            this.f4605m = true;
            this.f4606n = true;
        } else if (b0Var != null) {
            b0Var.a();
        }
    }

    public final boolean b() {
        b0 b0Var = this.f4607o;
        return b0Var != null ? b0Var.b() : this.f4605m || this.f4606n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) ("PointerId(value=" + this.f4593a + ')'));
        sb.append(", uptimeMillis=");
        sb.append(this.f4594b);
        sb.append(", position=");
        sb.append((Object) p1.c.i(this.f4595c));
        sb.append(", pressed=");
        sb.append(this.f4596d);
        sb.append(", pressure=");
        sb.append(this.f4597e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f4598f);
        sb.append(", previousPosition=");
        sb.append((Object) p1.c.i(this.f4599g));
        sb.append(", previousPressed=");
        sb.append(this.f4600h);
        sb.append(", isConsumed=");
        sb.append(b());
        sb.append(", type=");
        int i10 = this.f4601i;
        sb.append((Object) (i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", historical=");
        Object obj = this.f4603k;
        if (obj == null) {
            obj = qg.z.f22752a;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) p1.c.i(this.f4602j));
        sb.append(')');
        return sb.toString();
    }

    public b0(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, int i10, List list, long j15, long j16) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, false, i10, j15);
        this.f4603k = list;
        this.f4604l = j16;
    }
}
