package x5;

import android.database.SQLException;
import androidx.room.s0;
import androidx.room.t0;
import c9.u1;
import eh.p;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.r;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;
import pg.q;
import qg.t;
import x5.b;

/* loaded from: classes.dex */
public final class i implements t0, n {

    /* renamed from: a, reason: collision with root package name */
    public final e f32130a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f32131b;

    /* renamed from: c, reason: collision with root package name */
    public final qg.l<c> f32132c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f32133d;

    public final class a implements h6.d {

        /* renamed from: a, reason: collision with root package name */
        public final h6.d f32134a;

        /* renamed from: b, reason: collision with root package name */
        public final long f32135b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f32136c;

        public a(i iVar, h6.d delegate) {
            r.e(delegate, "delegate");
            this.f32136c = iVar;
            this.f32134a = delegate;
            this.f32135b = w5.d.a();
        }

        @Override // h6.d
        public final void C(int i10, String value) {
            r.e(value, "value");
            if (this.f32136c.f32133d.get()) {
                h6.a.c(21, "Statement is recycled");
                throw null;
            }
            if (this.f32135b == w5.d.a()) {
                this.f32134a.C(i10, value);
            } else {
                h6.a.c(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // h6.d
        public final String W(int i10) {
            if (this.f32136c.f32133d.get()) {
                h6.a.c(21, "Statement is recycled");
                throw null;
            }
            if (this.f32135b == w5.d.a()) {
                return this.f32134a.W(i10);
            }
            h6.a.c(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // java.lang.AutoCloseable
        public final void close() throws Exception {
            if (this.f32136c.f32133d.get()) {
                h6.a.c(21, "Statement is recycled");
                throw null;
            }
            if (this.f32135b == w5.d.a()) {
                this.f32134a.close();
            } else {
                h6.a.c(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // h6.d
        public final void d(int i10, long j10) {
            if (this.f32136c.f32133d.get()) {
                h6.a.c(21, "Statement is recycled");
                throw null;
            }
            if (this.f32135b == w5.d.a()) {
                this.f32134a.d(i10, j10);
            } else {
                h6.a.c(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // h6.d
        public final void e(int i10) {
            if (this.f32136c.f32133d.get()) {
                h6.a.c(21, "Statement is recycled");
                throw null;
            }
            if (this.f32135b == w5.d.a()) {
                this.f32134a.e(i10);
            } else {
                h6.a.c(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // h6.d
        public final int getColumnCount() {
            if (this.f32136c.f32133d.get()) {
                h6.a.c(21, "Statement is recycled");
                throw null;
            }
            if (this.f32135b == w5.d.a()) {
                return this.f32134a.getColumnCount();
            }
            h6.a.c(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // h6.d
        public final String getColumnName(int i10) {
            if (this.f32136c.f32133d.get()) {
                h6.a.c(21, "Statement is recycled");
                throw null;
            }
            if (this.f32135b == w5.d.a()) {
                return this.f32134a.getColumnName(i10);
            }
            h6.a.c(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // h6.d
        public final long getLong(int i10) {
            if (this.f32136c.f32133d.get()) {
                h6.a.c(21, "Statement is recycled");
                throw null;
            }
            if (this.f32135b == w5.d.a()) {
                return this.f32134a.getLong(i10);
            }
            h6.a.c(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // h6.d
        public final boolean isNull(int i10) {
            if (this.f32136c.f32133d.get()) {
                h6.a.c(21, "Statement is recycled");
                throw null;
            }
            if (this.f32135b == w5.d.a()) {
                return this.f32134a.isNull(i10);
            }
            h6.a.c(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // h6.d
        public final void reset() {
            if (this.f32136c.f32133d.get()) {
                h6.a.c(21, "Statement is recycled");
                throw null;
            }
            if (this.f32135b == w5.d.a()) {
                this.f32134a.reset();
            } else {
                h6.a.c(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // h6.d
        public final boolean t0() {
            if (this.f32136c.f32133d.get()) {
                h6.a.c(21, "Statement is recycled");
                throw null;
            }
            if (this.f32135b == w5.d.a()) {
                return this.f32134a.t0();
            }
            h6.a.c(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    public final class b<T> implements s0<T>, n {
        public b() {
        }

        @Override // androidx.room.w
        public final Object a(String str, eh.l lVar, vg.c cVar) {
            return i.this.a(str, lVar, cVar);
        }

        @Override // x5.n
        public final h6.b d() {
            return i.this.f32130a;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f32138a;

        public c(int i10) {
            this.f32138a = i10;
        }
    }

    public i(e delegate, boolean z10) {
        r.e(delegate, "delegate");
        this.f32130a = delegate;
        this.f32131b = z10;
        this.f32132c = new qg.l<>();
        this.f32133d = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.room.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, eh.l lVar, vg.c cVar) {
        m mVar;
        e eVar;
        i iVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i10 = mVar.f32163g;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                mVar.f32163g = i10 - PKIFailureInfo.systemUnavail;
            } else {
                mVar = new m(this, cVar);
            }
        }
        Object obj = mVar.f32161e;
        ug.a aVar = ug.a.f29706a;
        int i11 = mVar.f32163g;
        if (i11 == 0) {
            q.b(obj);
            if (this.f32133d.get()) {
                h6.a.c(21, "Connection is recycled");
                throw null;
            }
            x5.a aVar2 = (x5.a) mVar.getContext().get(x5.a.f32077b);
            if (aVar2 == null || aVar2.f32078a != this) {
                h6.a.c(21, "Attempted to use connection on a different coroutine");
                throw null;
            }
            mVar.f32157a = this;
            mVar.f32158b = str;
            mVar.f32159c = lVar;
            eVar = this.f32130a;
            mVar.f32160d = eVar;
            mVar.f32163g = 1;
            if (eVar.f32105b.h(mVar) == aVar) {
                return aVar;
            }
            iVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e eVar2 = mVar.f32160d;
            lVar = mVar.f32159c;
            String str2 = mVar.f32158b;
            iVar = mVar.f32157a;
            q.b(obj);
            eVar = eVar2;
            str = str2;
        }
        try {
            a aVar3 = new a(iVar, iVar.f32130a.B0(str));
            try {
                Object objInvoke = lVar.invoke(aVar3);
                ch.a.a(aVar3, null);
                return objInvoke;
            } finally {
            }
        } finally {
            eVar.l(null);
        }
    }

    @Override // androidx.room.t0
    public final Object b(vg.i iVar) {
        if (this.f32133d.get()) {
            h6.a.c(21, "Connection is recycled");
            throw null;
        }
        x5.a aVar = (x5.a) iVar.getContext().get(x5.a.f32077b);
        if (aVar != null && aVar.f32078a == this) {
            return Boolean.valueOf(!this.f32132c.isEmpty());
        }
        h6.a.c(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // androidx.room.t0
    public final Object c(t0.a aVar, p pVar, vg.i iVar) {
        if (this.f32133d.get()) {
            h6.a.c(21, "Connection is recycled");
            throw null;
        }
        x5.a aVar2 = (x5.a) iVar.getContext().get(x5.a.f32077b);
        if (aVar2 != null && aVar2.f32078a == this) {
            return g(aVar, pVar, iVar);
        }
        h6.a.c(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // x5.n
    public final h6.b d() {
        return this.f32130a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(t0.a aVar, vg.c cVar) {
        j jVar;
        e eVar;
        i iVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i10 = jVar.f32144f;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                jVar.f32144f = i10 - PKIFailureInfo.systemUnavail;
            } else {
                jVar = new j(this, cVar);
            }
        }
        Object obj = jVar.f32142d;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = jVar.f32144f;
        if (i11 == 0) {
            q.b(obj);
            jVar.f32139a = this;
            jVar.f32140b = aVar;
            eVar = this.f32130a;
            jVar.f32141c = eVar;
            jVar.f32144f = 1;
            if (eVar.f32105b.h(jVar) == aVar2) {
                return aVar2;
            }
            iVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e eVar2 = jVar.f32141c;
            t0.a aVar3 = jVar.f32140b;
            iVar = jVar.f32139a;
            q.b(obj);
            eVar = eVar2;
            aVar = aVar3;
        }
        try {
            qg.l<c> lVar = iVar.f32132c;
            e eVar3 = iVar.f32130a;
            int i12 = lVar.f22729c;
            if (lVar.isEmpty()) {
                int iOrdinal = aVar.ordinal();
                if (iOrdinal == 0) {
                    h6.a.a("BEGIN DEFERRED TRANSACTION", eVar3);
                } else if (iOrdinal == 1) {
                    h6.a.a("BEGIN IMMEDIATE TRANSACTION", eVar3);
                } else {
                    if (iOrdinal != 2) {
                        throw new pg.l();
                    }
                    h6.a.a("BEGIN EXCLUSIVE TRANSACTION", eVar3);
                }
            } else {
                h6.a.a("SAVEPOINT '" + i12 + '\'', eVar3);
            }
            lVar.addLast(new c(i12));
            f0 f0Var = f0.f21461a;
            eVar.l(null);
            return f0Var;
        } catch (Throwable th2) {
            eVar.l(null);
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(boolean z10, vg.c cVar) {
        k kVar;
        i iVar;
        e eVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i10 = kVar.f32150f;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f32150f = i10 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(this, cVar);
            }
        }
        Object obj = kVar.f32148d;
        ug.a aVar = ug.a.f29706a;
        int i11 = kVar.f32150f;
        if (i11 == 0) {
            q.b(obj);
            kVar.f32145a = this;
            e eVar2 = this.f32130a;
            kVar.f32146b = eVar2;
            kVar.f32147c = z10;
            kVar.f32150f = 1;
            if (eVar2.f32105b.h(kVar) == aVar) {
                return aVar;
            }
            iVar = this;
            eVar = eVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = kVar.f32147c;
            eVar = kVar.f32146b;
            iVar = kVar.f32145a;
            q.b(obj);
        }
        try {
            qg.l<c> lVar = iVar.f32132c;
            e eVar3 = iVar.f32130a;
            if (lVar.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            c cVar2 = (c) t.t(lVar);
            if (z10) {
                cVar2.getClass();
                if (lVar.isEmpty()) {
                    h6.a.a("END TRANSACTION", eVar3);
                } else {
                    h6.a.a("RELEASE SAVEPOINT '" + cVar2.f32138a + '\'', eVar3);
                }
            } else if (lVar.isEmpty()) {
                h6.a.a("ROLLBACK TRANSACTION", eVar3);
            } else {
                h6.a.a("ROLLBACK TRANSACTION TO SAVEPOINT '" + cVar2.f32138a + '\'', eVar3);
            }
            f0 f0Var = f0.f21461a;
            eVar.l(null);
            return f0Var;
        } catch (Throwable th2) {
            eVar.l(null);
            throw th2;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(1:(2:22|23)(1:(2:15|16)(4:17|70|18|66)))(6:24|74|25|(1:42)|43|(1:61)(1:46)))(1:29))(5:30|(1:32)|33|(1:36)|61)|72|37|(4:40|(0)|43|(0))|61|(2:(0)|(1:77))) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a5, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a6, code lost:
    
        r13 = r12;
        r12 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ad, code lost:
    
        r0.f32151a = null;
        r0.f32152b = null;
        r0.f32156f = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b7, code lost:
    
        if (r13.f(false, r0) == r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ba, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bb, code lost:
    
        throw r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bc, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bd, code lost:
    
        r9 = r12;
        r12 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c1, code lost:
    
        r0.f32151a = r9;
        r0.f32152b = r12;
        r0.f32156f = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00cb, code lost:
    
        if (r13.f(false, r0) != r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ce, code lost:
    
        r14 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cf, code lost:
    
        r13 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(t0.a aVar, p pVar, vg.c cVar) throws Throwable {
        l lVar;
        i iVar;
        i iVar2;
        int i10;
        boolean z10;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i11 = lVar.f32156f;
            if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                lVar.f32156f = i11 - PKIFailureInfo.systemUnavail;
            } else {
                lVar = new l(this, cVar);
            }
        }
        Object objInvoke = lVar.f32154d;
        ug.a aVar2 = ug.a.f29706a;
        int i12 = lVar.f32156f;
        Throwable th2 = null;
        if (i12 == 0) {
            q.b(objInvoke);
            if (aVar == null) {
                aVar = t0.a.f3088a;
            }
            lVar.f32151a = this;
            lVar.f32152b = (Serializable) pVar;
            lVar.f32156f = 1;
            if (e(aVar, lVar) != aVar2) {
                iVar = this;
            }
        }
        if (i12 != 1) {
            if (i12 == 2) {
                i10 = lVar.f32153c;
                iVar2 = (i) lVar.f32151a;
                try {
                    q.b(objInvoke);
                    z10 = i10 != 0;
                    lVar.f32151a = objInvoke;
                    lVar.f32156f = 3;
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    try {
                        if (!(th4 instanceof b.a)) {
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                return iVar2.f(z10, lVar) != aVar2 ? aVar2 : objInvoke;
            }
            if (i12 == 3 || i12 == 4) {
                Object obj = lVar.f32151a;
                q.b(objInvoke);
                return obj;
            }
            if (i12 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            th = (Throwable) lVar.f32152b;
            Throwable th6 = (Throwable) lVar.f32151a;
            try {
                q.b(objInvoke);
            } catch (SQLException e10) {
                e = e10;
                if (th6 != null) {
                    throw e;
                }
                u1.b(th6, e);
                throw th;
            }
            throw th;
        }
        pVar = (p) lVar.f32152b;
        iVar = (i) lVar.f32151a;
        q.b(objInvoke);
        b bVar = iVar.new b();
        lVar.f32151a = iVar;
        lVar.f32152b = null;
        lVar.f32153c = 1;
        lVar.f32156f = 2;
        objInvoke = pVar.invoke(bVar, lVar);
        if (objInvoke != aVar2) {
            iVar2 = iVar;
            i10 = 1;
            if (i10 != 0) {
            }
            lVar.f32151a = objInvoke;
            lVar.f32156f = 3;
            if (iVar2.f(z10, lVar) != aVar2) {
            }
        }
    }
}
