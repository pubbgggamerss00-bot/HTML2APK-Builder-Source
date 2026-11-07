package h1;

import android.view.KeyEvent;
import x0.j;
import x0.n1;
import x0.o0;

/* loaded from: classes.dex */
public final class m {
    public static final boolean a(int i10, KeyEvent keyEvent) {
        return ((int) (a2.d.a(keyEvent) >> 32)) == i10;
    }

    public static final int b(long[] jArr, long j10) {
        int length = jArr.length - 1;
        int i10 = 0;
        while (i10 <= length) {
            int i11 = (i10 + length) >>> 1;
            long j11 = jArr[i11];
            if (j10 > j11) {
                i10 = i11 + 1;
            } else {
                if (j10 >= j11) {
                    return i11;
                }
                length = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static void c(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(j2.y.a(i11, "at index "));
            }
        }
    }

    public static final n1 d(x.m mVar, x0.j jVar, int i10) {
        Object objG = jVar.g();
        j.a.C0321a c0321a = j.a.f31715a;
        if (objG == c0321a) {
            objG = bg.b.h(Boolean.FALSE);
            jVar.C(objG);
        }
        n1 n1Var = (n1) objG;
        boolean z10 = (((i10 & 14) ^ 6) > 4 && jVar.K(mVar)) || (i10 & 6) == 4;
        Object objG2 = jVar.g();
        if (z10 || objG2 == c0321a) {
            objG2 = new x.p(mVar, n1Var, null);
            jVar.C(objG2);
        }
        o0.d((eh.p) objG2, mVar, jVar);
        return n1Var;
    }
}
