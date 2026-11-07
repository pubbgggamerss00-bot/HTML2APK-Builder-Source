package k8;

import androidx.datastore.preferences.protobuf.a1;
import kotlin.jvm.internal.r;
import r.e2;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f16139a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16140b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16141c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16142d;

    /* renamed from: e, reason: collision with root package name */
    public final l f16143e;

    /* renamed from: f, reason: collision with root package name */
    public final long f16144f;

    /* renamed from: g, reason: collision with root package name */
    public final long f16145g;

    /* renamed from: h, reason: collision with root package name */
    public final long f16146h;

    /* renamed from: i, reason: collision with root package name */
    public final int f16147i;

    /* renamed from: j, reason: collision with root package name */
    public final int f16148j;

    public k(String str, int i10, int i11, String str2, l lVar, long j10, long j11, long j12, int i12, int i13) {
        this.f16139a = str;
        this.f16140b = i10;
        this.f16141c = i11;
        this.f16142d = str2;
        this.f16143e = lVar;
        this.f16144f = j10;
        this.f16145g = j11;
        this.f16146h = j12;
        this.f16147i = i12;
        this.f16148j = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return r.a(this.f16139a, kVar.f16139a) && this.f16140b == kVar.f16140b && this.f16141c == kVar.f16141c && r.a(this.f16142d, kVar.f16142d) && this.f16143e == kVar.f16143e && this.f16144f == kVar.f16144f && this.f16145g == kVar.f16145g && this.f16146h == kVar.f16146h && this.f16147i == kVar.f16147i && this.f16148j == kVar.f16148j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16148j) + a1.a(this.f16147i, e2.a(e2.a(e2.a((this.f16143e.hashCode() + l0.k.a(a1.a(this.f16141c, a1.a(this.f16140b, this.f16139a.hashCode() * 31, 31), 31), 31, this.f16142d)) * 31, 31, this.f16144f), 31, this.f16145g), 31, this.f16146h), 31);
    }

    public final String toString() {
        StringBuilder sbA = androidx.datastore.preferences.protobuf.h.a(this.f16140b, "QuestDef(id=", this.f16139a, ", nameRes=", ", descRes=");
        sbA.append(this.f16141c);
        sbA.append(", icon=");
        sbA.append(this.f16142d);
        sbA.append(", type=");
        sbA.append(this.f16143e);
        sbA.append(", target=");
        sbA.append(this.f16144f);
        sbA.append(", rewardPaws=");
        sbA.append(this.f16145g);
        sbA.append(", rewardHearts=");
        sbA.append(this.f16146h);
        sbA.append(", rewardTuna=");
        sbA.append(this.f16147i);
        sbA.append(", rewardXp=");
        sbA.append(this.f16148j);
        sbA.append(")");
        return sbA.toString();
    }

    public /* synthetic */ k(String str, int i10, int i11, String str2, l lVar, long j10, long j11, long j12, int i12, int i13, int i14) {
        this(str, i10, i11, str2, lVar, j10, j11, (i14 & 128) != 0 ? 0L : j12, (i14 & 256) != 0 ? 0 : i12, i13);
    }
}
