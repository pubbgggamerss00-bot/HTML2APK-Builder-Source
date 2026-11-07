package o2;

import android.os.Build;
import androidx.work.k;
import r2.l;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e extends c<n2.b> {

    /* renamed from: e, reason: collision with root package name */
    public static final String f14011e = k.e("NetworkMeteredCtrlr");

    @Override // o2.c
    public final boolean b(l lVar) {
        return lVar.f14288j.f1764a == androidx.work.l.f1835w;
    }

    @Override // o2.c
    public final boolean c(n2.b bVar) {
        n2.b bVar2 = bVar;
        if (Build.VERSION.SDK_INT >= 26) {
            return (bVar2.f13913a && bVar2.f13915c) ? false : true;
        }
        k.c().a(f14011e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !bVar2.f13913a;
    }
}
