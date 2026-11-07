package jh;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class b implements Iterator, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f15738a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15739b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15740c;

    /* renamed from: d, reason: collision with root package name */
    public int f15741d;

    public b(char c10, char c11, int i10) {
        this.f15738a = i10;
        this.f15739b = c11;
        boolean z10 = false;
        if (i10 <= 0 ? r.f(c10, c11) >= 0 : r.f(c10, c11) <= 0) {
            z10 = true;
        }
        this.f15740c = z10;
        this.f15741d = z10 ? c10 : c11;
    }

    public final char c() {
        int i10 = this.f15741d;
        if (i10 != this.f15739b) {
            this.f15741d = this.f15738a + i10;
        } else {
            if (!this.f15740c) {
                throw new NoSuchElementException();
            }
            this.f15740c = false;
        }
        return (char) i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15740c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(c());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
