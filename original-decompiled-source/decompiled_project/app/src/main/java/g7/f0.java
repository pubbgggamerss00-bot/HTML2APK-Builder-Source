package g7;

import android.content.Context;
import g7.e0;
import g7.j;
import g7.p;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements e0.a {
    @Override // g7.e0.a
    public final t a(Context context) {
        p.a aVar = new p.a(context);
        j.b<pg.f0> bVar = g0.f11501b;
        pg.f0 f0Var = pg.f0.f21461a;
        LinkedHashMap linkedHashMap = aVar.f11519d.f11511a;
        if (f0Var != null) {
            linkedHashMap.put(bVar, f0Var);
        } else {
            linkedHashMap.remove(bVar);
        }
        return aVar.a();
    }
}
