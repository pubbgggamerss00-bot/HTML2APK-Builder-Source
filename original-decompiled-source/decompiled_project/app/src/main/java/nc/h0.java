package nc;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class h0 implements Iterator<Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f18683a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18684b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterator f18685c;

    public h0(Iterator it, int i10) {
        this.f18684b = i10;
        this.f18685c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18683a < this.f18684b && this.f18685c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f18683a++;
        return this.f18685c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f18685c.remove();
    }
}
