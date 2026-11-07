package b0;

import g2.g1;
import j1.d;
import java.util.List;

/* loaded from: classes.dex */
public final class w extends h0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f3456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d0.q0 f3457e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3458f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3459g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d.b f3460h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d.c f3461i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f3462j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3463k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f3464l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m0 f3465m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(long j10, boolean z10, o oVar, d0.q0 q0Var, int i10, int i11, d.b bVar, d.c cVar, int i12, int i13, long j11, m0 m0Var) {
        super(j10, z10, oVar, q0Var);
        this.f3456d = z10;
        this.f3457e = q0Var;
        this.f3458f = i10;
        this.f3459g = i11;
        this.f3460h = bVar;
        this.f3461i = cVar;
        this.f3462j = i12;
        this.f3463k = i13;
        this.f3464l = j11;
        this.f3465m = m0Var;
    }

    @Override // b0.h0
    public final g0 b(int i10, Object obj, Object obj2, List<? extends g1> list, long j10) {
        return new g0(i10, list, this.f3456d, this.f3460h, this.f3461i, this.f3457e.getLayoutDirection(), this.f3462j, this.f3463k, i10 == this.f3458f + (-1) ? 0 : this.f3459g, this.f3464l, obj, obj2, this.f3465m.f3394m, j10);
    }
}
