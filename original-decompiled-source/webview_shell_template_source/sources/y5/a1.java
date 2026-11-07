package y5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a1 extends c1 {

    /* renamed from: u, reason: collision with root package name */
    public final boolean f15320u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1() {
        super(true);
        boolean z6 = true;
        G(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c1.f15322t;
        i iVar = (i) atomicReferenceFieldUpdater.get(this);
        j jVar = iVar instanceof j ? (j) iVar : null;
        if (jVar == null) {
            z6 = false;
            break;
        }
        c1 c1VarK = jVar.k();
        while (!c1VarK.C()) {
            i iVar2 = (i) atomicReferenceFieldUpdater.get(c1VarK);
            j jVar2 = iVar2 instanceof j ? (j) iVar2 : null;
            if (jVar2 == null) {
                z6 = false;
                break;
            }
            c1VarK = jVar2.k();
        }
        this.f15320u = z6;
    }

    @Override // y5.c1
    public final boolean C() {
        return this.f15320u;
    }
}
