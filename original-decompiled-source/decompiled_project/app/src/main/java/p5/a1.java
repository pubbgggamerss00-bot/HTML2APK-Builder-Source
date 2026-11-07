package p5;

import android.widget.VideoView;

/* loaded from: classes.dex */
public final /* synthetic */ class a1 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21190a;

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f21190a) {
            case 0:
                w0 navOptions = (w0) obj;
                kotlin.jvm.internal.r.e(navOptions, "$this$navOptions");
                navOptions.f21297b = true;
                break;
            default:
                VideoView it = (VideoView) obj;
                kotlin.jvm.internal.r.e(it, "it");
                it.stopPlayback();
                break;
        }
        return pg.f0.f21461a;
    }
}
