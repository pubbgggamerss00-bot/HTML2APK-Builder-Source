package lh;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.r;
import pg.f0;
import pg.q;

/* loaded from: classes2.dex */
public final class h<T> extends i<T> implements Iterator<T>, tg.e<f0>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public int f17075a;

    /* renamed from: b, reason: collision with root package name */
    public T f17076b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator<? extends T> f17077c;

    /* renamed from: d, reason: collision with root package name */
    public tg.e<? super f0> f17078d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lh.i
    public final void c(Object obj, tg.e frame) {
        this.f17076b = obj;
        this.f17075a = 3;
        this.f17078d = frame;
        ug.a aVar = ug.a.f29706a;
        r.e(frame, "frame");
    }

    @Override // lh.i
    public final Object e(Iterator it, vg.h hVar) {
        if (!it.hasNext()) {
            return f0.f21461a;
        }
        this.f17077c = it;
        this.f17075a = 2;
        this.f17078d = hVar;
        return ug.a.f29706a;
    }

    public final RuntimeException f() {
        int i10 = this.f17075a;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f17075a);
    }

    @Override // tg.e
    public final tg.h getContext() {
        return tg.i.f28768a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i10 = this.f17075a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw f();
                }
                Iterator<? extends T> it = this.f17077c;
                r.b(it);
                if (it.hasNext()) {
                    this.f17075a = 2;
                    return true;
                }
                this.f17077c = null;
            }
            this.f17075a = 5;
            tg.e<? super f0> eVar = this.f17078d;
            r.b(eVar);
            this.f17078d = null;
            eVar.resumeWith(f0.f21461a);
        }
    }

    @Override // java.util.Iterator
    public final T next() {
        int i10 = this.f17075a;
        if (i10 == 0 || i10 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i10 == 2) {
            this.f17075a = 1;
            Iterator<? extends T> it = this.f17077c;
            r.b(it);
            return it.next();
        }
        if (i10 != 3) {
            throw f();
        }
        this.f17075a = 0;
        T t3 = this.f17076b;
        this.f17076b = null;
        return t3;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // tg.e
    public final void resumeWith(Object obj) {
        q.b(obj);
        this.f17075a = 4;
    }
}
