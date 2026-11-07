package y3;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final b.e f33869a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<o> f33870b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f33871c = new HashMap();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.lifecycle.l f33872a;

        /* renamed from: b, reason: collision with root package name */
        public androidx.lifecycle.r f33873b;

        public a(androidx.lifecycle.l lVar, androidx.lifecycle.r rVar) {
            this.f33872a = lVar;
            this.f33873b = rVar;
            lVar.a(rVar);
        }
    }

    public n(b.e eVar) {
        this.f33869a = eVar;
    }

    public final void a(o oVar) {
        this.f33870b.remove(oVar);
        a aVar = (a) this.f33871c.remove(oVar);
        if (aVar != null) {
            aVar.f33872a.c(aVar.f33873b);
            aVar.f33873b = null;
        }
        this.f33869a.run();
    }
}
