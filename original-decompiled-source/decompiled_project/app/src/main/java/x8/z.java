package x8;

import com.basitce.htmltoapk.data.local.entity.FolderEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class z implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f33425a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f33426b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f33427c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f33428d;

    public /* synthetic */ z(x0.n1 n1Var, x0.n1 n1Var2, x0.n1 n1Var3, x0.n1 n1Var4) {
        this.f33425a = n1Var;
        this.f33426b = n1Var2;
        this.f33427c = n1Var3;
        this.f33428d = n1Var4;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    @Override // eh.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        float f10 = s.f33139a;
        x0.n1 n1Var = this.f33427c;
        List list = (List) n1Var.getValue();
        this.f33428d.setValue(null);
        if (list != null) {
            Iterable iterable = (Iterable) this.f33425a.getValue();
            ArrayList arrayList = new ArrayList(qg.p.h(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((FolderEntity) it.next()).getId()));
            }
            if (list.equals(arrayList)) {
                n1Var.setValue(null);
            } else {
                ((eh.l) this.f33426b.getValue()).invoke(list);
            }
        }
        return pg.f0.f21461a;
    }
}
