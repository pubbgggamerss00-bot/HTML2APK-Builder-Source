package qc;

import qc.a;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final /* synthetic */ class b {
    public static /* synthetic */ boolean a(Unsafe unsafe, a aVar, long j10, a.k kVar, a.k kVar2) {
        while (!unsafe.compareAndSwapObject(aVar, j10, kVar, kVar2)) {
            if (unsafe.getObject(aVar, j10) != kVar) {
                return false;
            }
        }
        return true;
    }
}
