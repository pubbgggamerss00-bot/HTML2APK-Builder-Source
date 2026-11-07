package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class g42 implements Iterable<Byte>, Serializable {

    /* renamed from: t, reason: collision with root package name */
    public static final e42 f4896t = new e42(s52.f8802b);
    public int s = 0;

    static {
        int i6 = w32.f10030a;
    }

    public static g42 f(Iterator it, int i6) {
        if (i6 <= 0) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.s0.a(i6, "length (", ") must be >= 1"));
        }
        if (i6 == 1) {
            return (g42) it.next();
        }
        int i7 = i6 >>> 1;
        g42 g42VarF = f(it, i7);
        g42 g42VarF2 = f(it, i6 - i7);
        if (Integer.MAX_VALUE - g42VarF.g() < g42VarF2.g()) {
            throw new IllegalArgumentException(androidx.camera.view.g.e("ByteString would be too long: ", g42VarF.g(), g42VarF2.g(), "+"));
        }
        if (g42VarF2.g() == 0) {
            return g42VarF;
        }
        if (g42VarF.g() == 0) {
            return g42VarF2;
        }
        int iG = g42VarF2.g() + g42VarF.g();
        if (iG < 128) {
            int iG2 = g42VarF.g();
            int iG3 = g42VarF2.g();
            int i8 = iG2 + iG3;
            byte[] bArr = new byte[i8];
            p(0, iG2, g42VarF.g());
            p(0, iG2, i8);
            if (iG2 > 0) {
                g42VarF.h(0, bArr, 0, iG2);
            }
            p(0, iG3, g42VarF2.g());
            p(iG2, i8, i8);
            if (iG3 > 0) {
                g42VarF2.h(0, bArr, iG2, iG3);
            }
            return new e42(bArr);
        }
        if (g42VarF instanceof a72) {
            a72 a72Var = (a72) g42VarF;
            g42 g42Var = a72Var.f2599v;
            g42 g42Var2 = a72Var.f2600w;
            if (g42VarF2.g() + g42Var2.g() < 128) {
                int iG4 = g42Var2.g();
                int iG5 = g42VarF2.g();
                int i9 = iG4 + iG5;
                byte[] bArr2 = new byte[i9];
                p(0, iG4, g42Var2.g());
                p(0, iG4, i9);
                if (iG4 > 0) {
                    g42Var2.h(0, bArr2, 0, iG4);
                }
                p(0, iG5, g42VarF2.g());
                p(iG4, i9, i9);
                if (iG5 > 0) {
                    g42VarF2.h(0, bArr2, iG4, iG5);
                }
                return new a72(g42Var, new e42(bArr2));
            }
            if (g42Var.i() > g42Var2.i() && a72Var.f2602y > g42VarF2.i()) {
                return new a72(g42Var, new a72(g42Var2, g42VarF2));
            }
        }
        if (iG >= a72.u(Math.max(g42VarF.i(), g42VarF2.i()) + 1)) {
            return new a72(g42VarF, g42VarF2);
        }
        y62 y62Var = new y62();
        y62Var.a(g42VarF);
        y62Var.a(g42VarF2);
        ArrayDeque arrayDeque = y62Var.f10874a;
        g42 a72Var2 = (g42) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            a72Var2 = new a72((g42) arrayDeque.pop(), a72Var2);
        }
        return a72Var2;
    }

    public static int p(int i6, int i7, int i8) {
        int i9 = i7 - i6;
        if ((i6 | i7 | i9 | (i8 - i7)) >= 0) {
            return i9;
        }
        if (i6 < 0) {
            throw new IndexOutOfBoundsException(androidx.camera.camera2.internal.s0.a(i6, "Beginning index: ", " < 0"));
        }
        if (i7 < i6) {
            throw new IndexOutOfBoundsException(androidx.camera.view.g.e("Beginning index larger than ending index: ", i6, i7, ", "));
        }
        throw new IndexOutOfBoundsException(androidx.camera.view.g.e("End index: ", i7, i8, " >= "));
    }

    public static g42 r(ArrayList arrayList) {
        int size;
        if (arrayList == null) {
            int size2 = arrayList.size();
            size = 0;
            int i6 = 0;
            while (i6 < size2) {
                arrayList.get(i6);
                i6++;
                size++;
            }
        } else {
            size = arrayList.size();
        }
        return size == 0 ? f4896t : f(arrayList.iterator(), size);
    }

    public static e42 s(int i6, int i7, byte[] bArr) {
        p(i6, i6 + i7, bArr.length);
        byte[] bArr2 = new byte[i7];
        System.arraycopy(bArr, i6, bArr2, 0, i7);
        return new e42(bArr2);
    }

    public static void t(int i6, int i7) {
        if (((i7 - (i6 + 1)) | i6) < 0) {
            if (i6 >= 0) {
                throw new ArrayIndexOutOfBoundsException(androidx.camera.view.g.e("Index > length: ", i6, i7, ", "));
            }
            throw new ArrayIndexOutOfBoundsException(androidx.camera.camera2.internal.compat.workaround.c.d(i6, "Index < 0: "));
        }
    }

    public final byte[] c() {
        int iG = g();
        if (iG == 0) {
            return s52.f8802b;
        }
        byte[] bArr = new byte[iG];
        h(0, bArr, 0, iG);
        return bArr;
    }

    public abstract byte d(int i6);

    public abstract byte e(int i6);

    public abstract boolean equals(Object obj);

    public abstract int g();

    public abstract void h(int i6, byte[] bArr, int i7, int i8);

    public final int hashCode() {
        int iK = this.s;
        if (iK == 0) {
            int iG = g();
            iK = k(iG, 0, iG);
            if (iK == 0) {
                iK = 1;
            }
            this.s = iK;
        }
        return iK;
    }

    public abstract int i();

    public abstract boolean j();

    public abstract int k(int i6, int i7, int i8);

    public abstract g42 l(int i6, int i7);

    public abstract k42 m();

    public abstract ByteBuffer n();

    public abstract void o(p42 p42Var);

    @Override // java.lang.Iterable
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public up1 iterator() {
        return new b42(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iG = g();
        String strF = g() <= 50 ? iu1.f(this) : iu1.f(l(0, 47)).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iG);
        sb.append(" contents=\"");
        return androidx.activity.m.e(sb, strF, "\">");
    }
}
