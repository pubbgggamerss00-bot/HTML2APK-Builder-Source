package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a72 extends g42 {

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f2597z = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: u, reason: collision with root package name */
    public final int f2598u;

    /* renamed from: v, reason: collision with root package name */
    public final g42 f2599v;

    /* renamed from: w, reason: collision with root package name */
    public final g42 f2600w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2601x;

    /* renamed from: y, reason: collision with root package name */
    public final int f2602y;

    public a72(g42 g42Var, g42 g42Var2) {
        this.f2599v = g42Var;
        this.f2600w = g42Var2;
        int iG = g42Var.g();
        this.f2601x = iG;
        this.f2598u = g42Var2.g() + iG;
        this.f2602y = Math.max(g42Var.i(), g42Var2.i()) + 1;
    }

    public static int u(int i6) {
        if (i6 >= 47) {
            return Integer.MAX_VALUE;
        }
        return f2597z[i6];
    }

    @Override // com.google.android.gms.internal.ads.g42
    public final byte d(int i6) {
        g42.t(i6, this.f2598u);
        return e(i6);
    }

    @Override // com.google.android.gms.internal.ads.g42
    public final byte e(int i6) {
        int i7 = this.f2601x;
        return i6 < i7 ? this.f2599v.e(i6) : this.f2600w.e(i6 - i7);
    }

    @Override // com.google.android.gms.internal.ads.g42
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g42) {
            g42 g42Var = (g42) obj;
            int iG = g42Var.g();
            int i6 = this.f2598u;
            if (i6 == iG) {
                if (i6 == 0) {
                    return true;
                }
                int i7 = this.s;
                int i8 = g42Var.s;
                if (i7 == 0 || i8 == 0 || i7 == i8) {
                    z62 z62Var = new z62(this);
                    d42 next = z62Var.next();
                    z62 z62Var2 = new z62(g42Var);
                    d42 next2 = z62Var2.next();
                    int i9 = 0;
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        int iG2 = next.g() - i9;
                        int iG3 = next2.g() - i10;
                        int iMin = Math.min(iG2, iG3);
                        if (!(i9 == 0 ? next.u(next2, i10, iMin) : next2.u(next, i9, iMin))) {
                            break;
                        }
                        i11 += iMin;
                        if (i11 >= i6) {
                            if (i11 == i6) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (iMin == iG2) {
                            next = z62Var.next();
                            i9 = 0;
                        } else {
                            i9 += iMin;
                        }
                        if (iMin == iG3) {
                            next2 = z62Var2.next();
                            i10 = 0;
                        } else {
                            i10 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.g42
    public final int g() {
        return this.f2598u;
    }

    @Override // com.google.android.gms.internal.ads.g42
    public final void h(int i6, byte[] bArr, int i7, int i8) {
        int i9 = i6 + i8;
        g42 g42Var = this.f2599v;
        int i10 = this.f2601x;
        if (i9 <= i10) {
            g42Var.h(i6, bArr, i7, i8);
            return;
        }
        g42 g42Var2 = this.f2600w;
        if (i6 >= i10) {
            g42Var2.h(i6 - i10, bArr, i7, i8);
            return;
        }
        int i11 = i10 - i6;
        g42Var.h(i6, bArr, i7, i11);
        g42Var2.h(0, bArr, i7 + i11, i8 - i11);
    }

    @Override // com.google.android.gms.internal.ads.g42
    public final int i() {
        return this.f2602y;
    }

    @Override // com.google.android.gms.internal.ads.g42, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new x62(this);
    }

    @Override // com.google.android.gms.internal.ads.g42
    public final boolean j() {
        return this.f2598u >= u(this.f2602y);
    }

    @Override // com.google.android.gms.internal.ads.g42
    public final int k(int i6, int i7, int i8) {
        int i9 = i7 + i8;
        g42 g42Var = this.f2599v;
        int i10 = this.f2601x;
        if (i9 <= i10) {
            return g42Var.k(i6, i7, i8);
        }
        g42 g42Var2 = this.f2600w;
        if (i7 >= i10) {
            return g42Var2.k(i6, i7 - i10, i8);
        }
        int i11 = i10 - i7;
        return g42Var2.k(g42Var.k(i6, i7, i11), 0, i8 - i11);
    }

    @Override // com.google.android.gms.internal.ads.g42
    public final g42 l(int i6, int i7) {
        int i8 = this.f2598u;
        int iP = g42.p(i6, i7, i8);
        if (iP == 0) {
            return g42.f4896t;
        }
        if (iP == i8) {
            return this;
        }
        g42 g42Var = this.f2599v;
        int i9 = this.f2601x;
        if (i7 <= i9) {
            return g42Var.l(i6, i7);
        }
        g42 g42Var2 = this.f2600w;
        if (i6 < i9) {
            return new a72(g42Var.l(i6, g42Var.g()), g42Var2.l(0, i7 - i9));
        }
        return g42Var2.l(i6 - i9, i7 - i9);
    }

    @Override // com.google.android.gms.internal.ads.g42
    public final k42 m() {
        d42 d42Var;
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.f2602y);
        arrayDeque.push(this);
        g42 g42Var = this.f2599v;
        while (g42Var instanceof a72) {
            a72 a72Var = (a72) g42Var;
            arrayDeque.push(a72Var);
            g42Var = a72Var.f2599v;
        }
        d42 d42Var2 = (d42) g42Var;
        while (true) {
            if (!(d42Var2 != null)) {
                int size = arrayList.size();
                int i6 = 0;
                int iRemaining = 0;
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ByteBuffer byteBuffer = (ByteBuffer) obj;
                    iRemaining += byteBuffer.remaining();
                    i6 = byteBuffer.hasArray() ? i6 | 1 : byteBuffer.isDirect() ? i6 | 2 : i6 | 4;
                }
                if (i6 == 2) {
                    return new i42(iRemaining, arrayList);
                }
                v52 v52Var = new v52();
                v52Var.s = arrayList.iterator();
                v52Var.f9713u = 0;
                int size2 = arrayList.size();
                int i8 = 0;
                while (i8 < size2) {
                    Object obj2 = arrayList.get(i8);
                    i8++;
                    v52Var.f9713u++;
                }
                v52Var.f9714v = -1;
                if (!v52Var.b()) {
                    v52Var.f9712t = s52.f8803c;
                    v52Var.f9714v = 0;
                    v52Var.f9715w = 0;
                    v52Var.A = 0L;
                }
                return new j42(v52Var);
            }
            if (d42Var2 == null) {
                throw new NoSuchElementException();
            }
            while (true) {
                if (arrayDeque.isEmpty()) {
                    d42Var = null;
                    break;
                }
                g42 g42Var2 = ((a72) arrayDeque.pop()).f2600w;
                while (g42Var2 instanceof a72) {
                    a72 a72Var2 = (a72) g42Var2;
                    arrayDeque.push(a72Var2);
                    g42Var2 = a72Var2.f2599v;
                }
                d42Var = (d42) g42Var2;
                if (d42Var.g() != 0) {
                    break;
                }
            }
            arrayList.add(d42Var2.n());
            d42Var2 = d42Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.g42
    public final void o(p42 p42Var) {
        this.f2599v.o(p42Var);
        this.f2600w.o(p42Var);
    }

    @Override // com.google.android.gms.internal.ads.g42
    /* renamed from: q */
    public final up1 iterator() {
        return new x62(this);
    }
}
