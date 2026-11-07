package ff;

import android.util.Log;
import c2.u;
import cf.m;
import cf.n;
import cf.o;
import cf.p;
import cf.s;
import cf.t;
import com.yalantis.ucrop.view.CropImageView;
import ff.k;
import h1.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import lf.l;
import m0.r;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

/* loaded from: classes2.dex */
public class b extends a {

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f11190e;

    /* renamed from: f, reason: collision with root package name */
    public final ef.c f11191f;

    /* renamed from: g, reason: collision with root package name */
    public final String f11192g;

    /* renamed from: h, reason: collision with root package name */
    public long f11193h;

    /* renamed from: i, reason: collision with root package name */
    public long f11194i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f11195j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f11196k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11197l;

    /* renamed from: m, reason: collision with root package name */
    public HashMap f11198m;

    /* renamed from: n, reason: collision with root package name */
    public Long f11199n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f11200o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f11201p;

    /* renamed from: q, reason: collision with root package name */
    public lf.e f11202q;

    /* renamed from: r, reason: collision with root package name */
    public l f11203r;

    /* renamed from: s, reason: collision with root package name */
    public int f11204s;

    /* renamed from: t, reason: collision with root package name */
    public final k f11205t;

    /* renamed from: u, reason: collision with root package name */
    public final byte[] f11206u;

    /* renamed from: v, reason: collision with root package name */
    public static final char[] f11185v = {'x', 'r', 'e', 'f'};

    /* renamed from: w, reason: collision with root package name */
    public static final char[] f11186w = {'/', 'X', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'e', 'f'};

    /* renamed from: x, reason: collision with root package name */
    public static final char[] f11187x = {'s', 't', 'a', 'r', 't', 'x', 'r', 'e', 'f'};

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f11188y = {101, 110, 100, 115, 116, 114, 101, 97, 109};

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f11189z = {101, 110, 100, 111, 98, 106};
    public static final char[] A = {'%', '%', 'E', 'O', 'F'};
    public static final char[] B = {'o', 'b', 'j'};
    public static final char[] C = {'t', 'r', 'a', 'i', 'l', 'e', 'r'};
    public static final char[] D = {'/', 'O', 'b', 'j', 'S', 't', 'm'};

    public b(ef.c cVar) {
        super(new i(cVar));
        this.f11190e = new byte[2048];
        this.f11192g = "";
        this.f11195j = true;
        this.f11196k = false;
        this.f11197l = false;
        this.f11198m = null;
        this.f11199n = null;
        this.f11200o = null;
        this.f11201p = null;
        this.f11202q = null;
        this.f11203r = null;
        this.f11204s = 2048;
        this.f11205t = new k();
        this.f11206u = new byte[8192];
        this.f11191f = cVar;
        this.f11192g = "";
    }

    public static o A(o oVar, Long l10, o oVar2, Long l11) {
        return (oVar2 == null || (oVar2.f5550c != oVar.f5550c ? !(l11 == null || l10.longValue() <= l11.longValue()) : oVar2.f5551d < oVar.f5551d)) ? oVar : oVar2;
    }

    public static boolean C(cf.d dVar) {
        if (dVar.f5423b.containsKey(cf.l.K1)) {
            return false;
        }
        if (dVar.f5423b.containsKey(cf.l.f5464f)) {
            return false;
        }
        if (dVar.f5423b.containsKey(cf.l.f5488l0)) {
            return false;
        }
        if (dVar.f5423b.containsKey(cf.l.f5520t1)) {
            return true;
        }
        if (dVar.f5423b.containsKey(cf.l.f5521t2)) {
            return true;
        }
        if (dVar.f5423b.containsKey(cf.l.f5525v)) {
            return true;
        }
        if (dVar.f5423b.containsKey(cf.l.f5505p2)) {
            return true;
        }
        if (dVar.f5423b.containsKey(cf.l.f5474h1)) {
            return true;
        }
        if (dVar.f5423b.containsKey(cf.l.Z)) {
            return true;
        }
        if (dVar.f5423b.containsKey(cf.l.R1)) {
            return true;
        }
        return dVar.f5423b.containsKey(cf.l.Y);
    }

    public static int E(char[] cArr, byte[] bArr, int i10) {
        int length = cArr.length - 1;
        char c10 = cArr[length];
        while (true) {
            int i11 = length;
            while (true) {
                i10--;
                if (i10 < 0) {
                    return -1;
                }
                if (bArr[i10] == c10) {
                    i11--;
                    if (i11 < 0) {
                        return i10;
                    }
                    c10 = cArr[i11];
                } else if (i11 < length) {
                    break;
                }
            }
            c10 = cArr[length];
        }
    }

    public static long T(long j10, ArrayList arrayList) {
        int size = arrayList.size();
        Long lValueOf = null;
        int i10 = -1;
        for (int i11 = 0; i11 < size; i11++) {
            long jLongValue = j10 - ((Long) arrayList.get(i11)).longValue();
            if (lValueOf == null || Math.abs(lValueOf.longValue()) > Math.abs(jLongValue)) {
                lValueOf = Long.valueOf(jLongValue);
                i10 = i11;
            }
        }
        if (i10 > -1) {
            return ((Long) arrayList.get(i10)).longValue();
        }
        return -1L;
    }

    public static void v(LinkedList linkedList, cf.b bVar, HashSet hashSet) {
        if (bVar instanceof o) {
            if (hashSet.add(Long.valueOf((((o) bVar).f5550c << 32) | r0.f5551d))) {
                linkedList.add(bVar);
                return;
            }
            return;
        }
        if ((bVar instanceof cf.d) || (bVar instanceof cf.a)) {
            linkedList.add(bVar);
        }
    }

