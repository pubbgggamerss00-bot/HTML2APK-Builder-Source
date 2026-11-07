package y5;

import androidx.room.s0;
import androidx.room.t0;
import eh.l;
import eh.p;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.q;
import vg.i;
import x5.n;

/* loaded from: classes.dex */
public final class c implements t0, n {

    /* renamed from: a, reason: collision with root package name */
    public final y5.a f33941a;

    public final class a<T> implements s0<T>, n {
        public a() {
        }

        @Override // androidx.room.w
        public final Object a(String str, l lVar, vg.c cVar) {
            return c.this.a(str, lVar, cVar);
        }

        @Override // x5.n
        public final h6.b d() {
            return c.this.f33941a;
        }
    }

    public c(y5.a aVar) {
        this.f33941a = aVar;
    }

    @Override // androidx.room.w
    public final Object a(String str, l lVar, vg.c cVar) {
        e eVarB0 = this.f33941a.B0(str);
        try {
            Object objInvoke = lVar.invoke(eVarB0);
            ch.a.a(eVarB0, null);
            return objInvoke;
        } finally {
        }
    }

    @Override // androidx.room.t0
    public final Object b(i iVar) {
        return Boolean.valueOf(this.f33941a.f33939a.h0());
    }

    @Override // androidx.room.t0
    public final Object c(t0.a aVar, p pVar, i iVar) {
        return e(aVar, pVar, iVar);
    }

    @Override // x5.n
    public final h6.b d() {
        return this.f33941a;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(t0.a aVar, p pVar, vg.c cVar) throws Throwable {
        d dVar;
        i6.b bVar;
        c cVar2;
        i6.b bVar2;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i10 = dVar.f33947e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f33947e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(this, cVar);
            }
        }
        Object obj = dVar.f33945c;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = dVar.f33947e;
        if (i11 == 0) {
            q.b(obj);
            bVar = this.f33941a.f33939a;
            bVar.h0();
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                bVar.u();
            } else if (iOrdinal == 1) {
                bVar.I();
            } else {
                if (iOrdinal != 2) {
                    throw new pg.l();
                }
                bVar.i();
            }
            try {
                a aVar3 = new a();
                dVar.f33943a = this;
                dVar.f33944b = bVar;
                dVar.f33947e = 1;
                Object objInvoke = pVar.invoke(aVar3, dVar);
                if (objInvoke == aVar2) {
                    return aVar2;
                }
                obj = objInvoke;
                bVar2 = bVar;
                cVar2 = this;
            } catch (Throwable th2) {
                th = th2;
                cVar2 = this;
                bVar.U();
                if (!bVar.h0()) {
                    cVar2.getClass();
                }
                throw th;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar2 = dVar.f33944b;
            cVar2 = dVar.f33943a;
            try {
                q.b(obj);
            } catch (Throwable th3) {
                bVar = bVar2;
                th = th3;
                bVar.U();
                if (!bVar.h0()) {
                }
                throw th;
            }
        }
        bVar2.H();
        bVar2.U();
        if (!bVar2.h0()) {
            cVar2.getClass();
        }
        return obj;
    }
}
