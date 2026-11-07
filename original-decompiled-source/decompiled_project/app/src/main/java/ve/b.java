package ve;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.eac.CertificateBody;
import p5.d1;
import re.j;

/* loaded from: classes2.dex */
public final class b extends n0 {

    /* renamed from: f, reason: collision with root package name */
    public re.g f30776f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final p0 f30777a;

        public a(p0 p0Var) {
            this.f30777a = p0Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v47, types: [p5.d1, re.j$e] */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49, types: [p5.d1, re.j$h] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, re.g] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r1v106, types: [java.lang.Object, re.j$k] */
    @Override // ve.n0
    public final void a(p0 p0Var, k0 k0Var) throws IOException {
        byte[][] bArr;
        re.a mVar;
        String str;
        byte[][] bArr2;
        ArrayList arrayList;
        String str2;
        Double d10;
        Double d11;
        d1 dVar;
        j.g gVar;
        int i10;
        int i11;
        int i12;
        ?? eVar;
        String str3;
        byte[][] bArr3;
        String str4;
        String[] strArr;
        byte[] bArrZ = k0Var.z((int) this.f30854c);
        re.j jVar = new re.j();
        jVar.f23472a = null;
        new a(this.f30856e);
        re.b bVar = new re.b(bArrZ);
        int i13 = 4;
        String str5 = new String(bVar.d(4), xe.a.f33561a);
        int i14 = 0;
        if ("OTTO".equals(str5)) {
            short sG = (short) bVar.g();
            bVar.g();
            bVar.g();
            bVar.g();
            for (int i15 = 0; i15 < sG; i15++) {
                String str6 = new String(bVar.d(4), xe.a.f33561a);
                bVar.g();
                bVar.g();
                long jG = (bVar.g() << 16) | bVar.g();
                long jG2 = (bVar.g() << 16) | bVar.g();
                if ("CFF ".equals(str6)) {
                    bVar = new re.b(Arrays.copyOfRange(bArrZ, (int) jG, (int) (jG + jG2)));
                }
            }
            throw new IOException("CFF tag not found in this OpenType font.");
        }
        if ("ttcf".equals(str5)) {
            throw new IOException("True Type Collection fonts are not supported.");
        }
        if ("\u0000\u0001\u0000\u0000".equals(str5)) {
            throw new IOException("OpenType fonts containing a true type font are not supported.");
        }
        bVar.f23511b = 0;
        bVar.f();
        bVar.f();
        bVar.f();
        bVar.h();
        String[] strArrH = re.j.h(bVar);
        if (strArrH == null) {
            throw new IOException("Name index missing in CFF font");
        }
        byte[][] bArrC = re.j.c(bVar);
        jVar.f23472a = re.j.h(bVar);
        byte[][] bArrC2 = re.j.c(bVar);
        ArrayList arrayList2 = new ArrayList(strArrH.length);
        int i16 = 0;
        while (i16 < strArrH.length) {
            String str7 = strArrH[i16];
            byte[] bArr4 = bArrC[i16];
            Double dValueOf = Double.valueOf(0.001d);
            Double dValueOf2 = Double.valueOf(0.0d);
            int i17 = i13;
            Integer numValueOf = Integer.valueOf(i14);
            re.b bVar2 = new re.b(bArr4);
            j.b bVar3 = new j.b();
            while (bVar2.f23511b < bVar2.f23510a.length) {
                j.b.a aVarB = re.j.b(bVar2);
                re.i iVar = aVarB.f23479b;
                if (iVar != null) {
                    strArr = strArrH;
                    bVar3.f23477a.put(iVar.f23470b, aVarB);
                } else {
                    strArr = strArrH;
                }
                strArrH = strArr;
            }
            String[] strArr2 = strArrH;
            if (bVar3.d("SyntheticBase") != null) {
                throw new IOException("Synthetic Fonts are not supported");
            }
            boolean z10 = bVar3.d("ROS") != null;
            if (z10) {
                re.a aVar = new re.a();
                j.b.a aVarD = bVar3.d("ROS");
                if (aVarD != null) {
                    bArr = bArrC;
                    if (aVarD.f23478a.size() >= 3) {
                        aVar.f23447f = jVar.g(aVarD.a(0).intValue());
                        aVar.f23448g = jVar.g(aVarD.a(1).intValue());
                        aVar.f23449h = aVarD.a(2).intValue();
                        mVar = aVar;
                    }
                }
                throw new IOException("ROS entry must have 3 elements");
            }
            bArr = bArrC;
            mVar = new re.m();
            jVar.f23473b = str7;
            mVar.f23460a = str7;
            mVar.a(jVar.a(bVar3, "version"), "version");
            mVar.a(jVar.a(bVar3, "Notice"), "Notice");
            mVar.a(jVar.a(bVar3, "Copyright"), "Copyright");
            mVar.a(jVar.a(bVar3, "FullName"), "FullName");
            mVar.a(jVar.a(bVar3, "FamilyName"), "FamilyName");
            mVar.a(jVar.a(bVar3, "Weight"), "Weight");
            mVar.a(bVar3.b("isFixedPitch"), "isFixedPitch");
            mVar.a(bVar3.e(numValueOf, "ItalicAngle"), "ItalicAngle");
            mVar.a(bVar3.e(-100, "UnderlinePosition"), "UnderlinePosition");
            mVar.a(bVar3.e(50, "UnderlineThickness"), "UnderlineThickness");
            mVar.a(bVar3.e(numValueOf, "PaintType"), "PaintType");
            mVar.a(bVar3.e(2, "CharstringType"), "CharstringType");
            Number[] numberArr = new Number[6];
            numberArr[0] = dValueOf;
            numberArr[1] = dValueOf2;
            numberArr[2] = dValueOf2;
            numberArr[3] = dValueOf;
            numberArr[i17] = dValueOf2;
            numberArr[5] = dValueOf2;
            String str8 = "FontMatrix";
            mVar.a(bVar3.a("FontMatrix", Arrays.asList(numberArr)), "FontMatrix");
            mVar.a(bVar3.e(null, "UniqueID"), "UniqueID");
            Number[] numberArr2 = new Number[i17];
            numberArr2[0] = numValueOf;
            numberArr2[1] = numValueOf;
            numberArr2[2] = numValueOf;
            numberArr2[3] = numValueOf;
            List<Number> listAsList = Arrays.asList(numberArr2);
            String str9 = "FontBBox";
            mVar.a(bVar3.a("FontBBox", listAsList), "FontBBox");
            mVar.a(bVar3.e(numValueOf, "StrokeWidth"), "StrokeWidth");
            int i18 = i16;
            mVar.a(bVar3.a("XUID", null), "XUID");
            j.b.a aVarD2 = bVar3.d("CharStrings");
            if (aVarD2 == null || !aVarD2.b()) {
                throw new IOException("CharStrings is missing or empty");
            }
            bVar.f23511b = aVarD2.a(0).intValue();
            byte[][] bArrC3 = re.j.c(bVar);
            if (bArrC3 == null) {
                throw new IOException("CharStringsIndex is missing");
            }
            j.b.a aVarD3 = bVar3.d("charset");
            if (aVarD3 == null || !aVarD3.b()) {
                str = "FontBBox";
                bArr2 = bArrC2;
                arrayList = arrayList2;
                str2 = "FontMatrix";
                d10 = dValueOf;
                d11 = dValueOf2;
                if (z10) {
                    int length = bArrC3.length;
                    dVar = new j.d(true);
                    dVar.a(0, 0);
                    for (int i19 = 1; i19 <= length; i19++) {
                        dVar.a(i19, i19);
                    }
                } else {
                    dVar = re.h.f23466h;
                }
            } else {
                d10 = dValueOf;
                int iIntValue = aVarD3.a(0).intValue();
                if (!z10 && iIntValue == 0) {
                    dVar = re.h.f23466h;
                } else if (!z10 && iIntValue == 1) {
                    dVar = re.d.f23456h;
                } else if (z10 || iIntValue != 2) {
                    bVar.f23511b = iIntValue;
                    int length2 = bArrC3.length;
                    int iF = bVar.f();
                    if (iF != 0) {
                        d11 = dValueOf2;
                        if (iF == 1) {
                            str = "FontBBox";
                            bArr2 = bArrC2;
                            arrayList = arrayList2;
                            str2 = "FontMatrix";
                            eVar = new j.h(z10);
                            eVar.f23484g = iF;
                            if (z10) {
                                eVar.a(0, 0);
                                eVar.f23485h = new ArrayList();
                            } else {
                                eVar.b(0, 0, ".notdef");
                            }
                            int i20 = 1;
                            while (i20 < length2) {
                                int iG = bVar.g();
                                int iF2 = bVar.f();
                                if (z10) {
                                    eVar.f23485h.add(new j.m(i20, iG, iF2));
                                } else {
                                    for (int i21 = 0; i21 < iF2 + 1; i21++) {
                                        int i22 = iG + i21;
                                        eVar.b(i20 + i21, i22, jVar.g(i22));
                                    }
                                }
                                i20 = i20 + iF2 + 1;
                            }
                        } else {
                            if (iF != 2) {
                                throw new IOException(j2.y.a(iF, "Incorrect charset format "));
                            }
                            j.C0260j c0260j = new j.C0260j(z10);
                            c0260j.f23488g = iF;
                            if (z10) {
                                c0260j.a(0, 0);
                                c0260j.f23489h = new ArrayList();
                            } else {
                                c0260j.b(0, 0, ".notdef");
                            }
                            int i23 = 1;
                            while (i23 < length2) {
                                int iG2 = bVar.g();
                                ArrayList arrayList3 = arrayList2;
                                int iG3 = bVar.g();
                                if (z10) {
                                    str3 = str9;
                                    bArr3 = bArrC2;
                                    str4 = str8;
                                    c0260j.f23489h.add(new j.m(i23, iG2, iG3));
                                } else {
                                    bArr3 = bArrC2;
                                    int i24 = 0;
                                    while (true) {
                                        str4 = str8;
                                        if (i24 >= iG3 + 1) {
                                            break;
                                        }
                                        int i25 = iG2 + i24;
                                        int i26 = i24;
                                        c0260j.b(i23 + i26, i25, jVar.g(i25));
                                        i24 = i26 + 1;
                                        str8 = str4;
                                        str9 = str9;
                                    }
                                    str3 = str9;
                                }
                                i23 = i23 + iG3 + 1;
                                arrayList2 = arrayList3;
                                bArrC2 = bArr3;
                                str8 = str4;
                                str9 = str3;
                            }
                            str = str9;
                            bArr2 = bArrC2;
                            arrayList = arrayList2;
                            str2 = str8;
                            dVar = c0260j;
                        }
                    } else {
                        str = "FontBBox";
                        bArr2 = bArrC2;
                        arrayList = arrayList2;
                        str2 = "FontMatrix";
                        d11 = dValueOf2;
                        eVar = new j.e(z10);
                        eVar.f23480g = iF;
                        if (z10) {
                            eVar.a(0, 0);
                        } else {
                            eVar.b(0, 0, ".notdef");
                        }
                        for (int i27 = 1; i27 < length2; i27++) {
                            int iG4 = bVar.g();
                            if (z10) {
                                eVar.a(i27, iG4);
                            } else {
                                eVar.b(i27, iG4, jVar.g(iG4));
                            }
                        }
                    }
                    dVar = eVar;
                } else {
                    dVar = re.f.f23459h;
                }
                str = "FontBBox";
                bArr2 = bArrC2;
                arrayList = arrayList2;
                str2 = "FontMatrix";
                d11 = dValueOf2;
            }
            mVar.f23462c = dVar;
            mVar.f23463d = bArrC3;
            String str10 = com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f7020l;
            if (z10) {
                re.a aVar2 = mVar;
                int length3 = bArrC3.length;
                j.b.a aVarD4 = bVar3.d("FDArray");
                if (aVarD4 == null || !aVarD4.b()) {
                    throw new IOException("FDArray is missing for a CIDKeyed Font.");
                }
                bVar.f23511b = aVarD4.a(0).intValue();
                byte[][] bArrC4 = re.j.c(bVar);
                if (bArrC4 == null) {
                    throw new IOException("Font dict index is missing for a CIDKeyed Font");
                }
                LinkedList linkedList = new LinkedList();
                LinkedList linkedList2 = new LinkedList();
                int length4 = bArrC4.length;
                int i28 = 0;
                while (i28 < length4) {
                    re.b bVar4 = new re.b(bArrC4[i28]);
                    j.b bVar5 = new j.b();
                    byte[][] bArr5 = bArrC4;
                    while (true) {
                        i10 = length4;
                        if (bVar4.f23511b >= bVar4.f23510a.length) {
                            break;
                        }
                        j.b.a aVarB2 = re.j.b(bVar4);
                        re.i iVar2 = aVarB2.f23479b;
                        if (iVar2 != null) {
                            i12 = i28;
                            bVar5.f23477a.put(iVar2.f23470b, aVarB2);
                        } else {
                            i12 = i28;
                        }
                        length4 = i10;
                        i28 = i12;
                    }
                    int i29 = i28;
                    j.b.a aVarD5 = bVar5.d(str10);
                    if (aVarD5 == null || aVarD5.f23478a.size() < 2) {
                        throw new IOException("Font DICT invalid without \"Private\" entry");
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(4);
                    linkedHashMap.put("FontName", jVar.a(bVar5, "FontName"));
                    linkedHashMap.put("FontType", bVar5.e(numValueOf, "FontType"));
                    String str11 = str;
                    String str12 = str10;
                    linkedHashMap.put(str11, bVar5.a(str11, null));
                    String str13 = str2;
                    linkedHashMap.put(str13, bVar5.a(str13, null));
                    linkedList2.add(linkedHashMap);
                    int iIntValue2 = aVarD5.a(1).intValue();
                    bVar.f23511b = iIntValue2;
                    int iIntValue3 = aVarD5.a(0).intValue();
                    j.b bVar6 = new j.b();
                    int i30 = bVar.f23511b + iIntValue3;
                    while (bVar.f23511b < i30) {
                        j.b.a aVarB3 = re.j.b(bVar);
                        int i31 = iIntValue2;
                        re.i iVar3 = aVarB3.f23479b;
                        if (iVar3 != null) {
                            i11 = i30;
                            bVar6.f23477a.put(iVar3.f23470b, aVarB3);
                        } else {
                            i11 = i30;
                        }
                        iIntValue2 = i31;
                        i30 = i11;
                    }
                    int i32 = iIntValue2;
                    LinkedHashMap linkedHashMapF = re.j.f(bVar6);
                    linkedList.add(linkedHashMapF);
                    Number numberE = bVar6.e(numValueOf, "Subrs");
                    if (numberE instanceof Integer) {
                        Integer num = (Integer) numberE;
                        if (num.intValue() > 0) {
                            bVar.f23511b = num.intValue() + i32;
                            linkedHashMapF.put("Subrs", re.j.c(bVar));
                        }
                    }
                    i28 = i29 + 1;
                    str2 = str13;
                    bArrC4 = bArr5;
                    str10 = str12;
                    length4 = i10;
                    str = str11;
                }
                String str14 = str2;
                j.b.a aVarD6 = bVar3.d("FDSelect");
                if (aVarD6 == null || !aVarD6.b()) {
                    throw new IOException("FDSelect is missing or empty");
                }
                bVar.f23511b = aVarD6.a(0).intValue();
                int iF3 = bVar.f();
                if (iF3 == 0) {
                    j.g gVar2 = new j.g();
                    gVar2.f23483a = new int[length3];
                    int i33 = 0;
                    while (true) {
                        int[] iArr = gVar2.f23483a;
                        if (i33 >= iArr.length) {
                            break;
                        }
                        iArr[i33] = bVar.f();
                        i33++;
                    }
                    gVar = gVar2;
                } else {
                    if (iF3 != 3) {
                        throw new IllegalArgumentException();
                    }
                    ?? kVar = new j.k();
                    kVar.f23490a = iF3;
                    int iG5 = bVar.g();
                    kVar.f23491b = iG5;
                    kVar.f23492c = new j.l[iG5];
                    for (int i34 = 0; i34 < kVar.f23491b; i34++) {
                        j.l lVar = new j.l();
                        lVar.f23494a = bVar.g();
                        lVar.f23495b = bVar.f();
                        kVar.f23492c[i34] = lVar;
                    }
                    kVar.f23493d = bVar.g();
                    gVar = kVar;
                }
                aVar2.f23450j = linkedList;
                aVar2.f23451k = gVar;
                List list = (linkedList2.isEmpty() || !((Map) linkedList2.get(0)).containsKey(str14)) ? null : (List) ((Map) linkedList2.get(0)).get(str14);
                List<Number> listA = bVar3.a(str14, null);
                if (listA == null) {
                    if (list != null) {
                        mVar.a(list, str14);
                    } else {
                        mVar.a(bVar3.a(str14, Arrays.asList(d10, d11, d11, d10, d11, d11)), str14);
                    }
                } else if (list != null) {
                    double dDoubleValue = listA.get(0).doubleValue();
                    double dDoubleValue2 = listA.get(1).doubleValue();
                    double dDoubleValue3 = listA.get(2).doubleValue();
                    double dDoubleValue4 = listA.get(3).doubleValue();
                    double dDoubleValue5 = listA.get(4).doubleValue();
                    double dDoubleValue6 = listA.get(5).doubleValue();
                    double dDoubleValue7 = ((Number) list.get(0)).doubleValue();
                    double dDoubleValue8 = ((Number) list.get(1)).doubleValue();
                    double dDoubleValue9 = ((Number) list.get(2)).doubleValue();
                    double dDoubleValue10 = ((Number) list.get(3)).doubleValue();
                    double dDoubleValue11 = ((Number) list.get(4)).doubleValue();
                    double dDoubleValue12 = ((Number) list.get(5)).doubleValue();
                    listA.set(0, Double.valueOf((dDoubleValue2 * dDoubleValue9) + (dDoubleValue * dDoubleValue7)));
                    listA.set(1, Double.valueOf((dDoubleValue2 * dDoubleValue4) + (dDoubleValue * dDoubleValue8)));
                    listA.set(2, Double.valueOf((dDoubleValue4 * dDoubleValue9) + (dDoubleValue3 * dDoubleValue7)));
                    listA.set(3, Double.valueOf((dDoubleValue4 * dDoubleValue10) + (dDoubleValue3 * dDoubleValue8)));
                    listA.set(4, Double.valueOf((dDoubleValue9 * dDoubleValue6) + (dDoubleValue7 * dDoubleValue5) + dDoubleValue11));
                    listA.set(5, Double.valueOf((dDoubleValue6 * dDoubleValue10) + (dDoubleValue5 * dDoubleValue8) + dDoubleValue12));
                }
            } else {
                re.m mVar2 = mVar;
                j.b.a aVarD7 = bVar3.d("Encoding");
                int iIntValue4 = (aVarD7 == null || !aVarD7.b()) ? 0 : aVarD7.a(0).intValue();
                if (iIntValue4 == 0) {
                    re.k kVar2 = re.k.f23500c;
                } else if (iIntValue4 != 1) {
                    bVar.f23511b = iIntValue4;
                    int iF4 = bVar.f();
                    int i35 = iF4 & CertificateBody.profileType;
                    if (i35 == 0) {
                        j.f fVar = new j.f(2);
                        fVar.f23481d = iF4;
                        fVar.f23482e = bVar.f();
                        fVar.a(0, ".notdef");
                        for (int i36 = 1; i36 <= fVar.f23482e; i36++) {
                            fVar.a(bVar.f(), jVar.g(dVar.e(i36)));
                        }
                        if ((iF4 & 128) != 0) {
                            jVar.i(bVar, fVar);
                        }
                    } else {
                        if (i35 != 1) {
                            throw new IOException(j2.y.a(i35, "Invalid encoding base format "));
                        }
                        j.i iVar4 = new j.i(2);
                        iVar4.f23486d = iF4;
                        iVar4.f23487e = bVar.f();
                        iVar4.a(0, ".notdef");
                        int i37 = 1;
                        for (int i38 = 0; i38 < iVar4.f23487e; i38++) {
                            int iF5 = bVar.f();
                            int iF6 = bVar.f();
                            for (int i39 = 0; i39 <= iF6; i39++) {
                                iVar4.a(iF5 + i39, jVar.g(dVar.e(i37)));
                                i37++;
                            }
                        }
                        if ((iF4 & 128) != 0) {
                            jVar.i(bVar, iVar4);
                        }
                    }
                } else {
                    re.e eVar2 = re.e.f23457c;
                }
                j.b.a aVarD8 = bVar3.d(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f7020l);
                if (aVarD8 == null || aVarD8.f23478a.size() < 2) {
                    throw new IOException("Private dictionary entry missing for font " + mVar2.f23460a);
                }
                int iIntValue5 = aVarD8.a(1).intValue();
                bVar.f23511b = iIntValue5;
                int iIntValue6 = aVarD8.a(0).intValue();
                j.b bVar7 = new j.b();
                int i40 = bVar.f23511b + iIntValue6;
                while (bVar.f23511b < i40) {
                    j.b.a aVarB4 = re.j.b(bVar);
                    re.i iVar5 = aVarB4.f23479b;
                    if (iVar5 != null) {
                        bVar7.f23477a.put(iVar5.f23470b, aVarB4);
                    }
                }
                for (Map.Entry entry : re.j.f(bVar7).entrySet()) {
                    String str15 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        mVar2.f23502f.put(str15, value);
                    }
                }
                Number numberE2 = bVar7.e(numValueOf, "Subrs");
                if (numberE2 instanceof Integer) {
                    Integer num2 = (Integer) numberE2;
                    if (num2.intValue() > 0) {
                        bVar.f23511b = num2.intValue() + iIntValue5;
                        byte[][] bArrC5 = re.j.c(bVar);
                        if (bArrC5 != null) {
                            mVar2.f23502f.put("Subrs", bArrC5);
                        }
                    }
                }
            }
            byte[][] bArr6 = bArr2;
            mVar.f23464e = bArr6;
            ArrayList arrayList4 = arrayList;
            arrayList4.add(mVar);
            i16 = i18 + 1;
            i13 = 4;
            i14 = 0;
            bArrC2 = bArr6;
            arrayList2 = arrayList4;
            strArrH = strArr2;
            bArrC = bArr;
        }
        this.f30776f = (re.g) arrayList2.get(i14);
        this.f30855d = true;
    }
}
