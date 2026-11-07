package qc;

import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final /* synthetic */ class d {
    public static /* synthetic */ boolean a(Unsafe unsafe, a aVar, long j10, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(aVar, j10, obj, obj2)) {
            if (unsafe.getObject(aVar, j10) != obj) {
                return false;
            }
        }
        return true;
    }
}
