package k5;

import androidx.lifecycle.a1;
import androidx.lifecycle.b1;
import androidx.lifecycle.i;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.r;
import x0.j;

/* loaded from: classes.dex */
public final class c {
    public static final w0 a(b1 b1Var, h hVar, z0.c cVar, j5.a extras) {
        z0 z0VarA;
        if (cVar != null) {
            a1 store = b1Var.getViewModelStore();
            r.e(store, "store");
            r.e(extras, "extras");
            z0VarA = new z0(store, cVar, extras);
        } else if (b1Var instanceof i) {
            a1 store2 = b1Var.getViewModelStore();
            z0.c factory = ((i) b1Var).getDefaultViewModelProviderFactory();
            r.e(store2, "store");
            r.e(factory, "factory");
            r.e(extras, "extras");
            z0VarA = new z0(store2, factory, extras);
        } else {
            z0VarA = z0.b.a(b1Var, null, 6);
        }
        return z0VarA.a(hVar);
    }

    public static final w0 b(Class cls, b1 b1Var, ig.b bVar, j5.a aVar, j jVar) {
        return a(b1Var, h0.a(cls), bVar, aVar);
    }
}
