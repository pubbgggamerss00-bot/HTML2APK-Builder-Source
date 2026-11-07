package c1;

import java.util.List;
import t2.b;

/* loaded from: classes.dex */
public final class x {
    public static final Object[] a(Object[] objArr, int i10, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        qg.m.i(objArr, 0, objArr2, i10, 6);
        qg.m.g(objArr, i10 + 2, objArr2, i10, objArr.length);
        objArr2[i10] = obj;
        objArr2[i10 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] b(int i10, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        qg.m.i(objArr, 0, objArr2, i10, 6);
        qg.m.g(objArr, i10, objArr2, i10 + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] c(int i10, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        qg.m.i(objArr, 0, objArr2, i10, 6);
        qg.m.g(objArr, i10, objArr2, i10 + 1, objArr.length);
        return objArr2;
    }

    public static final void d(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException((i10 != i11 ? r1.f.a(i10, i11, "Both size ", " and step ", " must be greater than zero.") : ad.b.b(i10, "size ", " must be greater than zero.")).toString());
        }
    }

    public static int e(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    public static final boolean f(t2.b bVar) {
        int length = bVar.f27761b.length();
        List<b.c<? extends b.a>> list = bVar.f27760a;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                b.c<? extends b.a> cVar = list.get(i10);
                if ((cVar.f27771a instanceof t2.i) && t2.e.b(0, length, cVar.f27772b, cVar.f27773c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final int g(int i10, int i11) {
        return (i10 >> i11) & 31;
    }
}
