package s2;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j2.k f14356t;

    public c(j2.k kVar) {
        this.f14356t = kVar;
    }

    @Override // s2.d
    public final void b() {
        j2.k kVar = this.f14356t;
        WorkDatabase workDatabase = kVar.f13476c;
        workDatabase.c();
        try {
            ArrayList arrayListG = ((r2.s) workDatabase.n()).g();
            int size = arrayListG.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayListG.get(i6);
                i6++;
                d.a(kVar, (String) obj);
            }
            workDatabase.h();
            workDatabase.f();
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
