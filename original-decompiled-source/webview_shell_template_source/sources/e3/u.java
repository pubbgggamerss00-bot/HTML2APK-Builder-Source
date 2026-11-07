package e3;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.b;
import d3.a;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u implements b.c {

    /* renamed from: a, reason: collision with root package name */
    public final a.e f12904a;

    /* renamed from: b, reason: collision with root package name */
    public final a<?> f12905b;

    /* renamed from: c, reason: collision with root package name */
    public com.google.android.gms.common.internal.h f12906c = null;

    /* renamed from: d, reason: collision with root package name */
    public Set<Scope> f12907d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12908e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f12909f;

    public u(d dVar, a.e eVar, a<?> aVar) {
        this.f12909f = dVar;
        this.f12904a = eVar;
        this.f12905b = aVar;
    }

    @Override // com.google.android.gms.common.internal.b.c
    public final void a(c3.b bVar) {
        this.f12909f.E.post(new t(this, bVar));
    }

    public final void b(c3.b bVar) {
        r rVar = (r) this.f12909f.B.get(this.f12905b);
        if (rVar != null) {
            com.google.android.gms.common.internal.l.c(rVar.E.E);
            a.e eVar = rVar.f12894t;
            String name = eVar.getClass().getName();
            String strValueOf = String.valueOf(bVar);
            StringBuilder sb = new StringBuilder(name.length() + 25 + strValueOf.length());
            sb.append("onSignInFailed for ");
            sb.append(name);
            sb.append(" with ");
            sb.append(strValueOf);
            eVar.disconnect(sb.toString());
            rVar.m(bVar, null);
        }
    }
}
