package h8;

import androidx.room.y0;
import androidx.room.z0;
import java.util.List;
import r.o2;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f12447a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12448b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12449c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12450d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12451e;

    /* renamed from: f, reason: collision with root package name */
    public final List<w> f12452f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f12453g;

    /* renamed from: h, reason: collision with root package name */
    public final String f12454h;

    public s(String str, String mode, String prompt, String str2, String str3, List<w> failedBlocks, boolean z10, String str4) {
        kotlin.jvm.internal.r.e(mode, "mode");
        kotlin.jvm.internal.r.e(prompt, "prompt");
        kotlin.jvm.internal.r.e(failedBlocks, "failedBlocks");
        this.f12447a = str;
        this.f12448b = mode;
        this.f12449c = prompt;
        this.f12450d = str2;
        this.f12451e = str3;
        this.f12452f = failedBlocks;
        this.f12453g = z10;
        this.f12454h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return kotlin.jvm.internal.r.a(this.f12447a, sVar.f12447a) && kotlin.jvm.internal.r.a(this.f12448b, sVar.f12448b) && kotlin.jvm.internal.r.a(this.f12449c, sVar.f12449c) && kotlin.jvm.internal.r.a(this.f12450d, sVar.f12450d) && kotlin.jvm.internal.r.a(this.f12451e, sVar.f12451e) && kotlin.jvm.internal.r.a(this.f12452f, sVar.f12452f) && this.f12453g == sVar.f12453g && kotlin.jvm.internal.r.a(this.f12454h, sVar.f12454h);
    }

    public final int hashCode() {
        String str = this.f12447a;
        int iA = l0.k.a(l0.k.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f12448b), 31, this.f12449c);
        String str2 = this.f12450d;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f12451e;
        return this.f12454h.hashCode() + o2.a(a2.a.a(this.f12452f, (iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31, 31), 31, this.f12453g);
    }

    public final String toString() {
        StringBuilder sbA = y0.a("AiRequest(sessionId=", this.f12447a, ", mode=", this.f12448b, ", prompt=");
        z0.a(sbA, this.f12449c, ", html=", this.f12450d, ", settingsJson=");
        sbA.append(this.f12451e);
        sbA.append(", failedBlocks=");
        sbA.append(this.f12452f);
        sbA.append(", autoMode=");
        sbA.append(this.f12453g);
        sbA.append(", locale=");
        sbA.append(this.f12454h);
        sbA.append(")");
        return sbA.toString();
    }
}
