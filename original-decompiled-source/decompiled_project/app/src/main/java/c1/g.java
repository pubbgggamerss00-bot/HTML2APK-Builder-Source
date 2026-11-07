package c1;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m0;

/* loaded from: classes.dex */
public class g<K, V, T> extends e<K, V, T> {

    /* renamed from: d, reason: collision with root package name */
    public final f<K, V> f4568d;

    /* renamed from: e, reason: collision with root package name */
    public K f4569e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4570f;

    /* renamed from: g, reason: collision with root package name */
    public int f4571g;

    public g(f<K, V> fVar, u<K, V, T>[] uVarArr) {
        super(fVar.f4564c, uVarArr);
        this.f4568d = fVar;
        this.f4571g = fVar.f4566e;
    }

    public final void f(int i10, t<?, ?> tVar, K k10, int i11) {
        int i12 = i11 * 5;
        u<K, V, T>[] uVarArr = this.f4559a;
        if (i12 <= 30) {
            int iG = 1 << x.g(i10, i12);
            if (tVar.h(iG)) {
                uVarArr[i11].c(tVar.f4583d, Integer.bitCount(tVar.f4580a) * 2, tVar.f(iG));
                this.f4560b = i11;
                return;
            } else {
                int iT = tVar.t(iG);
                t<?, ?> tVarS = tVar.s(iT);
                uVarArr[i11].c(tVar.f4583d, Integer.bitCount(tVar.f4580a) * 2, iT);
                f(i10, tVarS, k10, i11 + 1);
                return;
            }
        }
        u<K, V, T> uVar = uVarArr[i11];
        Object[] objArr = tVar.f4583d;
        uVar.c(objArr, objArr.length, 0);
        while (true) {
            u<K, V, T> uVar2 = uVarArr[i11];
            if (kotlin.jvm.internal.r.a(uVar2.f4586a[uVar2.f4588c], k10)) {
                this.f4560b = i11;
                return;
            } else {
                uVarArr[i11].f4588c += 2;
            }
        }
    }

    @Override // c1.e, java.util.Iterator
    public final T next() {
        if (this.f4568d.f4566e != this.f4571g) {
            throw new ConcurrentModificationException();
        }
        if (!this.f4561c) {
            throw new NoSuchElementException();
        }
        u<K, V, T> uVar = this.f4559a[this.f4560b];
        this.f4569e = (K) uVar.f4586a[uVar.f4588c];
        this.f4570f = true;
        return (T) super.next();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c1.e, java.util.Iterator
    public final void remove() {
        if (!this.f4570f) {
            throw new IllegalStateException();
        }
        boolean z10 = this.f4561c;
        f<K, V> fVar = this.f4568d;
        if (!z10) {
            m0.a(fVar).remove(this.f4569e);
        } else {
            if (!z10) {
                throw new NoSuchElementException();
            }
            u<K, V, T> uVar = this.f4559a[this.f4560b];
            Object obj = uVar.f4586a[uVar.f4588c];
            m0.a(fVar).remove(this.f4569e);
            f(obj != null ? obj.hashCode() : 0, fVar.f4564c, obj, 0);
        }
        this.f4569e = null;
        this.f4570f = false;
        this.f4571g = fVar.f4566e;
    }
}
