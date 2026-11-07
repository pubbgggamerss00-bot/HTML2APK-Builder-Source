package u6;

import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final gb.h f29360a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f29361b = new Object();

    public y(gb.h hVar) {
        this.f29360a = hVar;
    }

    public final boolean a(c7.j jVar) {
        boolean zContainsKey;
        synchronized (this.f29361b) {
            zContainsKey = ((LinkedHashMap) this.f29360a.f11912a).containsKey(jVar);
        }
        return zContainsKey;
    }

    public final List<x> b(String workSpecId) {
        List<x> listB;
        kotlin.jvm.internal.r.e(workSpecId, "workSpecId");
        synchronized (this.f29361b) {
            listB = this.f29360a.b(workSpecId);
        }
        return listB;
    }

    public final x c(c7.j id2) {
        x xVarC;
        kotlin.jvm.internal.r.e(id2, "id");
        synchronized (this.f29361b) {
            xVarC = this.f29360a.c(id2);
        }
        return xVarC;
    }

    public final x d(c7.j jVar) {
        x xVarD;
        synchronized (this.f29361b) {
            xVarD = this.f29360a.d(jVar);
        }
        return xVarD;
    }
}
