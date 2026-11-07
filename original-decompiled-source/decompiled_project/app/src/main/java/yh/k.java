package yh;

import java.util.concurrent.atomic.AtomicReferenceArray;
import uh.s;

/* loaded from: classes2.dex */
public final class k extends s<k> {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f34427e;

    public k(long j10, k kVar, int i10) {
        super(j10, kVar, i10);
        this.f34427e = new AtomicReferenceArray(j.f34426f);
    }

    @Override // uh.s
    public final int g() {
        return j.f34426f;
    }

    @Override // uh.s
    public final void h(int i10, tg.h hVar) {
        this.f34427e.set(i10, j.f34425e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f29768c + ", hashCode=" + hashCode() + ']';
    }
}
