package e5;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import m5.d;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class b<T> implements Iterator<T>, q5.a {
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public File f12926t;

    public final boolean a() {
        File file;
        File fileA;
        this.s = 3;
        d.b bVar = (d.b) this;
        while (true) {
            ArrayDeque<d.c> arrayDeque = bVar.f13889u;
            d.c cVarPeek = arrayDeque.peek();
            if (cVarPeek == null) {
                file = null;
                break;
            }
            fileA = cVarPeek.a();
            if (fileA == null) {
                arrayDeque.pop();
            } else {
                if (fileA.equals(cVarPeek.f13899a) || !fileA.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                    break;
                }
                arrayDeque.push(bVar.b(fileA));
            }
        }
        file = fileA;
        if (file != null) {
            bVar.f12926t = file;
            bVar.s = 1;
        } else {
            bVar.s = 2;
        }
        return this.s == 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i6 = this.s;
        if (i6 == 0) {
            return a();
        }
        if (i6 == 1) {
            return true;
        }
        if (i6 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final T next() {
        int i6 = this.s;
        if (i6 == 1) {
            this.s = 0;
            return (T) this.f12926t;
        }
        if (i6 == 2 || !a()) {
            throw new NoSuchElementException();
        }
        this.s = 0;
        return (T) this.f12926t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
