package l;

import l.y;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class x extends k0 {
    public final /* synthetic */ y.e B;
    public final /* synthetic */ y C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, y yVar2, y.e eVar) {
        super(yVar2);
        this.C = yVar;
        this.B = eVar;
    }

    @Override // l.k0
    public final k.f b() {
        return this.B;
    }

    @Override // l.k0
    public final boolean c() {
        y yVar = this.C;
        if (yVar.getInternalPopup().a()) {
            return true;
        }
        yVar.f13754x.n(yVar.getTextDirection(), yVar.getTextAlignment());
        return true;
    }
}
