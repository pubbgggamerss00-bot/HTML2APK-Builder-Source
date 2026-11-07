package jh;

import java.util.NoSuchElementException;
import qg.h0;

/* loaded from: classes2.dex */
public final class f extends h0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f15747a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15748b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15749c;

    /* renamed from: d, reason: collision with root package name */
    public int f15750d;

    public f(int i10, int i11, int i12) {
        this.f15747a = i12;
        this.f15748b = i11;
        boolean z10 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z10 = true;
        }
        this.f15749c = z10;
        this.f15750d = z10 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15749c;
    }

    @Override // qg.h0
    public final int nextInt() {
        int i10 = this.f15750d;
        if (i10 != this.f15748b) {
            this.f15750d = this.f15747a + i10;
            return i10;
        }
        if (!this.f15749c) {
            throw new NoSuchElementException();
        }
        this.f15749c = false;
        return i10;
    }
}
