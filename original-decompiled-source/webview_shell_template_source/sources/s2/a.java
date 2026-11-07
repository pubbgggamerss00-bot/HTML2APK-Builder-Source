package s2;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j2.k f14353t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ UUID f14354u;

    public a(j2.k kVar, UUID uuid) {
        this.f14353t = kVar;
        this.f14354u = uuid;
    }

    @Override // s2.d
    public final void b() {
        j2.k kVar = this.f14353t;
        WorkDatabase workDatabase = kVar.f13476c;
        workDatabase.c();
        try {
            d.a(kVar, this.f14354u.toString());
            workDatabase.h();
            workDatabase.f();
            j2.f.a(kVar.f13475b, kVar.f13476c, kVar.f13478e);
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
