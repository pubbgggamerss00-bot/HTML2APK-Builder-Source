package c9;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f5057a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5058b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5059c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5060d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5061e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5062f;

    /* renamed from: g, reason: collision with root package name */
    public final List<v1> f5063g;

    /* JADX WARN: Multi-variable type inference failed */
    public b(long j10, int i10, int i11, float f10, float f11, int i12, List<? extends v1> list) {
        this.f5057a = j10;
        this.f5058b = i10;
        this.f5059c = i11;
        this.f5060d = f10;
        this.f5061e = f11;
        this.f5062f = i12;
        this.f5063g = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static b a(b bVar, long j10, int i10, ArrayList arrayList, int i11) {
        if ((i11 & 1) != 0) {
            j10 = bVar.f5057a;
        }
        long j11 = j10;
        int i12 = bVar.f5058b;
        int i13 = bVar.f5059c;
        float f10 = bVar.f5060d;
        float f11 = bVar.f5061e;
        if ((i11 & 32) != 0) {
            i10 = bVar.f5062f;
        }
        int i14 = i10;
        List list = arrayList;
        if ((i11 & 64) != 0) {
            list = bVar.f5063g;
        }
        List marks = list;
        kotlin.jvm.internal.r.e(marks, "marks");
        return new b(j11, i12, i13, f10, f11, i14, marks);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f5057a == bVar.f5057a && this.f5058b == bVar.f5058b && this.f5059c == bVar.f5059c && Float.compare(this.f5060d, bVar.f5060d) == 0 && Float.compare(this.f5061e, bVar.f5061e) == 0 && this.f5062f == bVar.f5062f && kotlin.jvm.internal.r.a(this.f5063g, bVar.f5063g);
    }

    public final int hashCode() {
        return this.f5063g.hashCode() + androidx.datastore.preferences.protobuf.a1.a(this.f5062f, r.z1.a(this.f5061e, r.z1.a(this.f5060d, androidx.datastore.preferences.protobuf.a1.a(this.f5059c, androidx.datastore.preferences.protobuf.a1.a(this.f5058b, Long.hashCode(this.f5057a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "EditPage(key=" + this.f5057a + ", source=" + this.f5058b + ", index=" + this.f5059c + ", width=" + this.f5060d + ", height=" + this.f5061e + ", rotation=" + this.f5062f + ", marks=" + this.f5063g + ")";
    }

    public /* synthetic */ b(long j10, int i10, int i11, float f10, float f11) {
        this(j10, i10, i11, f10, f11, 0, qg.z.f22752a);
    }
}
