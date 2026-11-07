package e3;

import d3.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p implements Runnable {
    public final /* synthetic */ q s;

    public p(q qVar) {
        this.s = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.e eVar = this.s.f12893a.f12894t;
        eVar.disconnect(eVar.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
