package we;

import androidx.datastore.preferences.protobuf.y0;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import j2.y;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import p.g0;
import re.r;
import re.s;
import we.b;

/* loaded from: classes2.dex */
public final class d implements c, qe.a {

    /* renamed from: a, reason: collision with root package name */
    public String f31509a = "";

    /* renamed from: b, reason: collision with root package name */
    public j2.b f31510b = null;

    /* renamed from: c, reason: collision with root package name */
    public String f31511c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f31512d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f31513e;

    /* renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap f31514f;

    public d() {
        new ArrayList();
        new ArrayList();
        this.f31511c = "";
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        this.f31512d = new ArrayList();
        this.f31513e = new LinkedHashMap();
        this.f31514f = new ConcurrentHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x0414, code lost:
    
        if (r0.f31518a.c(r1) == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0422, code lost:
    
        if (r0.f31518a.f31516b.f31493a.equals("CharStrings") != false) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0427, code lost:
    
        r0.e("CharStrings", r1);
        r3 = r0.d(r2).a();
        r0.e("dict", r7);
        r0.e("dup", r7);
        r0.e("begin", r7);
        r5 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x043e, code lost:
    
        if (r5 >= r3) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0440, code lost:
    
        r8 = r0.f31518a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0444, code lost:
    
        if (r8.f31516b != null) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x044b, code lost:
    
        if (r8.c(r7) == false) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0457, code lost:
    
        if (r0.f31518a.f31516b.f31493a.equals("end") == false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x045a, code lost:
    
        r4 = r0.d(r1).f31493a;
        r0.d(r2);
        r0.f31519b.f31513e.put(r4, we.f.b(r0.d(r12).f31494b, 4330, r6));
        r0.f();
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x047c, code lost:
    
        r0.e("end", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0480, code lost:
    
        r0.f31518a.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0197, code lost:
    
        r10 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d b(FileInputStream fileInputStream) throws IOException, NumberFormatException {
        int i10;
        byte[] bArrB;
        b bVar;
        int i11;
        int i12;
        int i13;
        int i14;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[65535];
        while (true) {
            int i15 = fileInputStream.read(bArr);
            i10 = 0;
            if (i15 == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i15);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length < 18) {
            throw new IOException("PFB header missing");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        int length = byteArray.length - 18;
        byte[] bArr2 = new byte[length];
        int[] iArr = new int[3];
        int i16 = 0;
        for (int i17 = 0; i17 < 3; i17++) {
            if (byteArrayInputStream.read() != 128) {
                throw new IOException("Start marker missing");
            }
            if (byteArrayInputStream.read() != ue.a.f29704a[i17]) {
                throw new IOException("Incorrect record type");
            }
            int i18 = byteArrayInputStream.read() + (byteArrayInputStream.read() << 8) + (byteArrayInputStream.read() << 16) + (byteArrayInputStream.read() << 24);
            if (i18 < 0) {
                throw new IOException(y.a(i18, "PFB record size is negative: "));
            }
            iArr[i17] = i18;
            if (i16 >= length) {
                throw new EOFException("attempted to read past EOF");
            }
            int i19 = length - i16;
            if (i18 > i19) {
                StringBuilder sbA = g0.a(i18, i16, "attempted to read ", " bytes at position ", " into array of size ");
                sbA.append(length);
                sbA.append(", but only space for ");
                sbA.append(i19);
                sbA.append(" bytes left");
                throw new EOFException(sbA.toString());
            }
            int i20 = byteArrayInputStream.read(bArr2, i16, i18);
            if (i20 < 0) {
                throw new EOFException();
            }
            i16 += i20;
        }
        f fVar = new f();
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, 0, iArr[0]);
        int i21 = iArr[0];
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr2, i21, iArr[1] + i21);
        fVar.f31519b = new d();
        try {
            fVar.c(bArrCopyOfRange);
            if (bArrCopyOfRange2.length > 0) {
                int iA = 4;
                if (bArrCopyOfRange2.length < 4) {
                    bArrB = f.b(bArrCopyOfRange2, 55665, 4);
                    e eVar = new e(bArrB);
                    fVar.f31518a = eVar;
                    bVar = eVar.f31516b;
                    while (bVar != null && !i.f7020l.equals(bVar.f31493a)) {
                        fVar.f31518a.b();
                        bVar = fVar.f31518a.f31516b;
                    }
                    if (bVar != null) {
                        throw new IOException("/Private token not found");
                    }
                    b.a aVar = b.a.f31498c;
                    fVar.e(i.f7020l, aVar);
                    b.a aVar2 = b.a.f31500e;
                    int iA2 = fVar.d(aVar2).a();
                    b.a aVar3 = b.a.f31497b;
                    fVar.e("dict", aVar3);
                    fVar.g("dup");
                    fVar.e("begin", aVar3);
                    int i22 = 0;
                    while (true) {
                        b.a aVar4 = b.a.f31507m;
                        if (i22 >= iA2 || !fVar.f31518a.c(aVar)) {
                            break;
                        }
                        String str = fVar.d(aVar).f31493a;
                        if ("Subrs".equals(str)) {
                            int iA3 = fVar.d(aVar2).a();
                            for (int i23 = i10; i23 < iA3; i23++) {
                                fVar.f31519b.f31512d.add(null);
                            }
                            fVar.e("array", aVar3);
                            int i24 = 0;
                            while (i24 < iA3) {
                                e eVar2 = fVar.f31518a;
                                if (eVar2.f31516b == null || !eVar2.c(aVar3) || !fVar.f31518a.f31516b.f31493a.equals("dup")) {
                                    break;
                                }
                                fVar.e("dup", aVar3);
                                b bVarD = fVar.d(aVar2);
                                fVar.d(aVar2);
                                b bVarD2 = fVar.d(aVar4);
                                int iA4 = bVarD.a();
                                if (iA4 < fVar.f31519b.f31512d.size()) {
                                    i14 = iA2;
                                    fVar.f31519b.f31512d.set(iA4, f.b(bVarD2.f31494b, 4330, iA));
                                } else {
                                    i14 = iA2;
                                }
                                fVar.i();
                                i24++;
                                iA2 = i14;
                            }
                            i11 = iA2;
                            fVar.f();
                        } else {
                            i11 = iA2;
                            if ("OtherSubrs".equals(str)) {
                                e eVar3 = fVar.f31518a;
                                if (eVar3.f31516b == null) {
                                    throw new IOException("Missing start token of OtherSubrs procedure");
                                }
                                if (eVar3.c(b.a.f31501f)) {
                                    fVar.k();
                                    fVar.f();
                                } else {
                                    int iA5 = fVar.d(aVar2).a();
                                    fVar.e("array", aVar3);
                                    for (int i25 = 0; i25 < iA5; i25++) {
                                        fVar.e("dup", aVar3);
                                        fVar.d(aVar2);
                                        fVar.k();
                                        fVar.i();
                                    }
                                    fVar.f();
                                }
                            } else if ("lenIV".equals(str)) {
                                ArrayList arrayListK = fVar.k();
                                fVar.f();
                                iA = ((b) arrayListK.get(0)).a();
                            } else {
                                boolean zEquals = "ND".equals(str);
                                b.a aVar5 = b.a.f31504j;
                                b.a aVar6 = b.a.f31503h;
                                if (zEquals) {
                                    fVar.d(aVar6);
                                    fVar.g("noaccess");
                                    fVar.e("def", aVar3);
                                    fVar.d(aVar5);
                                    fVar.g("executeonly");
                                    fVar.g("readonly");
                                    fVar.e("def", aVar3);
                                } else {
                                    i12 = i22;
                                    if ("NP".equals(str)) {
                                        fVar.d(aVar6);
                                        fVar.g("noaccess");
                                        fVar.d(aVar3);
                                        fVar.d(aVar5);
                                        fVar.g("executeonly");
                                        fVar.g("readonly");
                                        fVar.e("def", aVar3);
                                    } else if ("RD".equals(str)) {
                                        fVar.d(aVar6);
                                        fVar.h();
                                        fVar.g("bind");
                                        fVar.g("executeonly");
                                        fVar.g("readonly");
                                        fVar.e("def", aVar3);
                                    } else {
                                        ArrayList arrayListK2 = fVar.k();
                                        fVar.f();
                                        if (str.equals("BlueValues")) {
                                            d dVar = fVar.f31519b;
                                            f.a(arrayListK2);
                                            dVar.getClass();
                                        } else if (str.equals("OtherBlues")) {
                                            d dVar2 = fVar.f31519b;
                                            f.a(arrayListK2);
                                            dVar2.getClass();
                                        } else if (str.equals("FamilyBlues")) {
                                            d dVar3 = fVar.f31519b;
                                            f.a(arrayListK2);
                                            dVar3.getClass();
                                        } else if (str.equals("FamilyOtherBlues")) {
                                            d dVar4 = fVar.f31519b;
                                            f.a(arrayListK2);
                                            dVar4.getClass();
                                        } else {
                                            if (str.equals("BlueScale")) {
                                                d dVar5 = fVar.f31519b;
                                                i13 = 0;
                                                Float.parseFloat(((b) arrayListK2.get(0)).f31493a);
                                                dVar5.getClass();
                                            } else {
                                                i13 = 0;
                                                if (str.equals("BlueShift")) {
                                                    d dVar6 = fVar.f31519b;
                                                    ((b) arrayListK2.get(0)).a();
                                                    dVar6.getClass();
                                                } else if (str.equals("BlueFuzz")) {
                                                    d dVar7 = fVar.f31519b;
                                                    ((b) arrayListK2.get(0)).a();
                                                    dVar7.getClass();
                                                } else if (str.equals("StdHW")) {
                                                    d dVar8 = fVar.f31519b;
                                                    f.a(arrayListK2);
                                                    dVar8.getClass();
                                                } else if (str.equals("StdVW")) {
                                                    d dVar9 = fVar.f31519b;
                                                    f.a(arrayListK2);
                                                    dVar9.getClass();
                                                } else if (str.equals("StemSnapH")) {
                                                    d dVar10 = fVar.f31519b;
                                                    f.a(arrayListK2);
                                                    dVar10.getClass();
                                                } else if (str.equals("StemSnapV")) {
                                                    d dVar11 = fVar.f31519b;
                                                    f.a(arrayListK2);
                                                    dVar11.getClass();
                                                } else if (str.equals("ForceBold")) {
                                                    d dVar12 = fVar.f31519b;
                                                    i13 = 0;
                                                    ((b) arrayListK2.get(0)).f31493a.equals("true");
                                                    dVar12.getClass();
                                                } else {
                                                    i13 = 0;
                                                    if (str.equals("LanguageGroup")) {
                                                        d dVar13 = fVar.f31519b;
                                                        ((b) arrayListK2.get(0)).a();
                                                        dVar13.getClass();
                                                    }
                                                }
                                            }
                                            i10 = i13;
                                            i22 = i12 + 1;
                                            iA2 = i11;
                                        }
                                    }
                                    i13 = 0;
                                    i10 = i13;
                                    i22 = i12 + 1;
                                    iA2 = i11;
                                }
                            }
                        }
                        i12 = i22;
                        i13 = 0;
                        i10 = i13;
                        i22 = i12 + 1;
                        iA2 = i11;
                    }
                } else {
                    for (int i26 = 0; i26 < 4; i26++) {
                        byte b10 = bArrCopyOfRange2[i26];
                        if (b10 != 10 && b10 != 13 && b10 != 32 && b10 != 9 && Character.digit((char) b10, 16) == -1) {
                            bArrB = f.b(bArrCopyOfRange2, 55665, 4);
                            break;
                        }
                    }
                    int i27 = 0;
                    for (byte b11 : bArrCopyOfRange2) {
                        if (Character.digit((char) b11, 16) != -1) {
                            i27++;
                        }
                    }
                    byte[] bArr3 = new byte[i27 / 2];
                    int i28 = -1;
                    int i29 = 0;
                    for (byte b12 : bArrCopyOfRange2) {
                        int iDigit = Character.digit((char) b12, 16);
                        if (iDigit != -1) {
                            if (i28 == -1) {
                                i28 = iDigit;
                            } else {
                                bArr3[i29] = (byte) ((i28 * 16) + iDigit);
                                i28 = -1;
                                i29++;
                            }
                        }
                    }
                    bArrB = f.b(bArr3, 55665, 4);
                    e eVar4 = new e(bArrB);
                    fVar.f31518a = eVar4;
                    bVar = eVar4.f31516b;
                    while (bVar != null) {
                        fVar.f31518a.b();
                        bVar = fVar.f31518a.f31516b;
                    }
                    if (bVar != null) {
                    }
                }
            }
            return fVar.f31519b;
        } catch (NumberFormatException e10) {
            throw new IOException(e10);
        }
    }

    @Override // we.c
    public final r a(String str) throws IOException {
        ConcurrentHashMap concurrentHashMap = this.f31514f;
        r rVar = (r) concurrentHashMap.get(str);
        if (rVar != null) {
            return rVar;
        }
        LinkedHashMap linkedHashMap = this.f31513e;
        byte[] bArr = (byte[]) linkedHashMap.get(str);
        if (bArr == null) {
            bArr = (byte[]) linkedHashMap.get(".notdef");
        }
        s sVar = new s(this.f31509a, str);
        ArrayList arrayList = new ArrayList();
        sVar.a(bArr, this.f31512d, arrayList);
        r rVar2 = new r(this, this.f31509a, str);
        rVar2.f23521i = arrayList;
        concurrentHashMap.put(str, rVar2);
        return rVar2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        y0.a(d.class, sb, "[fontName=");
        sb.append(this.f31509a);
        sb.append(", fullName=");
        sb.append(this.f31511c);
        sb.append(", encoding=");
        sb.append(this.f31510b);
        sb.append(", charStringsDict=");
        sb.append(this.f31513e);
        sb.append("]");
        return sb.toString();
    }
}
