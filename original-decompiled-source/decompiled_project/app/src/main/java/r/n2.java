package r;

import android.view.ViewConfiguration;
import x0.j;

/* loaded from: classes.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f22893a = ViewConfiguration.getScrollFriction();

    public static final s.y a(x0.j jVar) {
        f3.d dVar = (f3.d) jVar.f(j2.j2.f14779h);
        boolean zH = jVar.h(dVar.getDensity());
        Object objG = jVar.g();
        if (zH || objG == j.a.f31715a) {
            objG = new s.z(new m2(dVar));
            jVar.C(objG);
        }
        return (s.y) objG;
    }
}
