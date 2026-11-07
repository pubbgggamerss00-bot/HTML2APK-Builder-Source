package k7;

import ah.l;
import c9.u1;
import eh.p;
import hi.b0;
import hi.d0;
import hi.n;
import hi.x;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.r;
import mh.k;
import mh.t;
import pg.f0;
import pg.q;
import ph.g0;
import ph.i0;
import ph.j0;
import ph.z0;
import vg.i;

/* loaded from: classes.dex */
public final class c implements AutoCloseable {

    /* renamed from: t, reason: collision with root package name */
    public static final k f16012t = new k("[a-z0-9_-]{1,120}");

    /* renamed from: a, reason: collision with root package name */
    public final b0 f16013a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16014b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f16015c;

    /* renamed from: d, reason: collision with root package name */
    public final b0 f16016d;

    /* renamed from: e, reason: collision with root package name */
    public final b0 f16017e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f16018f;

    /* renamed from: g, reason: collision with root package name */
    public final uh.c f16019g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f16020h;

    /* renamed from: j, reason: collision with root package name */
    public long f16021j;

    /* renamed from: k, reason: collision with root package name */
    public int f16022k;

    /* renamed from: l, reason: collision with root package name */
    public d0 f16023l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16024m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f16025n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f16026p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16027q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f16028r;

    /* renamed from: s, reason: collision with root package name */
    public final k7.d f16029s;

    public final class a {

        /* renamed from: a, reason: collision with root package name */
        public final b f16030a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f16031b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean[] f16032c = new boolean[2];

        public a(b bVar) {
            this.f16030a = bVar;
        }

