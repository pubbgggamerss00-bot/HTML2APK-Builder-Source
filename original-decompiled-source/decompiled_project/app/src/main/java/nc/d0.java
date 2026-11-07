package nc;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class d0 extends k<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Iterable f18672b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18673c;

    public d0(Iterable iterable, int i10) {
        this.f18672b = iterable;
        this.f18673c = i10;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        Iterator it = this.f18672b.iterator();
        it.getClass();
        int i10 = this.f18673c;
        if (i10 >= 0) {
            return new h0(it, i10);
        }
        throw new IllegalArgumentException("limit is negative");
    }
}
