package t8;

import h8.m;
import org.bouncycastle.asn1.eac.CertificateBody;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.ai.AiSessionViewModel$applyPendingSettings$1", f = "AiSessionViewModel.kt", l = {209, 212}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class n3 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f28352a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m3 f28353b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f28354c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h8.u f28355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f28356e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(m3 m3Var, long j10, h8.u uVar, int i10, tg.e<? super n3> eVar) {
        super(2, eVar);
        this.f28353b = m3Var;
        this.f28354c = j10;
        this.f28355d = uVar;
        this.f28356e = i10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new n3(this.f28353b, this.f28354c, this.f28355d, this.f28356e, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((n3) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
    
        if (r4.l(r14) == r0) goto L20;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f28352a;
        m3 m3Var = this.f28353b;
        if (i10 == 0) {
            pg.q.b(obj);
            h8.m mVar = m3Var.f28309d;
            this.f28352a = 1;
            mVar.getClass();
            wh.c cVar = ph.z0.f21632a;
            obj = ph.h.e(wh.b.f31563c, new h8.r(mVar, this.f28354c, null, this.f28355d, null), this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return pg.f0.f21461a;
        }
        pg.q.b(obj);
        m3Var.o(this.f28356e, new q8.r2((m.a) obj, 1));
        h8.j jVar = this.f28355d.f12470h;
        if (jVar != null) {
            sh.z0 z0Var = m3Var.f28312g;
            do {
                value = z0Var.getValue();
            } while (!z0Var.a(value, b3.a((b3) value, null, null, null, false, false, false, jVar, CertificateBody.profileType)));
        }
        this.f28352a = 2;
    }
}
