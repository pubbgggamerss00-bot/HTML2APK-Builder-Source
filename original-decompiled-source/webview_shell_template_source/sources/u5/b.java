package u5;

import e5.v;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b extends v {
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public final int f14722t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f14723u;

    /* renamed from: v, reason: collision with root package name */
    public int f14724v;

    public b(int i6, int i7, int i8) {
        this.s = i8;
        this.f14722t = i7;
        boolean z6 = false;
        if (i8 <= 0 ? i6 >= i7 : i6 <= i7) {
            z6 = true;
        }
        this.f14723u = z6;
        this.f14724v = z6 ? i6 : i7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14723u;
    }

    @Override // e5.v
    public final int nextInt() {
        int i6 = this.f14724v;
        if (i6 != this.f14722t) {
            this.f14724v = this.s + i6;
            return i6;
        }
        if (!this.f14723u) {
            throw new NoSuchElementException();
        }
        this.f14723u = false;
        return i6;
    }
}
