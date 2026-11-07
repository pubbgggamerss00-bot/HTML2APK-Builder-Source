package rd;

import com.google.android.gms.common.api.internal.c;

/* loaded from: classes2.dex */
public final class s0 implements c.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f23428a;

    public s0(q0 q0Var) {
        this.f23428a = q0Var;
    }

    @Override // com.google.android.gms.common.api.internal.c.a
    public final void a(boolean z10) {
        if (z10) {
            p pVar = this.f23428a.f23420a;
            pVar.f23416c.removeCallbacks(pVar.f23417d);
        }
    }
}
