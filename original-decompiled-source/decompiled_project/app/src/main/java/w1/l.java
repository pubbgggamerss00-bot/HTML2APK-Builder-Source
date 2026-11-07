package w1;

import com.yalantis.ucrop.view.CropImageView;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.r;
import qg.z;
import r.z1;

/* loaded from: classes.dex */
public final class l extends n implements Iterable<n>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f31199a;

    /* renamed from: b, reason: collision with root package name */
    public final float f31200b;

    /* renamed from: c, reason: collision with root package name */
    public final float f31201c;

    /* renamed from: d, reason: collision with root package name */
    public final float f31202d;

    /* renamed from: e, reason: collision with root package name */
    public final float f31203e;

    /* renamed from: f, reason: collision with root package name */
    public final float f31204f;

    /* renamed from: g, reason: collision with root package name */
    public final float f31205g;

    /* renamed from: h, reason: collision with root package name */
    public final float f31206h;

    /* renamed from: j, reason: collision with root package name */
    public final List<g> f31207j;

    /* renamed from: k, reason: collision with root package name */
    public final List<n> f31208k;

    public static final class a implements Iterator<n>, fh.a {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<n> f31209a;

        public a(l lVar) {
            this.f31209a = lVar.f31208k.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f31209a.hasNext();
        }

        @Override // java.util.Iterator
        public final n next() {
            return this.f31209a.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List<? extends g> list, List<? extends n> list2) {
        this.f31199a = str;
        this.f31200b = f10;
        this.f31201c = f11;
        this.f31202d = f12;
        this.f31203e = f13;
        this.f31204f = f14;
        this.f31205g = f15;
        this.f31206h = f16;
        this.f31207j = list;
        this.f31208k = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof l)) {
            l lVar = (l) obj;
            return r.a(this.f31199a, lVar.f31199a) && this.f31200b == lVar.f31200b && this.f31201c == lVar.f31201c && this.f31202d == lVar.f31202d && this.f31203e == lVar.f31203e && this.f31204f == lVar.f31204f && this.f31205g == lVar.f31205g && this.f31206h == lVar.f31206h && r.a(this.f31207j, lVar.f31207j) && r.a(this.f31208k, lVar.f31208k);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31208k.hashCode() + a2.a.a(this.f31207j, z1.a(this.f31206h, z1.a(this.f31205g, z1.a(this.f31204f, z1.a(this.f31203e, z1.a(this.f31202d, z1.a(this.f31201c, z1.a(this.f31200b, this.f31199a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // java.lang.Iterable
    public final Iterator<n> iterator() {
        return new a(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l() {
        int i10 = m.f31210a;
        z zVar = z.f22752a;
        this("", CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, zVar, zVar);
    }
}
