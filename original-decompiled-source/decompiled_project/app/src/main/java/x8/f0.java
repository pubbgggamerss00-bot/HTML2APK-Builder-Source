package x8;

import com.basitce.htmltoapk.data.local.entity.FolderEntity;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f0 implements eh.l<q1.l1, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f32584a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0.m0 f32585b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Float> f32586c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FolderEntity f32587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.k1 f32588e;

    public f0(boolean z10, b0.m0 m0Var, x0.r3<Float> r3Var, FolderEntity folderEntity, x0.k1 k1Var) {
        this.f32584a = z10;
        this.f32585b = m0Var;
        this.f32586c = r3Var;
        this.f32587d = folderEntity;
        this.f32588e = k1Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(q1.l1 l1Var) {
        Object next;
        q1.l1 graphicsLayer = l1Var;
        kotlin.jvm.internal.r.e(graphicsLayer, "$this$graphicsLayer");
        float f10 = s.f33139a;
        float fFloatValue = (this.f32586c.getValue().floatValue() * 0.06f) + 1.0f;
        boolean z10 = this.f32584a;
        float f11 = fFloatValue + (z10 ? 0.04f : CropImageView.DEFAULT_ASPECT_RATIO);
        graphicsLayer.h(f11);
        graphicsLayer.d(f11);
        if (z10) {
            Iterator<T> it = this.f32585b.i().i().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.r.a(((b0.n) next).getKey(), Long.valueOf(this.f32587d.getId()))) {
                    break;
                }
            }
            if (((b0.n) next) != null) {
                graphicsLayer.j(this.f32588e.getFloatValue() - ((r1.getSize() / 2.0f) + r1.getOffset()));
            }
            graphicsLayer.n(graphicsLayer.N0(8));
            graphicsLayer.p1(h0.f.a(16));
        }
        return pg.f0.f21461a;
    }
}
