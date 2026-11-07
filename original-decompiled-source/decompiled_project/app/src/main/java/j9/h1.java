package j9;

import com.yalantis.ucrop.view.CropImageView;
import j9.x1;
import java.util.List;
import x0.j;
import x0.r3;
import z.b;

/* loaded from: classes.dex */
public final class h1 implements eh.q<z.i, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z.f1 f15413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<x1.a> f15414b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x1 f15415c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r3<Boolean> f15416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q8.d0 f15417e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f15418f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p5.x f15419g;

    public h1(z.f1 f1Var, List<x1.a> list, x1 x1Var, r3<Boolean> r3Var, q8.d0 d0Var, long j10, p5.x xVar) {
        this.f15413a = f1Var;
        this.f15414b = list;
        this.f15415c = x1Var;
        this.f15416d = r3Var;
        this.f15417e = d0Var;
        this.f15418f = j10;
        this.f15419g = xVar;
    }

    @Override // eh.q
    public final pg.f0 b(z.i iVar, x0.j jVar, Integer num) {
        z.i BackgroundBox = iVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(BackgroundBox, "$this$BackgroundBox");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.layout.f.g(androidx.compose.foundation.layout.g.f976c, this.f15413a), 20, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            z.g1 g1VarD = androidx.compose.foundation.layout.f.d(8, 24, 5);
            b.i iVarH = z.b.h(12);
            jVar2.L(1888748601);
            boolean zL = jVar2.l(this.f15414b);
            final x1 x1Var = this.f15415c;
            boolean zL2 = zL | jVar2.l(x1Var) | jVar2.K(this.f15416d) | jVar2.K(this.f15417e) | jVar2.j(this.f15418f) | jVar2.l(this.f15419g);
            Object objG = jVar2.g();
            if (zL2 || objG == j.a.f31715a) {
                final List<x1.a> list = this.f15414b;
                final q8.d0 d0Var = this.f15417e;
                final long j10 = this.f15418f;
                final p5.x xVar = this.f15419g;
                final r3<Boolean> r3Var = this.f15416d;
                eh.l lVar = new eh.l() { // from class: j9.z0
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        b0.j0 LazyColumn = (b0.j0) obj;
                        kotlin.jvm.internal.r.e(LazyColumn, "$this$LazyColumn");
                        a1 a1Var = new a1();
                        List list2 = list;
                        LazyColumn.d(list2.size(), new e1(a1Var, list2, 0), new f1(0, d1.f15343a, list2), new f1.b(-632812321, true, new g1(list2, x1Var, d0Var, j10, xVar, r3Var)));
                        b0.j0.b(LazyColumn, null, f.f15363d, 3);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(lVar);
                objG = lVar;
            }
            jVar2.B();
            b0.d.a(dVarJ, null, g1VarD, iVarH, null, null, false, null, (eh.l) objG, jVar2, 24960, 490);
        }
        return pg.f0.f21461a;
    }
}
