package androidx.compose.ui.graphics;

import ad.f;
import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import i2.a1;
import i2.g1;
import i2.k;
import kotlin.jvm.internal.r;
import q1.b1;
import q1.f2;
import q1.g2;
import q1.h2;
import q1.l2;
import r.e2;
import r.o2;
import r.z1;

/* loaded from: classes.dex */
final class GraphicsLayerElement extends a1<h2> {

    /* renamed from: b, reason: collision with root package name */
    public final float f1187b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1188c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1189d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1190e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1191f;

    /* renamed from: g, reason: collision with root package name */
    public final float f1192g = 8.0f;

    /* renamed from: h, reason: collision with root package name */
    public final long f1193h;

    /* renamed from: i, reason: collision with root package name */
    public final f2 f1194i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f1195j;

    /* renamed from: k, reason: collision with root package name */
    public final long f1196k;

    /* renamed from: l, reason: collision with root package name */
    public final long f1197l;

    public GraphicsLayerElement(float f10, float f11, float f12, float f13, float f14, long j10, f2 f2Var, boolean z10, long j11, long j12) {
        this.f1187b = f10;
        this.f1188c = f11;
        this.f1189d = f12;
        this.f1190e = f13;
        this.f1191f = f14;
        this.f1193h = j10;
        this.f1194i = f2Var;
        this.f1195j = z10;
        this.f1196k = j11;
        this.f1197l = j12;
    }

    @Override // i2.a1
    public final d.c a() {
        h2 h2Var = new h2();
        h2Var.f21698q = this.f1187b;
        h2Var.f21699r = this.f1188c;
        h2Var.f21700s = this.f1189d;
        h2Var.f21701t = this.f1190e;
        h2Var.f21702v = this.f1191f;
        h2Var.f21703w = this.f1192g;
        h2Var.f21704x = this.f1193h;
        h2Var.f21705y = this.f1194i;
        h2Var.f21706z = this.f1195j;
        h2Var.A = this.f1196k;
        h2Var.B = this.f1197l;
        h2Var.C = new g2(h2Var);
        return h2Var;
    }

    @Override // i2.a1
    public final void b(d.c cVar) {
        h2 h2Var = (h2) cVar;
        h2Var.f21698q = this.f1187b;
        h2Var.f21699r = this.f1188c;
        h2Var.f21700s = this.f1189d;
        h2Var.f21701t = this.f1190e;
        h2Var.f21702v = this.f1191f;
        h2Var.f21703w = this.f1192g;
        h2Var.f21704x = this.f1193h;
        h2Var.f21705y = this.f1194i;
        h2Var.f21706z = this.f1195j;
        h2Var.A = this.f1196k;
        h2Var.B = this.f1197l;
        g1 g1Var = k.d(h2Var, 2).f13877r;
        if (g1Var != null) {
            g1Var.T1(h2Var.C, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.f1187b, graphicsLayerElement.f1187b) == 0 && Float.compare(this.f1188c, graphicsLayerElement.f1188c) == 0 && Float.compare(this.f1189d, graphicsLayerElement.f1189d) == 0 && Float.compare(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO) == 0 && Float.compare(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO) == 0 && Float.compare(this.f1190e, graphicsLayerElement.f1190e) == 0 && Float.compare(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO) == 0 && Float.compare(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO) == 0 && Float.compare(this.f1191f, graphicsLayerElement.f1191f) == 0 && Float.compare(this.f1192g, graphicsLayerElement.f1192g) == 0 && l2.a(this.f1193h, graphicsLayerElement.f1193h) && r.a(this.f1194i, graphicsLayerElement.f1194i) && this.f1195j == graphicsLayerElement.f1195j && b1.d(this.f1196k, graphicsLayerElement.f1196k) && b1.d(this.f1197l, graphicsLayerElement.f1197l);
    }

    public final int hashCode() {
        int iA = z1.a(this.f1192g, z1.a(this.f1191f, z1.a(CropImageView.DEFAULT_ASPECT_RATIO, z1.a(CropImageView.DEFAULT_ASPECT_RATIO, z1.a(this.f1190e, z1.a(CropImageView.DEFAULT_ASPECT_RATIO, z1.a(CropImageView.DEFAULT_ASPECT_RATIO, z1.a(this.f1189d, z1.a(this.f1188c, Float.hashCode(this.f1187b) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i10 = l2.f21719c;
        int iA2 = o2.a((this.f1194i.hashCode() + e2.a(iA, 31, this.f1193h)) * 31, 961, this.f1195j);
        int i11 = b1.f21655i;
        return Integer.hashCode(0) + e2.a(e2.a(iA2, 31, this.f1196k), 31, this.f1197l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.f1187b);
        sb.append(", scaleY=");
        sb.append(this.f1188c);
        sb.append(", alpha=");
        sb.append(this.f1189d);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f1190e);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.f1191f);
        sb.append(", cameraDistance=");
        sb.append(this.f1192g);
        sb.append(", transformOrigin=");
        sb.append((Object) l2.d(this.f1193h));
        sb.append(", shape=");
        sb.append(this.f1194i);
        sb.append(", clip=");
        sb.append(this.f1195j);
        sb.append(", renderEffect=null, ambientShadowColor=");
        f.c(this.f1196k, ", spotShadowColor=", sb);
        sb.append((Object) b1.j(this.f1197l));
        sb.append(", compositingStrategy=CompositingStrategy(value=0))");
        return sb.toString();
    }
}
