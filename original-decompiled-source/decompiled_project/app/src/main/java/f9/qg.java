package f9;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final /* synthetic */ class qg implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10335a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10336b;

    public /* synthetic */ qg(Object obj, int i10) {
        this.f10335a = i10;
        this.f10336b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f10335a) {
            case 0:
                return ProjectEntity.copy$default((ProjectEntity) obj, 0L, null, null, null, 0, null, 0, 0, null, null, (String) this.f10336b, null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -1025, -1, 15, null);
            default:
                s.b bVar = (s.b) this.f10336b;
                q1.l1 graphicsLayer = (q1.l1) obj;
                kotlin.jvm.internal.r.e(graphicsLayer, "$this$graphicsLayer");
                float fFloatValue = ((Number) bVar.d()).floatValue();
                if (fFloatValue == 1.0f) {
                    return pg.f0.f21461a;
                }
                graphicsLayer.c1(b3.e.a(0.5f, CropImageView.DEFAULT_ASPECT_RATIO));
                graphicsLayer.h(fFloatValue);
                graphicsLayer.d(fFloatValue);
                graphicsLayer.f(jh.j.l(3.0f * fFloatValue, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f));
                if (fFloatValue < 1.0f) {
                    graphicsLayer.C(true);
                    graphicsLayer.p1(new x8.a(fFloatValue));
                }
                return pg.f0.f21461a;
        }
    }
}
