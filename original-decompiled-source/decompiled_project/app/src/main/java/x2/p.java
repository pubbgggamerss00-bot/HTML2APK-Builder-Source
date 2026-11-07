package x2;

import com.yalantis.ucrop.view.CropImageView;
import java.util.List;
import org.bouncycastle.asn1.x509.DisplayText;

/* loaded from: classes.dex */
public final class p implements Comparable<p> {

    /* renamed from: b, reason: collision with root package name */
    public static final p f32029b;

    /* renamed from: c, reason: collision with root package name */
    public static final p f32030c;

    /* renamed from: d, reason: collision with root package name */
    public static final p f32031d;

    /* renamed from: e, reason: collision with root package name */
    public static final p f32032e;

    /* renamed from: f, reason: collision with root package name */
    public static final p f32033f;

    /* renamed from: g, reason: collision with root package name */
    public static final p f32034g;

    /* renamed from: h, reason: collision with root package name */
    public static final p f32035h;

    /* renamed from: j, reason: collision with root package name */
    public static final List<p> f32036j;

    /* renamed from: a, reason: collision with root package name */
    public final int f32037a;

    public static final class a {
        public static p a() {
            return p.f32033f;
        }

        public static p b() {
            return p.f32031d;
        }

        public static p c() {
            return p.f32032e;
        }
    }

    static {
        p pVar = new p(100);
        p pVar2 = new p(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
        p pVar3 = new p(300);
        p pVar4 = new p(400);
        p pVar5 = new p(CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION);
        p pVar6 = new p(600);
        f32029b = pVar6;
        p pVar7 = new p(700);
        p pVar8 = new p(800);
        p pVar9 = new p(900);
        f32030c = pVar4;
        f32031d = pVar5;
        f32032e = pVar6;
        f32033f = pVar7;
        f32034g = pVar8;
        f32035h = pVar9;
        f32036j = qg.p.j(pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, pVar9);
    }

    public p(int i10) {
        this.f32037a = i10;
        boolean z10 = false;
        if (1 <= i10 && i10 < 1001) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        z2.a.a("Font weight can be in range [1, 1000]. Current value: " + i10);
    }

    @Override // java.lang.Comparable
    public final int compareTo(p pVar) {
        return kotlin.jvm.internal.r.f(this.f32037a, pVar.f32037a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return this.f32037a == ((p) obj).f32037a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f32037a;
    }

    public final String toString() {
        return b.b.a(new StringBuilder("FontWeight(weight="), this.f32037a, ')');
    }
}
