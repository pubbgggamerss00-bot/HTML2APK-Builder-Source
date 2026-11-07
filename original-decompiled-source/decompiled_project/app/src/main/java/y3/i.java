package y3;

import java.util.Objects;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final a f33820a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f33821a;

        /* renamed from: b, reason: collision with root package name */
        public final int f33822b;

        /* renamed from: c, reason: collision with root package name */
        public final int f33823c;

        public a(String str, int i10, int i11) {
            this.f33821a = str;
            this.f33822b = i10;
            this.f33823c = i11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f33821a, aVar.f33821a) && this.f33822b == aVar.f33822b && this.f33823c == aVar.f33823c;
        }

        public final int hashCode() {
            Integer numValueOf = Integer.valueOf(this.f33822b);
            Integer numValueOf2 = Integer.valueOf(this.f33823c);
            Float fValueOf = Float.valueOf(1.0f);
            return Objects.hash(this.f33821a, numValueOf, numValueOf2, fValueOf, 0, 0, 0, fValueOf);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DisplayShapeCompat{ spec=");
            String str = this.f33821a;
            sb.append(str != null ? Integer.valueOf(str.hashCode()) : "null");
            sb.append(" displayWidth=");
            sb.append(this.f33822b);
            sb.append(" displayHeight=");
            return x0.a.a(sb, this.f33823c, " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}");
        }
    }

    static {
        new i("", 0, 0);
    }

    public i(String str, int i10, int i11) {
        this.f33820a = new a(str, i10, i11);
    }

    public static i a(boolean z10, int i10, int i11, int i12, int i13, int i14, int i15) {
        String string;
        if (z10) {
            int i16 = i10 / 2;
            int i17 = i11 / 2;
            StringBuilder sbA = p.g0.a(i17, i16, "M0,", " A", ",");
            sbA.append(i17);
            sbA.append(" 0 1,1 ");
            sbA.append(i10);
            sbA.append(",");
            sbA.append(i17);
            sbA.append(" A");
            sbA.append(i16);
            sbA.append(",");
            sbA.append(i17);
            sbA.append(" 0 1,1 0,");
            sbA.append(i17);
            sbA.append(" Z");
            string = sbA.toString();
        } else {
            StringBuilder sb = new StringBuilder("M ");
            int iMin = Math.min(i10 / 2, i11 / 2);
            int iMin2 = Math.min(iMin, i12);
            int iMin3 = Math.min(iMin, i13);
            int iMin4 = Math.min(iMin, i14);
            int iMin5 = Math.min(iMin, i15);
            sb.append(iMin2);
            sb.append(",0 L ");
            sb.append(i10 - iMin3);
            sb.append(",0");
            if (iMin3 > 0) {
                sb.append(" A ");
                sb.append(iMin3);
                sb.append(",");
                sb.append(iMin3);
                sb.append(" 0 0,1 ");
                sb.append(i10);
                sb.append(",");
                sb.append(iMin3);
            }
            sb.append(" L ");
            sb.append(i10);
            sb.append(",");
            sb.append(i11 - iMin4);
            if (iMin4 > 0) {
                sb.append(" A ");
                sb.append(iMin4);
                sb.append(",");
                sb.append(iMin4);
                sb.append(" 0 0,1 ");
                sb.append(i10 - iMin4);
                sb.append(",");
                sb.append(i11);
            }
            sb.append(" L ");
            sb.append(iMin5);
            sb.append(",");
            sb.append(i11);
            if (iMin5 > 0) {
                sb.append(" A ");
                sb.append(iMin5);
                sb.append(",");
                sb.append(iMin5);
                sb.append(" 0 0,1 0,");
                sb.append(i11 - iMin5);
            }
            if (iMin2 > 0) {
                sb.append(" L 0,");
                sb.append(iMin2);
                sb.append(" A ");
                sb.append(iMin2);
                sb.append(",");
                sb.append(iMin2);
                sb.append(" 0 0,1 ");
                sb.append(iMin2);
                sb.append(",0");
            }
            sb.append(" Z");
            string = sb.toString();
        }
        return new i(string, i10, i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            return this.f33820a.equals(((i) obj).f33820a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33820a.hashCode();
    }

    public final String toString() {
        return this.f33820a.toString();
    }
}
