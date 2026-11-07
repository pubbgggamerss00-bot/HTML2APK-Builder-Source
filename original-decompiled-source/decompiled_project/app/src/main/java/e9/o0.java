package e9;

import android.content.Context;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import java.util.List;
import x0.l1;
import x0.n1;
import x0.r3;
import z.f1;

/* loaded from: classes.dex */
public final class o0 implements eh.q<f1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8483a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f8484b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1 f8485c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s0 f8486d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f8487e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f8488f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r3<ProjectEntity> f8489g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r3<List<String>> f8490h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f8491j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p5.x f8492k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b0.m0 f8493l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n1 f8494m;

    public o0(String str, n1 n1Var, l1 l1Var, s0 s0Var, long j10, Context context, n1 n1Var2, n1 n1Var3, n1 n1Var4, p5.x xVar, b0.m0 m0Var, n1 n1Var5) {
        this.f8483a = str;
        this.f8484b = n1Var;
        this.f8485c = l1Var;
        this.f8486d = s0Var;
        this.f8487e = j10;
        this.f8488f = context;
        this.f8489g = n1Var2;
        this.f8490h = n1Var3;
        this.f8491j = n1Var4;
        this.f8492k = xVar;
        this.f8493l = m0Var;
        this.f8494m = n1Var5;
    }

    @Override // eh.q
    public final pg.f0 b(f1 f1Var, x0.j jVar, Integer num) {
        f1 padding = f1Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(padding, "padding");
        if ((iIntValue & 6) == 0) {
            iIntValue |= jVar2.K(padding) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && jVar2.s()) {
            jVar2.v();
        } else {
            q8.i.a(null, null, f1.c.b(-1654096801, new n0(padding, this.f8483a, this.f8484b, this.f8485c, this.f8486d, this.f8487e, this.f8488f, this.f8489g, this.f8490h, this.f8491j, this.f8492k, this.f8493l, this.f8494m), jVar2), jVar2, 384);
        }
        return pg.f0.f21461a;
    }
}
