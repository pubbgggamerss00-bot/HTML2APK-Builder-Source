package okhttp3;

import fh.a;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class Cache$urls$1 implements Iterator<String>, a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f19162a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        this.f19162a = false;
        throw null;
    }

    @Override // java.util.Iterator
    public final String next() {
        this.f19162a = false;
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f19162a) {
            throw new IllegalStateException("remove() before next()");
        }
        throw null;
    }
}
