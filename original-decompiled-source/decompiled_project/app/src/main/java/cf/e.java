package cf;

import android.util.Log;
import ff.g;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes2.dex */
public final class e extends b implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public d f5428f;

    /* renamed from: h, reason: collision with root package name */
    public long f5430h;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5432k;

    /* renamed from: l, reason: collision with root package name */
    public final ef.g f5433l;

    /* renamed from: m, reason: collision with root package name */
    public long f5434m;

    /* renamed from: b, reason: collision with root package name */
    public float f5424b = 1.4f;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f5425c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f5426d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f5427e = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5429g = true;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5431j = false;

    public e(ef.g gVar) {
        this.f5433l = gVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f5431j) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f5425c.values());
        int size = arrayList.size();
        int i10 = 0;
        IOException iOExceptionA = null;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            b bVar = ((o) obj).f5549b;
            if (bVar instanceof t) {
                iOExceptionA = ef.a.a((t) bVar, "COSStream", iOExceptionA);
            }
        }
        ArrayList arrayList2 = this.f5427e;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            iOExceptionA = ef.a.a((t) obj2, "COSStream", iOExceptionA);
        }
        ef.g gVar = this.f5433l;
        if (gVar != null) {
            iOExceptionA = ef.a.a(gVar, "ScratchFile", iOExceptionA);
        }
        this.f5431j = true;
        if (iOExceptionA != null) {
            throw iOExceptionA;
        }
    }

    @Override // cf.b
    public final Object f0(gf.b bVar) throws IOException {
        Object obj;
        long j10;
        long j11;
        HashSet hashSet = bVar.f12062k;
        LinkedList linkedList = bVar.f12063l;
        bVar.f12056d.write(("%PDF-" + this.f5424b).getBytes(wf.a.f31523d));
        bVar.f12056d.h();
        bVar.f12056d.write(gf.b.f12050x);
        bVar.f12056d.write(gf.b.f12051y);
        bVar.f12056d.h();
        d dVar = this.f5428f;
        b bVarL0 = dVar.l0(l.Y1);
        b bVarL02 = dVar.l0(l.f5458d1);
        b bVarL03 = dVar.l0(l.f5530w0);
        if (bVarL0 != null) {
            bVar.h(bVarL0);
        }
        if (bVarL02 != null) {
            bVar.h(bVarL02);
        }
        while (linkedList.size() > 0) {
            b bVar2 = (b) linkedList.removeFirst();
            hashSet.remove(bVar2);
            bVar.l(bVar2);
        }
        bVar.f12068r = false;
        if (bVarL03 != null) {
            bVar.h(bVarL03);
        }
        while (linkedList.size() > 0) {
            b bVar3 = (b) linkedList.removeFirst();
            hashSet.remove(bVar3);
            bVar.l(bVar3);
        }
        d dVar2 = this.f5428f;
        long j12 = -1;
        long jI0 = dVar2 != null ? dVar2.I0(l.I2) : -1L;
        boolean z10 = this.f5432k;
        if (z10) {
            if (z10 || jI0 != -1) {
                t tVarG0 = g0();
                TreeMap treeMap = new TreeMap();
                TreeSet treeSet = new TreeSet();
                ArrayList arrayList = bVar.f12061j;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    gf.c cVar = (gf.c) obj2;
                    long j13 = j12;
                    treeSet.add(Long.valueOf(cVar.f12073c.f5553a));
                    if (cVar.f12074d) {
                        g.a aVar = new g.a();
                        p pVar = cVar.f12073c;
                        aVar.f11216a = pVar.f5554b;
                        long j14 = pVar.f5553a;
                        aVar.f11217b = j14;
                        treeMap.put(Long.valueOf(j14), aVar);
                    } else {
                        g.b bVar4 = new g.b();
                        p pVar2 = cVar.f12073c;
                        bVar4.f11218a = pVar2.f5554b;
                        bVar4.f11219b = cVar.f12071a;
                        treeMap.put(Long.valueOf(pVar2.f5553a), bVar4);
                    }
                    j12 = j13;
                }
                j10 = j12;
                d dVar3 = this.f5428f;
                dVar3.L0(l.Q1);
                for (Map.Entry<l, b> entry : dVar3.f5423b.entrySet()) {
                    l key = entry.getKey();
                    if (l.f5458d1.equals(key) || l.Y1.equals(key) || l.f5530w0.equals(key) || l.V0.equals(key) || l.Q1.equals(key)) {
                        tVarG0.O0(key, entry.getValue());
                    }
                }
                long j15 = bVar.f12058f + 2;
                bVar.f12057e = bVar.f12056d.f12045a;
                tVarG0.O0(l.f5532w2, l.H2);
                if (j15 == j10) {
                    throw new IllegalArgumentException("size is not set in xrefstream");
                }
                tVarG0.Q0(l.f5475h2, j15);
                LinkedList linkedList2 = new LinkedList();
                TreeSet treeSet2 = new TreeSet();
                j11 = jI0;
                long j16 = 0;
                treeSet2.add(0L);
                treeSet2.addAll(treeSet);
                Iterator it = treeSet2.iterator();
                Long l10 = null;
                Long lValueOf = null;
                while (it.hasNext()) {
                    Long l11 = (Long) it.next();
                    if (l10 == null) {
                        lValueOf = 1L;
                        l10 = l11;
                    }
                    if (lValueOf.longValue() + l10.longValue() == l11.longValue()) {
                        lValueOf = Long.valueOf(lValueOf.longValue() + 1);
                    }
                    if (lValueOf.longValue() + l10.longValue() < l11.longValue()) {
                        linkedList2.add(l10);
                        linkedList2.add(lValueOf);
                        lValueOf = 1L;
                        l10 = l11;
                    }
                }
                linkedList2.add(l10);
                linkedList2.add(lValueOf);
                a aVar2 = new a();
                Iterator it2 = linkedList2.iterator();
                while (it2.hasNext()) {
                    aVar2.g0(i.q0(((Long) it2.next()).longValue()));
                }
                tVarG0.O0(l.f5454c1, aVar2);
                int i11 = 3;
                long[] jArr = new long[3];
                Iterator it3 = treeMap.values().iterator();
                while (true) {
                    obj = null;
                    if (it3.hasNext()) {
                        Object next = it3.next();
                        if (next instanceof g.a) {
                            jArr[0] = Math.max(jArr[0], j16);
                            jArr[1] = Math.max(jArr[1], ((g.a) next).f11217b);
                            jArr[2] = Math.max(jArr[2], r14.f11216a);
                        } else if (next instanceof g.b) {
                            jArr[0] = Math.max(jArr[0], 1L);
                            jArr[1] = Math.max(jArr[1], ((g.b) next).f11219b);
                            jArr[2] = Math.max(jArr[2], r14.f11218a);
                        } else {
                            if (!(next instanceof g.c)) {
                                throw new RuntimeException("unexpected reference type");
                            }
                            jArr[0] = Math.max(jArr[0], 2L);
                            jArr[1] = Math.max(jArr[1], 0L);
                            jArr[2] = Math.max(jArr[2], 0L);
                            j16 = 0;
                            i11 = 3;
                        }
                        j16 = 0;
                        i11 = 3;
                    } else {
                        long j17 = j16;
                        int i12 = i11;
                        int[] iArr = new int[i12];
                        int i13 = 0;
                        while (i13 < i12) {
                            while (true) {
                                long j18 = jArr[i13];
                                if (j18 > j17) {
                                    iArr[i13] = iArr[i13] + 1;
                                    jArr[i13] = j18 >> 8;
                                    j17 = 0;
                                }
                            }
                            i13++;
                            i12 = 3;
                            j17 = 0;
                        }
                        a aVar3 = new a();
                        for (int i14 = 0; i14 < 3; i14++) {
                            aVar3.g0(i.q0(iArr[i14]));
                        }
                        tVarG0.O0(l.C2, aVar3);
                        r rVarV0 = tVarG0.V0(l.E0);
                        ff.g.a(rVarV0, 0L, iArr[0]);
                        ff.g.a(rVarV0, 0L, iArr[1]);
                        ff.g.a(rVarV0, 65535L, iArr[2]);
                        for (Object obj3 : treeMap.values()) {
                            if (obj3 instanceof g.a) {
                                ff.g.a(rVarV0, 0L, iArr[0]);
                                ff.g.a(rVarV0, ((g.a) obj3).f11217b, iArr[1]);
                                ff.g.a(rVarV0, r9.f11216a, iArr[2]);
                            } else if (obj3 instanceof g.b) {
                                ff.g.a(rVarV0, 1L, iArr[0]);
                                ff.g.a(rVarV0, ((g.b) obj3).f11219b, iArr[1]);
                                ff.g.a(rVarV0, r9.f11218a, iArr[2]);
                            } else {
                                if (!(obj3 instanceof g.c)) {
                                    throw new RuntimeException("unexpected reference type");
                                }
                                ff.g.a(rVarV0, 2L, iArr[0]);
                                ff.g.a(rVarV0, 0L, iArr[1]);
                                ff.g.a(rVarV0, 0L, iArr[2]);
                            }
                        }
                        rVarV0.flush();
                        rVarV0.close();
                        for (l lVar : tVarG0.f5423b.keySet()) {
                            if (!l.Y1.equals(lVar) && !l.f5458d1.equals(lVar) && !l.Q1.equals(lVar) && !l.f5530w0.equals(lVar)) {
                                tVarG0.v0(lVar).f5417a = true;
                            }
                        }
                        bVar.l(tVarG0);
                    }
                }
            } else {
                j10 = -1;
                j11 = jI0;
                obj = null;
            }
            if (!this.f5432k || j11 != j10) {
                d dVar4 = this.f5428f;
                dVar4.Q0(l.Q1, this.f5430h);
                if (j11 != j10) {
                    l lVar2 = l.I2;
                    dVar4.L0(lVar2);
                    dVar4.Q0(lVar2, bVar.f12057e);
                }
                bVar.z();
                bVar.p(this);
            }
        } else {
            obj = null;
            bVar.z();
            bVar.p(this);
        }
        bVar.f12056d.write(gf.b.F);
        bVar.f12056d.h();
        bVar.f12056d.write(String.valueOf(bVar.f12057e).getBytes(wf.a.f31523d));
        bVar.f12056d.h();
        bVar.f12056d.write(gf.b.f12052z);
        bVar.f12056d.h();
        return obj;
    }

    public final void finalize() throws IOException {
        if (this.f5431j) {
            return;
        }
        if (this.f5429g) {
            Log.w("PdfBox-Android", "Warning: You did not close a PDF Document");
        }
        close();
    }

    public final t g0() {
        t tVar = new t(this.f5433l);
        this.f5427e.add(tVar);
        return tVar;
    }

    public final o i0(p pVar) throws IOException {
        HashMap map = this.f5425c;
        o oVar = pVar != null ? (o) map.get(pVar) : null;
        if (oVar == null) {
            oVar = new o(null);
            if (pVar != null) {
                oVar.f5550c = pVar.f5553a;
                oVar.f5551d = pVar.f5554b;
                map.put(pVar, oVar);
            }
        }
        return oVar;
    }
}
