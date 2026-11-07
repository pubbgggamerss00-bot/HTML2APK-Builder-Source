package androidx.compose.foundation.selection;

import androidx.compose.foundation.e;
import androidx.compose.ui.d;
import eh.q;
import kotlin.jvm.internal.s;
import q2.i;
import t.u0;
import x.m;
import x.n;
import x0.j;

/* loaded from: classes.dex */
public final class c extends s implements q<d, j, Integer, d> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f1049a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s2.a f1050b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1051c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f1052d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eh.a f1053e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(eh.a aVar, i iVar, s2.a aVar2, u0 u0Var, boolean z10) {
        super(3);
        this.f1049a = u0Var;
        this.f1050b = aVar2;
        this.f1051c = z10;
        this.f1052d = iVar;
        this.f1053e = aVar;
    }

    @Override // eh.q
    public final d b(d dVar, j jVar, Integer num) {
        j jVar2 = jVar;
        num.intValue();
        jVar2.L(-1525724089);
        Object objG = jVar2.g();
        if (objG == j.a.f31715a) {
            objG = new n();
            jVar2.C(objG);
        }
        m mVar = (m) objG;
        d dVarH = e.a(d.a.f1143b, mVar, this.f1049a).h(new TriStateToggleableElement(this.f1050b, mVar, null, this.f1051c, this.f1052d, this.f1053e));
        jVar2.B();
        return dVarH;
    }
}
