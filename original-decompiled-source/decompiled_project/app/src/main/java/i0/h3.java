package i0;

import t0.ic;

/* loaded from: classes.dex */
public final class h3 extends kotlin.jvm.internal.s implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13319b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h3(Object obj, int i10) {
        super(1);
        this.f13318a = i10;
        this.f13319b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f13318a) {
            case 0:
                float[] fArr = ((q1.r1) obj).f21729a;
                g2.v vVar = (g2.v) this.f13319b;
                if (vVar.m()) {
                    g2.w.c(vVar).G(vVar, fArr);
                }
                return pg.f0.f21461a;
            default:
                return Boolean.valueOf(kotlin.jvm.internal.r.a(((t0.t3) obj).f27042a, (ic) this.f13319b));
        }
    }
}
