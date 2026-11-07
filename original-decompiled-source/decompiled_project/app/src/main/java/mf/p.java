package mf;

import android.util.Log;
import cf.t;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ve.l0;
import ve.m0;
import ve.n0;
import ve.p0;
import ve.w;
import ve.x;

/* loaded from: classes2.dex */
public final class p extends n {

    /* renamed from: b, reason: collision with root package name */
    public final k f18223b;

    /* renamed from: c, reason: collision with root package name */
    public final se.b f18224c;

    /* renamed from: d, reason: collision with root package name */
    public final se.b f18225d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18226e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f18227f;

    /* renamed from: g, reason: collision with root package name */
    public final l f18228g;

    /* renamed from: h, reason: collision with root package name */
    public p0 f18229h;

    public p(hf.b bVar, p0 p0Var) throws Throwable {
        se.b bVarA;
        new HashSet();
        l lVar = new l(bVar, this.f18220a, p0Var, this);
        this.f18228g = lVar;
        k kVar = new k(lVar.f18214j, lVar.f18212h, lVar.f18232b);
        this.f18223b = kVar;
        cf.d dVar = this.f18220a;
        cf.l lVar2 = cf.l.f5526v0;
        cf.b bVarV0 = dVar.v0(lVar2);
        boolean z10 = false;
        cf.h hVar = null;
        str = null;
        String str = null;
        if (bVarV0 instanceof cf.l) {
            this.f18224c = c.a(((cf.l) bVarV0).f5545b);
            this.f18226e = true;
        } else if (bVarV0 != null) {
            if (bVarV0 instanceof cf.l) {
                bVarA = c.a(((cf.l) bVarV0).f5545b);
            } else {
                if (!(bVarV0 instanceof t)) {
                    throw new IOException("Expected Name or Stream");
                }
                try {
                    cf.h hVarU0 = ((t) bVarV0).U0();
                    try {
                        ConcurrentHashMap concurrentHashMap = c.f18172a;
                        se.b bVarH = new se.c(0).h(hVarU0);
                        ef.a.b(hVarU0);
                        bVarA = bVarH;
                    } catch (Throwable th2) {
                        th = th2;
                        hVar = hVarU0;
                        ef.a.b(hVar);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            this.f18224c = bVarA;
            if (bVarA.f24909i.isEmpty() && bVarA.f24910j.isEmpty()) {
                Log.w("PdfBox-Android", "Invalid Encoding CMap in font " + this.f18220a.J0(cf.l.f5529w));
            }
        }
        m mVarA = kVar.a();
        if (mVarA != null) {
            String strA = mVarA.a();
            if ("Adobe".equals(mVarA.f18219a.J0(cf.l.V1)) && ("GB1".equals(strA) || "CNS1".equals(strA) || "Japan1".equals(strA) || "Korea1".equals(strA))) {
                z10 = true;
            }
            this.f18227f = z10;
        }
        cf.l lVarQ0 = this.f18220a.q0(lVar2);
        if ((this.f18226e && lVarQ0 != cf.l.Y0 && lVarQ0 != cf.l.Z0) || this.f18227f) {
            if (this.f18227f) {
                m mVarA2 = kVar.a();
                if (mVarA2 != null) {
                    cf.d dVar2 = mVarA2.f18219a;
                    str = dVar2.J0(cf.l.V1) + "-" + mVarA2.a() + "-" + dVar2.G0(cf.l.f5513r2, null, -1);
                }
            } else if (lVarQ0 != null) {
                str = lVarQ0.f5545b;
            }
            if (str != null) {
                try {
                    se.b bVarA2 = c.a(str);
                    this.f18225d = c.a(bVarA2.f24902b + "-" + bVarA2.f24903c + "-UCS2");
                } catch (IOException e10) {
                    StringBuilder sbA = e.e.a("Could not get ", str, " UC2 map for font ");
                    sbA.append(this.f18220a.J0(cf.l.f5529w));
                    Log.w("PdfBox-Android", sbA.toString(), e10);
                }
            }
        }
        this.f18229h = p0Var;
        bVar.f13003g.add(p0Var);
    }

    @Override // mf.n
    public final void a(int i10) {
        if (!e()) {
            throw new IllegalStateException("This font was created with subsetting disabled");
        }
        this.f18228g.f18235e.add(Integer.valueOf(i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    @Override // mf.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] b(int i10) throws IOException {
        int iB;
        k kVar = this.f18223b;
        ve.c cVar = kVar.f18210k;
        p pVar = kVar.f18201a;
        if (!kVar.f18209j) {
            iB = cVar.b(i10);
        } else if (pVar.f18224c.f24901a.startsWith("Identity-")) {
            iB = cVar != null ? cVar.b(i10) : -1;
            if (iB == -1) {
                iB = 0;
            }
        } else {
            se.b bVar = pVar.f18225d;
            if (bVar != null) {
                Integer num = (Integer) bVar.f24909i.get(Integer.valueOf(i10));
                if (num == null) {
                    ArrayList arrayList = bVar.f24910j;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            iB = 0;
                            break;
                        }
                        Object obj = arrayList.get(i11);
                        i11++;
                        se.a aVar = (se.a) obj;
                        char c10 = (char) i10;
                        char c11 = aVar.f24898a;
                        int i12 = (c11 > c10 || c10 > aVar.f24899b) ? -1 : (c10 - c11) + aVar.f24900c;
                        if (i12 != -1) {
                            iB = i12;
                            break;
                        }
                    }
                } else {
                    iB = num.intValue();
                }
            }
            if (iB == -1) {
            }
        }
        if (iB != 0) {
            return new byte[]{(byte) ((iB >> 8) & 255), (byte) (iB & 255)};
        }
        throw new IllegalArgumentException(String.format("No glyph for U+%04X (%c) in font %s", Integer.valueOf(i10), Character.valueOf((char) i10), kVar.f18206f.J0(cf.l.f5529w)));
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0673  */
    @Override // mf.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() throws Throwable {
        TreeMap treeMap;
        TreeSet treeSet;
        DataOutputStream dataOutputStream;
        byte[] bArr;
        cf.h hVar;
        cf.h hVarU0;
        p0 p0VarC;
        cf.l lVarG0;
        cf.a aVar;
        ByteArrayOutputStream byteArrayOutputStream;
        int iIntValue;
        ArrayList arrayListA;
        char c10;
        m0 m0Var;
        if (!e()) {
            throw new IllegalStateException("This font was created with subsetting disabled");
        }
        l lVar = this.f18228g;
        p0 p0Var = lVar.f18232b;
        if (p0Var.M() != null && (p0Var.M().f30759j & 256) == 256) {
            throw new IOException("This font does not permit subsetting");
        }
        if (!lVar.f18236f) {
            throw new IllegalStateException("Subsetting is disabled");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("head");
        arrayList.add("hhea");
        arrayList.add("loca");
        arrayList.add("maxp");
        arrayList.add("cvt ");
        arrayList.add("prep");
        arrayList.add("glyf");
        arrayList.add("hmtx");
        arrayList.add("fpgm");
        arrayList.add("gasp");
        m0 m0Var2 = new m0(lVar.f18232b, arrayList);
        Iterator it = lVar.f18235e.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            treeMap = m0Var2.f30846c;
            treeSet = m0Var2.f30848e;
            if (!zHasNext) {
                break;
            }
            Integer num = (Integer) it.next();
            int iB = m0Var2.f30845b.b(num.intValue());
            if (iB != 0) {
                treeMap.put(num, Integer.valueOf(iB));
                treeSet.add(Integer.valueOf(iB));
            }
        }
        m0Var2.a();
        HashMap map = new HashMap();
        Iterator it2 = treeSet.iterator();
        int i10 = 0;
        while (it2.hasNext()) {
            Integer num2 = (Integer) it2.next();
            num2.getClass();
            map.put(Integer.valueOf(i10), num2);
            i10++;
        }
        long jHashCode = map.hashCode();
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j10 = jHashCode / 25;
            sb.append("BCDEFGHIJKLMNOPQRSTUVWXYZ".charAt((int) (jHashCode % 25)));
            if (j10 == 0 || sb.length() >= 6) {
                break;
            } else {
                jHashCode = j10;
            }
        }
        while (sb.length() < 6) {
            sb.insert(0, 'A');
        }
        sb.append('+');
        String string = sb.toString();
        m0Var2.f30849f = string;
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        p0 p0Var2 = m0Var2.f30844a;
        if (treeSet.isEmpty() || treeMap.isEmpty()) {
            Log.i("PdfBox-Android", "font subset is empty");
        }
        m0Var2.a();
        DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream2);
        try {
            int size = treeSet.size() + 1;
            long[] jArr = new long[size];
            byte[] bArrD = m0Var2.d();
            try {
                byte[] bArrE = m0Var2.e();
                byte[] bArrG = m0Var2.g();
                HashMap map2 = map;
                byte[] bArrH = m0Var2.h();
                byte[] bArrI = m0Var2.i();
                try {
                    byte[] bArrC = m0Var2.c(jArr);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    m0 m0Var3 = m0Var2;
                    DataOutputStream dataOutputStream3 = new DataOutputStream(byteArrayOutputStream3);
                    int i11 = 0;
                    while (i11 < size) {
                        int i12 = i11;
                        dataOutputStream3.writeInt((int) jArr[i12]);
                        i11 = i12 + 1;
                        p0Var2 = p0Var2;
                    }
                    p0 p0Var3 = p0Var2;
                    dataOutputStream3.flush();
                    byte[] byteArray = byteArrayOutputStream3.toByteArray();
                    byte[] bArrB = m0Var3.b();
                    byte[] bArrF = m0Var3.f();
                    byte[] bArrJ = m0Var3.j();
                    TreeMap treeMap2 = new TreeMap();
                    if (bArrI != null) {
                        bArr = bArrH;
                        treeMap2.put("OS/2", bArrI);
                    } else {
                        bArr = bArrH;
                    }
                    if (bArrB != null) {
                        treeMap2.put("cmap", bArrB);
                    }
                    treeMap2.put("glyf", bArrC);
                    treeMap2.put("head", bArrD);
                    treeMap2.put("hhea", bArrE);
                    treeMap2.put("hmtx", bArrF);
                    treeMap2.put("loca", byteArray);
                    treeMap2.put("maxp", bArrG);
                    if (bArr != null) {
                        treeMap2.put("name", bArr);
                    }
                    if (bArrJ != null) {
                        treeMap2.put("post", bArrJ);
                    }
                    for (Map.Entry entry : p0Var3.f30898b.entrySet()) {
                        String str = (String) entry.getKey();
                        n0 n0Var = (n0) entry.getValue();
                        if (treeMap2.containsKey(str)) {
                            m0Var = m0Var3;
                        } else {
                            m0Var = m0Var3;
                            if (m0Var.f30847d.contains(str)) {
                                treeMap2.put(str, p0Var3.d0(n0Var));
                            }
                        }
                        m0Var3 = m0Var;
                    }
                    int size2 = treeMap2.size();
                    dataOutputStream = dataOutputStream2;
                    try {
                        dataOutputStream.writeInt(65536);
                        dataOutputStream.writeShort(size2);
                        int iHighestOneBit = Integer.highestOneBit(size2);
                        int i13 = iHighestOneBit * 16;
                        dataOutputStream.writeShort(i13);
                        int iFloor = (int) Math.floor(Math.log(iHighestOneBit) / Math.log(2.0d));
                        dataOutputStream.writeShort(iFloor);
                        int i14 = (size2 * 16) - i13;
                        dataOutputStream.writeShort(i14);
                        long jO = ((i14 & 65535) | ((iFloor & 65535) << 16)) + (((size2 & 65535) << 16) | (i13 & 65535)) + 65536;
                        long size3 = (treeMap2.size() * 16) + 12;
                        for (Map.Entry entry2 : treeMap2.entrySet()) {
                            jO += m0.o(dataOutputStream, (String) entry2.getKey(), size3, (byte[]) entry2.getValue());
                            size3 += ((((byte[]) entry2.getValue()).length + 3) / 4) * 4;
                        }
                        long j11 = 2981146554L - (jO & BodyPartID.bodyIdMax);
                        char c11 = '\b';
                        bArrD[8] = (byte) (j11 >>> 24);
                        bArrD[9] = (byte) (j11 >>> 16);
                        bArrD[10] = (byte) (j11 >>> 8);
                        bArrD[11] = (byte) j11;
                        for (byte[] bArr2 : treeMap2.values()) {
                            int length = bArr2.length;
                            dataOutputStream.write(bArr2);
                            int i15 = length % 4;
                            if (i15 != 0) {
                                dataOutputStream.write(m0.f30843h, 0, 4 - i15);
                            }
                        }
                        dataOutputStream.close();
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream2.toByteArray());
                        hf.b bVar = lVar.f18211g;
                        cf.d dVar = lVar.f18214j;
                        TreeMap treeMap3 = new TreeMap();
                        for (Map.Entry entry3 : map2.entrySet()) {
                            Integer num3 = (Integer) entry3.getKey();
                            num3.getClass();
                            Integer num4 = (Integer) entry3.getValue();
                            num4.getClass();
                            treeMap3.put(num4, num3);
                        }
                        hf.b bVar2 = lVar.f18211g;
                        TreeMap treeMap4 = new TreeMap();
                        int i16 = ((w) lVar.f18232b.Z("maxp")).f30950f;
                        boolean z10 = false;
                        int i17 = 1;
                        while (i17 <= i16) {
                            HashMap map3 = map2;
                            if (map3.containsKey(Integer.valueOf(i17)) && (arrayListA = lVar.f18234d.a((iIntValue = ((Integer) map3.get(Integer.valueOf(i17))).intValue()))) != null) {
                                int iIntValue2 = ((Integer) arrayListA.get(0)).intValue();
                                c10 = c11;
                                if (iIntValue2 > 65535) {
                                    z10 = true;
                                }
                                String str2 = new String(new int[]{iIntValue2}, 0, 1);
                                if (iIntValue < 0 || iIntValue > 65535) {
                                    throw new IllegalArgumentException("CID is not valid");
                                }
                                if (str2.isEmpty()) {
                                    throw new IllegalArgumentException("Text is null or empty");
                                }
                                treeMap4.put(Integer.valueOf(iIntValue), str2);
                            } else {
                                c10 = c11;
                            }
                            i17++;
                            map2 = map3;
                            c11 = c10;
                        }
                        ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream4, wf.a.f31520a));
                        bufferedWriter.write("/CIDInit /ProcSet findresource begin");
                        bufferedWriter.write(10);
                        bufferedWriter.write("12 dict begin\n");
                        bufferedWriter.write(10);
                        bufferedWriter.write("begincmap");
                        bufferedWriter.write(10);
                        bufferedWriter.write("/CIDSystemInfo");
                        bufferedWriter.write(10);
                        bufferedWriter.write("<< /Registry (Adobe)");
                        bufferedWriter.write(10);
                        bufferedWriter.write("/Ordering (UCS)");
                        bufferedWriter.write(10);
                        bufferedWriter.write("/Supplement 0");
                        bufferedWriter.write(10);
                        bufferedWriter.write(">> def\n");
                        bufferedWriter.write(10);
                        bufferedWriter.write("/CMapName /Adobe-Identity-UCS def");
                        bufferedWriter.write(10);
                        bufferedWriter.write("/CMapType 2 def\n");
                        bufferedWriter.write(10);
                        bufferedWriter.write("1 begincodespacerange");
                        bufferedWriter.write(10);
                        bufferedWriter.write("<0000> <FFFF>");
                        bufferedWriter.write(10);
                        bufferedWriter.write("endcodespacerange\n");
                        bufferedWriter.write(10);
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        Map.Entry entry4 = null;
                        for (Map.Entry entry5 : treeMap4.entrySet()) {
                            if (entry4 == null || entry5 == null) {
                                byteArrayOutputStream = byteArrayOutputStream4;
                            } else {
                                if (r.a(((Integer) entry4.getKey()).intValue(), ((Integer) entry5.getKey()).intValue())) {
                                    String str3 = (String) entry4.getValue();
                                    String str4 = (String) entry5.getValue();
                                    if (str3.isEmpty() || str4.isEmpty()) {
                                        byteArrayOutputStream = byteArrayOutputStream4;
                                    } else {
                                        byteArrayOutputStream = byteArrayOutputStream4;
                                        if (r.a(str3.codePointAt(0), str4.codePointAt(0))) {
                                            if (str3.codePointCount(0, str3.length()) == 1) {
                                                arrayList3.set(arrayList3.size() - 1, entry5.getKey());
                                            }
                                        }
                                    }
                                }
                                byteArrayOutputStream4 = byteArrayOutputStream;
                                entry4 = entry5;
                            }
                            arrayList2.add(entry5.getKey());
                            arrayList3.add(entry5.getKey());
                            arrayList4.add(entry5.getValue());
                            byteArrayOutputStream4 = byteArrayOutputStream;
                            entry4 = entry5;
                        }
                        ByteArrayOutputStream byteArrayOutputStream5 = byteArrayOutputStream4;
                        int iCeil = (int) Math.ceil(arrayList2.size() / 100.0d);
                        int i18 = 0;
                        while (i18 < iCeil) {
                            int size4 = i18 == iCeil + (-1) ? arrayList2.size() - (i18 * 100) : 100;
                            bufferedWriter.write(size4 + " beginbfrange\n");
                            int i19 = 0;
                            while (i19 < size4) {
                                int i20 = (i18 * 100) + i19;
                                int i21 = iCeil;
                                bufferedWriter.write(60);
                                bufferedWriter.write(wf.b.a(((Integer) arrayList2.get(i20)).shortValue()));
                                bufferedWriter.write("> ");
                                int i22 = i18;
                                bufferedWriter.write(60);
                                bufferedWriter.write(wf.b.a(((Integer) arrayList3.get(i20)).shortValue()));
                                bufferedWriter.write("> ");
                                bufferedWriter.write(60);
                                String str5 = (String) arrayList4.get(i20);
                                char[] cArr = new char[str5.length() * 4];
                                int i23 = i19;
                                int i24 = 0;
                                for (int i25 = 0; i25 < str5.length(); i25++) {
                                    char cCharAt = str5.charAt(i25);
                                    char[] cArr2 = wf.b.f31527b;
                                    cArr[i24] = cArr2[(cCharAt >> '\f') & 15];
                                    cArr[i24 + 1] = cArr2[(cCharAt >> '\b') & 15];
                                    int i26 = i24 + 3;
                                    cArr[i24 + 2] = cArr2[(cCharAt >> 4) & 15];
                                    i24 += 4;
                                    cArr[i26] = cArr2[cCharAt & 15];
                                }
                                bufferedWriter.write(cArr);
                                bufferedWriter.write(">\n");
                                i19 = i23 + 1;
                                iCeil = i21;
                                i18 = i22;
                            }
                            bufferedWriter.write("endbfrange\n");
                            bufferedWriter.write(10);
                            i18++;
                            iCeil = iCeil;
                        }
                        bufferedWriter.write("endcmap");
                        bufferedWriter.write(10);
                        bufferedWriter.write("CMapName currentdict /CMap defineresource pop");
                        bufferedWriter.write(10);
                        bufferedWriter.write("end");
                        bufferedWriter.write(10);
                        bufferedWriter.write("end");
                        bufferedWriter.write(10);
                        bufferedWriter.flush();
                        jf.h hVar2 = new jf.h(bVar2, new ByteArrayInputStream(byteArrayOutputStream5.toByteArray()), cf.l.E0);
                        if (z10 && bVar2.p() < 1.5d) {
                            float fP = bVar2.p();
                            if (1.5f != fP) {
                                if (1.5f < fP) {
                                    Log.e("PdfBox-Android", "It's not allowed to downgrade the version of a pdf.");
                                } else {
                                    cf.e eVar = bVar2.f12997a;
                                    if (eVar.f5424b >= 1.4f) {
                                        bVar2.h().f13005a.R0(cf.l.B2, Float.toString(1.5f));
                                    } else {
                                        eVar.f5424b = 1.5f;
                                    }
                                }
                            }
                        }
                        lVar.f18213i.P0(cf.l.f5524u2, hVar2);
                        jf.h hVar3 = new jf.h(lVar.f18231a, byteArrayInputStream, cf.l.E0);
                        t tVar = hVar3.f15719a;
                        try {
                            hVarU0 = tVar.U0();
                            try {
                                l0 l0Var = new l0(false, false);
                                l0Var.f30837a = true;
                                p0VarC = l0Var.c(new x(hVarU0));
                                lVar.f18232b = p0VarC;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            hVar = null;
                        }
                        try {
                            if (p0VarC.M() != null) {
                                short s10 = p0VarC.M().f30759j;
                                boolean z11 = ((s10 & 15) == 2 || (s10 & 512) == 512) ? false : true;
                                if (!z11) {
                                    try {
                                        throw new IOException("This font does not permit embedding");
                                    } catch (Throwable th4) {
                                        th = th4;
                                        hVar = hVarU0;
                                        ef.a.b(hVar);
                                        throw th;
                                    }
                                }
                                if (lVar.f18233c == null) {
                                    lVar.f18233c = s.a(lVar.f18232b);
                                }
                                ef.a.b(hVarU0);
                                tVar.Q0(cf.l.f5489l1, lVar.f18232b.f30899c.p());
                                lVar.f18233c.f18221a.P0(cf.l.L0, hVar3);
                                String strA = k3.a.a(string, lVar.f18233c.a());
                                cf.d dVar2 = lVar.f18213i;
                                cf.l lVar2 = cf.l.f5529w;
                                dVar2.R0(lVar2, strA);
                                o oVar = lVar.f18233c;
                                if (strA != null) {
                                    oVar.getClass();
                                    lVarG0 = cf.l.g0(strA);
                                } else {
                                    lVarG0 = null;
                                }
                                oVar.f18221a.O0(cf.l.N0, lVarG0);
                                dVar.R0(lVar2, strA);
                                float f10 = 1000.0f / lVar.f18232b.l().f30906j;
                                cf.a aVar2 = new cf.a();
                                cf.a aVar3 = new cf.a();
                                Set setKeySet = treeMap3.keySet();
                                ve.s sVarP = lVar.f18232b.p();
                                Iterator it3 = setKeySet.iterator();
                                int i27 = PKIFailureInfo.systemUnavail;
                                while (it3.hasNext()) {
                                    int iIntValue3 = ((Integer) it3.next()).intValue();
                                    cf.a aVar4 = aVar3;
                                    long jRound = Math.round(sVarP.b(((Integer) treeMap3.get(r12)).intValue()) * f10);
                                    if (jRound == 1000) {
                                        aVar3 = aVar4;
                                    } else {
                                        if (i27 != iIntValue3 - 1) {
                                            aVar = new cf.a();
                                            aVar2.g0(cf.i.q0(iIntValue3));
                                            aVar2.g0(aVar);
                                        } else {
                                            aVar = aVar4;
                                        }
                                        aVar.g0(cf.i.q0(jRound));
                                        aVar3 = aVar;
                                        i27 = iIntValue3;
                                    }
                                }
                                dVar.O0(cf.l.C2, aVar2);
                                int iIntValue4 = ((Integer) treeMap3.lastKey()).intValue();
                                byte[] bArr3 = new byte[(iIntValue4 * 2) + 2];
                                int i28 = 0;
                                for (int i29 = 0; i29 <= iIntValue4; i29++) {
                                    Integer num5 = (Integer) treeMap3.get(Integer.valueOf(i29));
                                    if (num5 != null) {
                                        bArr3[i28] = (byte) ((num5.intValue() >> 8) & 255);
                                        bArr3[i28 + 1] = (byte) (num5.intValue() & 255);
                                    }
                                    i28 += 2;
                                }
                                dVar.P0(cf.l.M, new jf.h(bVar, new ByteArrayInputStream(bArr3), cf.l.E0));
                                int iIntValue5 = ((Integer) treeMap3.lastKey()).intValue();
                                byte[] bArr4 = new byte[(iIntValue5 / 8) + 1];
                                for (int i30 = 0; i30 <= iIntValue5; i30++) {
                                    int i31 = i30 / 8;
                                    bArr4[i31] = (byte) ((1 << (7 - (i30 % 8))) | bArr4[i31]);
                                }
                                lVar.f18233c.f18221a.P0(cf.l.N, new jf.h(bVar, new ByteArrayInputStream(bArr4), cf.l.E0));
                                lVar.f18232b.close();
                                p0 p0Var4 = this.f18229h;
                                if (p0Var4 != null) {
                                    p0Var4.close();
                                    this.f18229h = null;
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            hVar = hVarU0;
                            ef.a.b(hVar);
                            throw th;
                        }
                        ef.a.b(hVar);
                        throw th;
                    } catch (Throwable th6) {
                        th = th6;
                        dataOutputStream.close();
                        throw th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    dataOutputStream = dataOutputStream2;
                }
            } catch (Throwable th8) {
                th = th8;
                dataOutputStream = dataOutputStream2;
                dataOutputStream.close();
                throw th;
            }
        } catch (Throwable th9) {
            th = th9;
        }
    }

    @Override // mf.n
    public final boolean e() {
        l lVar = this.f18228g;
        return lVar != null && lVar.f18236f;
    }

    @Override // mf.n
    public final String toString() {
        return p.class.getSimpleName() + "/" + (this.f18223b != null ? k.class.getSimpleName() : null) + ", PostScript name: " + this.f18220a.J0(cf.l.f5529w);
    }
}
