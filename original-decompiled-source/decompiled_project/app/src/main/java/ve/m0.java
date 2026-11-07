package ve;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes2.dex */
public final class m0 {

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f30843h = {0, 0, 0};

    /* renamed from: a, reason: collision with root package name */
    public final p0 f30844a;

    /* renamed from: b, reason: collision with root package name */
    public final c f30845b;

    /* renamed from: c, reason: collision with root package name */
    public final TreeMap f30846c = new TreeMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f30847d;

    /* renamed from: e, reason: collision with root package name */
    public final TreeSet f30848e;

    /* renamed from: f, reason: collision with root package name */
    public String f30849f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f30850g;

    public m0(p0 p0Var, ArrayList arrayList) throws IOException {
        this.f30844a = p0Var;
        this.f30847d = arrayList;
        TreeSet treeSet = new TreeSet();
        this.f30848e = treeSet;
        this.f30845b = p0Var.f0(true);
        treeSet.add(0);
    }

    public static long k(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream, long j10, long j11, int i10) throws IOException {
        long j12 = j10 - j11;
        if (j12 != inputStream.skip(j12)) {
            throw new EOFException("Unexpected EOF exception parsing glyphId of hmtx table.");
        }
        byte[] bArr = new byte[i10];
        if (i10 != inputStream.read(bArr, 0, i10)) {
            throw new EOFException("Unexpected EOF exception parsing glyphId of hmtx table.");
        }
        byteArrayOutputStream.write(bArr, 0, i10);
        return j10 + i10;
    }

    public static boolean l(y yVar) {
        int i10;
        return yVar.f30966a == 3 && yVar.f30967b == 1 && yVar.f30968c == 1033 && (i10 = yVar.f30969d) >= 0 && i10 < 7;
    }

    public static void m(DataOutputStream dataOutputStream, double d10) throws IOException {
        double dFloor = Math.floor(d10);
        dataOutputStream.writeShort((int) dFloor);
        dataOutputStream.writeShort((int) ((d10 - dFloor) * 65536.0d));
    }

    public static void n(DataOutputStream dataOutputStream, Calendar calendar) throws IOException {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar2.set(1904, 0, 1, 0, 0, 0);
        calendar2.set(14, 0);
        dataOutputStream.writeLong((calendar.getTimeInMillis() - calendar2.getTimeInMillis()) / 1000);
    }

    public static long o(DataOutputStream dataOutputStream, String str, long j10, byte[] bArr) throws IOException {
        long j11 = 0;
        for (int i10 = 0; i10 < bArr.length; i10++) {
            j11 += (255 & bArr[i10]) << (24 - ((i10 % 4) * 8));
        }
        long j12 = j11 & BodyPartID.bodyIdMax;
        dataOutputStream.write(str.getBytes("US-ASCII"), 0, 4);
        dataOutputStream.writeInt((int) j12);
        dataOutputStream.writeInt((int) j10);
        dataOutputStream.writeInt(bArr.length);
        return ((r12[3] & 255) | ((r12[0] & 255) << 24) | ((r12[1] & 255) << 16) | ((r12[2] & 255) << 8)) + j12 + j12 + j10 + bArr.length;
    }

