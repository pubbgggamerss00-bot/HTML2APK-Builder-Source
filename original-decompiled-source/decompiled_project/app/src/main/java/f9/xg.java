package f9;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import java.io.File;

/* loaded from: classes.dex */
public final /* synthetic */ class xg implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10957a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10958b;

    public /* synthetic */ xg(Object obj, int i10) {
        this.f10957a = i10;
        this.f10958b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f10957a) {
            case 0:
                return ProjectEntity.copy$default((ProjectEntity) obj, 0L, null, null, null, 0, null, 0, 0, null, null, ((File) this.f10958b).getAbsolutePath(), null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -1025, -1, 15, null);
            default:
                s.b bVar = (s.b) this.f10958b;
                q1.l1 graphicsLayer = (q1.l1) obj;
                kotlin.jvm.internal.r.e(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.f(((Number) bVar.d()).floatValue());
                return pg.f0.f21461a;
        }
    }
}