        public final void a(boolean z10) {
            c cVar = c.this;
            synchronized (cVar.f16020h) {
                try {
                    if (this.f16031b) {
                        throw new IllegalStateException("editor is closed");
                    }
                    if (r.a(this.f16030a.f16040g, this)) {
                        c.h(cVar, this, z10);
                    }
                    this.f16031b = true;
                    f0 f0Var = f0.f21461a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final b0 b(int i10) {
            b0 b0Var;
            c cVar = c.this;
            synchronized (cVar.f16020h) {
                if (this.f16031b) {
                    throw new IllegalStateException("editor is closed");
                }
                this.f16032c[i10] = true;
                b0 b0Var2 = this.f16030a.f16037d.get(i10);
                b8.g.a(cVar.f16029s, b0Var2);
                b0Var = b0Var2;
            }
            return b0Var;
        }
    }

    public final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f16034a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f16035b = new long[2];

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList<b0> f16036c = new ArrayList<>(2);

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList<b0> f16037d = new ArrayList<>(2);

        /* renamed from: e, reason: collision with root package name */
        public boolean f16038e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f16039f;

        /* renamed from: g, reason: collision with root package name */
        public a f16040g;

        /* renamed from: h, reason: collision with root package name */
        public int f16041h;

        public b(String str) {
            this.f16034a = str;
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i10 = 0; i10 < 2; i10++) {
                sb.append(i10);
                this.f16036c.add(c.this.f16013a.e(sb.toString()));
                sb.append(".tmp");
                this.f16037d.add(c.this.f16013a.e(sb.toString()));
                sb.setLength(length);
            }
        }

        public final C0163c a() {
            if (!this.f16038e || this.f16040g != null || this.f16039f) {
                return null;
            }
            ArrayList<b0> arrayList = this.f16036c;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                c cVar = c.this;
                if (i10 >= size) {
                    this.f16041h++;
                    return cVar.new C0163c(this);
                }
                if (!cVar.f16029s.M(arrayList.get(i10))) {
                    try {
                        cVar.e0(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
                i10++;
            }
        }
    }

    /* renamed from: k7.c$c, reason: collision with other inner class name */
    public final class C0163c implements AutoCloseable {

        /* renamed from: a, reason: collision with root package name */
        public final b f16043a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f16044b;

        public C0163c(b bVar) {
            this.f16043a = bVar;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            if (this.f16044b) {
                return;
            }
            this.f16044b = true;
            c cVar = c.this;
            synchronized (cVar.f16020h) {
                try {
                    b bVar = this.f16043a;
                    int i10 = bVar.f16041h - 1;
                    bVar.f16041h = i10;
                    if (i10 == 0 && bVar.f16039f) {
                        cVar.e0(bVar);
                    }
                    f0 f0Var = f0.f21461a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @vg.e(c = "coil3.disk.DiskLruCache$launchCleanup$1", f = "DiskLruCache.kt", l = {}, m = "invokeSuspend")
    public static final class d extends i implements p<i0, tg.e<? super f0>, Object> {
        public d(tg.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return c.this.new d(eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            q.b(obj);
            c cVar = c.this;
            synchronized (cVar.f16020h) {
                if (!cVar.f16025n || cVar.f16026p) {
                    return f0.f21461a;
                }
                try {
                    cVar.f0();
                } catch (IOException unused) {
                    cVar.f16027q = true;
                }
                try {
                    if (cVar.f16022k >= 2000) {
                        cVar.i0();
                    }
                } catch (IOException unused2) {
                    cVar.f16028r = true;
                    cVar.f16023l = x.a(new hi.f());
                }
                return f0.f21461a;
            }
        }
    }

    public c(long j10, n nVar, b0 b0Var, tg.h hVar) {
        this.f16013a = b0Var;
        this.f16014b = j10;
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f16015c = b0Var.e("journal");
        this.f16016d = b0Var.e("journal.tmp");
        this.f16017e = b0Var.e("journal.bkp");
        this.f16018f = new LinkedHashMap(0, 0.75f, true);
        tg.h hVarPlus = hVar.plus(l.a());
        g0 g0Var = (g0) hVar.get(g0.f21535b);
        if (g0Var == null) {
            wh.c cVar = z0.f21632a;
            g0Var = wh.b.f31563c;
        }
        this.f16019g = j0.a(hVarPlus.plus(g0Var.G0(1)));
        this.f16020h = new Object();
        this.f16029s = new k7.d(nVar);
    }

    public static void g0(String str) {
        if (f16012t.e(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x010d A[Catch: all -> 0x0033, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0011, B:12:0x0018, B:14:0x001e, B:16:0x002e, B:24:0x003c, B:26:0x0054, B:28:0x0067, B:30:0x0075, B:32:0x007c, B:27:0x005a, B:36:0x009c, B:38:0x00a3, B:41:0x00a8, B:43:0x00b9, B:46:0x00be, B:51:0x00f9, B:53:0x0104, B:58:0x0110, B:57:0x010d, B:47:0x00d6, B:49:0x00eb, B:50:0x00f6, B:35:0x008c, B:61:0x0114, B:62:0x011b), top: B:65:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(c cVar, a aVar, boolean z10) {
        synchronized (cVar.f16020h) {
            b bVar = aVar.f16030a;
            if (!r.a(bVar.f16040g, aVar)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z10 || bVar.f16039f) {
                for (int i10 = 0; i10 < 2; i10++) {
                    cVar.f16029s.E(bVar.f16037d.get(i10));
                }
            } else {
                for (int i11 = 0; i11 < 2; i11++) {
                    if (aVar.f16032c[i11] && !cVar.f16029s.M(bVar.f16037d.get(i11))) {
                        aVar.a(false);
                        return;
                    }
                }
                for (int i12 = 0; i12 < 2; i12++) {
                    b0 b0Var = bVar.f16037d.get(i12);
                    b0 b0Var2 = bVar.f16036c.get(i12);
                    if (cVar.f16029s.M(b0Var)) {
                        cVar.f16029s.l(b0Var, b0Var2);
                    } else {
                        b8.g.a(cVar.f16029s, bVar.f16036c.get(i12));
                    }
                    long j10 = bVar.f16035b[i12];
                    Long l10 = cVar.f16029s.Z(b0Var2).f13089d;
                    long jLongValue = l10 != null ? l10.longValue() : 0L;
                    bVar.f16035b[i12] = jLongValue;
                    cVar.f16021j = (cVar.f16021j - j10) + jLongValue;
                }
            }
            bVar.f16040g = null;
            if (bVar.f16039f) {
                cVar.e0(bVar);
                return;
            }
            cVar.f16022k++;
            d0 d0Var = cVar.f16023l;
            r.b(d0Var);
            if (z10 || bVar.f16038e) {
                bVar.f16038e = true;
                d0Var.O("CLEAN");
                d0Var.writeByte(32);
                d0Var.O(bVar.f16034a);
                for (long j11 : bVar.f16035b) {
                    d0Var.writeByte(32);
                    d0Var.l(j11);
                }
                d0Var.writeByte(10);
            } else {
                cVar.f16018f.remove(bVar.f16034a);
                d0Var.O("REMOVE");
                d0Var.writeByte(32);
                d0Var.O(bVar.f16034a);
                d0Var.writeByte(10);
            }
            d0Var.flush();
            if (cVar.f16021j > cVar.f16014b) {
                cVar.E();
            } else if (cVar.f16022k >= 2000) {
            }
            f0 f0Var = f0.f21461a;
        }
    }

    public final void E() {
        ph.h.c(this.f16019g, null, null, new d(null), 3);
    }

    public final d0 M() {
        k7.d dVar = this.f16029s;
        dVar.getClass();
        b0 file = this.f16015c;
        r.e(file, "file");
        return x.a(new e(dVar.h(file), new k7.b(this)));
    }

    public final void N() throws IOException {
        Iterator it = this.f16018f.values().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            int i10 = 0;
            if (bVar.f16040g == null) {
                while (i10 < 2) {
                    j10 += bVar.f16035b[i10];
                    i10++;
                }
            } else {
                bVar.f16040g = null;
                while (i10 < 2) {
                    b0 b0Var = bVar.f16036c.get(i10);
                    k7.d dVar = this.f16029s;
                    dVar.E(b0Var);
                    dVar.E(bVar.f16037d.get(i10));
                    i10++;
                }
                it.remove();
            }
        }
        this.f16021j = j10;
    }

    public final void Z() throws Throwable {
        hi.f0 f0VarB = x.b(this.f16029s.g0(this.f16015c));
        try {
            String strF = f0VarB.F(Long.MAX_VALUE);
            String strF2 = f0VarB.F(Long.MAX_VALUE);
            String strF3 = f0VarB.F(Long.MAX_VALUE);
            String strF4 = f0VarB.F(Long.MAX_VALUE);
            String strF5 = f0VarB.F(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strF) || !"1".equals(strF2) || !r.a(String.valueOf(3), strF3) || !r.a(String.valueOf(2), strF4) || strF5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strF + ", " + strF2 + ", " + strF3 + ", " + strF4 + ", " + strF5 + ']');
            }
            int i10 = 0;
            while (true) {
                try {
                    d0(f0VarB.F(Long.MAX_VALUE));
                    i10++;
                } catch (EOFException unused) {
                    this.f16022k = i10 - this.f16018f.size();
                    if (f0VarB.h()) {
                        this.f16023l = M();
                    } else {
                        i0();
                    }
                    f0 f0Var = f0.f21461a;
                    try {
                        f0VarB.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th != null) {
                        throw th;
                    }
                    return;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                f0VarB.close();
            } catch (Throwable th4) {
                u1.b(th, th4);
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f16020h) {
            try {
                if (this.f16025n && !this.f16026p) {
                    for (b bVar : (b[]) this.f16018f.values().toArray(new b[0])) {
                        a aVar = bVar.f16040g;
                        if (aVar != null) {
                            b bVar2 = aVar.f16030a;
                            if (r.a(bVar2.f16040g, aVar)) {
                                bVar2.f16039f = true;
                            }
                        }
                    }
                    f0();
                    j0.b(this.f16019g, null);
                    d0 d0Var = this.f16023l;
                    r.b(d0Var);
                    d0Var.close();
                    this.f16023l = null;
                    this.f16026p = true;
                    f0 f0Var = f0.f21461a;
                    return;
                }
                this.f16026p = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d0(String str) throws IOException {
        String strSubstring;
        int iX = mh.x.x(str, ' ', 0, 6);
        if (iX == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i10 = iX + 1;
        int iX2 = mh.x.x(str, ' ', i10, 4);
        LinkedHashMap linkedHashMap = this.f16018f;
        if (iX2 == -1) {
            strSubstring = str.substring(i10);
            r.d(strSubstring, "substring(...)");
            if (iX == 6 && t.p(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iX2);
            r.d(strSubstring, "substring(...)");
        }
        Object bVar = linkedHashMap.get(strSubstring);
        if (bVar == null) {
            bVar = new b(strSubstring);
            linkedHashMap.put(strSubstring, bVar);
        }
        b bVar2 = (b) bVar;
        if (iX2 == -1 || iX != 5 || !t.p(str, "CLEAN", false)) {
            if (iX2 == -1 && iX == 5 && t.p(str, "DIRTY", false)) {
                bVar2.f16040g = new a(bVar2);
                return;
            } else {
                if (iX2 != -1 || iX != 4 || !t.p(str, "READ", false)) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String strSubstring2 = str.substring(iX2 + 1);
        r.d(strSubstring2, "substring(...)");
        List listP = mh.x.P(strSubstring2, new char[]{' '});
        bVar2.f16038e = true;
        bVar2.f16040g = null;
        if (listP.size() != 2) {
            throw new IOException("unexpected journal line: " + listP);
        }
        try {
            int size = listP.size();
            for (int i11 = 0; i11 < size; i11++) {
                bVar2.f16035b[i11] = Long.parseLong((String) listP.get(i11));
            }
        } catch (NumberFormatException unused) {
            throw new IOException("unexpected journal line: " + listP);
        }
    }

    public final void e0(b bVar) throws IOException {
        d0 d0Var;
        int i10 = bVar.f16041h;
        String str = bVar.f16034a;
        if (i10 > 0 && (d0Var = this.f16023l) != null) {
            d0Var.O("DIRTY");
            d0Var.writeByte(32);
            d0Var.O(str);
            d0Var.writeByte(10);
            d0Var.flush();
        }
        if (bVar.f16041h > 0 || bVar.f16040g != null) {
            bVar.f16039f = true;
            return;
        }
        for (int i11 = 0; i11 < 2; i11++) {
            this.f16029s.E(bVar.f16036c.get(i11));
            long j10 = this.f16021j;
            long[] jArr = bVar.f16035b;
            this.f16021j = j10 - jArr[i11];
            jArr[i11] = 0;
        }
        this.f16022k++;
        d0 d0Var2 = this.f16023l;
        if (d0Var2 != null) {
            d0Var2.O("REMOVE");
            d0Var2.writeByte(32);
            d0Var2.O(str);
            d0Var2.writeByte(10);
            d0Var2.flush();
        }
        this.f16018f.remove(str);
        if (this.f16022k >= 2000) {
            E();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        e0(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f0() throws IOException {
        while (this.f16021j > this.f16014b) {
            for (b bVar : this.f16018f.values()) {
                if (!bVar.f16039f) {
                    break;
                }
            }
            return;
        }
        this.f16027q = false;
    }

    public final void i0() {
        Throwable th2;
        synchronized (this.f16020h) {
            try {
                d0 d0Var = this.f16023l;
                if (d0Var != null) {
                    d0Var.close();
                }
                d0 d0VarA = x.a(this.f16029s.f0(this.f16016d, false));
                try {
                    d0VarA.O("libcore.io.DiskLruCache");
                    d0VarA.writeByte(10);
                    d0VarA.O("1");
                    d0VarA.writeByte(10);
                    d0VarA.l(3);
                    d0VarA.writeByte(10);
                    d0VarA.l(2);
                    d0VarA.writeByte(10);
                    d0VarA.writeByte(10);
                    for (b bVar : this.f16018f.values()) {
                        if (bVar.f16040g != null) {
                            d0VarA.O("DIRTY");
                            d0VarA.writeByte(32);
                            d0VarA.O(bVar.f16034a);
                            d0VarA.writeByte(10);
                        } else {
                            d0VarA.O("CLEAN");
                            d0VarA.writeByte(32);
                            d0VarA.O(bVar.f16034a);
                            for (long j10 : bVar.f16035b) {
                                d0VarA.writeByte(32);
                                d0VarA.l(j10);
                            }
                            d0VarA.writeByte(10);
                        }
                    }
                    f0 f0Var = f0.f21461a;
                    try {
                        d0VarA.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        d0VarA.close();
                    } catch (Throwable th5) {
                        u1.b(th4, th5);
                    }
                    th2 = th4;
                }
                if (th2 != null) {
                    throw th2;
                }
                if (this.f16029s.M(this.f16015c)) {
                    this.f16029s.l(this.f16015c, this.f16017e);
                    this.f16029s.l(this.f16016d, this.f16015c);
                    this.f16029s.E(this.f16017e);
                } else {
                    this.f16029s.l(this.f16016d, this.f16015c);
                }
                this.f16023l = M();
                this.f16022k = 0;
                this.f16024m = false;
                this.f16028r = false;
                f0 f0Var2 = f0.f21461a;
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    public final a l(String str) {
        synchronized (this.f16020h) {
            if (this.f16026p) {
                throw new IllegalStateException("cache is closed");
            }
            g0(str);
            z();
            b bVar = (b) this.f16018f.get(str);
            if ((bVar != null ? bVar.f16040g : null) != null) {
                return null;
            }
            if (bVar != null && bVar.f16041h != 0) {
                return null;
            }
            if (!this.f16027q && !this.f16028r) {
                d0 d0Var = this.f16023l;
                r.b(d0Var);
                d0Var.O("DIRTY");
                d0Var.writeByte(32);
                d0Var.O(str);
                d0Var.writeByte(10);
                d0Var.flush();
                if (this.f16024m) {
                    return null;
                }
                if (bVar == null) {
                    bVar = new b(str);
                    this.f16018f.put(str, bVar);
                }
                a aVar = new a(bVar);
                bVar.f16040g = aVar;
                return aVar;
            }
            E();
            return null;
        }
    }

    public final C0163c p(String str) {
        C0163c c0163cA;
        synchronized (this.f16020h) {
            if (this.f16026p) {
                throw new IllegalStateException("cache is closed");
            }
            g0(str);
            z();
            b bVar = (b) this.f16018f.get(str);
            if (bVar != null && (c0163cA = bVar.a()) != null) {
                boolean z10 = true;
                this.f16022k++;
                d0 d0Var = this.f16023l;
                r.b(d0Var);
                d0Var.O("READ");
                d0Var.writeByte(32);
                d0Var.O(str);
                d0Var.writeByte(10);
                d0Var.flush();
                if (this.f16022k < 2000) {
                    z10 = false;
                }
                if (z10) {
                    E();
                }
                return c0163cA;
            }
            return null;
        }
    }

    public final void z() {
        synchronized (this.f16020h) {
            try {
                if (this.f16025n) {
                    return;
                }
                this.f16029s.E(this.f16016d);
                if (this.f16029s.M(this.f16017e)) {
                    if (this.f16029s.M(this.f16015c)) {
                        this.f16029s.E(this.f16017e);
                    } else {
                        this.f16029s.l(this.f16017e, this.f16015c);
                    }
                }
                if (this.f16029s.M(this.f16015c)) {
                    try {
                        Z();
                        N();
                        this.f16025n = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            close();
                            b8.g.b(this.f16029s, this.f16013a);
                            this.f16026p = false;
                        } catch (Throwable th2) {
                            this.f16026p = false;
                            throw th2;
                        }
                    }
                }
                i0();
                this.f16025n = true;
                f0 f0Var = f0.f21461a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
