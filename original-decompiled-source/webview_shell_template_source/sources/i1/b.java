package i1;

import android.util.Log;
import androidx.fragment.app.k;
import androidx.fragment.app.y;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f13340a = a.f13341a;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13341a;

        static {
            a aVar = new a();
            new LinkedHashMap();
            f13341a = aVar;
        }
    }

    public static a a(k kVar) {
        while (kVar != null) {
            if (kVar.K != null && kVar.C) {
                kVar.f();
            }
            kVar = kVar.M;
        }
        return f13340a;
    }

    public static void b(d dVar) {
        if (y.H(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(dVar.s.getClass().getName()), dVar);
        }
    }

    public static final void c(k kVar, String str) {
        j.e("fragment", kVar);
        j.e("previousFragmentId", str);
        b(new i1.a(kVar, "Attempting to reuse fragment " + kVar + " with previous ID " + str));
        a(kVar).getClass();
    }
}
