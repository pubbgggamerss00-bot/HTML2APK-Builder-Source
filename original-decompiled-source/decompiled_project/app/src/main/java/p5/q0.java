package p5;

import android.os.Bundle;
import com.yalantis.ucrop.view.CropImageView;
import q1.l1;

/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21263a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21264b;

    public /* synthetic */ q0(Object obj, int i10) {
        this.f21263a = i10;
        this.f21264b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f21263a) {
            case 0:
                kotlin.jvm.internal.g0 g0Var = (kotlin.jvm.internal.g0) this.f21264b;
                String key = (String) obj;
                kotlin.jvm.internal.r.e(key, "key");
                T t3 = g0Var.f16327a;
                return Boolean.valueOf(t3 == 0 || !((Bundle) t3).containsKey(key));
            default:
                s.b bVar = (s.b) this.f21264b;
                l1 graphicsLayer = (l1) obj;
                kotlin.jvm.internal.r.e(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.f(jh.j.l((((Number) bVar.d()).floatValue() - 0.15f) / 0.35f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f));
                graphicsLayer.s(2);
                return pg.f0.f21461a;
        }
    }
}
