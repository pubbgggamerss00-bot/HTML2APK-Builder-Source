package t0;

/* loaded from: classes.dex */
public final class jb {

    /* renamed from: a, reason: collision with root package name */
    public final long f26160a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26161b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26162c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26163d;

    /* renamed from: e, reason: collision with root package name */
    public final long f26164e;

    /* renamed from: f, reason: collision with root package name */
    public final long f26165f;

    /* renamed from: g, reason: collision with root package name */
    public final long f26166g;

    /* renamed from: h, reason: collision with root package name */
    public final long f26167h;

    /* renamed from: i, reason: collision with root package name */
    public final long f26168i;

    /* renamed from: j, reason: collision with root package name */
    public final long f26169j;

    public jb(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19) {
        this.f26160a = j10;
        this.f26161b = j11;
        this.f26162c = j12;
        this.f26163d = j13;
        this.f26164e = j14;
        this.f26165f = j15;
        this.f26166g = j16;
        this.f26167h = j17;
        this.f26168i = j18;
        this.f26169j = j19;
    }

    public final long a(boolean z10, boolean z11) {
        return z10 ? z11 ? this.f26161b : this.f26163d : z11 ? this.f26166g : this.f26168i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof jb)) {
            return false;
        }
        jb jbVar = (jb) obj;
        return q1.b1.d(this.f26160a, jbVar.f26160a) && q1.b1.d(this.f26161b, jbVar.f26161b) && q1.b1.d(this.f26162c, jbVar.f26162c) && q1.b1.d(this.f26163d, jbVar.f26163d) && q1.b1.d(this.f26164e, jbVar.f26164e) && q1.b1.d(this.f26165f, jbVar.f26165f) && q1.b1.d(this.f26166g, jbVar.f26166g) && q1.b1.d(this.f26167h, jbVar.f26167h) && q1.b1.d(this.f26168i, jbVar.f26168i) && q1.b1.d(this.f26169j, jbVar.f26169j);
    }

    public final int hashCode() {
        int i10 = q1.b1.f21655i;
        return Long.hashCode(this.f26169j) + r.e2.a(r.e2.a(r.e2.a(r.e2.a(r.e2.a(r.e2.a(r.e2.a(r.e2.a(Long.hashCode(this.f26160a) * 31, 31, this.f26161b), 31, this.f26162c), 31, this.f26163d), 31, this.f26164e), 31, this.f26165f), 31, this.f26166g), 31, this.f26167h), 31, this.f26168i);
    }
}
