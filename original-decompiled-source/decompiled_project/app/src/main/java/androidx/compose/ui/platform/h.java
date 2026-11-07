package androidx.compose.ui.platform;

import android.view.View;
import com.basitce.htmltoapk.R;
import eh.p;
import java.util.Set;
import kotlin.jvm.internal.s;
import pg.f0;
import x0.j;
import x0.o0;
import x0.y;

/* loaded from: classes.dex */
public final class h extends s implements p<j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f1364a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p<j, Integer, f0> f1365b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(i iVar, p<? super j, ? super Integer, f0> pVar) {
        super(2);
        this.f1364a = iVar;
        this.f1365b = pVar;
    }

    @Override // eh.p
    public final f0 invoke(j jVar, Integer num) {
        j jVar2 = jVar;
        int iIntValue = num.intValue();
        if (jVar2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            i iVar = this.f1364a;
            AndroidComposeView androidComposeView = iVar.f1366a;
            Object tag = androidComposeView.getTag(R.id.inspection_slot_table_set);
            Set set = (!(tag instanceof Set) || ((tag instanceof fh.a) && !(tag instanceof fh.d))) ? null : (Set) tag;
            if (set == null) {
                Object parent = androidComposeView.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                set = (!(tag2 instanceof Set) || ((tag2 instanceof fh.a) && !(tag2 instanceof fh.d))) ? null : (Set) tag2;
            }
            if (set != null) {
                set.add(jVar2.k());
                jVar2.a();
            }
            boolean zL = jVar2.l(iVar);
            Object objG = jVar2.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (zL || objG == c0321a) {
                objG = new e(iVar, null);
                jVar2.C(objG);
            }
            o0.d((p) objG, androidComposeView, jVar2);
            boolean zL2 = jVar2.l(iVar);
            Object objG2 = jVar2.g();
            if (zL2 || objG2 == c0321a) {
                objG2 = new f(iVar, null);
                jVar2.C(objG2);
            }
            o0.d((p) objG2, androidComposeView, jVar2);
            y.a(i1.b.f13759a.a(set), f1.c.b(-1193460702, new g(iVar, this.f1365b), jVar2), jVar2, 56);
        } else {
            jVar2.v();
        }
        return f0.f21461a;
    }
}
