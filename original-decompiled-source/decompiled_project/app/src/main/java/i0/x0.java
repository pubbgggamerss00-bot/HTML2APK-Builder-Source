package i0;

import i0.i2;

/* loaded from: classes.dex */
public final class x0 extends kotlin.jvm.internal.s implements eh.l<x0.l0, x0.k0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i2 f13672a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y2.e0 f13673b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y2.c0 f13674c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y2.o f13675d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(i2 i2Var, y2.e0 e0Var, y2.c0 c0Var, y2.o oVar) {
        super(1);
        this.f13672a = i2Var;
        this.f13673b = e0Var;
        this.f13674c = c0Var;
        this.f13675d = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object, y2.n0] */
    @Override // eh.l
    public final x0.k0 invoke(x0.l0 l0Var) {
        i2 i2Var = this.f13672a;
        if (i2Var.b()) {
            y2.j jVar = i2Var.f13340d;
            i2.b bVar = i2Var.f13358v;
            i2.a aVar = i2Var.f13359w;
            kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
            g3 g3Var = new g3(jVar, bVar, g0Var);
            y2.e0 e0Var = this.f13673b;
            y2.x xVar = e0Var.f33704a;
            xVar.e(this.f13674c, this.f13675d, g3Var, aVar);
            ?? n0Var = new y2.n0(e0Var, xVar);
            e0Var.f33705b.set(n0Var);
            g0Var.f16327a = n0Var;
            i2Var.f13341e = n0Var;
        }
        return new w0();
    }
}
