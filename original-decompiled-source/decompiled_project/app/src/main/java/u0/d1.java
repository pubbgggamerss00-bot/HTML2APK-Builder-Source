package u0;

import x0.r3;

/* loaded from: classes.dex */
public final class d1 extends kotlin.jvm.internal.s implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28973a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28974b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(Object obj, int i10) {
        super(1);
        this.f28973a = i10;
        this.f28974b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T, g2.g1] */
    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f28973a) {
            case 0:
                ((q1.l1) obj).f(((Number) ((r3) this.f28974b).getValue()).floatValue());
                break;
            default:
                ((kotlin.jvm.internal.g0) this.f28974b).f16327a = (g2.g1) obj;
                break;
        }
        return pg.f0.f21461a;
    }
}
