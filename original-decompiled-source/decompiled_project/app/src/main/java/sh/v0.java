package sh;

@vg.e(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", l = {174, 176, 178, 179, 181}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class v0 extends vg.i implements eh.q<g<? super s0>, Integer, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f25113a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ g f25114b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f25115c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0 f25116d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(x0 x0Var, tg.e<? super v0> eVar) {
        super(3, eVar);
        this.f25116d = x0Var;
    }

    @Override // eh.q
    public final Object b(g<? super s0> gVar, Integer num, tg.e<? super pg.f0> eVar) {
        int iIntValue = num.intValue();
        v0 v0Var = new v0(this.f25116d, eVar);
        v0Var.f25114b = gVar;
        v0Var.f25115c = iIntValue;
        return v0Var.invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r1.c(r9, r8) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r1.c(r9, r8) != r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[PHI: r1
      0x0064: PHI (r1v3 sh.g) = (r1v2 sh.g), (r1v6 sh.g) binds: [B:25:0x0061, B:13:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074 A[PHI: r1
      0x0074: PHI (r1v4 sh.g) = (r1v3 sh.g), (r1v7 sh.g) binds: [B:28:0x0071, B:12:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g gVar;
        s0 s0Var;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f25113a;
        if (i10 == 0) {
            pg.q.b(obj);
            gVar = this.f25114b;
            if (this.f25115c > 0) {
                s0 s0Var2 = s0.f25088a;
                this.f25113a = 1;
            } else {
                long j10 = this.f25116d.f25120a;
                this.f25114b = gVar;
                this.f25113a = 2;
                if (ph.t0.b(j10, this) != aVar) {
                    s0Var = s0.f25089b;
                    this.f25114b = gVar;
                    this.f25113a = 3;
                    if (gVar.c(s0Var, this) != aVar) {
                    }
                }
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                gVar = this.f25114b;
                pg.q.b(obj);
                s0Var = s0.f25089b;
                this.f25114b = gVar;
                this.f25113a = 3;
                if (gVar.c(s0Var, this) != aVar) {
                    this.f25114b = gVar;
                    this.f25113a = 4;
                    if (ph.t0.b(Long.MAX_VALUE, this) != aVar) {
                    }
                }
                return aVar;
            }
            if (i10 == 3) {
                gVar = this.f25114b;
                pg.q.b(obj);
                this.f25114b = gVar;
                this.f25113a = 4;
                if (ph.t0.b(Long.MAX_VALUE, this) != aVar) {
                    s0 s0Var3 = s0.f25090c;
                    this.f25114b = null;
                    this.f25113a = 5;
                }
                return aVar;
            }
            if (i10 == 4) {
                gVar = this.f25114b;
                pg.q.b(obj);
                s0 s0Var32 = s0.f25090c;
                this.f25114b = null;
                this.f25113a = 5;
            } else if (i10 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        pg.q.b(obj);
        return pg.f0.f21461a;
    }
}
