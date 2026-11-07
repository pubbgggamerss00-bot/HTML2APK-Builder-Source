package w;

import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.s;
import pg.f0;
import v.b1;
import x0.x1;

/* loaded from: classes.dex */
public final class j extends s implements eh.l<s.k<Float, s.o>, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f31015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f31016b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f31017c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.l<Float, f0> f31018d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(float f10, d0 d0Var, b1 b1Var, eh.l<? super Float, f0> lVar) {
        super(1);
        this.f31015a = f10;
        this.f31016b = d0Var;
        this.f31017c = b1Var;
        this.f31018d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.l
    public final f0 invoke(s.k<Float, s.o> kVar) {
        s.k<Float, s.o> kVar2 = kVar;
        x1 x1Var = kVar2.f23791e;
        float fAbs = Math.abs(((Number) x1Var.getValue()).floatValue());
        float f10 = this.f31015a;
        float fAbs2 = Math.abs(f10);
        eh.l<Float, f0> lVar = this.f31018d;
        b1 b1Var = this.f31017c;
        d0 d0Var = this.f31016b;
        if (fAbs >= fAbs2) {
            float fD = m.d(((Number) x1Var.getValue()).floatValue(), f10);
            m.b(kVar2, b1Var, lVar, fD - d0Var.f16322a);
            kVar2.a();
            d0Var.f16322a = fD;
        } else {
            m.b(kVar2, b1Var, lVar, ((Number) x1Var.getValue()).floatValue() - d0Var.f16322a);
            d0Var.f16322a = ((Number) x1Var.getValue()).floatValue();
        }
        return f0.f21461a;
    }
}
