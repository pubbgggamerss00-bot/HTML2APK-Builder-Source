package t;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.s implements eh.l<s1.c, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p1.e f25317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0<q1.n1> f25318b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f25319c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q1.c1 f25320d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p1.e eVar, kotlin.jvm.internal.g0 g0Var, long j10, q1.p0 p0Var) {
        super(1);
        this.f25317a = eVar;
        this.f25318b = g0Var;
        this.f25319c = j10;
        this.f25320d = p0Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(s1.c cVar) throws Throwable {
        float f10;
        float f11;
        s1.c cVar2 = cVar;
        cVar2.z1();
        p1.e eVar = this.f25317a;
        float f12 = eVar.f21131a;
        float f13 = eVar.f21132b;
        kotlin.jvm.internal.g0<q1.n1> g0Var = this.f25318b;
        long j10 = this.f25319c;
        q1.c1 c1Var = this.f25320d;
        cVar2.Q0().f24180a.f(f12, f13);
        try {
            f10 = f12;
        } catch (Throwable th2) {
            th = th2;
            f10 = f12;
            f11 = f13;
        }
        try {
            s1.e.e1(cVar2, g0Var.f16327a, 0L, j10, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, c1Var, 0, 0, 890);
            cVar2.Q0().f24180a.f(-f10, -f13);
            return pg.f0.f21461a;
        } catch (Throwable th3) {
            th = th3;
            f11 = f13;
            cVar2.Q0().f24180a.f(-f10, -f11);
            throw th;
        }
    }
}
