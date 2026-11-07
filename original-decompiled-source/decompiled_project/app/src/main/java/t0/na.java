package t0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class na extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z.u1 f26526a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g2.t1 f26527b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f26528c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f26529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f26530e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Integer f26531f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f1.b f26532g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na(z.u1 u1Var, g2.t1 t1Var, ArrayList arrayList, int i10, ArrayList arrayList2, Integer num, f1.b bVar) {
        super(2);
        this.f26526a = u1Var;
        this.f26527b = t1Var;
        this.f26528c = arrayList;
        this.f26529d = i10;
        this.f26530e = arrayList2;
        this.f26531f = num;
        this.f26532g = bVar;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        Integer num2;
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            z.u1 u1Var = this.f26526a;
            g2.t1 t1Var = this.f26527b;
            z.t0 t0Var = new z.t0(u1Var, t1Var);
            this.f26532g.b(new z.g1(androidx.compose.foundation.layout.f.f(t0Var, t1Var.getLayoutDirection()), this.f26528c.isEmpty() ? t0Var.c() : t1Var.u(this.f26529d), androidx.compose.foundation.layout.f.e(t0Var, t1Var.getLayoutDirection()), (this.f26530e.isEmpty() || (num2 = this.f26531f) == null) ? t0Var.a() : t1Var.u(num2.intValue())), jVar2, 0);
        }
        return pg.f0.f21461a;
    }
}
