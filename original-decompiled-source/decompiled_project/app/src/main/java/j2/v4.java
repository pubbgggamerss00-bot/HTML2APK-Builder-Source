package j2;

import java.util.List;

/* loaded from: classes.dex */
public final class v4 {

    /* renamed from: a, reason: collision with root package name */
    public final q2.l f14932a;

    /* renamed from: b, reason: collision with root package name */
    public final p.z f14933b;

    public v4(q2.t tVar, p.i<w4> iVar) {
        this.f14932a = tVar.f21811d;
        this.f14933b = new p.z(q2.t.h(4, tVar).size());
        List listH = q2.t.h(4, tVar);
        int size = listH.size();
        for (int i10 = 0; i10 < size; i10++) {
            q2.t tVar2 = (q2.t) listH.get(i10);
            if (iVar.a(tVar2.f21814g)) {
                this.f14933b.a(tVar2.f21814g);
            }
        }
    }
}
