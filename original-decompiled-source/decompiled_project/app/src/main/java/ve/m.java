package ve;

import java.util.Locale;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f30839a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30840b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f30841c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f30842d;

    public m(int i10, int i11, boolean z10, boolean z11) {
        this.f30839a = i10;
        this.f30840b = i11;
        this.f30841c = z10;
        this.f30842d = z11;
    }

    public final String toString() {
        Locale locale = Locale.US;
        String str = this.f30841c ? "onCurve" : "";
        String str2 = this.f30842d ? "endOfContour" : "";
        StringBuilder sbA = p.g0.a(this.f30839a, this.f30840b, "Point(", ",", ",");
        sbA.append(str);
        sbA.append(",");
        sbA.append(str2);
        sbA.append(")");
        return sbA.toString();
    }
}
