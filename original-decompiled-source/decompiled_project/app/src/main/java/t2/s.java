package t2;

import androidx.datastore.preferences.protobuf.a1;
import com.yalantis.ucrop.view.CropImageView;
import r.e2;
import t2.b;

/* loaded from: classes.dex */
public final class s implements b.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f27875a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27876b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27877c;

    /* renamed from: d, reason: collision with root package name */
    public final e3.n f27878d;

    /* renamed from: e, reason: collision with root package name */
    public final v f27879e;

    /* renamed from: f, reason: collision with root package name */
    public final e3.f f27880f;

    /* renamed from: g, reason: collision with root package name */
    public final int f27881g;

    /* renamed from: h, reason: collision with root package name */
    public final int f27882h;

    /* renamed from: i, reason: collision with root package name */
    public final e3.o f27883i;

    public s(int i10, int i11, long j10, e3.n nVar, v vVar, e3.f fVar, int i12, int i13, e3.o oVar) {
        this.f27875a = i10;
        this.f27876b = i11;
        this.f27877c = j10;
        this.f27878d = nVar;
        this.f27879e = vVar;
        this.f27880f = fVar;
        this.f27881g = i12;
        this.f27882h = i13;
        this.f27883i = oVar;
        if (f3.t.a(j10, f3.t.f8833c) || f3.t.c(j10) >= CropImageView.DEFAULT_ASPECT_RATIO) {
            return;
        }
        z2.a.b("lineHeight can't be negative (" + f3.t.c(j10) + ')');
    }

    public final s a(s sVar) {
        return sVar == null ? this : t.a(this, sVar.f27875a, sVar.f27876b, sVar.f27877c, sVar.f27878d, sVar.f27879e, sVar.f27880f, sVar.f27881g, sVar.f27882h, sVar.f27883i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f27875a == sVar.f27875a && this.f27876b == sVar.f27876b && f3.t.a(this.f27877c, sVar.f27877c) && kotlin.jvm.internal.r.a(this.f27878d, sVar.f27878d) && kotlin.jvm.internal.r.a(this.f27879e, sVar.f27879e) && kotlin.jvm.internal.r.a(this.f27880f, sVar.f27880f) && this.f27881g == sVar.f27881g && this.f27882h == sVar.f27882h && kotlin.jvm.internal.r.a(this.f27883i, sVar.f27883i);
    }

    public final int hashCode() {
        int iA = a1.a(this.f27876b, Integer.hashCode(this.f27875a) * 31, 31);
        f3.v[] vVarArr = f3.t.f8832b;
        int iA2 = e2.a(iA, 31, this.f27877c);
        e3.n nVar = this.f27878d;
        int iHashCode = (iA2 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        v vVar = this.f27879e;
        int iHashCode2 = (iHashCode + (vVar != null ? vVar.hashCode() : 0)) * 31;
        e3.f fVar = this.f27880f;
        int iA3 = a1.a(this.f27882h, a1.a(this.f27881g, (iHashCode2 + (fVar != null ? fVar.hashCode() : 0)) * 31, 31), 31);
        e3.o oVar = this.f27883i;
        return iA3 + (oVar != null ? oVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) e3.h.a(this.f27875a)) + ", textDirection=" + ((Object) e3.j.a(this.f27876b)) + ", lineHeight=" + ((Object) f3.t.d(this.f27877c)) + ", textIndent=" + this.f27878d + ", platformStyle=" + this.f27879e + ", lineHeightStyle=" + this.f27880f + ", lineBreak=" + ((Object) e3.e.a(this.f27881g)) + ", hyphens=" + ((Object) e3.d.a(this.f27882h)) + ", textMotion=" + this.f27883i + ')';
    }
}
