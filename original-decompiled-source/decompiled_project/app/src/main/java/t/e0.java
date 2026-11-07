package t;

import android.view.KeyEvent;
import java.util.concurrent.CancellationException;
import v.t1;

/* loaded from: classes.dex */
public final class e0 extends t.a implements i2.h {
    public final p.c0<ph.s1> L;
    public final p.c0<a> M;

    public static final class a {
    }

    @vg.e(c = "androidx.compose.foundation.CombinedClickableNode$clickPointerInput$4", f = "Clickable.kt", l = {770}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.q<v.u0, p1.c, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f25196a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ v.u0 f25197b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ long f25198c;

        public b(tg.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // eh.q
        public final Object b(v.u0 u0Var, p1.c cVar, tg.e<? super pg.f0> eVar) {
            long j10 = cVar.f21129a;
            b bVar = e0.this.new b(eVar);
            bVar.f25197b = u0Var;
            bVar.f25198c = j10;
            return bVar.invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            Object objC;
            Object obj2 = ug.a.f29706a;
            int i10 = this.f25196a;
            if (i10 == 0) {
                pg.q.b(obj);
                v.u0 u0Var = this.f25197b;
                long j10 = this.f25198c;
                e0 e0Var = e0.this;
                if (e0Var.f25146x) {
                    this.f25196a = 1;
                    x.m mVar = e0Var.f25142s;
                    if (mVar == null || (objC = ph.j0.c(new d(u0Var, j10, mVar, e0Var, null), this)) != obj2) {
                        objC = pg.f0.f21461a;
                    }
                    if (objC == obj2) {
                        return obj2;
                    }
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

    public static final class c extends kotlin.jvm.internal.s implements eh.l<p1.c, pg.f0> {
        public c() {
            super(1);
        }

        @Override // eh.l
        public final pg.f0 invoke(p1.c cVar) {
            long j10 = cVar.f21129a;
            e0 e0Var = e0.this;
            if (e0Var.f25146x) {
                e0Var.f25147y.invoke();
            }
            return pg.f0.f21461a;
        }
    }

    public e0() {
        throw null;
    }

    public e0(eh.a aVar, boolean z10, x.m mVar, boolean z11) {
        super(mVar, null, z11, null, null, aVar);
        p.c0 c0Var = p.o.f20698a;
        this.L = new p.c0<>();
        this.M = new p.c0<>();
    }

    @Override // androidx.compose.ui.d.c
    public final void N1() {
        e2();
    }

    @Override // t.a
    public final void W1(q2.d0 d0Var) {
    }

    @Override // t.a
    public final Object X1(c2.j0 j0Var, tg.e<? super pg.f0> eVar) {
        b bVar = new b(null);
        c cVar = new c();
        t1.a aVar = v.t1.f30086a;
        Object objC = ph.j0.c(new v.z1(j0Var, bVar, null, null, cVar, null), eVar);
        ug.a aVar2 = ug.a.f29706a;
        if (objC != aVar2) {
            objC = pg.f0.f21461a;
        }
        return objC == aVar2 ? objC : pg.f0.f21461a;
    }

    @Override // t.a
    public final void a2() {
        e2();
    }

    @Override // t.a
    public final boolean b2(KeyEvent keyEvent) {
        if (this.M.b(a2.d.a(keyEvent)) == null) {
            return false;
        }
        throw null;
    }

    @Override // t.a
    public final void c2(KeyEvent keyEvent) {
        long jA = a2.d.a(keyEvent);
        p.c0<ph.s1> c0Var = this.L;
        boolean z10 = false;
        if (c0Var.b(jA) != null) {
            ph.s1 s1VarB = c0Var.b(jA);
            if (s1VarB != null) {
                if (s1VarB.isActive()) {
                    s1VarB.cancel((CancellationException) null);
                } else {
                    z10 = true;
                }
            }
            c0Var.g(jA);
        }
        if (z10) {
            return;
        }
        this.f25147y.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e2() {
        char c10;
        long j10;
        long j11;
        long j12;
        char c11;
        long j13;
        p.c0<ph.s1> c0Var = this.L;
        Object[] objArr = c0Var.f20679c;
        long[] jArr = c0Var.f20677a;
        int length = jArr.length - 2;
        char c12 = 7;
        long j14 = -9187201950435737472L;
        if (length >= 0) {
            int i10 = 0;
            j11 = 128;
            while (true) {
                long j15 = jArr[i10];
                j12 = 255;
                if ((((~j15) << c12) & j15 & j14) != j14) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j15 & 255) < 128) {
                            c11 = c12;
                            j13 = j14;
                            ((ph.s1) objArr[(i10 << 3) + i12]).cancel((CancellationException) null);
                        } else {
                            c11 = c12;
                            j13 = j14;
                        }
                        j15 >>= 8;
                        i12++;
                        c12 = c11;
                        j14 = j13;
                    }
                    c10 = c12;
                    j10 = j14;
                    if (i11 != 8) {
                        break;
                    }
                } else {
                    c10 = c12;
                    j10 = j14;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c12 = c10;
                j14 = j10;
            }
        } else {
            c10 = 7;
            j10 = -9187201950435737472L;
            j11 = 128;
            j12 = 255;
        }
        c0Var.c();
        p.c0<a> c0Var2 = this.M;
        Object[] objArr2 = c0Var2.f20679c;
        long[] jArr2 = c0Var2.f20677a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j16 = jArr2[i13];
                if ((((~j16) << c10) & j16 & j10) != j10) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j16 & j12) < j11) {
                            ((a) objArr2[(i13 << 3) + i15]).getClass();
                            throw null;
                        }
                        j16 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    } else if (i13 == length2) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        c0Var2.c();
    }
}
