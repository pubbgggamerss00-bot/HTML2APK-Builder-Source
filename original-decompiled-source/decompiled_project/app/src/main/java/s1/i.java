package s1;

import androidx.datastore.preferences.protobuf.a1;
import r.z1;

/* loaded from: classes.dex */
public final class i extends f {

    /* renamed from: a, reason: collision with root package name */
    public final float f24187a;

    /* renamed from: b, reason: collision with root package name */
    public final float f24188b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24189c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24190d;

    public i(float f10, float f11, int i10, int i11, int i12) {
        f11 = (i12 & 2) != 0 ? 4.0f : f11;
        i10 = (i12 & 4) != 0 ? 0 : i10;
        i11 = (i12 & 8) != 0 ? 0 : i11;
        this.f24187a = f10;
        this.f24188b = f11;
        this.f24189c = i10;
        this.f24190d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f24187a == iVar.f24187a && this.f24188b == iVar.f24188b && this.f24189c == iVar.f24189c && this.f24190d == iVar.f24190d;
    }

    public final int hashCode() {
        return a1.a(this.f24190d, a1.a(this.f24189c, z1.a(this.f24188b, Float.hashCode(this.f24187a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.f24187a);
        sb.append(", miter=");
        sb.append(this.f24188b);
        sb.append(", cap=");
        String str = "Unknown";
        int i10 = this.f24189c;
        sb.append((Object) (i10 == 0 ? "Butt" : i10 == 1 ? "Round" : i10 == 2 ? com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e.f6985m : "Unknown"));
        sb.append(", join=");
        int i11 = this.f24190d;
        if (i11 == 0) {
            str = "Miter";
        } else if (i11 == 1) {
            str = "Round";
        } else if (i11 == 2) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
