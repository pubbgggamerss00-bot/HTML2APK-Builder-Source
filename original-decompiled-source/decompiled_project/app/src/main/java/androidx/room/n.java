package androidx.room;

import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final /* synthetic */ class n extends kotlin.jvm.internal.p implements eh.l<Set<? extends Integer>, pg.f0> {
    @Override // eh.l
    public final pg.f0 invoke(Set<? extends Integer> set) {
        Set<? extends Integer> p02 = set;
        kotlin.jvm.internal.r.e(p02, "p0");
        m mVar = (m) this.receiver;
        ReentrantLock reentrantLock = mVar.f3018e;
        reentrantLock.lock();
        try {
            List<v> listC0 = qg.x.c0(mVar.f3017d.values());
            reentrantLock.unlock();
            for (v vVar : listC0) {
                vVar.getClass();
                int[] iArr = vVar.f3093b;
                int length = iArr.length;
                Set<String> setA = qg.b0.f22711a;
                if (length != 0) {
                    int i10 = 0;
                    if (length != 1) {
                        rg.g gVar = new rg.g();
                        int length2 = iArr.length;
                        int i11 = 0;
                        while (i10 < length2) {
                            int i12 = i11 + 1;
                            if (p02.contains(Integer.valueOf(iArr[i10]))) {
                                gVar.add(vVar.f3094c[i11]);
                            }
                            i10++;
                            i11 = i12;
                        }
                        setA = qg.n0.a(gVar);
                    } else if (p02.contains(Integer.valueOf(iArr[0]))) {
                        setA = vVar.f3095d;
                    }
                }
                if (!setA.isEmpty()) {
                    vVar.f3092a.a(setA);
                }
            }
            return pg.f0.f21461a;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
