package ne;

import java.util.Set;
import sd.y;
import sd.z;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements sd.d {
    @Override // sd.d
    public final Object b(z zVar) {
        Set setB = zVar.b(y.a(e.class));
        d dVar = d.f18799b;
        if (dVar == null) {
            synchronized (d.class) {
                try {
                    dVar = d.f18799b;
                    if (dVar == null) {
                        dVar = new d();
                        d.f18799b = dVar;
                    }
                } finally {
                }
            }
        }
        return new c(setB, dVar);
    }
}
