package hi;

import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13086a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13087b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f13088c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f13089d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f13090e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f13091f;

    /* renamed from: g, reason: collision with root package name */
    public final Long f13092g;

    /* renamed from: h, reason: collision with root package name */
    public final Map<kh.c<?>, Object> f13093h;

    public m(boolean z10, boolean z11, b0 b0Var, Long l10, Long l11, Long l12, Long l13, Map<kh.c<?>, ? extends Object> extras) {
        kotlin.jvm.internal.r.e(extras, "extras");
        this.f13086a = z10;
        this.f13087b = z11;
        this.f13088c = b0Var;
        this.f13089d = l10;
        this.f13090e = l11;
        this.f13091f = l12;
        this.f13092g = l13;
        this.f13093h = qg.k0.j(extras);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f13086a) {
            arrayList.add("isRegularFile");
        }
        if (this.f13087b) {
            arrayList.add("isDirectory");
        }
        Long l10 = this.f13089d;
        if (l10 != null) {
            arrayList.add("byteCount=" + l10);
        }
        Long l11 = this.f13090e;
        if (l11 != null) {
            arrayList.add("createdAt=" + l11);
        }
        Long l12 = this.f13091f;
        if (l12 != null) {
            arrayList.add("lastModifiedAt=" + l12);
        }
        Long l13 = this.f13092g;
        if (l13 != null) {
            arrayList.add("lastAccessedAt=" + l13);
        }
        Map<kh.c<?>, Object> map = this.f13093h;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return qg.x.I(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }

    public /* synthetic */ m(boolean z10, boolean z11, b0 b0Var, Long l10, Long l11, Long l12, Long l13) {
        this(z10, z11, b0Var, l10, l11, l12, l13, qg.a0.f22708a);
    }
}
