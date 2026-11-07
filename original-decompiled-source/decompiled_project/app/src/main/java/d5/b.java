package d5;

import android.util.Log;
import c5.b0;
import c5.h;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7368a = a.f7369a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7369a;

        static {
            a aVar = new a();
            new LinkedHashMap();
            f7369a = aVar;
        }
    }

    public static a a(h hVar) {
        while (hVar != null) {
            if (hVar.f4890v != null && hVar.f4882l) {
                hVar.i();
            }
            hVar = hVar.f4892x;
        }
        return f7368a;
    }

    public static void b(d dVar) {
        if (b0.G(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(dVar.f7370a.getClass().getName()), dVar);
        }
    }

    public static final void c(h hVar, String previousFragmentId) {
        r.e(previousFragmentId, "previousFragmentId");
        b(new d5.a(hVar, "Attempting to reuse fragment " + hVar + " with previous ID " + previousFragmentId));
        a(hVar).getClass();
    }
}
