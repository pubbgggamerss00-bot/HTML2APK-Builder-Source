package z;

import com.yalantis.ucrop.view.CropImageView;
import r.o2;
import z.v;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public float f34557a = CropImageView.DEFAULT_ASPECT_RATIO;

    /* renamed from: b, reason: collision with root package name */
    public boolean f34558b = true;

    /* renamed from: c, reason: collision with root package name */
    public v.c f34559c = null;

    public j1(int i10) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return Float.compare(this.f34557a, j1Var.f34557a) == 0 && this.f34558b == j1Var.f34558b && kotlin.jvm.internal.r.a(this.f34559c, j1Var.f34559c);
    }

    public final int hashCode() {
        int iA = o2.a(Float.hashCode(this.f34557a) * 31, 31, this.f34558b);
        v.c cVar = this.f34559c;
        return (iA + (cVar == null ? 0 : cVar.f34647b.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f34557a + ", fill=" + this.f34558b + ", crossAxisAlignment=" + this.f34559c + ", flowLayoutData=null)";
    }
}
