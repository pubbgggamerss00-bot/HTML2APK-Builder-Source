package x8;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.data.local.entity.FolderEntity;
import java.util.HashMap;
import java.util.List;
import x0.j;

/* loaded from: classes.dex */
public final class f3 implements eh.q<c0.v, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FolderEntity f32601a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Long> f32602b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s.b<Float, s.o> f32603c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph.i0 f32604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ HashMap<Long, p1.e> f32605e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f32606f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f32607g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f32608h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f32609j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Long> f32610k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x0.n1<List<Long>> f32611l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Long> f32612m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x0.n1<p1.c> f32613n;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ x0.n1<p1.e> f32614p;

    public f3(FolderEntity folderEntity, x0.n1<Long> n1Var, s.b<Float, s.o> bVar, ph.i0 i0Var, HashMap<Long, p1.e> map, boolean z10, x0.n1<Boolean> n1Var2, x0.n1<Boolean> n1Var3, x0.n1<Boolean> n1Var4, x0.n1<Long> n1Var5, x0.n1<List<Long>> n1Var6, x0.n1<Long> n1Var7, x0.n1<p1.c> n1Var8, x0.n1<p1.e> n1Var9) {
        this.f32601a = folderEntity;
        this.f32602b = n1Var;
        this.f32603c = bVar;
        this.f32604d = i0Var;
        this.f32605e = map;
        this.f32606f = z10;
        this.f32607g = n1Var2;
        this.f32608h = n1Var3;
        this.f32609j = n1Var4;
        this.f32610k = n1Var5;
        this.f32611l = n1Var6;
        this.f32612m = n1Var7;
        this.f32613n = n1Var8;
        this.f32614p = n1Var9;
    }

    @Override // eh.q
    public final pg.f0 b(c0.v vVar, x0.j jVar, Integer num) {
        c0.v item = vVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(item, "$this$item");
        if ((iIntValue & 17) == 16 && jVar2.s()) {
            jVar2.v();
        } else {
            boolean z10 = g5.f32665a;
            androidx.compose.ui.d dVarA = e.a(d.a.f1143b, e.b("folder_header", this.f32609j.getValue().booleanValue(), 1, this.f32610k.getValue(), jVar2, 390));
            jVar2.L(354101248);
            final x0.n1<Long> n1Var = this.f32602b;
            boolean zK = jVar2.K(n1Var) | jVar2.l(this.f32603c) | jVar2.l(this.f32604d) | jVar2.l(this.f32605e) | jVar2.c(this.f32606f);
            Object objG = jVar2.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (zK || objG == c0321a) {
                final s.b<Float, s.o> bVar = this.f32603c;
                final ph.i0 i0Var = this.f32604d;
                final x0.n1<List<Long>> n1Var2 = this.f32611l;
                final x0.n1<Long> n1Var3 = this.f32612m;
                final HashMap<Long, p1.e> map = this.f32605e;
                final boolean z11 = this.f32606f;
                final x0.n1<p1.c> n1Var4 = this.f32613n;
                final x0.n1<p1.e> n1Var5 = this.f32614p;
                eh.a aVar = new eh.a() { // from class: x8.e3
                    @Override // eh.a
                    public final Object invoke() {
                        g5.e(bVar, i0Var, n1Var, n1Var2, n1Var3, map, z11, n1Var4, n1Var5);
                        return pg.f0.f21461a;
                    }
                };
                jVar2.C(aVar);
                objG = aVar;
            }
            eh.a aVar2 = (eh.a) objG;
            x0.n1<Boolean> n1Var6 = this.f32607g;
            boolean zB = androidx.datastore.preferences.protobuf.e.b(jVar2, 354103376, n1Var6);
            Object objG2 = jVar2.g();
            if (zB || objG2 == c0321a) {
                objG2 = new c9.a1(n1Var6, 2);
                jVar2.C(objG2);
            }
            eh.a aVar3 = (eh.a) objG2;
            x0.n1<Boolean> n1Var7 = this.f32608h;
            boolean zB2 = androidx.datastore.preferences.protobuf.e.b(jVar2, 354106000, n1Var7);
            Object objG3 = jVar2.g();
            if (zB2 || objG3 == c0321a) {
                objG3 = new c9.b1(n1Var7, 1);
                jVar2.C(objG3);
            }
            jVar2.B();
            s.b(this.f32601a, aVar2, aVar3, (eh.a) objG3, dVarA, jVar2, 0);
        }
        return pg.f0.f21461a;
    }
}
