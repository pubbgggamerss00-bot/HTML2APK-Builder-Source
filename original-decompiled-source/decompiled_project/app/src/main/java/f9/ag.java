package f9;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.domain.model.WebViewSettings;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import x0.j;

/* loaded from: classes.dex */
public final class ag implements eh.q<t0.a3, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<pg.n<Integer, String>> f8981a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8982b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebViewSettings f8983c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f8984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eh.l<WebViewSettings, pg.f0> f8985e;

    public ag(WebViewSettings webViewSettings, eh.l lVar, List list, x0.n1 n1Var, boolean z10) {
        this.f8981a = list;
        this.f8982b = z10;
        this.f8983c = webViewSettings;
        this.f8984d = n1Var;
        this.f8985e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.q
    public final pg.f0 b(t0.a3 a3Var, x0.j jVar, Integer num) {
        x0.n1<Boolean> n1Var;
        t0.a3 ExposedDropdownMenuBox = a3Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(ExposedDropdownMenuBox, "$this$ExposedDropdownMenuBox");
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? jVar2.K(ExposedDropdownMenuBox) : jVar2.l(ExposedDropdownMenuBox) ? 4 : 2;
        }
        int i10 = iIntValue;
        if ((i10 & 19) != 18 || !jVar2.s()) {
            List<pg.n<Integer, String>> list = this.f8981a;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                pg.n nVar = (pg.n) it.next();
                if (((Number) nVar.f21469a).intValue() == this.f8983c.getMixedContentMode()) {
                    String str = (String) nVar.f21470b;
                    androidx.compose.ui.d dVarD = ExposedDropdownMenuBox.d(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), this.f8982b);
                    jVar2.L(1761074920);
                    Object objG = jVar2.g();
                    j.a.C0321a c0321a = j.a.f31715a;
                    if (objG == c0321a) {
                        objG = new com.basitce.htmltoapk.data.apkgenerator.h(1);
                        jVar2.C(objG);
                    }
                    jVar2.B();
                    x0.n1<Boolean> n1Var2 = this.f8984d;
                    t0.w9.a(str, (eh.l) objG, dVarD, this.f8982b, true, null, null, null, null, f1.c.b(-1308632412, new wf(n1Var2), jVar2), null, null, false, null, null, null, false, 0, 0, null, null, jVar2, 805330992, 0, 8388064);
                    boolean zBooleanValue = n1Var2.getValue().booleanValue();
                    jVar2.L(1761088735);
                    Object objG2 = jVar2.g();
                    if (objG2 == c0321a) {
                        n1Var = n1Var2;
                        objG2 = new vf(n1Var, 0);
                        jVar2.C(objG2);
                    } else {
                        n1Var = n1Var2;
                    }
                    jVar2.B();
                    q8.g.c(ExposedDropdownMenuBox, zBooleanValue, (eh.a) objG2, f1.c.b(883255853, new zf(this.f8983c, this.f8985e, list, n1Var, this.f8982b), jVar2), jVar2, 3456 | (i10 & 14));
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        jVar2.v();
        return pg.f0.f21461a;
    }
}
