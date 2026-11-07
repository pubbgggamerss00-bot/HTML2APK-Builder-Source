package t;

import androidx.compose.ui.d;
import i2.i2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class s0 extends d.c implements i2 {

    /* renamed from: q, reason: collision with root package name */
    public x.m f25339q;

    /* renamed from: r, reason: collision with root package name */
    public x.i f25340r;

    @vg.e(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$1", f = "Hoverable.kt", l = {89}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f25341a;

        public a(tg.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return s0.this.new a(eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f25341a;
            if (i10 == 0) {
                pg.q.b(obj);
                this.f25341a = 1;
                if (s0.T1(s0.this, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$2", f = "Hoverable.kt", l = {90}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f25343a;

        public b(tg.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return s0.this.new b(eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f25343a;
            if (i10 == 0) {
                pg.q.b(obj);
                this.f25343a = 1;
                if (s0.U1(s0.this, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object T1(s0 s0Var, vg.c cVar) {
        q0 q0Var;
        x.i iVar;
        if (cVar instanceof q0) {
            q0Var = (q0) cVar;
            int i10 = q0Var.f25325e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                q0Var.f25325e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                q0Var = new q0(s0Var, cVar);
            }
        }
        Object obj = q0Var.f25323c;
        ug.a aVar = ug.a.f29706a;
        int i11 = q0Var.f25325e;
        if (i11 == 0) {
            pg.q.b(obj);
            if (s0Var.f25340r == null) {
                iVar = new x.i();
                x.m mVar = s0Var.f25339q;
                q0Var.f25321a = s0Var;
                q0Var.f25322b = iVar;
                q0Var.f25325e = 1;
                if (mVar.c(iVar, q0Var) == aVar) {
                    return aVar;
                }
            }
            return pg.f0.f21461a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        x.i iVar2 = q0Var.f25322b;
        s0 s0Var2 = q0Var.f25321a;
        pg.q.b(obj);
        iVar = iVar2;
        s0Var = s0Var2;
        s0Var.f25340r = iVar;
        return pg.f0.f21461a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object U1(s0 s0Var, vg.c cVar) {
        r0 r0Var;
        if (cVar instanceof r0) {
            r0Var = (r0) cVar;
            int i10 = r0Var.f25330d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                r0Var.f25330d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                r0Var = new r0(s0Var, cVar);
            }
        }
        Object obj = r0Var.f25328b;
        ug.a aVar = ug.a.f29706a;
        int i11 = r0Var.f25330d;
        if (i11 == 0) {
            pg.q.b(obj);
            x.i iVar = s0Var.f25340r;
            if (iVar != null) {
                x.j jVar = new x.j(iVar);
                x.m mVar = s0Var.f25339q;
                r0Var.f25327a = s0Var;
                r0Var.f25330d = 1;
                if (mVar.c(jVar, r0Var) == aVar) {
                    return aVar;
                }
            }
            return pg.f0.f21461a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s0Var = r0Var.f25327a;
        pg.q.b(obj);
        s0Var.f25340r = null;
        return pg.f0.f21461a;
    }

    @Override // i2.i2
    public final void J(c2.r rVar, c2.t tVar, long j10) {
        if (tVar == c2.t.f4695b) {
            int i10 = rVar.f4690d;
            if (i10 == 4) {
                ph.h.c(H1(), null, null, new a(null), 3);
            } else if (i10 == 5) {
                ph.h.c(H1(), null, null, new b(null), 3);
            }
        }
    }

    @Override // androidx.compose.ui.d.c
    public final void M1() {
        V1();
    }

    public final void V1() {
        x.i iVar = this.f25340r;
        if (iVar != null) {
            this.f25339q.a(new x.j(iVar));
            this.f25340r = null;
        }
    }

    @Override // i2.i2
    public final void r0() {
        V1();
    }
}
