package nc;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class b0 extends k<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Iterable f18666b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lc.l f18667c;

    public b0(Iterable iterable, lc.l lVar) {
        this.f18666b = iterable;
        this.f18667c = lVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return j0.d(this.f18666b.iterator(), this.f18667c);
    }
}
