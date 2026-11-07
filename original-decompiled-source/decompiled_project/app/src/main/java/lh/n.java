package lh;

import java.util.Iterator;
import mh.b.a;

/* loaded from: classes2.dex */
public final class n implements Iterable<Object>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mh.b f17082a;

    public n(mh.b bVar) {
        this.f17082a = bVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return this.f17082a.new a();
    }
}
