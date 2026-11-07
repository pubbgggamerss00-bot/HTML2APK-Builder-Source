package i8;

import eh.p;
import n8.m1;
import n8.v0;
import pg.f0;
import pg.q;
import ph.i0;
import sh.z0;

@vg.e(c = "com.basitce.htmltoapk.billing.BillingManager$processAllPurchases$1", f = "BillingManager.kt", l = {366, 367, 373, 375, 376}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class k extends vg.i implements p<i0, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f14247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14248b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f14249c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f14250d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(boolean z10, j jVar, boolean z11, tg.e<? super k> eVar) {
        super(2, eVar);
        this.f14248b = z10;
        this.f14249c = jVar;
        this.f14250d = z11;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        return new k(this.f14248b, this.f14249c, this.f14250d, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
        return ((k) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (r0.e(r6, r13) != r3) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008c, code lost:
    
        if (r0.e(false, r13) != r3) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        j jVar = this.f14249c;
        z0 z0Var = jVar.f14233m;
        z0 z0Var2 = jVar.f14231k;
        m1 m1Var = jVar.f14222b;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f14247a;
        boolean z10 = this.f14250d;
        if (i10 == 0) {
            q.b(obj);
            if (this.f14248b) {
                this.f14247a = 1;
                if (m1Var.d(true, this) != aVar) {
                    this.f14247a = 2;
                }
            } else {
                v0 v0Var = m1Var.f18537m;
                this.f14247a = 3;
                obj = gg.a.f(v0Var, this);
                if (obj != aVar) {
                    if (((Boolean) obj).booleanValue()) {
                    }
                }
            }
            return aVar;
        }
        if (i10 == 1) {
            q.b(obj);
            this.f14247a = 2;
        } else if (i10 == 2) {
            q.b(obj);
            Boolean bool = Boolean.TRUE;
            z0Var2.getClass();
            z0Var2.j(null, bool);
            Boolean boolValueOf = Boolean.valueOf(z10);
            z0Var.getClass();
            z0Var.j(null, boolValueOf);
        } else if (i10 == 3) {
            q.b(obj);
            if (((Boolean) obj).booleanValue()) {
                this.f14247a = 4;
                if (m1Var.d(false, this) != aVar) {
                    this.f14247a = 5;
                }
                return aVar;
            }
        } else if (i10 == 4) {
            q.b(obj);
            this.f14247a = 5;
        } else {
            if (i10 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
            Boolean bool2 = Boolean.FALSE;
            z0Var2.getClass();
            z0Var2.j(null, bool2);
            z0Var.getClass();
            z0Var.j(null, bool2);
        }
        return f0.f21461a;
    }
}
