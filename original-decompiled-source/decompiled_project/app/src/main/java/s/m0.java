package s;

import s.l0;

/* loaded from: classes.dex */
public final class m0 extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Number f23833a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0.a<Object, Object> f23834b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Number f23835c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k0<Object> f23836d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(Number number, l0.a aVar, Number number2, k0 k0Var) {
        super(0);
        this.f23833a = number;
        this.f23834b = aVar;
        this.f23835c = number2;
        this.f23836d = k0Var;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        l0.a<Object, Object> aVar = this.f23834b;
        Number number = aVar.f23807a;
        Number number2 = this.f23833a;
        boolean zEquals = number2.equals(number);
        Number number3 = this.f23835c;
        if (!zEquals || !number3.equals(aVar.f23808b)) {
            aVar.f23807a = number2;
            aVar.f23808b = number3;
            k0<Object> k0Var = this.f23836d;
            aVar.f23811e = k0Var;
            aVar.f23812f = new x1<>(k0Var, aVar.f23809c, number2, number3, null);
            l0.this.f23804b.setValue(Boolean.TRUE);
            aVar.f23813g = false;
            aVar.f23814h = true;
        }
        return pg.f0.f21461a;
    }
}
