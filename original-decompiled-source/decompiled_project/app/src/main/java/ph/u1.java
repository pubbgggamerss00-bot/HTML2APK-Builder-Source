package ph;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class u1 extends y1 {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f21595c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(s1 s1Var) {
        super(true);
        boolean z10 = true;
        F(s1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y1.f21612b;
        r rVar = (r) atomicReferenceFieldUpdater.get(this);
        s sVar = rVar instanceof s ? (s) rVar : null;
        if (sVar == null) {
            z10 = false;
            break;
        }
        y1 y1VarI = sVar.i();
        while (!y1VarI.z()) {
            r rVar2 = (r) atomicReferenceFieldUpdater.get(y1VarI);
            s sVar2 = rVar2 instanceof s ? (s) rVar2 : null;
            if (sVar2 == null) {
                z10 = false;
                break;
            }
            y1VarI = sVar2.i();
        }
        this.f21595c = z10;
    }

    @Override // ph.y1
    public final boolean A() {
        return true;
    }

    @Override // ph.y1
    public final boolean z() {
        return this.f21595c;
    }
}
