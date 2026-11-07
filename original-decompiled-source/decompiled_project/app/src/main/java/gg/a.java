package gg;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import c9.u1;
import j2.y;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.g0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.q;
import ph.i0;
import ph.k0;
import ph.s1;
import ph.v1;
import qg.n;
import rh.h;
import sh.a0;
import sh.a1;
import sh.b0;
import sh.e;
import sh.f;
import sh.g;
import sh.l0;
import sh.o;
import sh.p;
import sh.t0;
import sh.u0;
import sh.w;
import sh.x;
import sh.x0;
import sh.y0;
import sh.z;
import sh.z0;
import tg.i;
import th.j;
import th.l;
import th.r;
import th.u;
import vg.c;

/* loaded from: classes2.dex */
public final class a {
    public static final l0 a(z0 z0Var) {
        return new l0(z0Var, null);
    }

    public static f b(f fVar, int i10) {
        rh.a aVar = rh.a.f23576a;
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException(y.a(i10, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i10 == -1) {
            aVar = rh.a.f23577b;
            i10 = 0;
        }
        int i11 = i10;
        rh.a aVar2 = aVar;
        return fVar instanceof r ? r.a.a((r) fVar, null, i11, aVar2, 1) : new j(fVar, null, i11, aVar2, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable c(f fVar, g gVar, c cVar) throws Throwable {
        o oVar;
        g0 g0Var;
        s1 s1Var;
        CancellationException cancellationException;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i10 = oVar.f25040c;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                oVar.f25040c = i10 - PKIFailureInfo.systemUnavail;
            } else {
                oVar = new o(cVar);
            }
        }
        Object obj = oVar.f25039b;
        ug.a aVar = ug.a.f29706a;
        int i11 = oVar.f25040c;
        if (i11 == 0) {
            q.b(obj);
            g0 g0Var2 = new g0();
            try {
                p pVar = new p(gVar, g0Var2);
                oVar.f25038a = g0Var2;
                oVar.f25040c = 1;
                if (fVar.b(pVar, oVar) == aVar) {
                    return aVar;
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                g0Var = g0Var2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g0Var = oVar.f25038a;
            try {
                q.b(obj);
                return null;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        Throwable th4 = (Throwable) g0Var.f16327a;
        if ((th4 != null && th4.equals(th)) || ((s1Var = (s1) oVar.getContext().get(s1.a.f21589a)) != null && s1Var.isCancelled() && (cancellationException = s1Var.getCancellationException()) != null && cancellationException.equals(th))) {
            throw th;
        }
        if (th4 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            u1.b(th4, th);
            throw th4;
        }
        u1.b(th, th4);
        throw th;
    }

    public static final f d(f fVar) {
        return ((fVar instanceof y0) || (fVar instanceof e)) ? fVar : new e(fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, uh.v] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(f fVar, eh.p pVar, c cVar) {
        a0 a0Var;
        g0 g0Var;
        th.a e10;
        sh.y yVar;
        T t3;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i10 = a0Var.f24928d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                a0Var.f24928d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                a0Var = new a0(cVar);
            }
        }
        Object obj = a0Var.f24927c;
        Object obj2 = ug.a.f29706a;
        int i11 = a0Var.f24928d;
        ?? r32 = u.f28848a;
        if (i11 == 0) {
            q.b(obj);
            g0 g0Var2 = new g0();
            g0Var2.f16327a = r32;
            sh.y yVar2 = new sh.y(pVar, g0Var2);
            try {
                a0Var.f24925a = g0Var2;
                a0Var.f24926b = yVar2;
                a0Var.f24928d = 1;
                if (fVar.b(yVar2, a0Var) == obj2) {
                    return obj2;
                }
                g0Var = g0Var2;
            } catch (th.a e11) {
                g0Var = g0Var2;
                e10 = e11;
                yVar = yVar2;
                if (e10.f28771a == yVar) {
                    throw e10;
                }
                v1.e(a0Var.getContext());
                t3 = g0Var.f16327a;
                if (t3 == r32) {
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yVar = a0Var.f24926b;
            g0Var = a0Var.f24925a;
            try {
                q.b(obj);
            } catch (th.a e12) {
                e10 = e12;
                if (e10.f28771a == yVar) {
                }
            }
        }
        t3 = g0Var.f16327a;
        if (t3 == r32) {
            return t3;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, uh.v] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(f fVar, tg.e eVar) {
        z zVar;
        g0 g0Var;
        th.a e10;
        x xVar;
        T t3;
        if (eVar instanceof z) {
            zVar = (z) eVar;
            int i10 = zVar.f25131d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                zVar.f25131d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                zVar = new z(eVar);
            }
        }
        Object obj = zVar.f25130c;
        Object obj2 = ug.a.f29706a;
        int i11 = zVar.f25131d;
        ?? r32 = u.f28848a;
        if (i11 == 0) {
            q.b(obj);
            g0 g0Var2 = new g0();
            g0Var2.f16327a = r32;
            x xVar2 = new x(g0Var2);
            try {
                zVar.f25128a = g0Var2;
                zVar.f25129b = xVar2;
                zVar.f25131d = 1;
                if (fVar.b(xVar2, zVar) == obj2) {
                    return obj2;
                }
                g0Var = g0Var2;
            } catch (th.a e11) {
                g0Var = g0Var2;
                e10 = e11;
                xVar = xVar2;
                if (e10.f28771a == xVar) {
                    throw e10;
                }
                v1.e(zVar.getContext());
                t3 = g0Var.f16327a;
                if (t3 == r32) {
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xVar = zVar.f25129b;
            g0Var = zVar.f25128a;
            try {
                q.b(obj);
            } catch (th.a e12) {
                e10 = e12;
                if (e10.f28771a == xVar) {
                }
            }
        }
        t3 = g0Var.f16327a;
        if (t3 == r32) {
            return t3;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    public static Application g(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        Context baseContext = context;
        while (baseContext instanceof ContextWrapper) {
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
            if (baseContext instanceof Application) {
                return (Application) baseContext;
            }
        }
        throw new IllegalStateException("Could not find an Application in the given context: " + context);
    }

    public static final l h(f... fVarArr) {
        int i10 = w.f25117a;
        return new l(fVarArr.length == 0 ? qg.z.f22752a : new n(fVarArr), i.f28768a, -2, rh.a.f23576a);
    }

    public static final l0 i(f fVar, i0 i0Var, x0 x0Var, Object obj) {
        t0 t0Var;
        th.g gVar;
        f fVarG;
        h.f23621u.getClass();
        h.a aVar = h.a.f23622a;
        if (!(fVar instanceof th.g) || (fVarG = (gVar = (th.g) fVar).g()) == null) {
            rh.a aVar2 = rh.a.f23576a;
            t0Var = new t0(fVar, i.f28768a);
        } else {
            int i10 = gVar.f28791b;
            if (i10 == -3 || i10 == -2 || i10 == 0) {
                rh.a aVar3 = rh.a.f23576a;
            }
            t0Var = new t0(fVarG, gVar.f28790a);
        }
        z0 z0VarA = a1.a(obj);
        return new l0(z0VarA, ph.h.b(i0Var, t0Var.f25099b, x0Var.equals(u0.f25107a) ? k0.f21553a : k0.f21556d, new b0(x0Var, t0Var.f25098a, z0VarA, obj, null)));
    }
}
