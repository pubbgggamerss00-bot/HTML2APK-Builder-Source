package s8;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import s.m2;

/* loaded from: classes.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public static final s.w f24621a = new s.w(0.2f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);

    /* renamed from: b, reason: collision with root package name */
    public static final Set<String> f24622b;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List<pg.t<e2, w1.d, w1.d>> list = b2.f24610a;
        ArrayList arrayList = new ArrayList(qg.p.h(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((e2) ((pg.t) it.next()).f21479a).f24627a);
        }
        f24622b = qg.x.h0(arrayList);
    }

    public static final boolean a(r.p<p5.s> pVar) {
        Set<String> set = f24622b;
        return qg.x.w(set, pVar.c().f21269b.f21235b.f24512e) && qg.x.w(set, pVar.e().f21269b.f21235b.f24512e);
    }

    public static final r.v1 b(r.p pVar, boolean z10, boolean z11) {
        kotlin.jvm.internal.r.e(pVar, "<this>");
        if (z10) {
            return r.w0.c(s.m.d(150, 0, null, 6), 2);
        }
        boolean zA = a(pVar);
        s.w wVar = f24621a;
        if (zA) {
            return r.w0.c(new m2(210, 90, s.d0.f23704b), 2).b(r.w0.e(s.m.d(300, 0, wVar, 2), 0.96f, 0L, 4));
        }
        return pVar.a(z11 ? 5 : 4, s.m.d(300, 0, wVar, 2), new c2()).b(r.w0.c(new m2(210, 90, s.d0.f23704b), 2));
    }

    public static final r.x1 c(r.p pVar, boolean z10, boolean z11) {
        kotlin.jvm.internal.r.e(pVar, "<this>");
        if (z10) {
            return r.w0.d(s.m.d(150, 0, null, 6), 2);
        }
        if (a(pVar)) {
            return r.w0.d(s.m.d(90, 0, s.d0.f23705c, 2), 2);
        }
        return pVar.b(z11 ? 5 : 4, s.m.d(300, 0, f24621a, 2), new b9.w0(1)).b(r.w0.d(s.m.d(90, 0, s.d0.f23705c, 2), 2));
    }
}