    public static int y(cf.d dVar, HashSet hashSet) {
        cf.b bVarV0 = dVar.v0(cf.l.f5477i1);
        int iY = 0;
        if (bVarV0 instanceof cf.a) {
            cf.a aVar = (cf.a) bVarV0;
            ArrayList arrayList = new ArrayList(aVar.f5416b);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                cf.b bVar = (cf.b) obj;
                if (bVar instanceof o) {
                    o oVar = (o) bVar;
                    if (!hashSet.contains(oVar)) {
                        cf.b bVar2 = oVar.f5549b;
                        if (bVar2 == null || bVar2.equals(m.f5548c)) {
                            Log.w("PdfBox-Android", "Removed null object " + bVar + " from pages dictionary");
                            aVar.v0(bVar);
                        } else if (bVar2 instanceof cf.d) {
                            cf.d dVar2 = (cf.d) bVar2;
                            cf.l lVarQ0 = dVar2.q0(cf.l.f5532w2);
                            if (cf.l.I1.equals(lVarQ0)) {
                                hashSet.add(oVar);
                                iY = y(dVar2, hashSet) + iY;
                            } else if (cf.l.H1.equals(lVarQ0)) {
                                iY++;
                            }
                        }
                    }
                }
                aVar.v0(bVar);
            }
        }
        dVar.N0(cf.l.X, iY);
        return iY;
    }

    public final long B() throws IOException {
        ef.c cVar = this.f11191f;
        try {
            long j10 = this.f11194i;
            int i10 = this.f11204s;
            if (j10 < i10) {
                i10 = (int) j10;
            }
            byte[] bArr = new byte[i10];
            long j11 = j10 - i10;
            cVar.seek(j11);
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                int i13 = cVar.read(bArr, i11, i12);
                if (i13 < 1) {
                    throw new IOException("No more bytes to read for trailing buffer, but expected: " + i12);
                }
                i11 += i13;
            }
            cVar.seek(0L);
            char[] cArr = A;
            int iE = E(cArr, bArr, i10);
            if (iE >= 0) {
                i10 = iE;
            } else {
                if (!this.f11195j) {
                    throw new IOException("Missing end of file marker '" + new String(cArr) + "'");
                }
                Log.d("PdfBox-Android", "Missing end of file marker '" + new String(cArr) + "'");
            }
            int iE2 = E(f11187x, bArr, i10);
            if (iE2 >= 0) {
                return j11 + iE2;
            }
            throw new IOException("Missing 'startxref' marker.");
        } catch (Throwable th2) {
            cVar.seek(0L);
            throw th2;
        }
    }

    public final boolean D(char[] cArr) throws IOException {
        ef.c cVar = this.f11191f;
        long j10 = cVar.f8712l;
        int length = cArr.length;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z10 = true;
                break;
            }
            if (cVar.read() != cArr[i10]) {
                break;
            }
            i10++;
        }
        cVar.seek(j10);
        return z10;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t F(cf.d dVar) throws IOException, NumberFormatException {
        boolean z10;
        t tVar;
        s sVarX0;
        String strR;
        t tVar2;
        boolean z11;
        boolean z12;
        t tVar3 = new t(this.f11184c.f5433l);
        for (Map.Entry<cf.l, cf.b> entry : dVar.f5423b.entrySet()) {
            tVar3.O0(entry.getKey(), entry.getValue());
        }
        r();
        u();
        cf.b bVarH0 = dVar.H0(cf.l.f5485k1);
        cf.l lVarQ0 = dVar.q0(cf.l.f5532w2);
        ef.c cVar = this.f11191f;
        n nVar = null;
        if (bVarH0 != null) {
            if (bVarH0 instanceof n) {
                nVar = (n) bVarH0;
            } else {
                if (!(bVarH0 instanceof o)) {
                    throw new IOException("Wrong type of length object: ".concat(bVarH0.getClass().getSimpleName()));
                }
                o oVar = (o) bVarH0;
                jf.c cVar2 = oVar.f5549b;
                if (cVar2 == null) {
                    long j10 = cVar.f8712l;
                    J(oVar.f5551d, oVar.f5550c, cf.l.A1.equals(lVarQ0));
                    cVar.seek(j10);
                    cVar2 = oVar.f5549b;
                }
                if (cVar2 == null) {
                    throw new IOException("Length object content was not read.");
                }
                if (m.f5548c == cVar2) {
                    Log.w("PdfBox-Android", "Length object (" + oVar.f5550c + " " + oVar.f5551d + ") not found");
                } else {
                    if (!(cVar2 instanceof n)) {
                        throw new IOException("Wrong type of referenced length object " + oVar + ": " + cVar2.getClass().getSimpleName());
                    }
                    nVar = (n) cVar2;
                }
            }
        }
        boolean z13 = this.f11195j;
        if (nVar == null) {
            if (!z13) {
                throw new IOException("Missing length for stream.");
            }
            Log.w("PdfBox-Android", "The stream doesn't provide any stream length, using fallback readUntilEnd, at offset " + cVar.f8712l);
        }
        try {
            if (nVar != null) {
                long jL0 = nVar.l0();
                long j11 = cVar.f8712l;
                long j12 = j11 + jL0;
                if (j12 > this.f11194i) {
                    StringBuilder sbA = y.a("The end of the stream is out of range, using workaround to read the stream, stream start position: ", ", length: ", j11);
                    sbA.append(jL0);
                    sbA.append(", expected end position: ");
                    sbA.append(j12);
                    Log.w("PdfBox-Android", sbA.toString());
                    z10 = z13;
                    tVar2 = tVar3;
                    z12 = false;
                } else {
                    cVar.seek(j12);
                    t();
                    int iPeek = cVar.peek();
                    byte[] bArr = f11188y;
                    z10 = z13;
                    if (iPeek == bArr[0]) {
                        byte[] bArr2 = new byte[9];
                        tVar2 = tVar3;
                        int i10 = cVar.read(bArr2, 0, 9);
                        for (int i11 = 9; i10 < i11; i11 = 9) {
                            int i12 = cVar.read(bArr2, i10, 9 - i10);
                            if (i12 < 0) {
                                break;
                            }
                            i10 += i12;
                        }
                        boolean zEquals = Arrays.equals(bArr, bArr2);
                        cVar.h(i10);
                        z11 = zEquals;
                    } else {
                        tVar2 = tVar3;
                        z11 = false;
                    }
                    if (z11) {
                        z12 = true;
                    } else {
                        StringBuilder sbA2 = y.a("The end of the stream doesn't point to the correct offset, using workaround to read the stream, stream start position: ", ", length: ", j11);
                        sbA2.append(jL0);
                        sbA2.append(", expected end position: ");
                        sbA2.append(j12);
                        Log.w("PdfBox-Android", sbA2.toString());
                        z12 = false;
                    }
                    cVar.seek(j11);
                }
                if (z12) {
                    s sVarX02 = tVar2.X0();
                    try {
                        P(sVarX02, nVar);
                        sVarX02.close();
                        tVar = tVar2;
                        tVar.O0(cf.l.f5485k1, nVar);
                        strR = r();
                        if (!strR.equals("endobj") && z10) {
                            Log.w("PdfBox-Android", "stream ends with 'endobj' instead of 'endstream' at offset " + cVar.f8712l);
                            cVar.h(6);
                            return tVar;
                        }
                        if (strR.length() <= 9 && z10 && strR.startsWith("endstream")) {
                            StringBuilder sbA3 = e.e.a("stream ends with '", strR, "' instead of 'endstream' at offset ");
                            sbA3.append(cVar.f8712l);
                            Log.w("PdfBox-Android", sbA3.toString());
                            cVar.h(strR.substring(9).getBytes(wf.a.f31523d).length);
                            return tVar;
                        }
                        if (!strR.equals("endstream")) {
                            return tVar;
                        }
                        StringBuilder sbA4 = e.e.a("Error reading stream, expected='endstream' actual='", strR, "' at offset ");
                        sbA4.append(cVar.f8712l);
                        throw new IOException(sbA4.toString());
                    } catch (Throwable th2) {
                        sVarX02.close();
                        tVar2.O0(cf.l.f5485k1, nVar);
                        throw th2;
                    }
                }
                tVar = tVar2;
            } else {
                z10 = z13;
                tVar = tVar3;
            }
            c cVar3 = new c(sVarX0);
            cVar3.f11207a = false;
            cVar3.f11208b = false;
            cVar3.f11209c = 0;
            cVar3.f11210d = true;
            O(cVar3);
            sVarX0.close();
            if (nVar != null) {
                tVar.O0(cf.l.f5485k1, nVar);
            }
            strR = r();
            if (!strR.equals("endobj")) {
            }
            if (strR.length() <= 9) {
            }
            if (!strR.equals("endstream")) {
            }
        } catch (Throwable th3) {
            sVarX0.close();
            if (nVar != null) {
                tVar.O0(cf.l.f5485k1, nVar);
            }
            throw th3;
        }
        sVarX0 = tVar.X0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01c5, code lost:
    
        throw new java.io.IOException(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01d6, code lost:
    
        if (r2.isEmpty() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01d9, code lost:
    
        r5 = ((java.util.List) r2.remove(r2.firstKey())).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01eb, code lost:
    
        if (r5.hasNext() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ed, code lost:
    
        r7 = (cf.o) r5.next();
        r8 = J(r7.f5551d, r7.f5550c, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01fc, code lost:
    
        if (r8 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01fe, code lost:
    
        r7.f5549b = r8;
        v(r1, r8, r4);
        r3.add(java.lang.Long.valueOf((r7.f5550c << 32) | r7.f5551d));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(cf.d dVar) throws IOException, NumberFormatException {
        LinkedList linkedList = new LinkedList();
        TreeMap treeMap = new TreeMap();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator<cf.b> it = dVar.f5423b.values().iterator();
        while (it.hasNext()) {
            v(linkedList, it.next(), hashSet2);
        }
        loop1: while (true) {
            if (!linkedList.isEmpty() || !treeMap.isEmpty()) {
                while (true) {
                    cf.b bVar = (cf.b) linkedList.poll();
                    if (bVar == null) {
                        break;
                    }
                    if (bVar instanceof cf.d) {
                        Iterator<cf.b> it2 = ((cf.d) bVar).f5423b.values().iterator();
                        while (it2.hasNext()) {
                            v(linkedList, it2.next(), hashSet2);
                        }
                    } else if (bVar instanceof cf.a) {
                        ArrayList arrayList = ((cf.a) bVar).f5416b;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            v(linkedList, (cf.b) obj, hashSet2);
                        }
                    } else if (bVar instanceof o) {
                        o oVar = (o) bVar;
                        long j10 = oVar.f5550c;
                        int i11 = oVar.f5551d;
                        long j11 = (j10 << 32) | i11;
                        p pVar = new p(i11, j10);
                        if (hashSet.contains(Long.valueOf(j11))) {
                            continue;
                        } else {
                            Long l10 = (Long) this.f11184c.f5426d.get(pVar);
                            boolean z10 = this.f11195j;
                            if (l10 == null && z10) {
                                x();
                                l10 = (Long) this.f11198m.get(pVar);
                                if (l10 != null) {
                                    Log.d("PdfBox-Android", "Set missing " + l10 + " for object " + pVar);
                                    this.f11184c.f5426d.put(pVar, l10);
                                }
                            }
                            if (l10 == null || l10.longValue() == 0) {
                                this.f11184c.i0(pVar).f5549b = m.f5548c;
                            } else if (l10.longValue() > 0) {
                                treeMap.put(l10, Collections.singletonList(oVar));
                            } else {
                                p pVar2 = new p(0, (int) (-l10.longValue()));
                                Long l11 = (Long) this.f11184c.f5426d.get(pVar2);
                                if (l11 == null || l11.longValue() <= 0) {
                                    if (z10) {
                                        x();
                                        l11 = (Long) this.f11198m.get(pVar2);
                                        if (l11 != null) {
                                            Log.d("PdfBox-Android", "Set missing " + l11 + " for object " + pVar2);
                                            this.f11184c.f5426d.put(pVar2, l11);
                                        } else {
                                            Log.w("PdfBox-Android", "Invalid object stream xref object reference for key '" + pVar + "': " + l11);
                                        }
                                    } else {
                                        String str = "Invalid object stream xref object reference for key '" + pVar + "': " + l11;
                                        if (!z10 || l11 != null) {
                                            break loop1;
                                        } else {
                                            Log.w("PdfBox-Android", str);
                                        }
                                    }
                                }
                                List arrayList2 = (List) treeMap.get(l11);
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                    treeMap.put(l11, arrayList2);
                                } else if (!(arrayList2 instanceof ArrayList)) {
                                    throw new IOException(oVar + " cannot be assigned to offset " + l11 + ", this belongs to " + arrayList2.get(0));
                                }
                                arrayList2.add(oVar);
                            }
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void H(o oVar) throws IOException, NumberFormatException {
        J(oVar.f5551d, oVar.f5550c, true);
        cf.b bVar = oVar.f5549b;
        if (!(bVar instanceof cf.d)) {
            throw new IOException("Dictionary object expected at offset " + this.f11191f.f8712l);
        }
        for (cf.b bVar2 : ((cf.d) bVar).f5423b.values()) {
            if (bVar2 instanceof o) {
                o oVar2 = (o) bVar2;
                if (oVar2.f5549b == null) {
                    H(oVar2);
                }
            }
        }
    }

    public final boolean I(String str, String str2) throws IOException, NumberFormatException {
        String strO = o();
        if (!strO.contains(str)) {
            strO = o();
            while (!strO.contains(str) && (strO.length() <= 0 || !Character.isDigit(strO.charAt(0)))) {
                strO = o();
            }
        }
        boolean zContains = strO.contains(str);
        ef.c cVar = this.f11191f;
        if (!zContains) {
            cVar.seek(0L);
            return false;
        }
        int iIndexOf = strO.indexOf(str);
        if (iIndexOf > 0) {
            strO = strO.substring(iIndexOf);
        }
        if (strO.startsWith(str) && !strO.matches(str.concat("\\d.\\d"))) {
            if (strO.length() < str.length() + 3) {
                strO = str.concat(str2);
                Log.d("PdfBox-Android", "No version found, set to " + str2 + " as default.");
            } else {
                String str3 = strO.substring(str.length() + 3, strO.length()) + "\n";
                strO = strO.substring(0, str.length() + 3);
                cVar.h(str3.getBytes(wf.a.f31523d).length);
            }
        }
        float f10 = -1.0f;
        try {
            String[] strArrSplit = strO.split("-");
            if (strArrSplit.length == 2) {
                f10 = Float.parseFloat(strArrSplit[1]);
            }
        } catch (NumberFormatException e10) {
            Log.d("PdfBox-Android", "Can't parse the header version.", e10);
        }
        if (f10 < CropImageView.DEFAULT_ASPECT_RATIO) {
            if (!this.f11195j) {
                throw new IOException(m3.a.a("Error getting header version: ", strO));
            }
            f10 = 1.7f;
        }
        this.f11184c.f5424b = f10;
        cVar.seek(0L);
        return true;
    }

    public final cf.b J(int i10, long j10, boolean z10) throws IOException, NumberFormatException {
        String str;
        cf.b bVar;
        cf.b bVar2;
        p pVar = new p(i10, j10);
        o oVarI0 = this.f11184c.i0(pVar);
        if (oVarI0.f5549b == null) {
            Long l10 = (Long) this.f11184c.f5426d.get(pVar);
            boolean z11 = this.f11195j;
            if (l10 == null && z11) {
                x();
                l10 = (Long) this.f11198m.get(pVar);
                if (l10 != null) {
                    Log.d("PdfBox-Android", "Set missing offset " + l10 + " for object " + pVar);
                    this.f11184c.f5426d.put(pVar, l10);
                }
            }
            if (z10 && (l10 == null || l10.longValue() <= 0)) {
                throw new IOException("Object must be defined and must not be compressed object: " + j10 + ":" + i10);
            }
            if (oVarI0.f5552e) {
                throw new IOException("Possible recursion detected when dereferencing object " + j10 + " " + i10);
            }
            oVarI0.f5552e = true;
            if (l10 == null && z11 && this.f11198m == null) {
                x();
                if (!this.f11198m.isEmpty()) {
                    Log.d("PdfBox-Android", "Add all new read objects from brute force search to the xref table");
                    HashMap map = this.f11184c.f5426d;
                    for (Map.Entry entry : this.f11198m.entrySet()) {
                        p pVar2 = (p) entry.getKey();
                        if (!map.containsKey(pVar2)) {
                            map.put(pVar2, entry.getValue());
                        }
                    }
                    l10 = (Long) map.get(pVar);
                }
            }
            if (l10 == null) {
                oVarI0.f5549b = m.f5548c;
            } else if (l10.longValue() > 0) {
                long jLongValue = l10.longValue();
                ef.c cVar = this.f11191f;
                cVar.seek(jLongValue);
                long jQ = q();
                int iN = n();
                m(B);
                int i11 = pVar.f5554b;
                if (jQ != j10 || iN != i11) {
                    throw new IOException("XREF for " + j10 + ":" + i11 + " points to wrong object: " + jQ + ":" + iN + " at offset " + l10);
                }
                t();
                cf.b bVarK = k();
                String strR = r();
                if (strR.equals("stream")) {
                    cVar.h(strR.getBytes(wf.a.f31523d).length);
                    if (!(bVarK instanceof cf.d)) {
                        throw new IOException("Stream not preceded by dictionary (offset: " + l10 + ").");
                    }
                    t tVarF = F((cf.d) bVarK);
                    l lVar = this.f11203r;
                    if (lVar != null) {
                        lVar.c(tVarF, pVar.f5553a, i11);
                    }
                    t();
                    strR = o();
                    if (!strR.startsWith("endobj") && strR.startsWith("endstream")) {
                        strR = strR.substring(9).trim();
                        if (strR.length() == 0) {
                            strR = o();
                        }
                    }
                    str = "endobj";
                    bVar2 = tVarF;
                } else {
                    str = "endobj";
                    l lVar2 = this.f11203r;
                    if (lVar2 != null) {
                        bVar = bVarK;
                        str = str;
                        lVar2.a(bVar, pVar.f5553a, i11);
                    } else {
                        bVar = bVarK;
                    }
                    bVar2 = bVar;
                }
                oVarI0.f5549b = bVar2;
                if (!strR.startsWith(str)) {
                    if (!z11) {
                        throw new IOException("Object (" + jQ + ":" + iN + ") at offset " + l10 + " does not end with 'endobj' but with '" + strR + "'");
                    }
                    Log.w("PdfBox-Android", "Object (" + jQ + ":" + iN + ") at offset " + l10 + " does not end with 'endobj' but with '" + strR + "'");
                }
            } else {
                K((int) (-l10.longValue()));
            }
            oVarI0.f5552e = false;
        }
        return oVarI0.f5549b;
    }

    public final void K(int i10) throws IOException, NumberFormatException {
        boolean z10 = this.f11195j;
        int i11 = 0;
        cf.b bVarJ = J(0, i10, true);
        if (bVarJ instanceof t) {
            try {
                e eVar = new e((t) bVarJ, this.f11184c);
                try {
                    eVar.v();
                    ArrayList arrayList = eVar.f11213e;
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        o oVar = (o) obj;
                        p pVar = new p(oVar.f5551d, oVar.f5550c);
                        k.b bVar = this.f11205t.f11232c;
                        Long l10 = (Long) (bVar == null ? null : bVar.f11238c).get(pVar);
                        if (l10 != null && l10.longValue() == (-i10)) {
                            this.f11184c.i0(pVar).f5549b = oVar.f5549b;
                        }
                    }
                } catch (IOException e10) {
                    if (!z10) {
                        throw e10;
                    }
                    Log.d("PdfBox-Android", "Stop reading object stream " + i10 + " due to an exception", e10);
                }
            } catch (IOException e11) {
                if (!z10) {
                    throw e11;
                }
                Log.e("PdfBox-Android", "object stream " + i10 + " could not be parsed due to an exception", e11);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(5:234|148|149|230|150)|(2:152|(2:154|(1:156)(5:159|(2:162|160)|265|163|(1:171)(2:169|170))))|172|173|232|174|(2:176|(2:178|170)(1:179))(1:182)|183|(1:(1:170)(2:188|189))(1:185)) */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0422, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0451 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cf.d L(long j10) throws IOException, NumberFormatException {
        long jP;
        k kVar;
        HashMap map;
        HashSet hashSet;
        HashMap map2;
        HashSet hashSet2;
        p pVar;
        long j11;
        long jM;
        cf.d dVar;
        String str;
        ef.c cVar = this.f11191f;
        cVar.seek(j10);
        long j12 = -1;
        if (D(f11187x)) {
            r();
            t();
            jP = p();
        } else {
            jP = -1;
        }
        long j13 = 0;
        long jMax = Math.max(0L, jP);
        long jZ = z(jMax);
        if (jZ > -1) {
            jMax = jZ;
        }
        this.f11184c.f5430h = jMax;
        HashSet hashSet3 = new HashSet();
        long j14 = jMax;
        loop0: while (true) {
            long j15 = j12;
            boolean z10 = this.f11195j;
            long j16 = j13;
            k kVar2 = this.f11205t;
            if (j14 <= j13) {
                long j17 = jMax;
                p pVar2 = null;
                kVar2.b(j17);
                k.b bVar = kVar2.f11232c;
                cf.d dVar2 = bVar == null ? null : bVar.f11236a;
                cf.e eVar = this.f11184c;
                eVar.f5428f = dVar2;
                eVar.f5432k = k.a.f11234b == (bVar == null ? null : bVar.f11237b);
                if (z10) {
                    HashMap map3 = bVar == null ? null : bVar.f11238c;
                    if (map3 == null) {
                        kVar = kVar2;
                    } else {
                        HashMap map4 = new HashMap();
                        HashSet hashSet4 = new HashSet();
                        Iterator it = map3.entrySet().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                p pVar3 = (p) entry.getKey();
                                Long l10 = (Long) entry.getValue();
                                if (l10 == null || l10.longValue() < j16) {
                                    map = map4;
                                    kVar = kVar2;
                                    hashSet = hashSet4;
                                } else {
                                    long jLongValue = l10.longValue();
                                    if (jLongValue < 6) {
                                        pVar = pVar2;
                                        map2 = map4;
                                        kVar = kVar2;
                                        hashSet2 = hashSet4;
                                    } else {
                                        try {
                                            cVar.seek(jLongValue);
                                            u();
                                            map2 = map4;
                                            try {
                                            } catch (IOException e10) {
                                                e = e10;
                                                kVar = kVar2;
                                                hashSet2 = hashSet4;
                                                Log.d("PdfBox-Android", u.a("No valid object at given location ", " - ignoring", jLongValue), e);
                                                if (pVar == null) {
                                                }
                                            }
                                        } catch (IOException e11) {
                                            e = e11;
                                            map2 = map4;
                                        }
                                        if (cVar.f8712l == jLongValue) {
                                            cVar.seek(jLongValue - 1);
                                            if (cVar.f8712l < jLongValue) {
                                                if (c()) {
                                                    long j18 = cVar.f8712l - 1;
                                                    cVar.seek(j18);
                                                    while (c()) {
                                                        j18--;
                                                        cVar.seek(j18);
                                                    }
                                                    p pVar4 = new p(n(), q());
                                                    Long l11 = (Long) map3.get(pVar4);
                                                    if (l11 == null || l11.longValue() <= j16 || Math.abs(jLongValue - l11.longValue()) >= 10) {
                                                        cVar.seek(jLongValue);
                                                    } else {
                                                        Log.d("PdfBox-Android", "Found the object " + pVar4 + " instead of " + pVar3 + " at offset " + jLongValue + " - ignoring");
                                                        kVar = kVar2;
                                                        hashSet2 = hashSet4;
                                                    }
                                                } else {
                                                    cVar.read();
                                                }
                                            }
                                        }
                                        long jQ = q();
                                        kVar = kVar2;
                                        hashSet2 = hashSet4;
                                        if (pVar3.f5553a != jQ) {
                                            Log.w("PdfBox-Android", "found wrong object number. expected [" + pVar3.f5553a + "] found [" + jQ + "]");
                                            if (z10) {
                                                pVar = new p(pVar3.f5554b, jQ);
                                            }
                                        } else {
                                            pVar = pVar3;
                                        }
                                        int iN = n();
                                        m(B);
                                        int i10 = pVar.f5554b;
                                        if (iN != i10) {
                                            pVar = (!z10 || iN <= i10) ? null : new p(iN, pVar.f5553a);
                                        }
                                    }
                                    if (pVar == null) {
                                        Log.d("PdfBox-Android", "Stop checking xref offsets as at least one (" + pVar3 + ") couldn't be dereferenced");
                                        x();
                                        if (!this.f11198m.isEmpty()) {
                                            Log.d("PdfBox-Android", "Replaced read xref table with the results of a brute force search");
                                            map3.clear();
                                            map3.putAll(this.f11198m);
                                        }
                                    } else if (pVar != pVar3) {
                                        map = map2;
                                        map.put(pVar3, pVar);
                                        hashSet = hashSet2;
                                    } else {
                                        map = map2;
                                        hashSet = hashSet2;
                                        hashSet.add(pVar3);
                                    }
                                }
                                hashSet4 = hashSet;
                                kVar2 = kVar;
                                map4 = map;
                                pVar2 = null;
                            } else {
                                HashMap map5 = map4;
                                kVar = kVar2;
                                HashSet hashSet5 = hashSet4;
                                HashMap map6 = new HashMap();
                                for (Map.Entry entry2 : map5.entrySet()) {
                                    if (!hashSet5.contains(entry2.getValue())) {
                                        map6.put(entry2.getValue(), map3.get(entry2.getKey()));
                                    }
                                }
                                Iterator it2 = map5.entrySet().iterator();
                                while (it2.hasNext()) {
                                    map3.remove(((Map.Entry) it2.next()).getKey());
                                }
                                for (Map.Entry entry3 : map6.entrySet()) {
                                    map3.put(entry3.getKey(), entry3.getValue());
                                }
                            }
                        }
                    }
                }
                cf.e eVar2 = this.f11184c;
                k.b bVar2 = kVar.f11232c;
                eVar2.f5426d.putAll(bVar2 == null ? null : bVar2.f11238c);
                return dVar2;
            }
            hashSet3.add(Long.valueOf(j14));
            cVar.seek(j14);
            t();
            hashSet3.add(Long.valueOf(cVar.f8712l));
            if (cVar.peek() == 120) {
                if (cVar.peek() != 120 || !r().trim().equals("xref")) {
                    break;
                }
                String strR = r();
                cVar.h(strR.getBytes(wf.a.f31523d).length);
                kVar2.a(j14, k.a.f11233a);
                if (strR.startsWith("trailer")) {
                    Log.w("PdfBox-Android", "skipping empty xref table");
                    break;
                }
                while (true) {
                    String strO = o();
                    String str2 = "\\s";
                    String[] strArrSplit = strO.split("\\s");
                    boolean z11 = z10;
                    if (strArrSplit.length != 2) {
                        Log.w("PdfBox-Android", "Unexpected XRefTable Entry: ".concat(strO));
                        break loop0;
                    }
                    try {
                        long j19 = Long.parseLong(strArrSplit[0]);
                        try {
                            int i11 = Integer.parseInt(strArrSplit[1]);
                            t();
                            long j20 = j19;
                            j11 = jMax;
                            int i12 = 0;
                            while (true) {
                                if (i12 >= i11 || cVar.g() || a.e((char) cVar.peek()) || cVar.peek() == 116) {
                                    break;
                                }
                                String strO2 = o();
                                String[] strArrSplit2 = strO2.split(str2);
                                int i13 = i11;
                                int i14 = i12;
                                if (strArrSplit2.length < 3) {
                                    Log.w("PdfBox-Android", "invalid xref line: ".concat(strO2));
                                    break;
                                }
                                if (strArrSplit2[strArrSplit2.length - 1].equals("n")) {
                                    try {
                                        str = str2;
                                        long j21 = Long.parseLong(strArrSplit2[0]);
                                        if (j21 > j16) {
                                            kVar2.c(new p(Integer.parseInt(strArrSplit2[1]), j20), j21);
                                        }
                                    } catch (NumberFormatException e12) {
                                        throw new IOException(e12);
                                    }
                                } else {
                                    str = str2;
                                    if (!strArrSplit2[2].equals("f")) {
                                        throw new IOException(r.a("Corrupt XRefTable Entry - ObjID:", j20));
                                    }
                                }
                                j20++;
                                t();
                                i12 = i14 + 1;
                                str2 = str;
                                i11 = i13;
                            }
                            t();
                            if (!c()) {
                                this.f11193h = cVar.f8712l;
                                if (z11) {
                                    for (int iPeek = cVar.peek(); iPeek != 116 && a.d(iPeek); iPeek = cVar.peek()) {
                                        if (cVar.f8712l == this.f11193h) {
                                            Log.w("PdfBox-Android", "Expected trailer object at offset " + this.f11193h + ", keep trying");
                                        }
                                        o();
                                    }
                                }
                                if (cVar.peek() != 116) {
                                    break;
                                }
                                long j22 = cVar.f8712l;
                                String strO3 = o();
                                if (!strO3.trim().equals("trailer")) {
                                    if (!strO3.startsWith("trailer")) {
                                        break;
                                    }
                                    cVar.seek(j22 + 7);
                                }
                                t();
                                cf.d dVarH = h();
                                k.b bVar3 = kVar2.f11231b;
                                if (bVar3 == null) {
                                    Log.w("PdfBox-Android", "Cannot add trailer because XRef start was not signalled.");
                                } else {
                                    bVar3.f11236a = dVarH;
                                }
                                t();
                                dVar = kVar2.f11231b.f11236a;
                                cf.l lVar = cf.l.I2;
                                if (dVar.f5423b.containsKey(lVar)) {
                                    int iG0 = dVar.G0(lVar, null, -1);
                                    long j23 = iG0;
                                    long jZ2 = z(j23);
                                    if (jZ2 > j15 && jZ2 != j23) {
                                        Log.w("PdfBox-Android", "/XRefStm offset " + iG0 + " is incorrect, corrected to " + jZ2);
                                        iG0 = (int) jZ2;
                                        dVar.N0(lVar, iG0);
                                    }
                                    if (iG0 > 0) {
                                        cVar.seek(iG0);
                                        t();
                                        try {
                                            M(j14, false);
                                        } catch (IOException e13) {
                                            if (!z11) {
                                                throw e13;
                                            }
                                            Log.e("PdfBox-Android", "Failed to parse /XRefStm at offset " + iG0, e13);
                                        }
                                    } else {
                                        if (!z11) {
                                            throw new IOException(j2.y.a(iG0, "Skipped XRef stream due to a corrupt offset:"));
                                        }
                                        Log.e("PdfBox-Android", "Skipped XRef stream due to a corrupt offset:" + iG0);
                                    }
                                }
                                jM = dVar.I0(cf.l.Q1);
                            } else {
                                z10 = z11;
                                jMax = j11;
                            }
                        } catch (NumberFormatException unused) {
                            Log.w("PdfBox-Android", "XRefTable: invalid number of objects: ".concat(strO));
                        }
                    } catch (NumberFormatException unused2) {
                        Log.w("PdfBox-Android", "XRefTable: invalid ID for the first object: ".concat(strO));
                    }
                }
            } else {
                j11 = jMax;
                jM = M(j14, true);
                dVar = kVar2.f11231b.f11236a;
            }
            if (jM > j16) {
                long jZ3 = z(jM);
                if (jZ3 <= j15 || jZ3 == jM) {
                    j14 = jM;
                } else {
                    dVar.Q0(cf.l.Q1, jZ3);
                    j14 = jZ3;
                }
            }
            if (hashSet3.contains(Long.valueOf(j14))) {
                throw new IOException(r.a("/Prev loop at offset ", j14));
            }
            j12 = j15;
            j13 = j16;
            jMax = j11;
        }
        throw new IOException("Expected trailer object at offset " + cVar.f8712l);
    }

    public final long M(long j10, boolean z10) throws IOException, NumberFormatException {
        j jVar;
        long jQ = q();
        cf.e eVar = this.f11184c;
        eVar.f5434m = Math.max(eVar.f5434m, jQ);
        n();
        m(B);
        cf.d dVarH = h();
        t tVarF = F(dVarH);
        k kVar = this.f11205t;
        if (z10) {
            kVar.a(j10, k.a.f11234b);
            k.b bVar = kVar.f11231b;
            if (bVar == null) {
                Log.w("PdfBox-Android", "Cannot add trailer because XRef start was not signalled.");
            } else {
                bVar.f11236a = tVarF;
            }
        }
        h hVar = new h(tVarF, this.f11184c, kVar);
        int[] iArr = hVar.f11221f;
        byte[] bArr = new byte[iArr[0] + iArr[1] + iArr[2]];
        while (true) {
            jVar = hVar.f11183b;
            if (jVar.g() || !hVar.f11222g.hasNext()) {
                break;
            }
            jVar.read(bArr);
            long jLongValue = hVar.f11222g.next().longValue();
            int i10 = iArr[0];
            int iW = i10 == 0 ? 1 : (int) h.w(0, i10, bArr);
            if (iW != 0) {
                long jW = h.w(iArr[0], iArr[1], bArr);
                p pVar = new p(iW == 1 ? (int) h.w(iArr[0] + iArr[1], iArr[2], bArr) : 0, jLongValue);
                k kVar2 = hVar.f11220e;
                if (iW == 1) {
                    kVar2.c(pVar, jW);
                } else {
                    kVar2.c(pVar, -jW);
                }
            }
        }
        if (jVar != null) {
            jVar.close();
        }
        hVar.f11184c = null;
        tVarF.close();
        return dVarH.I0(cf.l.Q1);
    }

    public final void N() throws IOException, NumberFormatException {
        String str = this.f11192g;
        if (this.f11202q != null) {
            return;
        }
        cf.d dVar = this.f11184c.f5428f;
        cf.l lVar = cf.l.f5530w0;
        cf.b bVarH0 = dVar.H0(lVar);
        if (bVarH0 == null || (bVarH0 instanceof m)) {
            return;
        }
        if (bVarH0 instanceof o) {
            H((o) bVarH0);
        }
        try {
            lf.e eVar = new lf.e(this.f11184c.f5428f.l0(lVar));
            this.f11202q = eVar;
            lf.n nVar = new lf.n(str);
            l lVarC = eVar.c();
            this.f11203r = lVarC;
            lVarC.i(this.f11202q, this.f11184c.f5428f.k0(cf.l.V0), nVar);
            lf.a aVar = this.f11203r.f17049h;
        } catch (IOException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new IOException("Error (" + e11.getClass().getSimpleName() + ") while creating security handler for decryption", e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(c cVar) throws IOException {
        byte b10;
        byte[] bArr = f11188y;
        int i10 = 0;
        byte[] bArr2 = bArr;
        while (true) {
            ef.c cVar2 = this.f11191f;
            byte[] bArr3 = this.f11190e;
            int i11 = cVar2.read(bArr3, i10, 2048 - i10);
            if (i11 <= 0) {
                break;
            }
            int i12 = i11 + i10;
            int i13 = i12 - 5;
            byte[] bArr4 = bArr2;
            int i14 = i10;
            while (true) {
                if (i10 >= i12) {
                    break;
                }
                int i15 = i10 + 5;
                if (i14 != 0 || i15 >= i13 || ((b10 = bArr3[i15]) <= 116 && b10 >= 97)) {
                    byte b11 = bArr3[i10];
                    if (b11 == bArr4[i14]) {
                        i14++;
                        if (i14 == bArr4.length) {
                            i10++;
                            break;
                        }
                    } else if (i14 == 3) {
                        bArr4 = f11189z;
                        if (b11 == bArr4[i14]) {
                            i14++;
                        } else {
                            i14 = b11 == 101 ? 1 : (b11 == 110 && i14 == 7) ? 2 : 0;
                            bArr4 = bArr;
                        }
                    }
                } else {
                    i10 = i15;
                }
                i10++;
            }
            int iMax = Math.max(0, i10 - i14);
            if (iMax > 0) {
                cVar.write(bArr3, 0, iMax);
            }
            if (i14 == bArr4.length) {
                cVar2.h(i12 - iMax);
                break;
            } else {
                System.arraycopy(bArr4, 0, bArr3, 0, i14);
                i10 = i14;
                bArr2 = bArr4;
            }
        }
        cVar.flush();
    }

    public final void P(s sVar, n nVar) throws IOException {
        long jL0 = nVar.l0();
        while (jL0 > 0) {
            int i10 = jL0 > 8192 ? 8192 : (int) jL0;
            ef.c cVar = this.f11191f;
            byte[] bArr = this.f11206u;
            int i11 = cVar.read(bArr, 0, i10);
            if (i11 <= 0) {
                throw new IOException("read error at offset " + cVar.f8712l + ": expected " + i10 + " bytes, but read() returns " + i11);
            }
            sVar.write(bArr, 0, i11);
            jL0 -= i11;
        }
    }

    public final cf.d Q(o oVar) throws IOException, NumberFormatException {
        p pVar = new p(oVar.f5551d, oVar.f5550c);
        Long l10 = (Long) this.f11198m.get(pVar);
        if (l10 == null) {
            return null;
        }
        ef.c cVar = this.f11191f;
        long j10 = cVar.f8712l;
        cf.d dVarR = R(pVar, l10.longValue());
        cVar.seek(j10);
        return dVarR;
    }

    public final cf.d R(p pVar, long j10) throws IOException, NumberFormatException {
        if (j10 < 0) {
            o oVarI0 = this.f11184c.i0(pVar);
            if (oVarI0.f5549b == null) {
                K((int) (-j10));
            }
            cf.b bVar = oVarI0.f5549b;
            if (bVar instanceof cf.d) {
                return (cf.d) bVar;
            }
        } else {
            ef.c cVar = this.f11191f;
            cVar.seek(j10);
            q();
            n();
            m(B);
            if (cVar.peek() == 60) {
                try {
                    return h();
                } catch (IOException unused) {
                    Log.d("PdfBox-Android", "Skipped object " + pVar + ", either it's corrupt or not a dictionary");
                    return null;
                }
            }
        }
        return null;
    }

    public final boolean S(cf.d dVar) throws IOException, NumberFormatException {
        o oVarI0;
        o oVarA = null;
        o oVarA2 = null;
        Long l10 = null;
        Long l11 = null;
        for (Map.Entry entry : this.f11198m.entrySet()) {
            cf.d dVarR = R((p) entry.getKey(), ((Long) entry.getValue()).longValue());
            if (dVarR != null) {
                if (cf.l.F.equals(dVarR.q0(cf.l.f5532w2))) {
                    o oVarI02 = this.f11184c.i0((p) entry.getKey());
                    oVarA = A(oVarI02, (Long) entry.getValue(), oVarA, l10);
                    if (oVarA == oVarI02) {
                        l10 = (Long) entry.getValue();
                    }
                } else if (C(dVarR) && (oVarA2 = A((oVarI0 = this.f11184c.i0((p) entry.getKey())), (Long) entry.getValue(), oVarA2, l11)) == oVarI0) {
                    l11 = (Long) entry.getValue();
                }
            }
        }
        if (oVarA != null) {
            dVar.O0(cf.l.Y1, oVarA);
        }
        if (oVarA2 != null) {
            dVar.O0(cf.l.f5458d1, oVarA2);
        }
        return oVarA != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w() throws Throwable {
        HashMap map;
        ef.c cVar;
        long j10;
        Iterator it;
        t tVar;
        long j11;
        t tVar2;
        ef.c cVar2;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        HashMap map2 = new HashMap();
        ef.c cVar3 = this.f11191f;
        long j17 = cVar3.f8712l;
        long j18 = 6;
        cVar3.seek(6L);
        char[] charArray = " obj".toCharArray();
        while (!cVar3.g()) {
            if (D(D)) {
                long j19 = j18;
                long j20 = cVar3.f8712l;
                long j21 = -1;
                int i10 = 1;
                boolean z10 = false;
                while (i10 < 40 && !z10) {
                    long j22 = j20 - (i10 * 10);
                    if (j22 > 0) {
                        cVar3.seek(j22);
                        j14 = j19;
                        for (int i11 = 0; i11 < 10; i11++) {
                            if (D(charArray)) {
                                cVar3.seek(j22 - 1);
                                if (a.d(cVar3.peek())) {
                                    cVar3.seek(j22 - 2);
                                    if (32 == this.f11183b.peek()) {
                                        long j23 = j22 - 3;
                                        cVar3.seek(j23);
                                        int i12 = 0;
                                        while (j23 > j14 && c()) {
                                            j23--;
                                            cVar3.seek(j23);
                                            i12++;
                                        }
                                        if (i12 > 0) {
                                            cVar3.read();
                                            j16 = cVar3.f8712l;
                                            j15 = j20;
                                            map2.put(Long.valueOf(j16), new p(n(), q()));
                                        } else {
                                            j15 = j20;
                                            j16 = j21;
                                        }
                                        Log.d("PdfBox-Android", "Dictionary start for object stream -> " + j16);
                                        j21 = j16;
                                        z10 = true;
                                    }
                                }
                                i10++;
                                j19 = j14;
                                j20 = j15;
                            } else {
                                j22++;
                                cVar3.read();
                            }
                        }
                    } else {
                        j14 = j19;
                    }
                    j15 = j20;
                    i10++;
                    j19 = j14;
                    j20 = j15;
                }
                j13 = j19;
                cVar3.seek(j20 + 7);
            } else {
                j13 = j18;
            }
            cVar3.read();
            j18 = j13;
        }
        Iterator it2 = map2.keySet().iterator();
        while (it2.hasNext()) {
            Long l10 = (Long) it2.next();
            Long l11 = (Long) this.f11198m.get(map2.get(l10));
            if (l11 == null) {
                Log.w("PdfBox-Android", "Skipped incomplete object stream:" + map2.get(l10) + " at " + l10);
            } else {
                if (l10.equals(l11)) {
                    cVar3.seek(l10.longValue());
                    long jQ = q();
                    int iN = n();
                    m(B);
                    try {
                        cf.d dVarH = h();
                        int iG0 = dVarH.G0(cf.l.C0, null, -1);
                        int iG02 = dVarH.G0(cf.l.f5527v1, null, -1);
                        if (iG0 == -1 || iG02 == -1) {
                            map = map2;
                        } else {
                            t tVarF = F(dVarH);
                            try {
                                try {
                                    l lVar = this.f11203r;
                                    if (lVar != null) {
                                        try {
                                            lVar.c(tVarF, jQ, iN);
                                            tVar2 = tVarF;
                                            j11 = jQ;
                                        } catch (IOException unused) {
                                            tVar2 = tVarF;
                                            j11 = jQ;
                                            map = map2;
                                            cVar = cVar3;
                                            j10 = j17;
                                            it = it2;
                                            Log.d("PdfBox-Android", "Skipped corrupt stream: (" + j11 + " 0 at offset " + l10);
                                            if (tVar2 != null) {
                                            }
                                            cVar3 = cVar;
                                            map2 = map;
                                            it2 = it;
                                            j17 = j10;
                                        }
                                    } else {
                                        tVar2 = tVarF;
                                        j11 = jQ;
                                    }
                                    try {
                                        try {
                                            e eVar = new e(tVar2, this.f11184c);
                                            ArrayList arrayList = new ArrayList(iG02);
                                            map = map2;
                                            int i13 = 0;
                                            while (i13 < iG02) {
                                                try {
                                                    int i14 = i13;
                                                    arrayList.add(Long.valueOf(eVar.q()));
                                                    eVar.p();
                                                    i13 = i14 + 1;
                                                } catch (IOException unused2) {
                                                    cVar = cVar3;
                                                    j10 = j17;
                                                    it = it2;
                                                    Log.d("PdfBox-Android", "Skipped corrupt stream: (" + j11 + " 0 at offset " + l10);
                                                    if (tVar2 != null) {
                                                        tVar2.close();
                                                    }
                                                    cVar3 = cVar;
                                                    map2 = map;
                                                    it2 = it;
                                                    j17 = j10;
                                                }
                                            }
                                            tVar2.close();
                                            if (arrayList.size() < iG02) {
                                                Log.d("PdfBox-Android", "Skipped corrupt stream: (" + j11 + " 0 at offset " + l10);
                                                map2 = map;
                                            } else {
                                                k.b bVar = this.f11205t.f11232c;
                                                HashMap map3 = bVar == null ? null : bVar.f11238c;
                                                int size = arrayList.size();
                                                int i15 = 0;
                                                while (i15 < size) {
                                                    Object obj = arrayList.get(i15);
                                                    i15++;
                                                    Iterator it3 = it2;
                                                    int i16 = size;
                                                    ArrayList arrayList2 = arrayList;
                                                    p pVar = new p(0, ((Long) obj).longValue());
                                                    Long l12 = (Long) this.f11198m.get(pVar);
                                                    if (l12 == null || l12.longValue() >= 0) {
                                                        cVar2 = cVar3;
                                                        j12 = j17;
                                                    } else {
                                                        cVar2 = cVar3;
                                                        j12 = j17;
                                                        l12 = (Long) this.f11198m.get(new p(0, Math.abs(l12.longValue())));
                                                    }
                                                    if (l12 == null || l10.longValue() > l12.longValue()) {
                                                        long j24 = -j11;
                                                        this.f11198m.put(pVar, Long.valueOf(j24));
                                                        map3.put(pVar, Long.valueOf(j24));
                                                    }
                                                    cVar3 = cVar2;
                                                    size = i16;
                                                    it2 = it3;
                                                    arrayList = arrayList2;
                                                    j17 = j12;
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            tVar = tVar2;
                                            if (tVar != null) {
                                                tVar.close();
                                            }
                                            throw th;
                                        }
                                    } catch (IOException unused3) {
                                        map = map2;
                                        cVar = cVar3;
                                        j10 = j17;
                                        it = it2;
                                        Log.d("PdfBox-Android", "Skipped corrupt stream: (" + j11 + " 0 at offset " + l10);
                                        if (tVar2 != null) {
                                        }
                                        cVar3 = cVar;
                                        map2 = map;
                                        it2 = it;
                                        j17 = j10;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    tVar2 = tVarF;
                                }
                            } catch (IOException unused4) {
                                map = map2;
                                cVar = cVar3;
                                it = it2;
                                tVar2 = tVarF;
                                j11 = jQ;
                                j10 = j17;
                            }
                        }
                    } catch (IOException unused5) {
                        map = map2;
                        cVar = cVar3;
                        it = it2;
                        j11 = jQ;
                        j10 = j17;
                        tVar2 = null;
                    } catch (Throwable th4) {
                        th = th4;
                        tVar = null;
                    }
                } else {
                    map = map2;
                }
                cVar = cVar3;
                j10 = j17;
                it = it2;
                cVar3 = cVar;
                map2 = map;
                it2 = it;
                j17 = j10;
            }
        }
        cVar3.seek(j17);
    }

    public final void x() throws IOException, NumberFormatException {
        if (this.f11198m == null) {
            Long l10 = this.f11199n;
            long j10 = 6;
            ef.c cVar = this.f11191f;
            if (l10 == null) {
                long j11 = cVar.f8712l;
                cVar.seek(6L);
                while (!cVar.g()) {
                    if (D(A)) {
                        long j12 = cVar.f8712l;
                        cVar.seek(5 + j12);
                        try {
                            t();
                            if (!D(f11185v)) {
                                q();
                                n();
                            }
                        } catch (IOException unused) {
                            this.f11199n = Long.valueOf(j12);
                        }
                    }
                    cVar.read();
                }
                cVar.seek(j11);
                if (this.f11199n == null) {
                    this.f11199n = Long.MAX_VALUE;
                }
            }
            this.f11198m = new HashMap();
            long j13 = cVar.f8712l;
            char[] charArray = "ndo".toCharArray();
            char[] charArray2 = "bj".toCharArray();
            long j14 = Long.MIN_VALUE;
            long length = 6;
            int i10 = Integer.MIN_VALUE;
            boolean z10 = false;
            long j15 = Long.MIN_VALUE;
            while (true) {
                cVar.seek(length);
                long j16 = j10;
                int i11 = cVar.read();
                long j17 = length + 1;
                if (a.g(i11) && D(B)) {
                    cVar.seek((-1) + length);
                    int iPeek = cVar.peek();
                    if (a.d(iPeek)) {
                        int i12 = iPeek - 48;
                        long j18 = length - 2;
                        cVar.seek(j18);
                        j jVar = this.f11183b;
                        if (a.g(jVar.peek())) {
                            while (j18 > j16 && a.g(jVar.peek())) {
                                j18--;
                                cVar.seek(j18);
                            }
                            boolean z11 = false;
                            while (j18 > j16 && c()) {
                                j18--;
                                cVar.seek(j18);
                                z11 = true;
                            }
                            if (z11) {
                                cVar.read();
                                long jQ = q();
                                if (j15 > 0) {
                                    this.f11198m.put(new p(i10, j14), Long.valueOf(j15));
                                }
                                j15 = j18 + 1;
                                j17 += 2;
                                i10 = i12;
                                j14 = jQ;
                                z10 = false;
                            }
                        }
                    }
                } else {
                    if (i11 == 101 && D(charArray)) {
                        length = j17 + charArray.length;
                        cVar.seek(length);
                        if (cVar.g()) {
                            z10 = true;
                        } else if (D(charArray2)) {
                            length += charArray2.length;
                            z10 = true;
                        }
                    }
                    if (length >= this.f11199n.longValue() || cVar.g()) {
                        break;
                    } else {
                        j10 = j16;
                    }
                }
                length = j17;
                if (length >= this.f11199n.longValue()) {
                    break;
                }
                break;
                break;
            }
            if ((this.f11199n.longValue() < Long.MAX_VALUE || z10) && j15 > 0) {
                this.f11198m.put(new p(i10, j14), Long.valueOf(j15));
            }
            cVar.seek(j13);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if ("XRef".equals(r3.J0(cf.l.f5532w2)) != false) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long z(long j10) throws IOException, NumberFormatException {
        long j11;
        long j12;
        long j13;
        long j14;
        int i10;
        long j15;
        long j16;
        boolean z10 = this.f11195j;
        if (z10) {
            ef.c cVar = this.f11191f;
            cVar.seek(j10);
            t();
            int iPeek = cVar.peek();
            char[] cArr = f11185v;
            if (iPeek != 120 || !D(cArr)) {
                if (j10 <= 0) {
                    return -1L;
                }
                if (z10 && j10 != 0) {
                    long j17 = 1;
                    cVar.seek(j10 - 1);
                    if (a.g(cVar.read())) {
                        t();
                        if (c()) {
                            try {
                                q();
                                n();
                                m(B);
                                cf.d dVarH = h();
                                cVar.seek(j10);
                            } catch (IOException unused) {
                                cVar.seek(j10);
                            }
                        }
                    }
                    if (j10 < 0) {
                        Log.e("PdfBox-Android", "Invalid object offset " + j10 + " when searching for a xref table/stream");
                        return 0L;
                    }
                    ArrayList arrayList = this.f11200o;
                    j jVar = this.f11183b;
                    long j18 = 6;
                    if (arrayList == null) {
                        this.f11200o = new ArrayList();
                        j11 = 0;
                        long j19 = cVar.f8712l;
                        cVar.seek(6L);
                        while (!cVar.g()) {
                            if (D(cArr)) {
                                long j20 = cVar.f8712l;
                                j16 = j17;
                                cVar.seek(j20 - j16);
                                if (a.g(jVar.peek())) {
                                    this.f11200o.add(Long.valueOf(j20));
                                }
                                cVar.seek(j20 + 4);
                            } else {
                                j16 = j17;
                            }
                            cVar.read();
                            j17 = j16;
                        }
                        j12 = j17;
                        j13 = -1;
                        cVar.seek(j19);
                    } else {
                        j11 = 0;
                        j12 = 1;
                        j13 = -1;
                    }
                    if (this.f11201p == null) {
                        this.f11201p = new ArrayList();
                        long j21 = cVar.f8712l;
                        cVar.seek(6L);
                        char[] charArray = " obj".toCharArray();
                        while (!cVar.g()) {
                            if (D(f11186w)) {
                                long j22 = cVar.f8712l;
                                long j23 = j13;
                                int i11 = 1;
                                boolean z11 = false;
                                while (i11 < 40 && !z11) {
                                    long j24 = j18;
                                    long j25 = j22 - (i11 * 10);
                                    if (j25 > j11) {
                                        cVar.seek(j25);
                                        i10 = i11;
                                        int i12 = 0;
                                        while (true) {
                                            if (i12 >= 10) {
                                                break;
                                            }
                                            if (D(charArray)) {
                                                cVar.seek(j25 - j12);
                                                if (a.d(cVar.peek())) {
                                                    cVar.seek(j25 - 2);
                                                    if (32 == jVar.peek()) {
                                                        long j26 = j25 - 3;
                                                        cVar.seek(j26);
                                                        int i13 = 0;
                                                        while (j26 > j24 && c()) {
                                                            j26 -= j12;
                                                            cVar.seek(j26);
                                                            i13++;
                                                        }
                                                        if (i13 > 0) {
                                                            cVar.read();
                                                            j15 = cVar.f8712l;
                                                        } else {
                                                            j15 = j23;
                                                        }
                                                        StringBuilder sbA = y.a("Fixed reference for xref stream ", " -> ", j22);
                                                        sbA.append(j15);
                                                        Log.d("PdfBox-Android", sbA.toString());
                                                        j23 = j15;
                                                        z11 = true;
                                                    }
                                                }
                                            } else {
                                                j25 += j12;
                                                cVar.read();
                                                i12++;
                                            }
                                        }
                                    } else {
                                        i10 = i11;
                                    }
                                    i11 = i10 + 1;
                                    j18 = j24;
                                }
                                j14 = j18;
                                if (j23 > j13) {
                                    this.f11201p.add(Long.valueOf(j23));
                                }
                                cVar.seek(j22 + 5);
                            } else {
                                j14 = j18;
                            }
                            cVar.read();
                            j18 = j14;
                        }
                        cVar.seek(j21);
                    }
                    ArrayList arrayList2 = this.f11200o;
                    long jT = arrayList2 != null ? T(j10, arrayList2) : j13;
                    ArrayList arrayList3 = this.f11201p;
                    long jT2 = arrayList3 != null ? T(j10, arrayList3) : j13;
                    if (jT <= j13 || jT2 <= j13) {
                        if (jT > j13) {
                            this.f11200o.remove(Long.valueOf(jT));
                        } else if (jT2 > j13) {
                            this.f11201p.remove(Long.valueOf(jT2));
                            jT = jT2;
                        } else {
                            jT = j13;
                        }
                    } else if (Math.abs(j10 - jT) > Math.abs(j10 - jT2)) {
                        this.f11201p.remove(Long.valueOf(jT2));
                        jT = jT2;
                    } else {
                        this.f11200o.remove(Long.valueOf(jT));
                    }
                    if (jT > j13) {
                        StringBuilder sbA2 = y.a("Fixed reference for xref table/stream ", " -> ", j10);
                        sbA2.append(jT);
                        Log.d("PdfBox-Android", sbA2.toString());
                        return jT;
                    }
                    Log.e("PdfBox-Android", "Can't find the object xref table/stream at offset " + j10);
                    return j11;
                }
            }
        }
        return j10;
    }
}
