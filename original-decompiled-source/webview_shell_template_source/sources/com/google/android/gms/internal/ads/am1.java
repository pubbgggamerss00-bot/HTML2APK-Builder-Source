package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class am1 implements Iterator {
    public String s;

    /* renamed from: u, reason: collision with root package name */
    public final CharSequence f2798u;

    /* renamed from: t, reason: collision with root package name */
    public int f2797t = 2;

    /* renamed from: v, reason: collision with root package name */
    public int f2799v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f2800w = Integer.MAX_VALUE;

    public am1(CharSequence charSequence) {
        this.f2798u = charSequence;
    }

    public abstract int a(int i6);

    public abstract int b(int i6);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int iA;
        int i6 = this.f2797t;
        if (i6 == 4) {
            throw new IllegalStateException();
        }
        int i7 = i6 - 1;
        String string = null;
        if (i6 == 0) {
            throw null;
        }
        if (i7 == 0) {
            return true;
        }
        if (i7 != 2) {
            this.f2797t = 4;
            int i8 = this.f2799v;
            while (true) {
                int i9 = this.f2799v;
                if (i9 == -1) {
                    this.f2797t = 3;
                    break;
                }
                int iB = b(i9);
                CharSequence charSequence = this.f2798u;
                if (iB == -1) {
                    iB = charSequence.length();
                    this.f2799v = -1;
                    iA = -1;
                } else {
                    iA = a(iB);
                    this.f2799v = iA;
                }
                if (iA == i8) {
                    int i10 = iA + 1;
                    this.f2799v = i10;
                    if (i10 > charSequence.length()) {
                        this.f2799v = -1;
                    }
                } else {
                    if (i8 < iB) {
                        charSequence.charAt(i8);
                    }
                    if (i8 < iB) {
                        charSequence.charAt(iB - 1);
                    }
                    int i11 = this.f2800w;
                    if (i11 == 1) {
                        iB = charSequence.length();
                        this.f2799v = -1;
                        if (iB > i8) {
                            charSequence.charAt(iB - 1);
                        }
                    } else {
                        this.f2800w = i11 - 1;
                    }
                    string = charSequence.subSequence(i8, iB).toString();
                }
            }
            this.s = string;
            if (this.f2797t != 3) {
                this.f2797t = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f2797t = 2;
        String str = this.s;
        this.s = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
