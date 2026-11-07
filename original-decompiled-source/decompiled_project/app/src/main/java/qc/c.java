package qc;

import qc.a;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final /* synthetic */ class c {
    public static /* synthetic */ boolean a(Unsafe unsafe, a aVar, long j10, a.d dVar, a.d dVar2) {
        while (!unsafe.compareAndSwapObject(aVar, j10, dVar, dVar2)) {
            if (unsafe.getObject(aVar, j10) != dVar) {
                return false;
            }
        }
        return true;
    }
}
