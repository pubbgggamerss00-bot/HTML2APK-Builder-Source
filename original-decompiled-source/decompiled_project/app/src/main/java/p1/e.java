package p1;

import b8.n;
import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;
import r.z1;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final e f21130e = new e(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);

    /* renamed from: a, reason: collision with root package name */
    public final float f21131a;

    /* renamed from: b, reason: collision with root package name */
    public final float f21132b;

    /* renamed from: c, reason: collision with root package name */
    public final float f21133c;

    /* renamed from: d, reason: collision with root package name */
    public final float f21134d;

    public e(float f10, float f11, float f12, float f13) {
        this.f21131a = f10;
        this.f21132b = f11;
        this.f21133c = f12;
        this.f21134d = f13;
    }

    public static e b(e eVar, float f10, float f11, float f12, int i10) {
        if ((i10 & 1) != 0) {
            f10 = eVar.f21131a;
        }
        float f13 = eVar.f21132b;
        if ((i10 & 4) != 0) {
            f11 = eVar.f21133c;
        }
        if ((i10 & 8) != 0) {
            f12 = eVar.f21134d;
        }
        return new e(f10, f13, f11, f12);
    }

    public final boolean a(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax));
        return (fIntBitsToFloat >= this.f21131a) & (fIntBitsToFloat < this.f21133c) & (fIntBitsToFloat2 >= this.f21132b) & (fIntBitsToFloat2 < this.f21134d);
    }

    public final long c() {
        float f10 = this.f21133c;
        float f11 = this.f21131a;
        float f12 = ((f10 - f11) / 2.0f) + f11;
        float f13 = this.f21134d;
        float f14 = this.f21132b;
        return (Float.floatToRawIntBits(((f13 - f14) / 2.0f) + f14) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f12) << 32);
    }

    public final long d() {
        float f10 = this.f21133c - this.f21131a;
        float f11 = this.f21134d - this.f21132b;
        return (Float.floatToRawIntBits(f11) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f10) << 32);
    }

    public final long e() {
        return (Float.floatToRawIntBits(this.f21131a) << 32) | (Float.floatToRawIntBits(this.f21132b) & BodyPartID.bodyIdMax);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f21131a, eVar.f21131a) == 0 && Float.compare(this.f21132b, eVar.f21132b) == 0 && Float.compare(this.f21133c, eVar.f21133c) == 0 && Float.compare(this.f21134d, eVar.f21134d) == 0;
    }

    public final e f(e eVar) {
        return new e(Math.max(this.f21131a, eVar.f21131a), Math.max(this.f21132b, eVar.f21132b), Math.min(this.f21133c, eVar.f21133c), Math.min(this.f21134d, eVar.f21134d));
    }

    public final boolean g() {
        return (this.f21131a >= this.f21133c) | (this.f21132b >= this.f21134d);
    }

    public final boolean h(e eVar) {
        return (this.f21131a < eVar.f21133c) & (eVar.f21131a < this.f21133c) & (this.f21132b < eVar.f21134d) & (eVar.f21132b < this.f21134d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f21134d) + z1.a(this.f21133c, z1.a(this.f21132b, Float.hashCode(this.f21131a) * 31, 31), 31);
    }

    public final e i(float f10, float f11) {
        return new e(this.f21131a + f10, this.f21132b + f11, this.f21133c + f10, this.f21134d + f11);
    }

    public final e j(long j10) {
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i10) + this.f21131a;
        int i11 = (int) (j10 & BodyPartID.bodyIdMax);
        return new e(fIntBitsToFloat, Float.intBitsToFloat(i11) + this.f21132b, Float.intBitsToFloat(i10) + this.f21133c, Float.intBitsToFloat(i11) + this.f21134d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + n.e(this.f21131a) + ", " + n.e(this.f21132b) + ", " + n.e(this.f21133c) + ", " + n.e(this.f21134d) + ')';
    }
}
