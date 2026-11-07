package x2;

import androidx.datastore.preferences.protobuf.a1;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final f f32043a;

    /* renamed from: b, reason: collision with root package name */
    public final p f32044b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32045c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32046d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f32047e;

    public x(f fVar, p pVar, int i10, int i11, Object obj) {
        this.f32043a = fVar;
        this.f32044b = pVar;
        this.f32045c = i10;
        this.f32046d = i11;
        this.f32047e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return kotlin.jvm.internal.r.a(this.f32043a, xVar.f32043a) && kotlin.jvm.internal.r.a(this.f32044b, xVar.f32044b) && this.f32045c == xVar.f32045c && this.f32046d == xVar.f32046d && kotlin.jvm.internal.r.a(this.f32047e, xVar.f32047e);
    }

    public final int hashCode() {
        f fVar = this.f32043a;
        int iA = a1.a(this.f32046d, a1.a(this.f32045c, (((fVar == null ? 0 : fVar.hashCode()) * 31) + this.f32044b.f32037a) * 31, 31), 31);
        Object obj = this.f32047e;
        return iA + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.f32043a);
        sb.append(", fontWeight=");
        sb.append(this.f32044b);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i10 = this.f32045c;
        sb.append((Object) (i10 == 0 ? com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f6965t0 : i10 == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i11 = this.f32046d;
        if (i11 == 0) {
            str = "None";
        } else if (i11 == 1) {
            str = "Weight";
        } else if (i11 == 2) {
            str = "Style";
        } else if (i11 == 65535) {
            str = "All";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.f32047e);
        sb.append(')');
        return sb.toString();
    }
}
