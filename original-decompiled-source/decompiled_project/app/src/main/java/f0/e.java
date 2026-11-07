package f0;

import androidx.compose.ui.d;

/* loaded from: classes.dex */
public final class e extends d.c {

    /* renamed from: q, reason: collision with root package name */
    public a f8756q;

    @Override // androidx.compose.ui.d.c
    public final boolean I1() {
        return false;
    }

    @Override // androidx.compose.ui.d.c
    public final void L1() {
        a aVar = this.f8756q;
        if (aVar instanceof d) {
            ((d) aVar).f8755a.j(this);
        }
        if (aVar instanceof d) {
            ((d) aVar).f8755a.b(this);
        }
        this.f8756q = aVar;
    }

    @Override // androidx.compose.ui.d.c
    public final void M1() {
        a aVar = this.f8756q;
        if (aVar instanceof d) {
            ((d) aVar).f8755a.j(this);
        }
    }
}
