package o2;

import android.os.Build;
import r2.l;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g extends c<n2.b> {
    @Override // o2.c
    public final boolean b(l lVar) {
        androidx.work.l lVar2 = lVar.f14288j.f1764a;
        if (lVar2 != androidx.work.l.f1833u) {
            return Build.VERSION.SDK_INT >= 30 && lVar2 == androidx.work.l.f1836x;
        }
        return true;
    }

    @Override // o2.c
    public final boolean c(n2.b bVar) {
        n2.b bVar2 = bVar;
        return !bVar2.f13913a || bVar2.f13915c;
    }
}
