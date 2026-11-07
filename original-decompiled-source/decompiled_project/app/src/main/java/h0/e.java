package h0;

import com.yalantis.ucrop.view.CropImageView;
import f3.r;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p1.g;
import q1.s1;

/* loaded from: classes.dex */
public final class e extends a {
    @Override // h0.a
    public final e b(b bVar, b bVar2, b bVar3, c cVar) {
        return new e(bVar, bVar2, bVar3, cVar);
    }

    @Override // h0.a
    public final s1 d(long j10, float f10, float f11, float f12, float f13, r rVar) {
        if (f10 + f11 + f12 + f13 == CropImageView.DEFAULT_ASPECT_RATIO) {
            return new s1.b(p1.f.a(0L, j10));
        }
        p1.e eVarA = p1.f.a(0L, j10);
        r rVar2 = r.f8828a;
        float f14 = rVar == rVar2 ? f10 : f11;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f14) & BodyPartID.bodyIdMax);
        float f15 = rVar == rVar2 ? f11 : f10;
        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(f15) << 32) | (Float.floatToRawIntBits(f15) & BodyPartID.bodyIdMax);
        float f16 = rVar == rVar2 ? f12 : f13;
        long jFloatToRawIntBits3 = (Float.floatToRawIntBits(f16) << 32) | (Float.floatToRawIntBits(f16) & BodyPartID.bodyIdMax);
        float f17 = rVar == rVar2 ? f13 : f12;
        return new s1.c(new g(eVarA.f21131a, eVarA.f21132b, eVarA.f21133c, eVarA.f21134d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (Float.floatToRawIntBits(f17) << 32) | (Float.floatToRawIntBits(f17) & BodyPartID.bodyIdMax)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.r.a(this.f12077a, eVar.f12077a) && kotlin.jvm.internal.r.a(this.f12078b, eVar.f12078b) && kotlin.jvm.internal.r.a(this.f12079c, eVar.f12079c) && kotlin.jvm.internal.r.a(this.f12080d, eVar.f12080d);
    }

    public final int hashCode() {
        return this.f12080d.hashCode() + ((this.f12079c.hashCode() + ((this.f12078b.hashCode() + (this.f12077a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f12077a + ", topEnd = " + this.f12078b + ", bottomEnd = " + this.f12079c + ", bottomStart = " + this.f12080d + ')';
    }
}
