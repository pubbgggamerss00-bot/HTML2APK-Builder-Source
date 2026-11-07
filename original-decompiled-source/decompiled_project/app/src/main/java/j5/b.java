package j5;

import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import eh.l;
import java.util.Arrays;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class b implements z0.c {

    /* renamed from: a, reason: collision with root package name */
    public final e<?>[] f15160a;

    public b(e<?>... initializers) {
        r.e(initializers, "initializers");
        this.f15160a = initializers;
    }

    @Override // androidx.lifecycle.z0.c
    public final w0 b(Class cls, d dVar) {
        w0 w0Var;
        e eVar;
        l<a, T> lVar;
        h hVarA = h0.a(cls);
        e<?>[] eVarArr = this.f15160a;
        e[] initializers = (e[]) Arrays.copyOf(eVarArr, eVarArr.length);
        r.e(initializers, "initializers");
        int length = initializers.length;
        int i10 = 0;
        while (true) {
            w0Var = null;
            if (i10 >= length) {
                eVar = null;
                break;
            }
            eVar = initializers[i10];
            if (eVar.f15162a.equals(hVarA)) {
                break;
            }
            i10++;
        }
        if (eVar != null && (lVar = eVar.f15163b) != 0) {
            w0Var = (w0) lVar.invoke(dVar);
        }
        if (w0Var != null) {
            return w0Var;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + hVarA.a()).toString());
    }
}
