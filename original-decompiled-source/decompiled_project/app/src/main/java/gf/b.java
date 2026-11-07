package gf;

import cf.d;
import cf.e;
import cf.l;
import cf.o;
import cf.p;
import cf.u;
import cf.v;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b implements Closeable {
    public static final byte[] A;
    public static final byte[] B;
    public static final byte[] C;
    public static final byte[] D;
    public static final byte[] E;
    public static final byte[] F;
    public static final byte[] G;
    public static final byte[] H;
    public static final byte[] I;
    public static final byte[] K;
    public static final byte[] L;
    public static final byte[] M;

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f12047t;

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f12048v;

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f12049w;

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f12050x;

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f12051y;

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f12052z;

    /* renamed from: a, reason: collision with root package name */
    public final DecimalFormat f12053a;

    /* renamed from: b, reason: collision with root package name */
    public final DecimalFormat f12054b;

    /* renamed from: c, reason: collision with root package name */
    public final BufferedOutputStream f12055c;

    /* renamed from: d, reason: collision with root package name */
    public final a f12056d;

    /* renamed from: e, reason: collision with root package name */
    public long f12057e;

    /* renamed from: f, reason: collision with root package name */
    public long f12058f;

    /* renamed from: g, reason: collision with root package name */
    public final Hashtable f12059g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f12060h;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f12061j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f12062k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedList f12063l;

    /* renamed from: m, reason: collision with root package name */
    public final HashSet f12064m;

    /* renamed from: n, reason: collision with root package name */
    public final HashSet f12065n;

    /* renamed from: p, reason: collision with root package name */
    public p f12066p;

    /* renamed from: q, reason: collision with root package name */
    public hf.b f12067q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f12068r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f12069s;

    static {
        Charset charset = wf.a.f31520a;
        f12047t = "<<".getBytes(charset);
        f12048v = ">>".getBytes(charset);
        f12049w = new byte[]{32};
        f12050x = new byte[]{37};
        "PDF-1.4".getBytes(charset);
        f12051y = new byte[]{-10, -28, -4, -33};
        f12052z = "%%EOF".getBytes(charset);
        A = "R".getBytes(charset);
        B = "xref".getBytes(charset);
        C = "f".getBytes(charset);
        D = "n".getBytes(charset);
        E = "trailer".getBytes(charset);
        F = "startxref".getBytes(charset);
        G = "obj".getBytes(charset);
        H = "endobj".getBytes(charset);
        I = "[".getBytes(charset);
        K = "]".getBytes(charset);
        L = "stream".getBytes(charset);
        M = "endstream".getBytes(charset);
    }

    public b(BufferedOutputStream bufferedOutputStream) {
        Locale locale = Locale.US;
        this.f12053a = new DecimalFormat("0000000000", DecimalFormatSymbols.getInstance(locale));
        this.f12054b = new DecimalFormat("00000", DecimalFormatSymbols.getInstance(locale));
        this.f12057e = 0L;
        this.f12058f = 0L;
        this.f12059g = new Hashtable();
        this.f12060h = new HashMap();
        this.f12061j = new ArrayList();
        this.f12062k = new HashSet();
        this.f12063l = new LinkedList();
        this.f12064m = new HashSet();
        this.f12065n = new HashSet();
        this.f12066p = null;
        this.f12067q = null;
        this.f12068r = false;
        this.f12069s = false;
        this.f12055c = bufferedOutputStream;
        a aVar = new a(this.f12055c);
        aVar.f12045a = 0L;
        aVar.f12046b = false;
        this.f12056d = aVar;
    }

    public static void d0(byte[] bArr, FilterOutputStream filterOutputStream) throws IOException {
        int i10 = 0;
        for (byte b10 : bArr) {
            if (b10 < 0 || b10 == 13 || b10 == 10) {
                filterOutputStream.write(60);
                int length = bArr.length;
                while (i10 < length) {
                    wf.b.b(bArr[i10], filterOutputStream);
                    i10++;
                }
                filterOutputStream.write(62);
                return;
            }
        }
        filterOutputStream.write(40);
        int length2 = bArr.length;
        while (i10 < length2) {
            int i11 = bArr[i10];
            if (i11 == 40 || i11 == 41 || i11 == 92) {
                filterOutputStream.write(92);
                filterOutputStream.write(i11);
            } else {
                filterOutputStream.write(i11);
            }
            i10++;
        }
        filterOutputStream.write(41);
    }

    public final p E(cf.b bVar) {
        cf.b bVar2 = bVar instanceof o ? ((o) bVar).f5549b : bVar;
        Hashtable hashtable = this.f12059g;
        p pVar = (p) hashtable.get(bVar);
        if (pVar == null && bVar2 != null) {
            pVar = (p) hashtable.get(bVar2);
        }
        if (pVar != null) {
            return pVar;
        }
        long j10 = this.f12058f + 1;
        this.f12058f = j10;
        p pVar2 = new p(0, j10);
        hashtable.put(bVar, pVar2);
        if (bVar2 != null) {
            hashtable.put(bVar2, pVar2);
        }
        return pVar2;
    }

    public final void M(d dVar) throws IOException {
        if (!this.f12069s) {
            cf.b bVarH0 = dVar.H0(l.f5532w2);
            if (l.f5471g2.equals(bVarH0) || l.f5503p0.equals(bVarH0)) {
                this.f12069s = true;
            }
        }
        this.f12056d.write(f12047t);
        this.f12056d.h();
        for (Map.Entry<l, cf.b> entry : dVar.f5423b.entrySet()) {
            cf.b value = entry.getValue();
            if (value != null) {
                entry.getKey().f0(this);
                this.f12056d.write(f12049w);
                if (value instanceof d) {
                    d dVar2 = (d) value;
                    l lVar = l.G2;
                    cf.b bVarH02 = dVar2.H0(lVar);
                    if (bVarH02 != null && !lVar.equals(entry.getKey())) {
                        bVarH02.f5417a = true;
                    }
                    l lVar2 = l.W1;
                    cf.b bVarH03 = dVar2.H0(lVar2);
                    if (bVarH03 != null && !lVar2.equals(entry.getKey())) {
                        bVarH03.f5417a = true;
                    }
                    if (dVar2.f5417a) {
                        M(dVar2);
                    } else {
                        h(dVar2);
                        Z(dVar2);
                    }
                } else if (value instanceof o) {
                    cf.b bVar = ((o) value).f5549b;
                    if (this.f12068r || (bVar instanceof d) || bVar == null) {
                        h(value);
                        Z(value);
                    } else {
                        bVar.f0(this);
                    }
                } else if (this.f12069s && l.W.equals(entry.getKey())) {
                    long j10 = this.f12056d.f12045a;
                    value.f0(this);
                    long j11 = this.f12056d.f12045a;
                } else if (this.f12069s && l.B.equals(entry.getKey())) {
                    long j12 = this.f12056d.f12045a;
                    value.f0(this);
                    long j13 = this.f12056d.f12045a;
                    this.f12069s = false;
                } else {
                    value.f0(this);
                }
                this.f12056d.h();
            }
        }
        this.f12056d.write(f12048v);
        this.f12056d.h();
    }

    public final void N(hf.b bVar) throws NoSuchAlgorithmException, IOException {
        cf.a aVar;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f12067q = bVar;
        boolean z10 = true;
        if (bVar.f13000d) {
            this.f12068r = false;
            bVar.f12997a.f5428f.L0(l.f5530w0);
        } else if (bVar.l() != null) {
            lf.l lVarC = this.f12067q.l().c();
            if (lVarC.f17048g == null) {
                throw new IllegalStateException("PDF contains an encryption dictionary, please remove it with setAllSecurityToBeRemoved() or set a protection policy with protect()");
            }
            lVarC.h(this.f12067q);
            this.f12068r = true;
        } else {
            this.f12068r = false;
        }
        e eVar = this.f12067q.f12997a;
        d dVar = eVar.f5428f;
        cf.b bVarV0 = dVar.v0(l.V0);
        if (bVarV0 instanceof cf.a) {
            aVar = (cf.a) bVarV0;
            if (aVar.f5416b.size() == 2) {
                z10 = false;
            }
        } else {
            aVar = null;
        }
        if (aVar != null && aVar.f5416b.size() == 2) {
            z10 = false;
        }
        if (z10) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(Long.toString(jCurrentTimeMillis).getBytes(wf.a.f31523d));
                d dVarL0 = dVar.l0(l.f5458d1);
                if (dVarL0 != null) {
                    Iterator<cf.b> it = dVarL0.f5423b.values().iterator();
                    while (it.hasNext()) {
                        messageDigest.update(it.next().toString().getBytes(wf.a.f31523d));
                    }
                }
                u uVar = z10 ? new u(messageDigest.digest()) : (u) aVar.i0(0);
                u uVar2 = z10 ? uVar : new u(messageDigest.digest());
                cf.a aVar2 = new cf.a();
                aVar2.g0(uVar);
                aVar2.g0(uVar2);
                dVar.O0(l.V0, aVar2);
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
        eVar.f0(this);
    }

    public final void Z(cf.b bVar) throws IOException {
        p pVarE = E(bVar);
        String strValueOf = String.valueOf(pVarE.f5553a);
        Charset charset = wf.a.f31523d;
        this.f12056d.write(strValueOf.getBytes(charset));
        a aVar = this.f12056d;
        byte[] bArr = f12049w;
        aVar.write(bArr);
        this.f12056d.write(String.valueOf(pVarE.f5554b).getBytes(charset));
        this.f12056d.write(bArr);
        this.f12056d.write(A);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        a aVar = this.f12056d;
        if (aVar != null) {
            aVar.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(cf.b bVar) {
        p pVar;
        cf.b bVar2 = bVar instanceof o ? ((o) bVar).f5549b : bVar;
        if (this.f12064m.contains(bVar)) {
            return;
        }
        HashSet hashSet = this.f12062k;
        if (hashSet.contains(bVar)) {
            return;
        }
        HashSet hashSet2 = this.f12065n;
        if (hashSet2.contains(bVar2)) {
            return;
        }
        if (bVar2 == null || (pVar = (p) this.f12059g.get(bVar2)) == null) {
            this.f12063l.add(bVar);
            hashSet.add(bVar);
            if (bVar2 != null) {
                hashSet2.add(bVar2);
                return;
            }
            return;
        }
        jf.c cVar = (cf.b) this.f12060h.get(pVar);
        if (bVar instanceof v) {
        }
        if (cVar instanceof v) {
            ((v) cVar).getClass();
        }
    }

    public final void l(cf.b bVar) throws IOException {
        this.f12064m.add(bVar);
        this.f12066p = E(bVar);
        this.f12061j.add(new c(this.f12056d.f12045a, bVar, this.f12066p));
        String strValueOf = String.valueOf(this.f12066p.f5553a);
        Charset charset = wf.a.f31523d;
        this.f12056d.write(strValueOf.getBytes(charset));
        a aVar = this.f12056d;
        byte[] bArr = f12049w;
        aVar.write(bArr);
        this.f12056d.write(String.valueOf(this.f12066p.f5554b).getBytes(charset));
        this.f12056d.write(bArr);
        this.f12056d.write(G);
        this.f12056d.h();
        bVar.f0(this);
        this.f12056d.h();
        this.f12056d.write(H);
        this.f12056d.h();
    }

    public final void p(e eVar) throws IOException {
        this.f12056d.write(E);
        this.f12056d.h();
        d dVar = eVar.f5428f;
        ArrayList arrayList = this.f12061j;
        Collections.sort(arrayList);
        dVar.Q0(l.f5475h2, ((c) arrayList.get(arrayList.size() - 1)).f12073c.f5553a + 1);
        dVar.L0(l.Q1);
        if (!eVar.f5432k) {
            dVar.L0(l.I2);
        }
        dVar.L0(l.f5499o0);
        cf.a aVarK0 = dVar.k0(l.V0);
        if (aVarK0 != null) {
            aVarK0.f5417a = true;
        }
        dVar.f0(this);
    }

    public final void z() throws IOException {
        c cVar = c.f12070e;
        ArrayList arrayList = this.f12061j;
        arrayList.add(cVar);
        Collections.sort(arrayList);
        a aVar = this.f12056d;
        this.f12057e = aVar.f12045a;
        aVar.write(B);
        this.f12056d.h();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        long j10 = -2;
        long j11 = 1;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            long j12 = ((c) obj).f12073c.f5553a;
            if (j12 == j10 + 1) {
                j11++;
            } else if (j10 != -2) {
                arrayList2.add(Long.valueOf((j10 - j11) + 1));
                arrayList2.add(Long.valueOf(j11));
                j11 = 1;
            }
            j10 = j12;
        }
        if (arrayList.size() > 0) {
            arrayList2.add(Long.valueOf((j10 - j11) + 1));
            arrayList2.add(Long.valueOf(j11));
        }
        Long[] lArr = (Long[]) arrayList2.toArray(new Long[arrayList2.size()]);
        int length = lArr.length;
        if (length % 2 == 0) {
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12 += 2) {
                long jLongValue = lArr[i12 + 1].longValue();
                String strValueOf = String.valueOf(lArr[i12].longValue());
                Charset charset = wf.a.f31523d;
                this.f12056d.write(strValueOf.getBytes(charset));
                a aVar2 = this.f12056d;
                byte[] bArr = f12049w;
                aVar2.write(bArr);
                this.f12056d.write(String.valueOf(jLongValue).getBytes(charset));
                this.f12056d.h();
                int i13 = 0;
                while (i13 < jLongValue) {
                    int i14 = i11 + 1;
                    c cVar2 = (c) arrayList.get(i11);
                    String str = this.f12053a.format(cVar2.f12071a);
                    String str2 = this.f12054b.format(cVar2.f12073c.f5554b);
                    Charset charset2 = wf.a.f31523d;
                    this.f12056d.write(str.getBytes(charset2));
                    this.f12056d.write(bArr);
                    this.f12056d.write(str2.getBytes(charset2));
                    this.f12056d.write(bArr);
                    this.f12056d.write(cVar2.f12074d ? C : D);
                    this.f12056d.write(a.f12043c);
                    i13++;
                    i11 = i14;
                }
            }
        }
    }
}
