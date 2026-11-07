package h9;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.foundation.layout.FillElement;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.licenses.OpenSourceLicenses;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import i2.g;
import j1.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pg.p;
import t0.ff;
import t0.nf;
import t0.of;
import t0.z9;
import x0.j;
import z.b;

/* loaded from: classes.dex */
public final class l1 implements eh.q<z.i, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z.f1 f12712a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f12713b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f12714c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.r3<pg.p<List<OpenSourceLicenses.a>>> f12715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f12716e;

    /* JADX WARN: Multi-variable type inference failed */
    public l1(z.f1 f1Var, x0.n1<String> n1Var, x0.n1<String> n1Var2, x0.r3<? extends pg.p<? extends List<OpenSourceLicenses.a>>> r3Var, Context context) {
        this.f12712a = f1Var;
        this.f12713b = n1Var;
        this.f12714c = n1Var2;
        this.f12715d = r3Var;
        this.f12716e = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.q
    public final pg.f0 b(z.i iVar, x0.j jVar, Integer num) {
        ArrayList arrayList;
        final z.i FadingPage = iVar;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(FadingPage, "$this$FadingPage");
        if ((iIntValue & 6) == 0) {
            iIntValue |= jVar2.K(FadingPage) ? 4 : 2;
        }
        int i10 = iIntValue;
        if ((i10 & 19) == 18 && jVar2.s()) {
            jVar2.v();
        } else {
            pg.p<List<OpenSourceLicenses.a>> value = this.f12715d.getValue();
            j1.f fVar = d.a.f14606e;
            Object obj = null;
            if (value == null) {
                jVar2.L(-1788166367);
                FillElement fillElement = androidx.compose.foundation.layout.g.f976c;
                g2.l0 l0VarD = z.g.d(fVar, false);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(fillElement, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar = g.a.f13863b;
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar);
                } else {
                    jVar2.z();
                }
                ph.v1.j(g.a.f13867f, l0VarD, jVar2);
                ph.v1.j(g.a.f13866e, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                ph.v1.j(g.a.f13865d, dVarC, jVar2);
                z9.a(CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 31, 0L, 0L, null, jVar2);
                jVar2.H();
                jVar2.B();
                pg.f0 f0Var = pg.f0.f21461a;
            } else {
                Object obj2 = value.f21471a;
                if (obj2 instanceof p.a) {
                    jVar2.L(-1788160741);
                    androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(androidx.compose.foundation.layout.g.f976c, 24);
                    g2.l0 l0VarD2 = z.g.d(fVar, false);
                    int iD2 = jVar2.D();
                    x0.a2 a2VarY2 = jVar2.y();
                    androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarH, jVar2);
                    i2.g.f13861o.getClass();
                    e0.a aVar2 = g.a.f13863b;
                    if (jVar2.t() == null) {
                        c9.u1.d();
                        throw null;
                    }
                    jVar2.r();
                    if (jVar2.m()) {
                        jVar2.w(aVar2);
                    } else {
                        jVar2.z();
                    }
                    ph.v1.j(g.a.f13867f, l0VarD2, jVar2);
                    ph.v1.j(g.a.f13866e, a2VarY2, jVar2);
                    g.a.C0128a c0128a2 = g.a.f13868g;
                    if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                        l9.i.a(iD2, jVar2, iD2, c0128a2);
                    }
                    ph.v1.j(g.a.f13865d, dVarC2, jVar2);
                    ff.b(f3.q.c(R.string.licenses_load_failed, jVar2), null, ((t0.e2) jVar2.f(t0.f2.f25858a)).f25777w, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26547j, jVar2, 0, 0, 65530);
                    jVar2.H();
                    jVar2.B();
                    pg.f0 f0Var2 = pg.f0.f21461a;
                } else {
                    jVar2.L(402052074);
                    pg.q.b(obj2);
                    final List list = (List) obj2;
                    final x0.n1<String> n1Var = this.f12713b;
                    Object obj3 = (String) n1Var.getValue();
                    jVar2.L(-1788145950);
                    boolean zK = jVar2.K(obj3) | jVar2.K(list);
                    Object objG = jVar2.g();
                    Object obj4 = j.a.f31715a;
                    Object obj5 = objG;
                    if (zK || objG == obj4) {
                        String string = mh.x.W(n1Var.getValue()).toString();
                        if (string.length() == 0) {
                            arrayList = list;
                        } else {
                            arrayList = new ArrayList();
                            for (Object obj6 : list) {
                                OpenSourceLicenses.a aVar3 = (OpenSourceLicenses.a) obj6;
                                if (mh.x.r(aVar3.f5694b, string, true) || mh.x.r(aVar3.f5693a, string, true)) {
                                    arrayList.add(obj6);
                                    break;
                                }
                                List<OpenSourceLicenses.b> list2 = aVar3.f5699g;
                                if (!list2.isEmpty()) {
                                    Iterator<T> it = list2.iterator();
                                    while (it.hasNext()) {
                                        if (mh.x.r(((OpenSourceLicenses.b) it.next()).f5702a, string, true)) {
                                            arrayList.add(obj6);
                                            break;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        jVar2.C(arrayList);
                        obj5 = arrayList;
                    }
                    final List list3 = (List) obj5;
                    jVar2.B();
                    androidx.compose.ui.d dVarF = d0.h.f(androidx.compose.foundation.layout.g.f976c);
                    float f10 = 20;
                    z.g1 g1Var = new z.g1(f10, this.f12712a.c() + 8, f10, 24);
                    b.i iVarH = z.b.h(10);
                    jVar2.L(-1788117941);
                    boolean zL = jVar2.l(list) | jVar2.K(n1Var) | jVar2.l(list3);
                    final x0.n1<String> n1Var2 = this.f12714c;
                    boolean zK2 = zL | jVar2.K(n1Var2);
                    Object objG2 = jVar2.g();
                    if (zK2 || objG2 == obj4) {
                        objG2 = new eh.l() { // from class: h9.z0
                            @Override // eh.l
                            public final Object invoke(Object obj7) {
                                b0.j0 LazyColumn = (b0.j0) obj7;
                                kotlin.jvm.internal.r.e(LazyColumn, "$this$LazyColumn");
                                b0.j0.b(LazyColumn, "intro", new f1.b(-150814637, true, new c1(list)), 2);
                                b0.j0.b(LazyColumn, "search", new f1.b(-1407292356, true, new f1(n1Var)), 2);
                                List list4 = list3;
                                if (list4.isEmpty()) {
                                    b0.j0.b(LazyColumn, "empty", c.f12552f, 2);
                                }
                                LazyColumn.d(list4.size(), new i1(new b1(0), list4), new j1(h1.f12638a, list4), new f1.b(-632812321, true, new k1(list4, n1Var2)));
                                return pg.f0.f21461a;
                            }
                        };
                        jVar2.C(objG2);
                    }
                    jVar2.B();
                    b0.d.a(dVarF, null, g1Var, iVarH, null, null, false, null, (eh.l) objG2, jVar2, 24576, 490);
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (kotlin.jvm.internal.r.a(((OpenSourceLicenses.a) next).f5693a, n1Var2.getValue())) {
                            obj = next;
                            break;
                        }
                    }
                    OpenSourceLicenses.a aVar4 = (OpenSourceLicenses.a) obj;
                    if (aVar4 != null) {
                        jVar2.L(1400915281);
                        boolean zK3 = jVar2.K(n1Var2);
                        Object objG3 = jVar2.g();
                        if (zK3 || objG3 == obj4) {
                            objG3 = new d9.p(n1Var2, 1);
                            jVar2.C(objG3);
                        }
                        eh.a aVar5 = (eh.a) objG3;
                        jVar2.B();
                        jVar2.L(1400916460);
                        boolean z10 = (i10 & 14) == 4;
                        final Context context = this.f12716e;
                        boolean zL2 = z10 | jVar2.l(context);
                        Object objG4 = jVar2.g();
                        if (zL2 || objG4 == obj4) {
                            objG4 = new eh.l() { // from class: h9.a1
                                @Override // eh.l
                                public final Object invoke(Object obj7) {
                                    Context context2 = context;
                                    String url = (String) obj7;
                                    kotlin.jvm.internal.r.e(url, "url");
                                    try {
                                        context2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
                                        pg.f0 f0Var3 = pg.f0.f21461a;
                                    } catch (Throwable th2) {
                                        pg.q.a(th2);
                                    }
                                    return pg.f0.f21461a;
                                }
                            };
                            jVar2.C(objG4);
                        }
                        jVar2.B();
                        s0.c(aVar4, aVar5, (eh.l) objG4, jVar2, 8);
                        pg.f0 f0Var3 = pg.f0.f21461a;
                    }
                    jVar2.B();
                }
            }
        }
        return pg.f0.f21461a;
    }
}
