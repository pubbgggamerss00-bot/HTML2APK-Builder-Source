package ve;

import android.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class o extends n0 {

    /* renamed from: f, reason: collision with root package name */
    public LinkedHashMap<String, n> f30857f;

    /* renamed from: g, reason: collision with root package name */
    public d[] f30858g;

    /* renamed from: h, reason: collision with root package name */
    public i[] f30859h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f30860i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f30861j;

    /* renamed from: k, reason: collision with root package name */
    public String f30862k;

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public int f30863a;

        public abstract int a(int i10);
    }

    public static class b extends a {

        /* renamed from: b, reason: collision with root package name */
        public int[] f30864b;

        @Override // ve.o.a
        public final int a(int i10) {
            return Arrays.binarySearch(this.f30864b, i10);
        }

        public final String toString() {
            return String.format("CoverageTableFormat1[coverageFormat=%d,glyphArray=%s]", Integer.valueOf(this.f30863a), Arrays.toString(this.f30864b));
        }
    }

    public static class c extends a {

        /* renamed from: b, reason: collision with root package name */
        public l[] f30865b;

        @Override // ve.o.a
        public final int a(int i10) {
            for (l lVar : this.f30865b) {
                int i11 = lVar.f30881a;
                if (i11 <= i10 && i10 <= lVar.f30882b) {
                    return (lVar.f30883c + i10) - i11;
                }
            }
            return -1;
        }

        public final String toString() {
            return String.format("CoverageTableFormat2[coverageFormat=%d]", Integer.valueOf(this.f30863a));
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public String f30866a;

        /* renamed from: b, reason: collision with root package name */
        public e f30867b;

        public final String toString() {
            return i8.n.d("FeatureRecord[featureTag=", this.f30866a, "]");
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public int[] f30868a;

        public final String toString() {
            return String.format("FeatureTable[lookupListIndiciesCount=%d]", Integer.valueOf(this.f30868a.length));
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public String f30869a;

        /* renamed from: b, reason: collision with root package name */
        public g f30870b;

        public final String toString() {
            return i8.n.d("LangSysRecord[langSysTag=", this.f30869a, "]");
        }
    }

    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public int f30871a;

        /* renamed from: b, reason: collision with root package name */
        public int[] f30872b;

        public final String toString() {
            return String.format("LangSysTable[requiredFeatureIndex=%d]", Integer.valueOf(this.f30871a));
        }
    }

    public static abstract class h {

        /* renamed from: a, reason: collision with root package name */
        public int f30873a;

        /* renamed from: b, reason: collision with root package name */
        public a f30874b;

        public abstract int a(int i10, int i11);
    }

    public static class i {

        /* renamed from: a, reason: collision with root package name */
        public int f30875a;

        /* renamed from: b, reason: collision with root package name */
        public int f30876b;

        /* renamed from: c, reason: collision with root package name */
        public int f30877c;

        /* renamed from: d, reason: collision with root package name */
        public h[] f30878d;

        public final String toString() {
            return String.format("LookupTable[lookupType=%d,lookupFlag=%d,markFilteringSet=%d]", Integer.valueOf(this.f30875a), Integer.valueOf(this.f30876b), Integer.valueOf(this.f30877c));
        }
    }

    public static class j extends h {

        /* renamed from: c, reason: collision with root package name */
        public short f30879c;

        @Override // ve.o.h
        public final int a(int i10, int i11) {
            return i11 < 0 ? i10 : i10 + this.f30879c;
        }

        public final String toString() {
            return String.format("LookupTypeSingleSubstFormat1[substFormat=%d,deltaGlyphID=%d]", Integer.valueOf(this.f30873a), Short.valueOf(this.f30879c));
        }
    }

    public static class k extends h {

        /* renamed from: c, reason: collision with root package name */
        public int[] f30880c;

        @Override // ve.o.h
        public final int a(int i10, int i11) {
            return i11 < 0 ? i10 : this.f30880c[i11];
        }

        public final String toString() {
            return String.format("LookupTypeSingleSubstFormat2[substFormat=%d,substituteGlyphIDs=%s]", Integer.valueOf(this.f30873a), Arrays.toString(this.f30880c));
        }
    }

    public static class l {

        /* renamed from: a, reason: collision with root package name */
        public int f30881a;

        /* renamed from: b, reason: collision with root package name */
        public int f30882b;

        /* renamed from: c, reason: collision with root package name */
        public int f30883c;

        public final String toString() {
            return String.format("RangeRecord[startGlyphID=%d,endGlyphID=%d,startCoverageIndex=%d]", Integer.valueOf(this.f30881a), Integer.valueOf(this.f30882b), Integer.valueOf(this.f30883c));
        }
    }

    public static class m {

        /* renamed from: a, reason: collision with root package name */
        public String f30884a;

        /* renamed from: b, reason: collision with root package name */
        public n f30885b;

        public final String toString() {
            return i8.n.d("ScriptRecord[scriptTag=", this.f30884a, "]");
        }
    }

    public static class n {

        /* renamed from: a, reason: collision with root package name */
        public g f30886a;

        /* renamed from: b, reason: collision with root package name */
        public LinkedHashMap<String, g> f30887b;

        public final String toString() {
            return String.format("ScriptTable[hasDefault=%s,langSysRecordsCount=%d]", Boolean.valueOf(this.f30886a != null), Integer.valueOf(this.f30887b.size()));
        }
    }

    public o(p0 p0Var) {
        super(p0Var);
        this.f30860i = new HashMap();
        this.f30861j = new HashMap();
    }

    public static a b(k0 k0Var, long j10) throws IOException {
        k0Var.seek(j10);
        int iI0 = k0Var.i0();
        int i10 = 0;
        if (iI0 == 1) {
            b bVar = new b();
            bVar.f30863a = iI0;
            int iI02 = k0Var.i0();
            bVar.f30864b = new int[iI02];
            while (i10 < iI02) {
                bVar.f30864b[i10] = k0Var.i0();
                i10++;
            }
            return bVar;
        }
        if (iI0 != 2) {
            throw new IOException(j2.y.a(iI0, "Unknown coverage format: "));
        }
        c cVar = new c();
        cVar.f30863a = iI0;
        int iI03 = k0Var.i0();
        cVar.f30865b = new l[iI03];
        while (i10 < iI03) {
            l[] lVarArr = cVar.f30865b;
            l lVar = new l();
            lVar.f30881a = k0Var.i0();
            lVar.f30882b = k0Var.i0();
            lVar.f30883c = k0Var.i0();
            lVarArr[i10] = lVar;
            i10++;
        }
        return cVar;
    }

    public static g c(k0 k0Var, long j10) throws IOException {
        k0Var.seek(j10);
        g gVar = new g();
        k0Var.i0();
        gVar.f30871a = k0Var.i0();
        int iI0 = k0Var.i0();
        gVar.f30872b = new int[iI0];
        for (int i10 = 0; i10 < iI0; i10++) {
            gVar.f30872b[i10] = k0Var.i0();
        }
        return gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [ve.o$h[]] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, ve.o$h, ve.o$j] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, ve.o$h, ve.o$k] */
    @Override // ve.n0
    public final void a(p0 p0Var, k0 k0Var) throws IOException {
        int i10;
        int i11;
        int[] iArr;
        ?? jVar;
        long jH = k0Var.h();
        k0Var.i0();
        int iI0 = k0Var.i0();
        int iI02 = k0Var.i0();
        int iI03 = k0Var.i0();
        int iI04 = k0Var.i0();
        if (iI0 == 1) {
            k0Var.g0();
        }
        long j10 = iI02 + jH;
        k0Var.seek(j10);
        int iI05 = k0Var.i0();
        m[] mVarArr = new m[iI05];
        int[] iArr2 = new int[iI05];
        for (int i12 = 0; i12 < iI05; i12++) {
            m mVar = new m();
            mVar.f30884a = k0Var.d0(4, xe.a.f33561a);
            iArr2[i12] = k0Var.i0();
            mVarArr[i12] = mVar;
        }
        int i13 = 0;
        while (i13 < iI05) {
            m mVar2 = mVarArr[i13];
            long j11 = iArr2[i13] + j10;
            k0Var.seek(j11);
            n nVar = new n();
            long j12 = jH;
            int iI06 = k0Var.i0();
            int iI07 = k0Var.i0();
            long j13 = j10;
            f[] fVarArr = new f[iI07];
            int[] iArr3 = new int[iI07];
            String str = "";
            int i14 = 0;
            while (i14 < iI07) {
                int i15 = i14;
                f fVar = new f();
                m[] mVarArr2 = mVarArr;
                int[] iArr4 = iArr2;
                String strD0 = k0Var.d0(4, xe.a.f33561a);
                fVar.f30869a = strD0;
                if (i15 > 0 && strD0.compareTo(str) <= 0) {
                    throw new IOException("LangSysRecords not alphabetically sorted by LangSys tag: " + fVar.f30869a + " <= " + str);
                }
                iArr3[i15] = k0Var.i0();
                fVarArr[i15] = fVar;
                str = fVar.f30869a;
                i14 = i15 + 1;
                mVarArr = mVarArr2;
                iArr2 = iArr4;
            }
            m[] mVarArr3 = mVarArr;
            int[] iArr5 = iArr2;
            if (iI06 != 0) {
                nVar.f30886a = c(k0Var, iI06 + j11);
            }
            for (int i16 = 0; i16 < iI07; i16++) {
                fVarArr[i16].f30870b = c(k0Var, iArr3[i16] + j11);
            }
            nVar.f30887b = new LinkedHashMap<>(iI07);
            for (int i17 = 0; i17 < iI07; i17++) {
                f fVar2 = fVarArr[i17];
                nVar.f30887b.put(fVar2.f30869a, fVar2.f30870b);
            }
            mVar2.f30885b = nVar;
            i13++;
            jH = j12;
            j10 = j13;
            mVarArr = mVarArr3;
            iArr2 = iArr5;
        }
        long j14 = jH;
        m[] mVarArr4 = mVarArr;
        LinkedHashMap<String, n> linkedHashMap = new LinkedHashMap<>(iI05);
        for (int i18 = 0; i18 < iI05; i18++) {
            m mVar3 = mVarArr4[i18];
            linkedHashMap.put(mVar3.f30884a, mVar3.f30885b);
        }
        this.f30857f = linkedHashMap;
        long j15 = j14 + iI03;
        k0Var.seek(j15);
        int iI08 = k0Var.i0();
        d[] dVarArr = new d[iI08];
        int[] iArr6 = new int[iI08];
        String str2 = "";
        for (int i19 = 0; i19 < iI08; i19++) {
            d dVar = new d();
            String strD02 = k0Var.d0(4, xe.a.f33561a);
            dVar.f30866a = strD02;
            if (i19 > 0 && strD02.compareTo(str2) < 0) {
                if (!dVar.f30866a.matches("\\w{4}") || !str2.matches("\\w{4}")) {
                    Log.w("PdfBox-Android", "FeatureRecord array not alphabetically sorted by FeatureTag: " + dVar.f30866a + " < " + str2);
                    i10 = 0;
                    dVarArr = new d[0];
                    break;
                }
                Log.d("PdfBox-Android", "FeatureRecord array not alphabetically sorted by FeatureTag: " + dVar.f30866a + " < " + str2);
            }
            iArr6[i19] = k0Var.i0();
            dVarArr[i19] = dVar;
            str2 = dVar.f30866a;
        }
        i10 = 0;
        for (int i20 = 0; i20 < iI08; i20++) {
            d dVar2 = dVarArr[i20];
            k0Var.seek(iArr6[i20] + j15);
            e eVar = new e();
            k0Var.i0();
            int iI09 = k0Var.i0();
            eVar.f30868a = new int[iI09];
            for (int i21 = 0; i21 < iI09; i21++) {
                eVar.f30868a[i21] = k0Var.i0();
            }
            dVar2.f30867b = eVar;
        }
        this.f30858g = dVarArr;
        long j16 = j14 + iI04;
        k0Var.seek(j16);
        int iI010 = k0Var.i0();
        int[] iArr7 = new int[iI010];
        for (int i22 = i10; i22 < iI010; i22++) {
            iArr7[i22] = k0Var.i0();
        }
        i[] iVarArr = new i[iI010];
        int i23 = i10;
        while (i23 < iI010) {
            long j17 = iArr7[i23] + j16;
            k0Var.seek(j17);
            i iVar = new i();
            iVar.f30875a = k0Var.i0();
            iVar.f30876b = k0Var.i0();
            int iI011 = k0Var.i0();
            int[] iArr8 = new int[iI011];
            for (int i24 = i10; i24 < iI011; i24++) {
                iArr8[i24] = k0Var.i0();
            }
            if ((iVar.f30876b & 16) != 0) {
                iVar.f30877c = k0Var.i0();
            }
            iVar.f30878d = new h[iI011];
            if (iVar.f30875a != 1) {
                Log.d("PdfBox-Android", "Type " + iVar.f30875a + " GSUB lookup table is not supported and will be ignored");
            } else {
                int i25 = 0;
                while (i25 < iI011) {
                    ?? r11 = iVar.f30878d;
                    long j18 = j16;
                    long j19 = iArr8[i25] + j17;
                    k0Var.seek(j19);
                    int iI012 = k0Var.i0();
                    if (iI012 == 1) {
                        i11 = iI010;
                        iArr = iArr7;
                        jVar = new j();
                        jVar.f30873a = iI012;
                        int iI013 = k0Var.i0();
                        jVar.f30879c = k0Var.Z();
                        jVar.f30874b = b(k0Var, j19 + iI013);
                    } else {
                        if (iI012 != 2) {
                            throw new IOException(j2.y.a(iI012, "Unknown substFormat: "));
                        }
                        jVar = new k();
                        jVar.f30873a = iI012;
                        int iI014 = k0Var.i0();
                        i11 = iI010;
                        int iI015 = k0Var.i0();
                        iArr = iArr7;
                        jVar.f30880c = new int[iI015];
                        int i26 = 0;
                        while (i26 < iI015) {
                            jVar.f30880c[i26] = k0Var.i0();
                            i26++;
                            iI015 = iI015;
                        }
                        jVar.f30874b = b(k0Var, j19 + iI014);
                    }
                    r11[i25] = jVar;
                    i25++;
                    j16 = j18;
                    iI010 = i11;
                    iArr7 = iArr;
                }
            }
            long j20 = j16;
            int i27 = iI010;
            int[] iArr9 = iArr7;
            iVarArr[i23] = iVar;
            i23++;
            j16 = j20;
            iI010 = i27;
            iArr7 = iArr9;
            i10 = 0;
        }
        this.f30859h = iVarArr;
    }
}
