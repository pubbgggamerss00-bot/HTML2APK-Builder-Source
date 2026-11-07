package androidx.compose.foundation.layout;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import eh.l;
import f3.h;
import i2.a1;
import r.z1;
import z.e1;

/* loaded from: classes.dex */
final class PaddingElement extends a1<e1> {

    /* renamed from: b, reason: collision with root package name */
    public final float f944b;

    /* renamed from: c, reason: collision with root package name */
    public final float f945c;

    /* renamed from: d, reason: collision with root package name */
    public final float f946d;

    /* renamed from: e, reason: collision with root package name */
    public final float f947e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f948f = true;

    public PaddingElement(float f10, float f11, float f12, float f13, l lVar) {
        this.f944b = f10;
        this.f945c = f11;
        this.f946d = f12;
        this.f947e = f13;
        boolean z10 = true;
        boolean z11 = (f10 >= CropImageView.DEFAULT_ASPECT_RATIO || Float.isNaN(f10)) & (f11 >= CropImageView.DEFAULT_ASPECT_RATIO || Float.isNaN(f11)) & (f12 >= CropImageView.DEFAULT_ASPECT_RATIO || Float.isNaN(f12));
        if (f13 < CropImageView.DEFAULT_ASPECT_RATIO && !Float.isNaN(f13)) {
            z10 = false;
        }
        if (!z11 || !z10) {
            a0.a.a("Padding must be non-negative");
        }
    }

    @Override // i2.a1
    public final d.c a() {
        e1 e1Var = new e1();
        e1Var.f34495q = this.f944b;
        e1Var.f34496r = this.f945c;
        e1Var.f34497s = this.f946d;
        e1Var.f34498t = this.f947e;
        e1Var.f34499v = this.f948f;
        return e1Var;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        e1 e1Var = (e1) cVar;
        e1Var.f34495q = this.f944b;
        e1Var.f34496r = this.f945c;
        e1Var.f34497s = this.f946d;
        e1Var.f34498t = this.f947e;
        e1Var.f34499v = this.f948f;
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && h.a(this.f944b, paddingElement.f944b) && h.a(this.f945c, paddingElement.f945c) && h.a(this.f946d, paddingElement.f946d) && h.a(this.f947e, paddingElement.f947e) && this.f948f == paddingElement.f948f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f948f) + z1.a(this.f947e, z1.a(this.f946d, z1.a(this.f945c, Float.hashCode(this.f944b) * 31, 31), 31), 31);
    }
}
