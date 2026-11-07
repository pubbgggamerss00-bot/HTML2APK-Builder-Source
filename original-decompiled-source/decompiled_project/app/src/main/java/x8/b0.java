package x8;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;

/* loaded from: classes.dex */
public final class b0 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0.m0 f32291a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f32292b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y1.a f32293c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Long> f32294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.n1<List<Long>> f32295e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.k1 f32296f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f32297g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f32298h;

    public b0(b0.m0 m0Var, x0.n1 n1Var, y1.a aVar, x0.n1 n1Var2, x0.n1 n1Var3, x0.k1 k1Var, x0.n1 n1Var4, x0.n1 n1Var5) {
        this.f32291a = m0Var;
        this.f32292b = n1Var;
        this.f32293c = aVar;
        this.f32294d = n1Var2;
        this.f32295e = n1Var3;
        this.f32296f = k1Var;
        this.f32297g = n1Var4;
        this.f32298h = n1Var5;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(c2.j0 j0Var, tg.e<? super pg.f0> eVar) {
        b0.m0 m0Var = this.f32291a;
        x0.n1 n1Var = this.f32292b;
        y1.a aVar = this.f32293c;
        x0.n1<Long> n1Var2 = this.f32294d;
        x0.n1<List<Long>> n1Var3 = this.f32295e;
        x0.k1 k1Var = this.f32296f;
        y yVar = new y(m0Var, n1Var, aVar, n1Var2, n1Var3, k1Var);
        z zVar = new z(this.f32297g, this.f32298h, n1Var3, n1Var2);
        androidx.credentials.playservices.p pVar = new androidx.credentials.playservices.p(1, n1Var2, n1Var3);
        a0 a0Var = new a0(m0Var, n1Var2, k1Var, n1Var3);
        float f10 = v.u.f30087a;
        Object objC = v.c0.c(j0Var, new v.s(yVar, zVar, pVar, a0Var, null), eVar);
        ug.a aVar2 = ug.a.f29706a;
        if (objC != aVar2) {
            objC = pg.f0.f21461a;
        }
        return objC == aVar2 ? objC : pg.f0.f21461a;
    }
}
