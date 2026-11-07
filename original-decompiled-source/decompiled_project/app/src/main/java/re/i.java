package re;

import java.util.Arrays;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f23467c = new LinkedHashMap(52);

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f23468d = new LinkedHashMap(52);

    /* renamed from: a, reason: collision with root package name */
    public a f23469a;

    /* renamed from: b, reason: collision with root package name */
    public String f23470b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f23471a;

        public a(int i10) {
            this(new int[]{i10});
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return Arrays.equals(this.f23471a, ((a) obj).f23471a);
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f23471a);
        }

        public final String toString() {
            return Arrays.toString(this.f23471a);
        }

        public a(int i10, int i11) {
            this(new int[]{i10, i11});
        }

        public a(int[] iArr) {
            this.f23471a = iArr;
        }
    }

    static {
        a(new a(0), "version");
        a(new a(1), "Notice");
        a(new a(12, 0), "Copyright");
        a(new a(2), "FullName");
        a(new a(3), "FamilyName");
        a(new a(4), "Weight");
        a(new a(12, 1), "isFixedPitch");
        a(new a(12, 2), "ItalicAngle");
        a(new a(12, 3), "UnderlinePosition");
        a(new a(12, 4), "UnderlineThickness");
        a(new a(12, 5), "PaintType");
        a(new a(12, 6), "CharstringType");
        a(new a(12, 7), "FontMatrix");
        a(new a(13), "UniqueID");
        a(new a(5), "FontBBox");
        a(new a(12, 8), "StrokeWidth");
        a(new a(14), "XUID");
        a(new a(15), "charset");
        a(new a(16), "Encoding");
        a(new a(17), "CharStrings");
        a(new a(18), com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f7020l);
        a(new a(12, 20), "SyntheticBase");
        a(new a(12, 21), "PostScript");
        a(new a(12, 22), "BaseFontName");
        a(new a(12, 23), "BaseFontBlend");
        a(new a(12, 30), "ROS");
        a(new a(12, 31), "CIDFontVersion");
        a(new a(12, 32), "CIDFontRevision");
        a(new a(12, 33), "CIDFontType");
        a(new a(12, 34), "CIDCount");
        a(new a(12, 35), "UIDBase");
        a(new a(12, 36), "FDArray");
        a(new a(12, 37), "FDSelect");
        a(new a(12, 38), "FontName");
        a(new a(6), "BlueValues");
        a(new a(7), "OtherBlues");
        a(new a(8), "FamilyBlues");
        a(new a(9), "FamilyOtherBlues");
        a(new a(12, 9), "BlueScale");
        a(new a(12, 10), "BlueShift");
        a(new a(12, 11), "BlueFuzz");
        a(new a(10), "StdHW");
        a(new a(11), "StdVW");
        a(new a(12, 12), "StemSnapH");
        a(new a(12, 13), "StemSnapV");
        a(new a(12, 14), "ForceBold");
        a(new a(12, 15), "LanguageGroup");
        a(new a(12, 16), "ExpansionFactor");
        a(new a(12, 17), "initialRandomSeed");
        a(new a(19), "Subrs");
        a(new a(20), "defaultWidthX");
        a(new a(21), "nominalWidthX");
    }

    public static void a(a aVar, String str) {
        i iVar = new i();
        iVar.f23469a = aVar;
        iVar.f23470b = str;
        f23467c.put(aVar, iVar);
        f23468d.put(str, iVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f23469a.equals(((i) obj).f23469a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f23469a.f23471a);
    }

    public final String toString() {
        return this.f23470b;
    }
}
