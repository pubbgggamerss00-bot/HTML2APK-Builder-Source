package y5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import y5.m0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class n0 extends l0 {
    public abstract Thread C();

    public void D(long j6, m0.a aVar) {
        int iC;
        Thread threadC;
        c0 c0Var = c0.A;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m0.f15364y;
        c0Var.getClass();
        if (m0.f15365z.get(c0Var) != 0) {
            iC = 1;
        } else {
            m0.b bVar = (m0.b) atomicReferenceFieldUpdater.get(c0Var);
            if (bVar == null) {
                m0.b bVar2 = new m0.b();
                bVar2.f15367c = j6;
                while (!atomicReferenceFieldUpdater.compareAndSet(c0Var, null, bVar2) && atomicReferenceFieldUpdater.get(c0Var) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(c0Var);
                kotlin.jvm.internal.j.b(obj);
                bVar = (m0.b) obj;
            }
            iC = aVar.c(j6, bVar, c0Var);
        }
        if (iC != 0) {
            if (iC == 1) {
                c0Var.D(j6, aVar);
                throw null;
            }
            if (iC != 2) {
                throw new IllegalStateException("unexpected result");
            }
            return;
        }
        m0.b bVar3 = (m0.b) atomicReferenceFieldUpdater.get(c0Var);
        if (bVar3 != null) {
            synchronized (bVar3) {
                Object[] objArr = bVar3.f2056a;
                obj = objArr != null ? objArr[0] : null;
            }
            obj = (m0.a) obj;
        }
        if (obj != aVar || Thread.currentThread() == (threadC = c0Var.C())) {
            return;
        }
        LockSupport.unpark(threadC);
    }
}
