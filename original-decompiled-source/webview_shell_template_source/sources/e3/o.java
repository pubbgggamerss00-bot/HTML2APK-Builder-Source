package e3;

import e3.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o implements b.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f12892a;

    public o(d dVar) {
        this.f12892a = dVar;
    }

    @Override // e3.b.a
    public final void a(boolean z6) {
        o3.f fVar = this.f12892a.E;
        fVar.sendMessage(fVar.obtainMessage(1, Boolean.valueOf(z6)));
    }
}
