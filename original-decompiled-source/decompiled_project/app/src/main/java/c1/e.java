package c1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class e<K, V, T> implements Iterator<T>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final u<K, V, T>[] f4559a;

    /* renamed from: b, reason: collision with root package name */
    public int f4560b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4561c = true;

    public e(t<K, V> tVar, u<K, V, T>[] uVarArr) {
        this.f4559a = uVarArr;
        uVarArr[0].c(tVar.f4583d, Integer.bitCount(tVar.f4580a) * 2, 0);
        this.f4560b = 0;
        c();
    }

    public final void c() {
        int i10 = this.f4560b;
        u<K, V, T>[] uVarArr = this.f4559a;
        u<K, V, T> uVar = uVarArr[i10];
        if (uVar.f4588c < uVar.f4587b) {
            return;
        }
        while (-1 < i10) {
            int iE = e(i10);
            if (iE == -1) {
                u<K, V, T> uVar2 = uVarArr[i10];
                int i11 = uVar2.f4588c;
                Object[] objArr = uVar2.f4586a;
                if (i11 < objArr.length) {
                    int length = objArr.length;
                    uVar2.f4588c = i11 + 1;
                    iE = e(i10);
                }
            }
            if (iE != -1) {
                this.f4560b = iE;
                return;
            }
            if (i10 > 0) {
                u<K, V, T> uVar3 = uVarArr[i10 - 1];
                int i12 = uVar3.f4588c;
                int length2 = uVar3.f4586a.length;
                uVar3.f4588c = i12 + 1;
            }
            uVarArr[i10].c(t.f4579e.f4583d, 0, 0);
            i10--;
        }
        this.f4561c = false;
    }

    public final int e(int i10) {
        u<K, V, T>[] uVarArr = this.f4559a;
        u<K, V, T> uVar = uVarArr[i10];
        int i11 = uVar.f4588c;
        if (i11 < uVar.f4587b) {
            return i10;
        }
        Object[] objArr = uVar.f4586a;
        if (i11 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i11];
        kotlin.jvm.internal.r.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        t tVar = (t) obj;
        if (i10 == 6) {
            u<K, V, T> uVar2 = uVarArr[i10 + 1];
            Object[] objArr2 = tVar.f4583d;
            uVar2.c(objArr2, objArr2.length, 0);
        } else {
            uVarArr[i10 + 1].c(tVar.f4583d, Integer.bitCount(tVar.f4580a) * 2, 0);
        }
        return e(i10 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4561c;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!this.f4561c) {
            throw new NoSuchElementException();
        }
        T next = this.f4559a[this.f4560b].next();
        c();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
