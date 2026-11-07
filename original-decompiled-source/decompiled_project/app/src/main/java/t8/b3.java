package t8;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    public final List<y3> f28111a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f28112b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28113c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28114d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f28115e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f28116f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f28117g;

    /* renamed from: h, reason: collision with root package name */
    public final h8.j f28118h;

    public b3() {
        this(false, 255);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static b3 a(b3 b3Var, ArrayList arrayList, Long l10, String str, boolean z10, boolean z11, boolean z12, h8.j jVar, int i10) {
        List list = arrayList;
        if ((i10 & 1) != 0) {
            list = b3Var.f28111a;
        }
        List turns = list;
        if ((i10 & 2) != 0) {
            l10 = b3Var.f28112b;
        }
        Long l11 = l10;
        if ((i10 & 4) != 0) {
            str = b3Var.f28113c;
        }
        String str2 = str;
        boolean z13 = b3Var.f28114d;
        if ((i10 & 16) != 0) {
            z10 = b3Var.f28115e;
        }
        boolean z14 = z10;
        if ((i10 & 32) != 0) {
            z11 = b3Var.f28116f;
        }
        boolean z15 = z11;
        if ((i10 & 64) != 0) {
            z12 = b3Var.f28117g;
        }
        boolean z16 = z12;
        h8.j jVar2 = (i10 & 128) != 0 ? b3Var.f28118h : jVar;
        b3Var.getClass();
        kotlin.jvm.internal.r.e(turns, "turns");
        return new b3(turns, l11, str2, z13, z14, z15, z16, jVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3)) {
            return false;
        }
        b3 b3Var = (b3) obj;
        return kotlin.jvm.internal.r.a(this.f28111a, b3Var.f28111a) && kotlin.jvm.internal.r.a(this.f28112b, b3Var.f28112b) && kotlin.jvm.internal.r.a(this.f28113c, b3Var.f28113c) && this.f28114d == b3Var.f28114d && this.f28115e == b3Var.f28115e && this.f28116f == b3Var.f28116f && this.f28117g == b3Var.f28117g && kotlin.jvm.internal.r.a(this.f28118h, b3Var.f28118h);
    }

    public final int hashCode() {
        int iHashCode = this.f28111a.hashCode() * 31;
        Long l10 = this.f28112b;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str = this.f28113c;
        int iA = r.o2.a(r.o2.a(r.o2.a(r.o2.a((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f28114d), 31, this.f28115e), 31, this.f28116f), 31, this.f28117g);
        h8.j jVar = this.f28118h;
        return iA + (jVar != null ? jVar.hashCode() : 0);
    }

    public final String toString() {
        return "AiSessionUi(turns=" + this.f28111a + ", projectId=" + this.f28112b + ", projectName=" + this.f28113c + ", autoMode=" + this.f28114d + ", running=" + this.f28115e + ", historyLoading=" + this.f28116f + ", historyFailed=" + this.f28117g + ", iconToRender=" + this.f28118h + ")";
    }

    public b3(List<y3> list, Long l10, String str, boolean z10, boolean z11, boolean z12, boolean z13, h8.j jVar) {
        this.f28111a = list;
        this.f28112b = l10;
        this.f28113c = str;
        this.f28114d = z10;
        this.f28115e = z11;
        this.f28116f = z12;
        this.f28117g = z13;
        this.f28118h = jVar;
    }

    public /* synthetic */ b3(boolean z10, int i10) {
        this(qg.z.f22752a, null, null, (i10 & 8) != 0 ? false : z10, false, false, false, null);
    }
}
