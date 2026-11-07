package q1;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class q1 extends d2 {

    /* renamed from: c, reason: collision with root package name */
    public final List<b1> f21725c;

    /* renamed from: d, reason: collision with root package name */
    public final List<Float> f21726d;

    /* renamed from: e, reason: collision with root package name */
    public final long f21727e;

    /* renamed from: f, reason: collision with root package name */
    public final long f21728f;

    public q1(List list, ArrayList arrayList, long j10, long j11) {
        this.f21725c = list;
        this.f21726d = arrayList;
        this.f21727e = j10;
        this.f21728f = j11;
    }

    @Override // q1.d2
    public final Shader b(long j10) {
        long j11 = this.f21727e;
        int i10 = (int) (j11 >> 32);
        if (Float.intBitsToFloat(i10) == Float.POSITIVE_INFINITY) {
            i10 = (int) (j10 >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        int i11 = (int) (j11 & BodyPartID.bodyIdMax);
        if (Float.intBitsToFloat(i11) == Float.POSITIVE_INFINITY) {
            i11 = (int) (j10 & BodyPartID.bodyIdMax);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i11);
        long j12 = this.f21728f;
        int i12 = (int) (j12 >> 32);
        if (Float.intBitsToFloat(i12) == Float.POSITIVE_INFINITY) {
            i12 = (int) (j10 >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i12);
        int i13 = (int) (j12 & BodyPartID.bodyIdMax);
        if (Float.intBitsToFloat(i13) == Float.POSITIVE_INFINITY) {
            i13 = (int) (j10 & BodyPartID.bodyIdMax);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i13);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & BodyPartID.bodyIdMax);
        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fIntBitsToFloat3) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat4) & BodyPartID.bodyIdMax);
        List<b1> list = this.f21725c;
        List<Float> list2 = this.f21726d;
        m0.a(list, list2);
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jFloatToRawIntBits & BodyPartID.bodyIdMax));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & BodyPartID.bodyIdMax));
        int size = list.size();
        int[] iArr = new int[size];
        for (int i14 = 0; i14 < size; i14++) {
            iArr[i14] = c2.n0.j(list.get(i14).f21656a);
        }
        return new LinearGradient(fIntBitsToFloat5, fIntBitsToFloat6, fIntBitsToFloat7, fIntBitsToFloat8, iArr, list2 != null ? qg.x.a0(list2) : null, n0.a(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return kotlin.jvm.internal.r.a(this.f21725c, q1Var.f21725c) && kotlin.jvm.internal.r.a(this.f21726d, q1Var.f21726d) && p1.c.b(this.f21727e, q1Var.f21727e) && p1.c.b(this.f21728f, q1Var.f21728f);
    }

    public final int hashCode() {
        int iHashCode = this.f21725c.hashCode() * 31;
        List<Float> list = this.f21726d;
        return Integer.hashCode(0) + r.e2.a(r.e2.a((iHashCode + (list != null ? list.hashCode() : 0)) * 31, 31, this.f21727e), 31, this.f21728f);
    }

    public final String toString() {
        String str;
        long j10 = this.f21727e;
        String str2 = "";
        if (((((j10 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) p1.c.i(j10)) + ", ";
        } else {
            str = "";
        }
        long j11 = this.f21728f;
        if (((((j11 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) p1.c.i(j11)) + ", ";
        }
        return "LinearGradient(colors=" + this.f21725c + ", stops=" + this.f21726d + ", " + str + str2 + "tileMode=" + ((Object) j2.a(0)) + ')';
    }
}
