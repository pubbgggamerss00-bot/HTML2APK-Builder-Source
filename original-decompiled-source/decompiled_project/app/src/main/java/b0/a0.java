package b0;

import java.util.Arrays;
import java.util.List;
import x0.j;

/* loaded from: classes.dex */
public final class a0 {
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int a(int i10, int i11, int i12, boolean z10) {
        if (i11 >= i12) {
            if (z10) {
                return 0;
            }
            return i12 - i11;
        }
        if (z10) {
            if (z10) {
                if (z10) {
                }
            } else if (z10) {
            }
        } else {
            if (z10 ? i12 - i11 <= i10 : i11 > i10) {
                if (z10) {
                    return i12 - i11;
                }
                return 0;
            }
            if (z10) {
                return i10 - i11;
            }
        }
        return i10;
    }

    public static final boolean b(long j10, long j11) {
        return j10 == j11;
    }

    public static final String c(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final Object d(Object[] objArr, g1.l lVar, eh.a aVar, x0.j jVar, int i10, int i11) {
        Object[] objArr2;
        Object obj;
        Object objC;
        if ((i11 & 2) != 0) {
            lVar = g1.m.f11307a;
        }
        g1.l lVar2 = lVar;
        int iD = jVar.D();
        g8.w.h(36);
        String string = Integer.toString(iD, 36);
        kotlin.jvm.internal.r.d(string, "toString(...)");
        kotlin.jvm.internal.r.c(lVar2, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        g1.i iVar = (g1.i) jVar.f(g1.k.f11305a);
        Object objG = jVar.g();
        Object obj2 = j.a.f31715a;
        if (objG == obj2) {
            Object objA = (iVar == null || (objC = iVar.c(string)) == null) ? null : lVar2.a(objC);
            if (objA == null) {
                objA = aVar.invoke();
            }
            objArr2 = objArr;
            Object cVar = new g1.c(lVar2, iVar, string, objA, objArr2);
            jVar.C(cVar);
            objG = cVar;
        } else {
            objArr2 = objArr;
        }
        g1.c cVar2 = (g1.c) objG;
        Object objInvoke = Arrays.equals(objArr2, cVar2.f11280e) ? cVar2.f11279d : null;
        if (objInvoke == null) {
            objInvoke = aVar.invoke();
        }
        boolean zL = jVar.l(cVar2) | jVar.l(lVar2) | jVar.l(iVar) | jVar.K(string) | jVar.l(objInvoke) | jVar.l(objArr2);
        Object objG2 = jVar.g();
        if (zL || objG2 == obj2) {
            Object[] objArr3 = objArr2;
            obj = objInvoke;
            Object bVar = new g1.b(cVar2, lVar2, iVar, string, obj, objArr3);
            jVar.C(bVar);
            objG2 = bVar;
        } else {
            obj = objInvoke;
        }
        x0.l0 l0Var = x0.o0.f31834a;
        jVar.u((eh.a) objG2);
        return obj;
    }

    public static final int e(z zVar) {
        List<n> listI = zVar.i();
        int size = listI.size();
        int size2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            size2 += listI.get(i10).getSize();
        }
        return zVar.g() + (size2 / listI.size());
    }
}
