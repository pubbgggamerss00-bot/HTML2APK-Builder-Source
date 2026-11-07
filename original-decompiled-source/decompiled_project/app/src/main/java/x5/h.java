package x5;

import c0.g0;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.r;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;
import pg.q;
import qg.x;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f32122a;

    /* renamed from: b, reason: collision with root package name */
    public final eh.a<h6.b> f32123b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f32124c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public int f32125d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f32126e;

    /* renamed from: f, reason: collision with root package name */
    public final e[] f32127f;

    /* renamed from: g, reason: collision with root package name */
    public final yh.i f32128g;

    /* renamed from: h, reason: collision with root package name */
    public final p.c<e> f32129h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [E[], java.lang.Object[]] */
    public h(int i10, eh.a<? extends h6.b> aVar) {
        this.f32122a = i10;
        this.f32123b = aVar;
        this.f32127f = new e[i10];
        int i11 = yh.j.f34421a;
        this.f32128g = new yh.i(i10);
        p.c<e> cVar = new p.c<>();
        if (i10 < 1) {
            q.d.a("capacity must be >= 1");
            throw null;
        }
        if (i10 > 1073741824) {
            q.d.a("capacity must be <= 2^30");
            throw null;
        }
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        cVar.f20580d = i10 - 1;
        cVar.f20577a = new Object[i10];
        this.f32129h = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(vg.c cVar) {
        g gVar;
        h hVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i10 = gVar.f32121d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f32121d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(this, cVar);
            }
        }
        Object obj = gVar.f32119b;
        ug.a aVar = ug.a.f29706a;
        int i11 = gVar.f32121d;
        if (i11 == 0) {
            q.b(obj);
            gVar.f32118a = this;
            gVar.f32121d = 1;
            if (this.f32128g.b(gVar) == aVar) {
                return aVar;
            }
            hVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = gVar.f32118a;
            q.b(obj);
        }
        try {
            ReentrantLock reentrantLock = hVar.f32124c;
            p.c<e> cVar2 = hVar.f32129h;
            reentrantLock.lock();
            try {
                if (hVar.f32126e) {
                    h6.a.c(21, "Connection pool is closed");
                    throw null;
                }
                if (cVar2.f20578b == cVar2.f20579c && hVar.f32125d < hVar.f32122a) {
                    e eVar = new e(hVar.f32123b.invoke());
                    e[] eVarArr = hVar.f32127f;
                    int i12 = hVar.f32125d;
                    hVar.f32125d = i12 + 1;
                    eVarArr[i12] = eVar;
                    cVar2.a(eVar);
                }
                int i13 = cVar2.f20578b;
                if (i13 == cVar2.f20579c) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                e[] eVarArr2 = cVar2.f20577a;
                e eVar2 = eVarArr2[i13];
                eVarArr2[i13] = null;
                cVar2.f20578b = (i13 + 1) & cVar2.f20580d;
                return eVar2;
            } finally {
                reentrantLock.unlock();
            }
        } catch (Throwable th2) {
            hVar.f32128g.a();
            throw th2;
        }
    }

    public final void b() {
        ReentrantLock reentrantLock = this.f32124c;
        reentrantLock.lock();
        try {
            this.f32126e = true;
            for (e eVar : this.f32127f) {
                if (eVar != null) {
                    eVar.close();
                }
            }
            f0 f0Var = f0.f21461a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void c(StringBuilder sb) {
        p.c<e> cVar = this.f32129h;
        ReentrantLock reentrantLock = this.f32124c;
        reentrantLock.lock();
        try {
            rg.b bVarB = g0.b();
            int i10 = (cVar.f20579c - cVar.f20578b) & cVar.f20580d;
            for (int i11 = 0; i11 < i10; i11++) {
                if (i11 >= 0) {
                    int i12 = cVar.f20579c;
                    int i13 = cVar.f20578b;
                    int i14 = cVar.f20580d;
                    if (i11 < ((i12 - i13) & i14)) {
                        e eVar = cVar.f20577a[(i13 + i11) & i14];
                        r.b(eVar);
                        bVarB.add(eVar);
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            rg.b bVarA = g0.a(bVarB);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.f32122a + ", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("permits=");
            yh.i iVar = this.f32128g;
            iVar.getClass();
            sb2.append(Math.max(yh.g.f34416g.get(iVar), 0));
            sb2.append(", ");
            sb.append(sb2.toString());
            sb.append("queue=(size=" + bVarA.c() + ")[" + x.I(bVarA, null, null, null, null, 63) + "], ");
            sb.append(")");
            sb.append('\n');
            e[] eVarArr = this.f32127f;
            int length = eVarArr.length;
            int i15 = 0;
            for (int i16 = 0; i16 < length; i16++) {
                e eVar2 = eVarArr[i16];
                i15++;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\t\t[");
                sb3.append(i15);
                sb3.append("] - ");
                sb3.append(eVar2 != null ? eVar2.f32104a.toString() : null);
                sb.append(sb3.toString());
                sb.append('\n');
                if (eVar2 != null) {
                    eVar2.p(sb);
                }
            }
            f0 f0Var = f0.f21461a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void d(e connection) {
        r.e(connection, "connection");
        ReentrantLock reentrantLock = this.f32124c;
        reentrantLock.lock();
        try {
            this.f32129h.a(connection);
            f0 f0Var = f0.f21461a;
            reentrantLock.unlock();
            this.f32128g.a();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
