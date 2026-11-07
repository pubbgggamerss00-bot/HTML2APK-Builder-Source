package s8;

import t0.ra;

/* loaded from: classes.dex */
public final class n1 implements eh.q<z.i, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q8.w0 f24691a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v8.q f24692b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p5.s0 f24693c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f24694d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f24695e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f24696f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f24697g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f24698h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f24699j;

    public n1(q8.w0 w0Var, v8.q qVar, p5.s0 s0Var, boolean z10, long j10, float f10, boolean z11, String str, boolean z12) {
        this.f24691a = w0Var;
        this.f24692b = qVar;
        this.f24693c = s0Var;
        this.f24694d = z10;
        this.f24695e = j10;
        this.f24696f = f10;
        this.f24697g = z11;
        this.f24698h = str;
        this.f24699j = z12;
    }

    @Override // eh.q
    public final pg.f0 b(z.i iVar, x0.j jVar, Integer num) {
        z.i AnimatedBackground = iVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(AnimatedBackground, "$this$AnimatedBackground");
        if ((iIntValue & 6) == 0) {
            iIntValue |= jVar2.K(AnimatedBackground) ? 4 : 2;
        }
        int i10 = iIntValue;
        if ((i10 & 19) == 18 && jVar2.s()) {
            jVar2.v();
        } else {
            ra.a(null, null, f1.c.b(511891955, new f(this.f24693c, this.f24694d, this.f24695e, this.f24696f, this.f24697g), jVar2), null, null, 0, q1.b1.f21653g, 0L, new z.z(), f1.c.b(-736019735, new m1(this.f24694d, this.f24693c, this.f24698h, this.f24699j, this.f24691a), jVar2), jVar2, 806879616, 187);
            int i11 = (i10 & 14) | 48;
            q8.p0.b(AnimatedBackground, this.f24691a, jVar2, i11);
            v8.k.a(AnimatedBackground, this.f24692b, jVar2, i11);
        }
        return pg.f0.f21461a;
    }
}
