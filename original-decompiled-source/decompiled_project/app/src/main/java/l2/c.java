package l2;

import android.R;
import android.view.Menu;
import j2.e1;
import p1.e;
import pg.f0;
import pg.l;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final e1 f16692a;

    /* renamed from: b, reason: collision with root package name */
    public e f16693b = e.f21130e;

    /* renamed from: c, reason: collision with root package name */
    public eh.a<f0> f16694c = null;

    /* renamed from: d, reason: collision with root package name */
    public eh.a<f0> f16695d = null;

    /* renamed from: e, reason: collision with root package name */
    public eh.a<f0> f16696e = null;

    /* renamed from: f, reason: collision with root package name */
    public eh.a<f0> f16697f = null;

    /* renamed from: g, reason: collision with root package name */
    public eh.a<f0> f16698g = null;

    public c(e1 e1Var) {
        this.f16692a = e1Var;
    }

    public static void a(Menu menu, b bVar) {
        int i10;
        int i11 = bVar.f16690a;
        int i12 = bVar.f16691b;
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 0) {
            i10 = R.string.copy;
        } else if (iOrdinal == 1) {
            i10 = R.string.paste;
        } else if (iOrdinal == 2) {
            i10 = R.string.cut;
        } else if (iOrdinal == 3) {
            i10 = R.string.selectAll;
        } else {
            if (iOrdinal != 4) {
                throw new l();
            }
            i10 = R.string.autofill;
        }
        menu.add(0, i11, i12, i10).setShowAsAction(1);
    }

    public static void b(Menu menu, b bVar, eh.a aVar) {
        int i10 = bVar.f16690a;
        if (aVar != null && menu.findItem(i10) == null) {
            a(menu, bVar);
        } else {
            if (aVar != null || menu.findItem(i10) == null) {
                return;
            }
            menu.removeItem(i10);
        }
    }
}
