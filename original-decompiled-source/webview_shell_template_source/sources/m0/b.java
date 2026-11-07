package m0;

import android.graphics.Insets;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f13853e = new b(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f13854a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13855b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13856c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13857d;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {
        public static Insets a(int i6, int i7, int i8, int i9) {
            return Insets.of(i6, i7, i8, i9);
        }
    }

    public b(int i6, int i7, int i8, int i9) {
        this.f13854a = i6;
        this.f13855b = i7;
        this.f13856c = i8;
        this.f13857d = i9;
    }

    public static b a(b bVar, b bVar2) {
        return c(Math.max(bVar.f13854a, bVar2.f13854a), Math.max(bVar.f13855b, bVar2.f13855b), Math.max(bVar.f13856c, bVar2.f13856c), Math.max(bVar.f13857d, bVar2.f13857d));
    }

    public static b b(b bVar, b bVar2) {
        return c(Math.min(bVar.f13854a, bVar2.f13854a), Math.min(bVar.f13855b, bVar2.f13855b), Math.min(bVar.f13856c, bVar2.f13856c), Math.min(bVar.f13857d, bVar2.f13857d));
    }

    public static b c(int i6, int i7, int i8, int i9) {
        return (i6 == 0 && i7 == 0 && i8 == 0 && i9 == 0) ? f13853e : new b(i6, i7, i8, i9);
    }

    public static b d(Insets insets) {
        return c(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets e() {
        return a.a(this.f13854a, this.f13855b, this.f13856c, this.f13857d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f13857d == bVar.f13857d && this.f13854a == bVar.f13854a && this.f13856c == bVar.f13856c && this.f13855b == bVar.f13855b;
    }

    public final int hashCode() {
        return (((((this.f13854a * 31) + this.f13855b) * 31) + this.f13856c) * 31) + this.f13857d;
    }

    public final String toString() {
        return "Insets{left=" + this.f13854a + ", top=" + this.f13855b + ", right=" + this.f13856c + ", bottom=" + this.f13857d + '}';
    }
}
