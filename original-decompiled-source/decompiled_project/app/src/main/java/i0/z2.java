package i0;

import java.util.List;
import t2.b;
import x2.f;

/* loaded from: classes.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    public final t2.b f13725a;

    /* renamed from: b, reason: collision with root package name */
    public final t2.l0 f13726b;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f13729e;

    /* renamed from: g, reason: collision with root package name */
    public final f3.d f13731g;

    /* renamed from: h, reason: collision with root package name */
    public final f.a f13732h;

    /* renamed from: j, reason: collision with root package name */
    public t2.m f13734j;

    /* renamed from: k, reason: collision with root package name */
    public f3.r f13735k;

    /* renamed from: c, reason: collision with root package name */
    public final int f13727c = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public final int f13728d = 1;

    /* renamed from: f, reason: collision with root package name */
    public final int f13730f = 1;

    /* renamed from: i, reason: collision with root package name */
    public final List<b.c<t2.u>> f13733i = qg.z.f22752a;

    public z2(t2.b bVar, t2.l0 l0Var, boolean z10, f3.d dVar, f.a aVar, int i10) {
        this.f13725a = bVar;
        this.f13726b = l0Var;
        this.f13729e = z10;
        this.f13731g = dVar;
        this.f13732h = aVar;
    }

    public final void a(f3.r rVar) {
        t2.m mVar = this.f13734j;
        if (mVar == null || rVar != this.f13735k || mVar.a()) {
            this.f13735k = rVar;
            mVar = new t2.m(this.f13725a, qg.n0.e(this.f13726b, rVar), this.f13733i, this.f13731g, this.f13732h);
        }
        this.f13734j = mVar;
    }
}
