package rh;

import java.util.concurrent.atomic.AtomicReferenceArray;
import ph.y2;

/* loaded from: classes2.dex */
public final class m<E> extends uh.s<m<E>> {

    /* renamed from: e, reason: collision with root package name */
    public final c<E> f23628e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f23629f;

    public m(long j10, m<E> mVar, c<E> cVar, int i10) {
        super(j10, mVar, i10);
        this.f23628e = cVar;
        this.f23629f = new AtomicReferenceArray(g.f23603b * 2);
    }

    @Override // uh.s
    public final int g() {
        return g.f23603b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        n(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        kotlin.jvm.internal.r.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // uh.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int i10, tg.h hVar) {
        int i11 = g.f23603b;
        boolean z10 = i10 >= i11;
        if (z10) {
            i10 -= i11;
        }
        this.f23629f.get(i10 * 2);
        while (true) {
            Object objL = l(i10);
            boolean z11 = objL instanceof y2;
            c<E> cVar = this.f23628e;
            if (z11 || (objL instanceof y)) {
                if (k(i10, objL, z10 ? g.f23611j : g.f23612k)) {
                    n(i10, null);
                    m(i10, !z10);
                    if (z10) {
                        kotlin.jvm.internal.r.b(cVar);
                        return;
                    }
                    return;
                }
            } else {
                if (objL == g.f23611j || objL == g.f23612k) {
                    break;
                }
                if (objL != g.f23608g && objL != g.f23607f) {
                    if (objL == g.f23610i || objL == g.f23605d || objL == g.f23613l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objL).toString());
                }
            }
        }
    }

    public final boolean k(int i10, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i11 = (i10 * 2) + 1;
        do {
            atomicReferenceArray = this.f23629f;
            if (atomicReferenceArray.compareAndSet(i11, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i11) == obj);
        return false;
    }

    public final Object l(int i10) {
        return this.f23629f.get((i10 * 2) + 1);
    }

    public final void m(int i10, boolean z10) {
        if (z10) {
            c<E> cVar = this.f23628e;
            kotlin.jvm.internal.r.b(cVar);
            cVar.L((this.f29768c * g.f23603b) + i10);
        }
        i();
    }

    public final void n(int i10, Object obj) {
        this.f23629f.set(i10 * 2, obj);
    }

    public final void o(int i10, Object obj) {
        this.f23629f.set((i10 * 2) + 1, obj);
    }
}
