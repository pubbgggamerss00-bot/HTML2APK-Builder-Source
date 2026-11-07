package t2;

import androidx.datastore.preferences.protobuf.a1;
import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;
import r.z1;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final a f27864a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27865b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27866c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27867d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27868e;

    /* renamed from: f, reason: collision with root package name */
    public final float f27869f;

    /* renamed from: g, reason: collision with root package name */
    public final float f27870g;

    public o(a aVar, int i10, int i11, int i12, int i13, float f10, float f11) {
        this.f27864a = aVar;
        this.f27865b = i10;
        this.f27866c = i11;
        this.f27867d = i12;
        this.f27868e = i13;
        this.f27869f = f10;
        this.f27870g = f11;
    }

    public final p1.e a(p1.e eVar) {
        return eVar.j((Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO) << 32) | (Float.floatToRawIntBits(this.f27869f) & BodyPartID.bodyIdMax));
    }

    public final long b(long j10, boolean z10) {
        if (z10) {
            long j11 = j0.f27837b;
            if (j0.a(j10, j11)) {
                return j11;
            }
        }
        int i10 = j0.f27838c;
        int i11 = (int) (j10 >> 32);
        int i12 = this.f27865b;
        return k0.a(i11 + i12, ((int) (j10 & BodyPartID.bodyIdMax)) + i12);
    }

    public final p1.e c(p1.e eVar) {
        float f10 = -this.f27869f;
        return eVar.j((Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO) << 32) | (Float.floatToRawIntBits(f10) & BodyPartID.bodyIdMax));
    }

    public final int d(int i10) {
        int i11 = this.f27866c;
        int i12 = this.f27865b;
        return jh.j.m(i10, i12, i11) - i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f27864a.equals(oVar.f27864a) && this.f27865b == oVar.f27865b && this.f27866c == oVar.f27866c && this.f27867d == oVar.f27867d && this.f27868e == oVar.f27868e && Float.compare(this.f27869f, oVar.f27869f) == 0 && Float.compare(this.f27870g, oVar.f27870g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f27870g) + z1.a(this.f27869f, a1.a(this.f27868e, a1.a(this.f27867d, a1.a(this.f27866c, a1.a(this.f27865b, this.f27864a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.f27864a);
        sb.append(", startIndex=");
        sb.append(this.f27865b);
        sb.append(", endIndex=");
        sb.append(this.f27866c);
        sb.append(", startLineIndex=");
        sb.append(this.f27867d);
        sb.append(", endLineIndex=");
        sb.append(this.f27868e);
        sb.append(", top=");
        sb.append(this.f27869f);
        sb.append(", bottom=");
        return org.bouncycastle.jcajce.provider.digest.d.a(sb, this.f27870g, ')');
    }
}
