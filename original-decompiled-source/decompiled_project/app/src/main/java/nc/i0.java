package nc;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class i0 extends e1<Object> {

    /* renamed from: a, reason: collision with root package name */
    public boolean f18690a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18691b;

    public i0(Object obj) {
        this.f18691b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f18690a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f18690a) {
            throw new NoSuchElementException();
        }
        this.f18690a = true;
        return this.f18691b;
    }
}
