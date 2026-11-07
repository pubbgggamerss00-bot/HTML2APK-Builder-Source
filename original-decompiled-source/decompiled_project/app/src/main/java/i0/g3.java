package i0;

import i0.i2;
import java.util.List;

/* loaded from: classes.dex */
public final class g3 extends kotlin.jvm.internal.s implements eh.l<List<? extends y2.i>, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y2.j f13297a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.l<y2.c0, pg.f0> f13298b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0<y2.n0> f13299c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(y2.j jVar, i2.b bVar, kotlin.jvm.internal.g0 g0Var) {
        super(1);
        this.f13297a = jVar;
        this.f13298b = bVar;
        this.f13299c = g0Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(List<? extends y2.i> list) {
        y2.n0 n0Var = this.f13299c.f16327a;
        y2.c0 c0VarA = this.f13297a.a(list);
        if (n0Var != null) {
            n0Var.a(null, c0VarA);
        }
        this.f13298b.invoke(c0VarA);
        return pg.f0.f21461a;
    }
}
