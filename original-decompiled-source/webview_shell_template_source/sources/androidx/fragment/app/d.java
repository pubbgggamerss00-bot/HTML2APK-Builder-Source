package androidx.fragment.app;

import androidx.fragment.app.j0;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d implements Runnable {
    public final /* synthetic */ ArrayList s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j0.d f1082t;

    public d(i iVar, ArrayList arrayList, j0.d dVar) {
        this.s = arrayList;
        this.f1082t = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.s;
        j0.d dVar = this.f1082t;
        if (arrayList.contains(dVar)) {
            arrayList.remove(dVar);
            dVar.f1167a.a(dVar.f1169c.W);
        }
    }
}
