package we;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import we.b;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public e f31518a;

    /* renamed from: b, reason: collision with root package name */
    public d f31519b;

    public static ArrayList a(ArrayList arrayList) throws IOException {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size() - 1;
        for (int i10 = 1; i10 < size; i10++) {
            b bVar = (b) arrayList.get(i10);
            b.a aVar = bVar.f31495c;
            if (aVar == b.a.f31499d) {
                arrayList2.add(Float.valueOf(Float.parseFloat(bVar.f31493a)));
            } else {
                if (aVar != b.a.f31500e) {
                    throw new IOException("Expected INTEGER or REAL but got " + bVar + " at array position " + i10);
                }
                arrayList2.add(Integer.valueOf(bVar.a()));
            }
        }
        return arrayList2;
    }

    public static byte[] b(byte[] bArr, int i10, int i11) {
        if (i11 == -1) {
            return bArr;
        }
        if (bArr.length == 0 || i11 > bArr.length) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[bArr.length - i11];
        for (int i12 = 0; i12 < bArr.length; i12++) {
            int i13 = bArr[i12] & 255;
            int i14 = (i10 >> 8) ^ i13;
            if (i12 >= i11) {
                bArr2[i12 - i11] = (byte) i14;
            }
            i10 = 65535 & (((i13 + i10) * 52845) + 22719);
        }
        return bArr2;
    }

    public final void c(byte[] bArr) throws IOException, NumberFormatException {
        b bVar;
        if (bArr.length == 0) {
            throw new IOException("ASCII segment of type 1 font is empty");
        }
        if (bArr.length < 2 || !(bArr[0] == 37 || bArr[1] == 33)) {
            throw new IOException("Invalid start of ASCII segment of type 1 font");
        }
        e eVar = new e(bArr);
        this.f31518a = eVar;
        boolean zEquals = "FontDirectory".equals(eVar.f31516b.f31493a);
        b.a aVar = b.a.f31498c;
        b.a aVar2 = b.a.f31497b;
        if (zEquals) {
            e("FontDirectory", aVar2);
            d(aVar);
            e("known", aVar2);
            b.a aVar3 = b.a.f31503h;
            d(aVar3);
            h();
            d(aVar3);
            h();
            e("ifelse", aVar2);
        }
        b.a aVar4 = b.a.f31500e;
        int iA = d(aVar4).a();
        e("dict", aVar2);
        g("dup");
        e("begin", aVar2);
        for (int i10 = 0; i10 < iA && (bVar = this.f31518a.f31516b) != null; i10++) {
            String str = bVar.f31493a;
            if (bVar.f31495c == aVar2 && (str.equals("currentdict") || str.equals("end"))) {
                break;
            }
            String str2 = d(aVar).f31493a;
            if (str2.equals("FontInfo") || str2.equals("Fontinfo")) {
                for (Map.Entry entry : j().entrySet()) {
                    String str3 = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    if (str3.equals("version")) {
                        d dVar = this.f31519b;
                        ((b) list.get(0)).getClass();
                        dVar.getClass();
                    } else if (str3.equals("Notice")) {
                        d dVar2 = this.f31519b;
                        ((b) list.get(0)).getClass();
                        dVar2.getClass();
                    } else if (str3.equals("FullName")) {
                        this.f31519b.f31511c = ((b) list.get(0)).f31493a;
                    } else if (str3.equals("FamilyName")) {
                        d dVar3 = this.f31519b;
                        String str4 = ((b) list.get(0)).f31493a;
                        dVar3.getClass();
                    } else if (str3.equals("Weight")) {
                        d dVar4 = this.f31519b;
                        String str5 = ((b) list.get(0)).f31493a;
                        dVar4.getClass();
                    } else if (str3.equals("ItalicAngle")) {
                        d dVar5 = this.f31519b;
                        Float.parseFloat(((b) list.get(0)).f31493a);
                        dVar5.getClass();
                    } else if (str3.equals("isFixedPitch")) {
                        d dVar6 = this.f31519b;
                        ((b) list.get(0)).f31493a.equals("true");
                        dVar6.getClass();
                    } else if (str3.equals("UnderlinePosition")) {
                        d dVar7 = this.f31519b;
                        Float.parseFloat(((b) list.get(0)).f31493a);
                        dVar7.getClass();
                    } else if (str3.equals("UnderlineThickness")) {
                        d dVar8 = this.f31519b;
                        Float.parseFloat(((b) list.get(0)).f31493a);
                        dVar8.getClass();
                    }
                }
            } else if (str2.equals("Metrics")) {
                j();
            } else if (!str2.equals("Encoding")) {
                ArrayList arrayListK = k();
                f();
                if (str2.equals("FontName")) {
                    this.f31519b.f31509a = ((b) arrayListK.get(0)).f31493a;
                } else if (str2.equals("PaintType")) {
                    d dVar9 = this.f31519b;
                    ((b) arrayListK.get(0)).a();
                    dVar9.getClass();
                } else if (str2.equals("FontType")) {
                    d dVar10 = this.f31519b;
                    ((b) arrayListK.get(0)).a();
                    dVar10.getClass();
                } else if (str2.equals("FontMatrix")) {
                    d dVar11 = this.f31519b;
                    a(arrayListK);
                    dVar11.getClass();
                } else if (str2.equals("FontBBox")) {
                    d dVar12 = this.f31519b;
                    a(arrayListK);
                    dVar12.getClass();
                } else if (str2.equals("UniqueID")) {
                    d dVar13 = this.f31519b;
                    ((b) arrayListK.get(0)).a();
                    dVar13.getClass();
                } else if (str2.equals("StrokeWidth")) {
                    d dVar14 = this.f31519b;
                    Float.parseFloat(((b) arrayListK.get(0)).f31493a);
                    dVar14.getClass();
                } else if (str2.equals("FID")) {
                    d dVar15 = this.f31519b;
                    ((b) arrayListK.get(0)).getClass();
                    dVar15.getClass();
                }
            } else if (this.f31518a.c(aVar2)) {
                String str6 = this.f31518a.b().f31493a;
                if (!str6.equals("StandardEncoding")) {
                    throw new IOException("Unknown encoding: ".concat(str6));
                }
                this.f31519b.f31510b = te.b.f28760d;
                g("readonly");
                e("def", aVar2);
            } else {
                d(aVar4).a();
                g("array");
                while (true) {
                    if (this.f31518a.c(aVar2) && (this.f31518a.f31516b.f31493a.equals("dup") || this.f31518a.f31516b.f31493a.equals("readonly") || this.f31518a.f31516b.f31493a.equals("def"))) {
                        break;
                    } else {
                        this.f31518a.b();
                    }
                }
                HashMap map = new HashMap();
                while (this.f31518a.c(aVar2) && this.f31518a.f31516b.f31493a.equals("dup")) {
                    e("dup", aVar2);
                    int iA2 = d(aVar4).a();
                    String str7 = d(aVar).f31493a;
                    e("put", aVar2);
                    map.put(Integer.valueOf(iA2), str7);
                }
                d dVar16 = this.f31519b;
                te.a aVar5 = new te.a(2);
                for (Map.Entry entry2 : map.entrySet()) {
                    aVar5.a(((Integer) entry2.getKey()).intValue(), (String) entry2.getValue());
                }
                dVar16.f31510b = aVar5;
                g("readonly");
                e("def", aVar2);
            }
        }
        g("currentdict");
        e("end", aVar2);
        e("currentfile", aVar2);
        e("eexec", aVar2);
    }

    public final b d(b.a aVar) throws IOException {
        b bVarB = this.f31518a.b();
        if (bVarB != null && bVarB.f31495c == aVar) {
            return bVarB;
        }
        throw new IOException("Found " + bVarB + " but expected " + aVar);
    }

    public final void e(String str, b.a aVar) throws IOException {
        b bVarD = d(aVar);
        String str2 = bVarD.f31493a;
        if (str2 == null || !str2.equals(str)) {
            throw new IOException("Found " + bVarD + " but expected " + str);
        }
    }

    public final void f() throws IOException {
        g("readonly");
        g("noaccess");
        b.a aVar = b.a.f31497b;
        b bVarD = d(aVar);
        String str = bVarD.f31493a;
        if (str.equals("ND") || str.equals("|-")) {
            return;
        }
        if (str.equals("noaccess")) {
            bVarD = d(aVar);
        }
        if (bVarD.f31493a.equals("def")) {
            return;
        }
        throw new IOException("Found " + bVarD + " but expected ND");
    }

    public final b g(String str) throws IOException {
        if (this.f31518a.c(b.a.f31497b) && this.f31518a.f31516b.f31493a.equals(str)) {
            return this.f31518a.b();
        }
        return null;
    }

    public final void h() throws IOException {
        int i10 = 1;
        while (true) {
            e eVar = this.f31518a;
            if (eVar.f31516b == null) {
                throw new IOException("Malformed procedure: missing token");
            }
            if (eVar.c(b.a.f31503h)) {
                i10++;
            }
            if (this.f31518a.b().f31495c == b.a.f31504j && i10 - 1 == 0) {
                g("executeonly");
                return;
            }
        }
    }

    public final void i() throws IOException {
        g("readonly");
        b.a aVar = b.a.f31497b;
        b bVarD = d(aVar);
        String str = bVarD.f31493a;
        if (str.equals("NP") || str.equals("|")) {
            return;
        }
        if (str.equals("noaccess")) {
            bVarD = d(aVar);
        }
        if (bVarD.f31493a.equals("put")) {
            return;
        }
        throw new IOException("Found " + bVarD + " but expected NP");
    }

    public final HashMap j() throws IOException {
        HashMap map = new HashMap();
        int iA = d(b.a.f31500e).a();
        b.a aVar = b.a.f31497b;
        e("dict", aVar);
        g("dup");
        e("begin", aVar);
        for (int i10 = 0; i10 < iA; i10++) {
            e eVar = this.f31518a;
            if (eVar.f31516b == null) {
                break;
            }
            if (eVar.c(aVar) && !this.f31518a.f31516b.f31493a.equals("end")) {
                d(aVar);
            }
            e eVar2 = this.f31518a;
            if (eVar2.f31516b == null || (eVar2.c(aVar) && this.f31518a.f31516b.f31493a.equals("end"))) {
                break;
            }
            String str = d(b.a.f31498c).f31493a;
            ArrayList arrayListK = k();
            f();
            map.put(str, arrayListK);
        }
        e("end", aVar);
        g("readonly");
        e("def", aVar);
        return map;
    }

    public final ArrayList k() throws IOException {
        ArrayList arrayList = new ArrayList();
        b bVarB = this.f31518a.b();
        if (this.f31518a.f31516b != null) {
            arrayList.add(bVarB);
            b.a aVar = bVarB.f31495c;
            b.a aVar2 = b.a.f31504j;
            b.a aVar3 = b.a.f31501f;
            b.a aVar4 = b.a.f31503h;
            int i10 = 1;
            if (aVar == aVar3) {
                while (true) {
                    e eVar = this.f31518a;
                    if (eVar.f31516b == null) {
                        break;
                    }
                    if (eVar.c(aVar3)) {
                        i10++;
                    }
                    b bVarB2 = this.f31518a.b();
                    arrayList.add(bVarB2);
                    if (bVarB2.f31495c == b.a.f31502g && i10 - 1 == 0) {
                        break;
                    }
                }
            } else if (aVar == aVar4) {
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    e eVar2 = this.f31518a;
                    if (eVar2.f31516b == null) {
                        throw new IOException("Malformed procedure: missing token");
                    }
                    if (eVar2.c(aVar4)) {
                        i10++;
                    }
                    b bVarB3 = this.f31518a.b();
                    arrayList2.add(bVarB3);
                    if (bVarB3.f31495c == aVar2 && i10 - 1 == 0) {
                        b bVarG = g("executeonly");
                        if (bVarG != null) {
                            arrayList2.add(bVarG);
                        }
                        arrayList.addAll(arrayList2);
                    }
                }
            } else if (aVar == b.a.f31505k) {
                d(b.a.f31506l);
                return arrayList;
            }
            b bVar = this.f31518a.f31516b;
            if (bVar == null) {
                throw new IOException("Missing start token for the system dictionary");
            }
            if ("systemdict".equals(bVar.f31493a)) {
                b.a aVar5 = b.a.f31497b;
                e("systemdict", aVar5);
                e("internaldict", b.a.f31498c);
                e("known", aVar5);
                d(aVar4);
                h();
                d(aVar4);
                h();
                e("ifelse", aVar5);
                d(aVar4);
                e("pop", aVar5);
                arrayList.clear();
                arrayList.addAll(k());
                d(aVar2);
                e("if", aVar5);
            }
        }
        return arrayList;
    }
}
