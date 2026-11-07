package e9;

import com.basitce.htmltoapk.domain.model.BuildState;
import org.bouncycastle.asn1.eac.CertificateBody;
import x0.l1;
import x0.n1;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.build.BuildProgressScreenKt$BuildProgressScreen$2$1", f = "BuildProgressScreen.kt", l = {CertificateBody.profileType}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class s extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f8512a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f8513b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1 f8514c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1 f8515d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(n1 n1Var, n1 n1Var2, l1 l1Var, tg.e eVar) {
        super(2, eVar);
        this.f8513b = n1Var;
        this.f8514c = n1Var2;
        this.f8515d = l1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new s(this.f8513b, this.f8514c, this.f8515d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((s) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f8512a;
        n1 n1Var = this.f8514c;
        l1 l1Var = this.f8515d;
        if (i10 == 0) {
            pg.q.b(obj);
            if ((((BuildState) this.f8513b.getValue()) instanceof BuildState.Idle) && ((Number) n1Var.getValue()).intValue() == 0) {
                l1Var.f(0);
            }
            return pg.f0.f21461a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pg.q.b(obj);
        while (l1Var.g() < ((Number) n1Var.getValue()).intValue()) {
            l1Var.f(l1Var.g() + 1);
            int iIntValue = ((Number) n1Var.getValue()).intValue() - l1Var.g();
            long j10 = iIntValue > 40 ? 8L : iIntValue > 20 ? 14L : iIntValue > 5 ? 22L : 35L;
            this.f8512a = 1;
            if (ph.t0.b(j10, this) == aVar) {
                return aVar;
            }
        }
        return pg.f0.f21461a;
    }
}
