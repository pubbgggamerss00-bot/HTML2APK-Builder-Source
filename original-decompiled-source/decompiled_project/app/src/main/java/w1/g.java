package w1;

import r.o2;
import r.z1;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f31121a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f31122b;

    public static final class a extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f31123c;

        /* renamed from: d, reason: collision with root package name */
        public final float f31124d;

        /* renamed from: e, reason: collision with root package name */
        public final float f31125e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f31126f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f31127g;

        /* renamed from: h, reason: collision with root package name */
        public final float f31128h;

        /* renamed from: i, reason: collision with root package name */
        public final float f31129i;

        public a(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            super(3);
            this.f31123c = f10;
            this.f31124d = f11;
            this.f31125e = f12;
            this.f31126f = z10;
            this.f31127g = z11;
            this.f31128h = f13;
            this.f31129i = f14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f31123c, aVar.f31123c) == 0 && Float.compare(this.f31124d, aVar.f31124d) == 0 && Float.compare(this.f31125e, aVar.f31125e) == 0 && this.f31126f == aVar.f31126f && this.f31127g == aVar.f31127g && Float.compare(this.f31128h, aVar.f31128h) == 0 && Float.compare(this.f31129i, aVar.f31129i) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f31129i) + z1.a(this.f31128h, o2.a(o2.a(z1.a(this.f31125e, z1.a(this.f31124d, Float.hashCode(this.f31123c) * 31, 31), 31), 31, this.f31126f), 31, this.f31127g), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
            sb.append(this.f31123c);
            sb.append(", verticalEllipseRadius=");
            sb.append(this.f31124d);
            sb.append(", theta=");
            sb.append(this.f31125e);
            sb.append(", isMoreThanHalf=");
            sb.append(this.f31126f);
            sb.append(", isPositiveArc=");
            sb.append(this.f31127g);
            sb.append(", arcStartX=");
            sb.append(this.f31128h);
            sb.append(", arcStartY=");
            return org.bouncycastle.jcajce.provider.digest.d.a(sb, this.f31129i, ')');
        }
    }

    public static final class b extends g {

        /* renamed from: c, reason: collision with root package name */
        public static final b f31130c = new b(3);
    }

    public static final class c extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f31131c;

        /* renamed from: d, reason: collision with root package name */
        public final float f31132d;

        /* renamed from: e, reason: collision with root package name */
        public final float f31133e;

        /* renamed from: f, reason: collision with root package name */
        public final float f31134f;

        /* renamed from: g, reason: collision with root package name */
        public final float f31135g;

        /* renamed from: h, reason: collision with root package name */
        public final float f31136h;

        public c(float f10, float f11, float f12, float f13, float f14, float f15) {
            super(2);
            this.f31131c = f10;
            this.f31132d = f11;
            this.f31133e = f12;
            this.f31134f = f13;
            this.f31135g = f14;
            this.f31136h = f15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Float.compare(this.f31131c, cVar.f31131c) == 0 && Float.compare(this.f31132d, cVar.f31132d) == 0 && Float.compare(this.f31133e, cVar.f31133e) == 0 && Float.compare(this.f31134f, cVar.f31134f) == 0 && Float.compare(this.f31135g, cVar.f31135g) == 0 && Float.compare(this.f31136h, cVar.f31136h) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f31136h) + z1.a(this.f31135g, z1.a(this.f31134f, z1.a(this.f31133e, z1.a(this.f31132d, Float.hashCode(this.f31131c) * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CurveTo(x1=");
            sb.append(this.f31131c);
            sb.append(", y1=");
            sb.append(this.f31132d);
            sb.append(", x2=");
            sb.append(this.f31133e);
            sb.append(", y2=");
            sb.append(this.f31134f);
            sb.append(", x3=");
            sb.append(this.f31135g);
            sb.append(", y3=");
            return org.bouncycastle.jcajce.provider.digest.d.a(sb, this.f31136h, ')');
        }
    }

    public static final class d extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f31137c;

        public d(float f10) {
            super(3);
            this.f31137c = f10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Float.compare(this.f31137c, ((d) obj).f31137c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f31137c);
        }

        public final String toString() {
            return org.bouncycastle.jcajce.provider.digest.d.a(new StringBuilder("HorizontalTo(x="), this.f31137c, ')');
        }
    }

    public static final class e extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f31138c;

        /* renamed from: d, reason: collision with root package name */
        public final float f31139d;

        public e(float f10, float f11) {
            super(3);
            this.f31138c = f10;
            this.f31139d = f11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Float.compare(this.f31138c, eVar.f31138c) == 0 && Float.compare(this.f31139d, eVar.f31139d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f31139d) + (Float.hashCode(this.f31138c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LineTo(x=");
            sb.append(this.f31138c);
            sb.append(", y=");
            return org.bouncycastle.jcajce.provider.digest.d.a(sb, this.f31139d, ')');
        }
    }

    public static final class f extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f31140c;

        /* renamed from: d, reason: collision with root package name */
        public final float f31141d;

        public f(float f10, float f11) {
            super(3);
            this.f31140c = f10;
            this.f31141d = f11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Float.compare(this.f31140c, fVar.f31140c) == 0 && Float.compare(this.f31141d, fVar.f31141d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f31141d) + (Float.hashCode(this.f31140c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MoveTo(x=");
            sb.append(this.f31140c);
            sb.append(", y=");
            return org.bouncycastle.jcajce.provider.digest.d.a(sb, this.f31141d, ')');
        }
    }

    /* renamed from: w1.g$g, reason: collision with other inner class name */
    public static final class C0315g extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f31142c;

        /* renamed from: d, reason: collision with root package name */
        public final float f31143d;

        /* renamed from: e, reason: collision with root package name */
        public final float f31144e;

        /* renamed from: f, reason: collision with root package name */
        public final float f31145f;

        public C0315g(float f10, float f11, float f12, float f13) {
            super(1);
            this.f31142c = f10;
            this.f31143d = f11;
            this.f31144e = f12;
            this.f31145f = f13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0315g)) {
                return false;
            }
            C0315g c0315g = (C0315g) obj;
            return Float.compare(this.f31142c, c0315g.f31142c) == 0 && Float.compare(this.f31143d, c0315g.f31143d) == 0 && Float.compare(this.f31144e, c0315g.f31144e) == 0 && Float.compare(this.f31145f, c0315g.f31145f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f31145f) + z1.a(this.f31144e, z1.a(this.f31143d, Float.hashCode(this.f31142c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("QuadTo(x1=");
            sb.append(this.f31142c);
            sb.append(", y1=");
            sb.append(this.f31143d);
            sb.append(", x2=");
            sb.append(this.f31144e);
            sb.append(", y2=");
            return org.bouncycastle.jcajce.provider.digest.d.a(sb, this.f31145f, ')');
        }
    }

    public static final class h extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f31146c;

        /* renamed from: d, reason: collision with root package name */
        public final float f31147d;

        /* renamed from: e, reason: collision with root package name */
        public final float f31148e;

        /* renamed from: f, reason: collision with root package name */
        public final float f31149f;

        public h(float f10, float f11, float f12, float f13) {
            super(2);
            this.f31146c = f10;
            this.f31147d = f11;
            this.f31148e = f12;
            this.f31149f = f13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Float.compare(this.f31146c, hVar.f31146c) == 0 && Float.compare(this.f31147d, hVar.f31147d) == 0 && Float.compare(this.f31148e, hVar.f31148e) == 0 && Float.compare(this.f31149f, hVar.f31149f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f31149f) + z1.a(this.f31148e, z1.a(this.f31147d, Float.hashCode(this.f31146c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
            sb.append(this.f31146c);
            sb.append(", y1=");
            sb.append(this.f31147d);
            sb.append(", x2=");
            sb.append(this.f31148e);
            sb.append(", y2=");
            return org.bouncycastle.jcajce.provider.digest.d.a(sb, this.f31149f, ')');
        }
    }

    public static final class i extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f31150c;

        /* renamed from: d, reason: collision with root package name */
        public final float f31151d;

        public i(float f10, float f11) {
            super(1);
            this.f31150c = f10;
            this.f31151d = f11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Float.compare(this.f31150c, iVar.f31150c) == 0 && Float.compare(this.f31151d, iVar.f31151d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f31151d) + (Float.hashCode(this.f31150c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
            sb.append(this.f31150c);
            sb.append(", y=");
            return org.bouncycastle.jcajce.provider.digest.d.a(sb, this.f31151d, ')');
        }
    }

    public static final class j extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f31152c;

        /* renamed from: d, reason: collision with root package name */
        public final float f31153d;

        /* renamed from: e, reason: collision with root package name */
        public final float f31154e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f31155f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f31156g;

        /* renamed from: h, reason: collision with root package name */
        public final float f31157h;

        /* renamed from: i, reason: collision with root package name */
        public final float f31158i;

        public j(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            super(3);
            this.f31152c = f10;
            this.f31153d = f11;
            this.f31154e = f12;
            this.f31155f = z10;
            this.f31156g = z11;
            this.f31157h = f13;
            this.f31158i = f14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Float.compare(this.f31152c, jVar.f31152c) == 0 && Float.compare(this.f31153d, jVar.f31153d) == 0 && Float.compare(this.f31154e, jVar.f31154e) == 0 && this.f31155f == jVar.f31155f && this.f31156g == jVar.f31156g && Float.compare(this.f31157h, jVar.f31157h) == 0 && Float.compare(this.f31158i, jVar.f31158i) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f31158i) + z1.a(this.f31157h, o2.a(o2.a(z1.a(this.f31154e, z1.a(this.f31153d, Float.hashCode(this.f31152c) * 31, 31), 31), 31, this.f31155f), 31, this.f31156g), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
            sb.append(this.f31152c);
            sb.append(", verticalEllipseRadius=");
            sb.append(this.f31153d);
            sb.append(", theta=");
            sb.append(this.f31154e);
            sb.append(", isMoreThanHalf=");
            sb.append(this.f31155f);
            sb.append(", isPositiveArc=");
            sb.append(this.f31156g);
            sb.append(", arcStartDx=");
            sb.append(this.f31157h);
            sb.append(", arcStartDy=");
            return org.bouncycastle.jcajce.provider.digest.d.a(sb, this.f31158i, ')');
        }
    }

    public static final class k extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f31159c;

        /* renamed from: d, reason: collision with root package name */
        public final float f31160d;

        /* renamed from: e, reason: collision with root package name */
        public final float f31161e;

        /* renamed from: f, reason: collision with root package name */
        public final float f31162f;

        /* renamed from: g, reason: collision with root package name */
        public final float f31163g;

        /* renamed from: h, reason: collision with root package name */
        public final float f31164h;

        public k(float f10, float f11, float f12, float f13, float f14, float f15) {
            super(2);
            this.f31159c = f10;
            this.f31160d = f11;
            this.f31161e = f12;
            this.f31162f = f13;
            this.f31163g = f14;
            this.f31164h = f15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return Float.compare(this.f31159c, kVar.f31159c) == 0 && Float.compare(this.f31160d, kVar.f31160d) == 0 && Float.compare(this.f31161e, kVar.f31161e) == 0 && Float.compare(this.f31162f, kVar.f31162f) == 0 && Float.compare(this.f31163g, kVar.f31163g) == 0 && Float.compare(this.f31164h, kVar.f31164h) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f31164h) + z1.a(this.f31163g, z1.a(this.f31162f, z1.a(this.f31161e, z1.a(this.f31160d, Float.hashCode(this.f31159c) * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
            sb.append(this.f31159c);
            sb.append(", dy1=");
            sb.append(this.f31160d);
            sb.append(", dx2=");
            sb.append(this.f31161e);
            sb.append(", dy2=");
            sb.append(this.f31162f);
            sb.append(", dx3=");
            sb.append(this.f31163g);
            sb.append(", dy3=");
            return org.bouncycastle.jcajce.provider.digest.d.a(sb, this.f31164h, ')');
        }
    }

    public static final class l extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f31165c;

        public l(float f10) {
            super(3);
            this.f31165c = f10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && Float.compare(this.f31165c, ((l) obj).f31165c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f31165c);
        }

        public final String toString() {
            return org.bouncycastle.jcajce.provider.digest.d.a(new StringBuilder("RelativeHorizontalTo(dx="), this.f31165c, ')');
        }
    }

    public static final class m extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f31166c;

        /* renamed from: d, reason: collision with root package name */
        public final float f31167d;

        public m(float f10, float f11) {
            super(3);
            this.f31166c = f10;
            this.f31167d = f11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return Float.compare(this.f31166c, mVar.f31166c) == 0 && Float.compare(this.f31167d, mVar.f31167d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f31167d) + (Float.hashCode(this.f31166c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
            sb.append(this.f31166c);
            sb.append(", dy=");
            return org.bouncycastle.jcajce.provider.digest.d.a(sb, this.f31167d, ')');
        }
    }

    public static final class n extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f31168c;

        /* renamed from: d, reason: collision with root package name */
        public final float f31169d;

        public n(float f10, float f11) {
            super(3);
            this.f31168c = f10;
            this.f31169d = f11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Float.compare(this.f31168c, nVar.f31168c) == 0 && Float.compare(this.f31169d, nVar.f31169d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f31169d) + (Float.hashCode(this.f31168c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
            sb.append(this.f31168c);
            sb.append(", dy=");
            return org.bouncycastle.jcajce.provider.digest.d.a(sb, this.f31169d, ')');
        }
    }

    public static final class o extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f31170c;

        /* renamed from: d, reason: collision with root package name */
        public final float f31171d;

        /* renamed from: e, reason: collision with root package name */
        public final float f31172e;

        /* renamed from: f, reason: collision with root package name */
        public final float f31173f;

        public o(float f10, float f11, float f12, float f13) {
            super(1);
            this.f31170c = f10;
            this.f31171d = f11;
            this.f31172e = f12;
            this.f31173f = f13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return Float.compare(this.f31170c, oVar.f31170c) == 0 && Float.compare(this.f31171d, oVar.f31171d) == 0 && Float.compare(this.f31172e, oVar.f31172e) == 0 && Float.compare(this.f31173f, oVar.f31173f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f31173f) + z1.a(this.f31172e, z1.a(this.f31171d, Float.hashCode(this.f31170c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
            sb.append(this.f31170c);
            sb.append(", dy1=");
            sb.append(this.f31171d);
            sb.append(", dx2=");
            sb.append(this.f31172e);
            sb.append(", dy2=");
            return org.bouncycastle.jcajce.provider.digest.d.a(sb, this.f31173f, ')');
        }
    }

    public static final class p extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f31174c;

        /* renamed from: d, reason: collision with root package name */
        public final float f31175d;

        /* renamed from: e, reason: collision with root package name */
        public final float f31176e;

        /* renamed from: f, reason: collision with root package name */
        public final float f31177f;

        public p(float f10, float f11, float f12, float f13) {
            super(2);
            this.f31174c = f10;
            this.f31175d = f11;
            this.f31176e = f12;
            this.f31177f = f13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return Float.compare(this.f31174c, pVar.f31174c) == 0 && Float.compare(this.f31175d, pVar.f31175d) == 0 && Float.compare(this.f31176e, pVar.f31176e) == 0 && Float.compare(this.f31177f, pVar.f31177f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f31177f) + z1.a(this.f31176e, z1.a(this.f31175d, Float.hashCode(this.f31174c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
            sb.append(this.f31174c);
            sb.append(", dy1=");
            sb.append(this.f31175d);
            sb.append(", dx2=");
            sb.append(this.f31176e);
            sb.append(", dy2=");
            return org.bouncycastle.jcajce.provider.digest.d.a(sb, this.f31177f, ')');
        }
    }

    public static final class q extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f31178c;

        /* renamed from: d, reason: collision with root package name */
        public final float f31179d;

        public q(float f10, float f11) {
            super(1);
            this.f31178c = f10;
            this.f31179d = f11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return Float.compare(this.f31178c, qVar.f31178c) == 0 && Float.compare(this.f31179d, qVar.f31179d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f31179d) + (Float.hashCode(this.f31178c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
            sb.append(this.f31178c);
            sb.append(", dy=");
            return org.bouncycastle.jcajce.provider.digest.d.a(sb, this.f31179d, ')');
        }
    }

    public static final class r extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f31180c;

        public r(float f10) {
            super(3);
            this.f31180c = f10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && Float.compare(this.f31180c, ((r) obj).f31180c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f31180c);
        }

        public final String toString() {
            return org.bouncycastle.jcajce.provider.digest.d.a(new StringBuilder("RelativeVerticalTo(dy="), this.f31180c, ')');
        }
    }

    public static final class s extends g {

        /* renamed from: c, reason: collision with root package name */
        public final float f31181c;

        public s(float f10) {
            super(3);
            this.f31181c = f10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && Float.compare(this.f31181c, ((s) obj).f31181c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f31181c);
        }

        public final String toString() {
            return org.bouncycastle.jcajce.provider.digest.d.a(new StringBuilder("VerticalTo(y="), this.f31181c, ')');
        }
    }

    public g(int i10) {
        boolean z10 = (i10 & 1) == 0;
        boolean z11 = (i10 & 2) == 0;
        this.f31121a = z10;
        this.f31122b = z11;
    }
}
