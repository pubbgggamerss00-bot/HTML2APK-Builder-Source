package qg;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class n implements Iterable<Object>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object[] f22740a;

    public n(Object[] objArr) {
        this.f22740a = objArr;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return f3.f.e(this.f22740a);
    }
}
