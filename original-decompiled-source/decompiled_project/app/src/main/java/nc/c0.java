package nc;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class c0 extends k<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Iterable f18668b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lc.e f18669c;

    public c0(Iterable iterable, lc.e eVar) {
        this.f18668b = iterable;
        this.f18669c = eVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        Iterator it = this.f18668b.iterator();
        lc.e eVar = this.f18669c;
        eVar.getClass();
        return new g0(it, eVar);
    }
}