    public final void a() throws IOException {
        TreeSet treeSet;
        int i10;
        TreeSet treeSet2 = this.f30848e;
        if (this.f30850g) {
            return;
        }
        this.f30850g = true;
        p0 p0Var = this.f30844a;
        p pVarH = p0Var.h();
        long[] jArr = ((t) p0Var.Z("loca")).f30945f;
        do {
            InputStream inputStreamL = p0Var.f30899c.l();
            try {
                inputStreamL.skip(pVarH.f30853b);
                Iterator it = treeSet2.iterator();
                treeSet = null;
                long j10 = 0;
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    long j11 = jArr[num.intValue()];
                    long j12 = jArr[num.intValue() + 1] - j11;
                    inputStreamL.skip(j11 - j10);
                    int i11 = (int) j12;
                    byte[] bArr = new byte[i11];
                    inputStreamL.read(bArr);
                    if (i11 >= 2 && bArr[0] == -1 && bArr[1] == -1) {
                        int i12 = 10;
                        do {
                            i10 = ((bArr[i12] & 255) << 8) | (bArr[i12 + 1] & 255);
                            int i13 = ((bArr[i12 + 2] & 255) << 8) | (bArr[i12 + 3] & 255);
                            if (!treeSet2.contains(Integer.valueOf(i13))) {
                                if (treeSet == null) {
                                    treeSet = new TreeSet();
                                }
                                treeSet.add(Integer.valueOf(i13));
                            }
                            i12 = (i10 & 1) != 0 ? i12 + 8 : i12 + 6;
                            if ((i10 & 128) != 0) {
                                i12 += 8;
                            } else if ((i10 & 64) != 0) {
                                i12 += 4;
                            } else if ((i10 & 8) != 0) {
                                i12 += 2;
                            }
                        } while ((i10 & 32) != 0);
                    }
                    j10 = jArr[num.intValue() + 1];
                }
                inputStreamL.close();
                if (treeSet != null) {
                    treeSet2.addAll(treeSet);
                }
            } catch (Throwable th2) {
                inputStreamL.close();
                throw th2;
            }
        } while (treeSet != null);
    }

    public final byte[] b() throws IOException {
        if (((e) this.f30844a.Z("cmap")) == null) {
            return null;
        }
        TreeMap treeMap = this.f30846c;
        if (treeMap.isEmpty() || !this.f30847d.contains("cmap")) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeShort(0);
        int i10 = 1;
        dataOutputStream.writeShort(1);
        dataOutputStream.writeShort(3);
        dataOutputStream.writeShort(1);
        dataOutputStream.writeInt((int) 12);
        Iterator it = treeMap.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        Integer num = (Integer) entry.getValue();
        TreeSet treeSet = this.f30848e;
        int size = treeSet.headSet(num).size();
        int size2 = treeMap.size() + 1;
        int[] iArr = new int[size2];
        int[] iArr2 = new int[size2];
        int[] iArr3 = new int[size2];
        int i11 = 0;
        int i12 = size;
        Map.Entry entry2 = entry;
        while (it.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it.next();
            int i13 = i10;
            int size3 = treeSet.headSet((Integer) entry3.getValue()).size();
            if (((Integer) entry3.getKey()).intValue() > 65535) {
                throw new UnsupportedOperationException("non-BMP Unicode character");
            }
            if (((Integer) entry3.getKey()).intValue() != ((Integer) entry2.getKey()).intValue() + 1 || size3 - i12 != ((Integer) entry3.getKey()).intValue() - ((Integer) entry.getKey()).intValue()) {
                if (i12 != 0) {
                    iArr[i11] = ((Integer) entry.getKey()).intValue();
                    iArr2[i11] = ((Integer) entry2.getKey()).intValue();
                    iArr3[i11] = i12 - ((Integer) entry.getKey()).intValue();
                } else {
                    if (!((Integer) entry.getKey()).equals(entry2.getKey())) {
                        iArr[i11] = ((Integer) entry.getKey()).intValue() + 1;
                        iArr2[i11] = ((Integer) entry2.getKey()).intValue();
                        iArr3[i11] = i12 - ((Integer) entry.getKey()).intValue();
                    }
                    i12 = size3;
                    entry = entry3;
                }
                i11++;
                i12 = size3;
                entry = entry3;
            }
            entry2 = entry3;
            i10 = i13;
        }
        iArr[i11] = ((Integer) entry.getKey()).intValue();
        iArr2[i11] = ((Integer) entry2.getKey()).intValue();
        iArr3[i11] = i12 - ((Integer) entry.getKey()).intValue();
        int i14 = i11 + 1;
        iArr[i14] = 65535;
        iArr2[i14] = 65535;
        iArr3[i14] = i10;
        int i15 = i11 + 2;
        int iPow = ((int) Math.pow(2.0d, (int) Math.floor(Math.log(i15) / Math.log(2.0d)))) * 2;
        dataOutputStream.writeShort(4);
        dataOutputStream.writeShort((i15 * 8) + 16);
        dataOutputStream.writeShort(0);
        int i16 = i15 * 2;
        dataOutputStream.writeShort(i16);
        dataOutputStream.writeShort(iPow);
        dataOutputStream.writeShort((int) Math.floor(Math.log(iPow / 2) / Math.log(2.0d)));
        dataOutputStream.writeShort(i16 - iPow);
        for (int i17 = 0; i17 < i15; i17++) {
            dataOutputStream.writeShort(iArr2[i17]);
        }
        dataOutputStream.writeShort(0);
        for (int i18 = 0; i18 < i15; i18++) {
            dataOutputStream.writeShort(iArr[i18]);
        }
        for (int i19 = 0; i19 < i15; i19++) {
            dataOutputStream.writeShort(iArr3[i19]);
        }
        for (int i20 = 0; i20 < i15; i20++) {
            dataOutputStream.writeShort(0);
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0102 A[Catch: all -> 0x00e2, TryCatch #0 {all -> 0x00e2, blocks: (B:3:0x001f, B:4:0x002e, B:6:0x0034, B:8:0x0060, B:10:0x0065, B:13:0x006b, B:15:0x00ad, B:17:0x00b2, B:19:0x00b6, B:26:0x00c6, B:28:0x00ca, B:30:0x00d0, B:34:0x00e4, B:35:0x00e8, B:40:0x00fa, B:42:0x0102, B:44:0x0111, B:20:0x00b9, B:22:0x00bd, B:23:0x00c0, B:25:0x00c4, B:16:0x00b0, B:39:0x00f4, B:45:0x011a), top: B:50:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] c(long[] jArr) throws IOException {
        TreeSet treeSet;
        long j10;
        int i10;
        TreeSet treeSet2 = this.f30848e;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        p0 p0Var = this.f30844a;
        p pVarH = p0Var.h();
        long[] jArr2 = ((t) p0Var.Z("loca")).f30945f;
        InputStream inputStreamL = p0Var.f30899c.l();
        try {
            inputStreamL.skip(pVarH.f30853b);
            Iterator it = treeSet2.iterator();
            char c10 = 0;
            int i11 = 0;
            long j11 = 0;
            long j12 = 0;
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                long j13 = jArr2[num.intValue()];
                long j14 = jArr2[num.intValue() + 1] - j13;
                int i12 = i11 + 1;
                jArr[i11] = j11;
                inputStreamL.skip(j13 - j12);
                int i13 = (int) j14;
                byte[] bArr = new byte[i13];
                inputStreamL.read(bArr);
                if (i13 >= 2 && bArr[c10] == -1 && bArr[1] == -1) {
                    int i14 = 10;
                    while (true) {
                        i10 = ((bArr[i14] & 255) << 8) | (bArr[i14 + 1] & 255);
                        int i15 = i14 + 2;
                        int i16 = i14 + 3;
                        int i17 = ((bArr[i15] & 255) << 8) | (bArr[i16] & 255);
                        treeSet2.add(Integer.valueOf(i17));
                        int size = treeSet2.headSet(Integer.valueOf(i17)).size();
                        treeSet = treeSet2;
                        bArr[i15] = (byte) (size >>> 8);
                        bArr[i16] = (byte) size;
                        i14 = (i10 & 1) != 0 ? i14 + 8 : i14 + 6;
                        if ((i10 & 128) != 0) {
                            i14 += 8;
                        } else if ((i10 & 64) != 0) {
                            i14 += 4;
                        } else if ((i10 & 8) != 0) {
                            i14 += 2;
                        }
                        if ((i10 & 32) == 0) {
                            break;
                        }
                        treeSet2 = treeSet;
                    }
                    if ((i10 & 256) == 256) {
                        i14 = i14 + 2 + (((bArr[i14] & 255) << 8) | (bArr[i14 + 1] & 255));
                    }
                    byteArrayOutputStream.write(bArr, 0, i14);
                    j10 = i14;
                } else {
                    treeSet = treeSet2;
                    if (i13 > 0) {
                        byteArrayOutputStream.write(bArr, 0, i13);
                        j10 = i13;
                    }
                    if (j11 % 4 == 0) {
                        int i18 = 4 - ((int) (j11 % 4));
                        c10 = 0;
                        byteArrayOutputStream.write(f30843h, 0, i18);
                        j11 += i18;
                    } else {
                        c10 = 0;
                    }
                    j12 = j13 + j14;
                    i11 = i12;
                    treeSet2 = treeSet;
                }
                j11 += j10;
                if (j11 % 4 == 0) {
                }
                j12 = j13 + j14;
                i11 = i12;
                treeSet2 = treeSet;
            }
            jArr[i11] = j11;
            inputStreamL.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            inputStreamL.close();
            throw th2;
        }
    }

    public final byte[] d() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        q qVarL = this.f30844a.l();
        m(dataOutputStream, qVarL.f30902f);
        m(dataOutputStream, qVarL.f30903g);
        dataOutputStream.writeInt((int) 0);
        dataOutputStream.writeInt((int) qVarL.f30904h);
        dataOutputStream.writeShort(qVarL.f30905i);
        dataOutputStream.writeShort(qVarL.f30906j);
        n(dataOutputStream, qVarL.f30907k);
        n(dataOutputStream, qVarL.f30908l);
        dataOutputStream.writeShort(qVarL.f30909m);
        dataOutputStream.writeShort(qVarL.f30910n);
        dataOutputStream.writeShort(qVarL.f30911o);
        dataOutputStream.writeShort(qVarL.f30912p);
        dataOutputStream.writeShort(qVarL.f30913q);
        dataOutputStream.writeShort(qVarL.f30914r);
        dataOutputStream.writeShort(qVarL.f30915s);
        dataOutputStream.writeShort(1);
        dataOutputStream.writeShort(qVarL.f30917u);
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public final byte[] e() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        r rVar = (r) this.f30844a.Z("hhea");
        m(dataOutputStream, rVar.f30919f);
        dataOutputStream.writeShort(rVar.f30920g);
        dataOutputStream.writeShort(rVar.f30921h);
        dataOutputStream.writeShort(rVar.f30922i);
        dataOutputStream.writeShort(rVar.f30923j);
        dataOutputStream.writeShort(rVar.f30924k);
        dataOutputStream.writeShort(rVar.f30925l);
        dataOutputStream.writeShort(rVar.f30926m);
        dataOutputStream.writeShort(rVar.f30927n);
        dataOutputStream.writeShort(rVar.f30928o);
        dataOutputStream.writeShort(rVar.f30929p);
        dataOutputStream.writeShort(rVar.f30930q);
        dataOutputStream.writeShort(rVar.f30931r);
        dataOutputStream.writeShort(rVar.f30932s);
        dataOutputStream.writeShort(rVar.f30933t);
        dataOutputStream.writeShort(rVar.f30934u);
        Integer numValueOf = Integer.valueOf(rVar.f30935v);
        TreeSet treeSet = this.f30848e;
        int size = treeSet.subSet(0, numValueOf).size();
        int iIntValue = ((Integer) treeSet.last()).intValue();
        int i10 = rVar.f30935v;
        if (iIntValue >= i10 && !treeSet.contains(Integer.valueOf(i10 - 1))) {
            size++;
        }
        dataOutputStream.writeShort(size);
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public final byte[] f() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        p0 p0Var = this.f30844a;
        r rVar = (r) p0Var.Z("hhea");
        s sVarP = p0Var.p();
        InputStream inputStreamL = p0Var.f30899c.l();
        int i10 = rVar.f30935v - 1;
        TreeSet treeSet = this.f30848e;
        boolean z10 = ((Integer) treeSet.last()).intValue() > i10 && !treeSet.contains(Integer.valueOf(i10));
        try {
            inputStreamL.skip(sVarP.f30853b);
            Iterator it = treeSet.iterator();
            long jK = 0;
            boolean z11 = z10;
            while (true) {
                long jK2 = jK;
                if (!it.hasNext()) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStreamL.close();
                    return byteArray;
                }
                if (((Integer) it.next()).intValue() <= i10) {
                    jK = k(inputStreamL, byteArrayOutputStream, r13.intValue() * 4, jK2, 4);
                } else {
                    if (z11) {
                        jK2 = k(inputStreamL, byteArrayOutputStream, i10 * 4, jK2, 2);
                        z11 = false;
                    }
                    jK = k(inputStreamL, byteArrayOutputStream, (rVar.f30935v * 4) + ((r13.intValue() - rVar.f30935v) * 2), jK2, 2);
                }
            }
        } catch (Throwable th2) {
            inputStreamL.close();
            throw th2;
        }
    }

    public final byte[] g() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        w wVar = (w) this.f30844a.Z("maxp");
        m(dataOutputStream, 1.0d);
        dataOutputStream.writeShort(this.f30848e.size());
        dataOutputStream.writeShort(wVar.f30951g);
        dataOutputStream.writeShort(wVar.f30952h);
        dataOutputStream.writeShort(wVar.f30953i);
        dataOutputStream.writeShort(wVar.f30954j);
        dataOutputStream.writeShort(wVar.f30955k);
        dataOutputStream.writeShort(wVar.f30956l);
        dataOutputStream.writeShort(wVar.f30957m);
        dataOutputStream.writeShort(wVar.f30958n);
        dataOutputStream.writeShort(wVar.f30959o);
        dataOutputStream.writeShort(wVar.f30960p);
        dataOutputStream.writeShort(wVar.f30961q);
        dataOutputStream.writeShort(wVar.f30962r);
        dataOutputStream.writeShort(wVar.f30963s);
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] h() throws IOException {
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        z zVar = (z) this.f30844a.Z("name");
        if (zVar == null || !this.f30847d.contains("name")) {
            return null;
        }
        ArrayList arrayList = zVar.f30973f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            if (l((y) obj)) {
                i10++;
            }
        }
        dataOutputStream.writeShort(0);
        dataOutputStream.writeShort(i10);
        dataOutputStream.writeShort((i10 * 12) + 6);
        if (i10 == 0) {
            return null;
        }
        byte[][] bArr = new byte[i10][];
        int size2 = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList.get(i13);
            i13++;
            y yVar = (y) obj2;
            if (l(yVar)) {
                int i14 = yVar.f30966a;
                int i15 = yVar.f30967b;
                if (i14 == 3 && i15 == 1) {
                    str = "UTF-16BE";
                } else if (i14 != 2) {
                    str = "ISO-8859-1";
                } else if (i15 == 0) {
                    str = "US-ASCII";
                } else if (i15 == 1) {
                    str = "UTF16-BE";
                }
                String strA = yVar.f30972g;
                if (yVar.f30969d == 6 && this.f30849f != null) {
                    strA = b.o.a(new StringBuilder(), this.f30849f, strA);
                }
                bArr[i12] = strA.getBytes(str);
                i12++;
            }
        }
        int size3 = arrayList.size();
        int i16 = 0;
        int length = 0;
        int i17 = 0;
        while (i17 < size3) {
            Object obj3 = arrayList.get(i17);
            i17++;
            y yVar2 = (y) obj3;
            if (l(yVar2)) {
                dataOutputStream.writeShort(yVar2.f30966a);
                dataOutputStream.writeShort(yVar2.f30967b);
                dataOutputStream.writeShort(yVar2.f30968c);
                dataOutputStream.writeShort(yVar2.f30969d);
                dataOutputStream.writeShort(bArr[i16].length);
                dataOutputStream.writeShort(length);
                length += bArr[i16].length;
                i16++;
            }
        }
        for (int i18 = 0; i18 < i10; i18++) {
            dataOutputStream.write(bArr[i18]);
        }
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public final byte[] i() throws IOException {
        a0 a0VarM = this.f30844a.M();
        if (a0VarM == null) {
            return null;
        }
        TreeMap treeMap = this.f30846c;
        if (treeMap.isEmpty() || !this.f30847d.contains("OS/2")) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeShort(a0VarM.f30755f);
        dataOutputStream.writeShort(a0VarM.f30756g);
        dataOutputStream.writeShort(a0VarM.f30757h);
        dataOutputStream.writeShort(a0VarM.f30758i);
        dataOutputStream.writeShort(a0VarM.f30759j);
        dataOutputStream.writeShort(a0VarM.f30760k);
        dataOutputStream.writeShort(a0VarM.f30761l);
        dataOutputStream.writeShort(a0VarM.f30762m);
        dataOutputStream.writeShort(a0VarM.f30763n);
        dataOutputStream.writeShort(a0VarM.f30764o);
        dataOutputStream.writeShort(a0VarM.f30765p);
        dataOutputStream.writeShort(a0VarM.f30766q);
        dataOutputStream.writeShort(a0VarM.f30767r);
        dataOutputStream.writeShort(a0VarM.f30768s);
        dataOutputStream.writeShort(a0VarM.f30769t);
        dataOutputStream.writeShort((short) a0VarM.f30770u);
        dataOutputStream.write(a0VarM.f30771v);
        int i10 = (int) 0;
        dataOutputStream.writeInt(i10);
        dataOutputStream.writeInt(i10);
        dataOutputStream.writeInt(i10);
        dataOutputStream.writeInt(i10);
        dataOutputStream.write(a0VarM.f30772w.getBytes("US-ASCII"));
        dataOutputStream.writeShort(a0VarM.f30773x);
        dataOutputStream.writeShort(((Integer) treeMap.firstKey()).intValue());
        dataOutputStream.writeShort(((Integer) treeMap.lastKey()).intValue());
        dataOutputStream.writeShort(a0VarM.f30774y);
        dataOutputStream.writeShort(a0VarM.f30775z);
        dataOutputStream.writeShort(a0VarM.A);
        dataOutputStream.writeShort(a0VarM.B);
        dataOutputStream.writeShort(a0VarM.C);
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public final byte[] j() throws IOException {
        String[] strArr;
        g0 g0Var = (g0) this.f30844a.Z("post");
        if (g0Var == null || !this.f30847d.contains("post")) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        m(dataOutputStream, 2.0d);
        m(dataOutputStream, g0Var.f30806g);
        dataOutputStream.writeShort(g0Var.f30807h);
        dataOutputStream.writeShort(g0Var.f30808i);
        dataOutputStream.writeInt((int) g0Var.f30809j);
        dataOutputStream.writeInt((int) g0Var.f30810k);
        dataOutputStream.writeInt((int) g0Var.f30811l);
        dataOutputStream.writeInt((int) g0Var.f30812m);
        dataOutputStream.writeInt((int) g0Var.f30813n);
        TreeSet treeSet = this.f30848e;
        dataOutputStream.writeShort(treeSet.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            String str = (iIntValue < 0 || (strArr = g0Var.f30814o) == null || iIntValue >= strArr.length) ? null : strArr[iIntValue];
            Integer num = (Integer) t0.f30947b.get(str);
            if (num != null) {
                dataOutputStream.writeShort(num.intValue());
            } else {
                Integer numValueOf = (Integer) linkedHashMap.get(str);
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(linkedHashMap.size());
                    linkedHashMap.put(str, numValueOf);
                }
                dataOutputStream.writeShort(numValueOf.intValue() + 258);
            }
        }
        Iterator it2 = linkedHashMap.keySet().iterator();
        while (it2.hasNext()) {
            byte[] bytes = ((String) it2.next()).getBytes(Charset.forName("US-ASCII"));
            dataOutputStream.writeByte(bytes.length);
            dataOutputStream.write(bytes);
        }
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }
}
