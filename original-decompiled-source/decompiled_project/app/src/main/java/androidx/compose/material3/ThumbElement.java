package androidx.compose.material3;

import androidx.compose.ui.d;
import i2.a1;
import i2.k;
import kotlin.jvm.internal.r;
import t0.kf;
import x.l;

/* loaded from: classes.dex */
final class ThumbElement extends a1<kf> {

    /* renamed from: b, reason: collision with root package name */
    public final l f1124b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1125c;

    public ThumbElement(l lVar, boolean z10) {
        this.f1124b = lVar;
        this.f1125c = z10;
    }

    @Override // i2.a1
    public final d.c a() {
        kf kfVar = new kf();
        kfVar.f26299q = this.f1124b;
        kfVar.f26300r = this.f1125c;
        kfVar.f26304w = Float.NaN;
        kfVar.f26305x = Float.NaN;
        return kfVar;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        kf kfVar = (kf) cVar;
        kfVar.f26299q = this.f1124b;
        boolean z10 = kfVar.f26300r;
        boolean z11 = this.f1125c;
        if (z10 != z11) {
            k.f(kfVar).O();
        }
        kfVar.f26300r = z11;
        if (kfVar.f26303v == null && !Float.isNaN(kfVar.f26305x)) {
            kfVar.f26303v = s.d.a(kfVar.f26305x);
        }
        if (kfVar.f26302t != null || Float.isNaN(kfVar.f26304w)) {
            return;
        }
        kfVar.f26302t = s.d.a(kfVar.f26304w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThumbElement)) {
            return false;
        }
        ThumbElement thumbElement = (ThumbElement) obj;
        return r.a(this.f1124b, thumbElement.f1124b) && this.f1125c == thumbElement.f1125c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1125c) + (this.f1124b.hashCode() * 31);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.f1124b + ", checked=" + this.f1125c + ')';
    }
}
