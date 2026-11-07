package c0;

import java.util.List;

/* loaded from: classes.dex */
public final class b0 extends o0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s0 f4348f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(s0 s0Var, int i10, int i11, a0 a0Var, v0 v0Var) {
        super(s0Var, i10, i11, a0Var, v0Var);
        this.f4348f = s0Var;
    }

    @Override // c0.o0
    public final n0 b(int i10, m0[] m0VarArr, List<c> list, int i11) {
        return new n0(i10, m0VarArr, this.f4348f, list, i11);
    }
}
