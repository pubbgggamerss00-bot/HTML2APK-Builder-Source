package bi;

import java.util.Iterator;
import kotlinx.serialization.internal.p;

/* loaded from: classes2.dex */
public final class h implements Iterator<String>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public int f4273a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f4274b;

    public h(p pVar) {
        this.f4274b = pVar;
        this.f4273a = pVar.f16390c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4273a > 0;
    }

    @Override // java.util.Iterator
    public final String next() {
        p pVar = this.f4274b;
        int i10 = pVar.f16390c;
        int i11 = this.f4273a;
        this.f4273a = i11 - 1;
        return pVar.f16392e[i10 - i11];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
