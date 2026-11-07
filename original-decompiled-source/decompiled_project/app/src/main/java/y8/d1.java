package y8;

import android.content.Context;
import android.content.Intent;
import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import java.util.List;
import x0.n1;
import x0.r3;

/* loaded from: classes.dex */
public final class d1 implements eh.q<z.f1, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h9.x f34095a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f34096b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1 f34097c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f34098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r3<List<KeystoreEntity>> f34099e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n1<Boolean> f34100f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p5.x f34101g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c.k<Intent, e.a> f34102h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r3<List<ProjectEntity>> f34103j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ n1<KeystoreEntity> f34104k;

    public d1(h9.x xVar, Context context, n1 n1Var, n1 n1Var2, n1 n1Var3, n1 n1Var4, p5.x xVar2, c.k kVar, n1 n1Var5, n1 n1Var6) {
        this.f34095a = xVar;
        this.f34096b = context;
        this.f34097c = n1Var;
        this.f34098d = n1Var2;
        this.f34099e = n1Var3;
        this.f34100f = n1Var4;
        this.f34101g = xVar2;
        this.f34102h = kVar;
        this.f34103j = n1Var5;
        this.f34104k = n1Var6;
    }

    @Override // eh.q
    public final pg.f0 b(z.f1 f1Var, x0.j jVar, Integer num) {
        z.f1 padding = f1Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(padding, "padding");
        if ((iIntValue & 6) == 0) {
            iIntValue |= jVar2.K(padding) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && jVar2.s()) {
            jVar2.v();
        } else {
            p9.d.a(padding.c(), f1.c.b(1473415471, new c1(padding, this.f34095a, this.f34096b, this.f34097c, this.f34098d, this.f34099e, this.f34100f, this.f34101g, this.f34102h, this.f34103j, this.f34104k), jVar2), jVar2, 48);
        }
        return pg.f0.f21461a;
    }
}
