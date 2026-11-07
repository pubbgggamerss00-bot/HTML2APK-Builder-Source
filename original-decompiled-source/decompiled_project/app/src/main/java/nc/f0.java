package nc;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class f0 extends b<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterator f18678a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.l f18679b;

    public f0(Iterator it, lc.l lVar) {
        this.f18678a = it;
        this.f18679b = lVar;
    }

    @Override // nc.b
    public final Object computeNext() {
        Object next;
        do {
            Iterator it = this.f18678a;
            if (!it.hasNext()) {
                return endOfData();
            }
            next = it.next();
        } while (!this.f18679b.apply(next));
        return next;
    }
}
