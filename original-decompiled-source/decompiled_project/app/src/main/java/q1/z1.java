package q1;

import android.graphics.RenderEffect;

/* loaded from: classes.dex */
public abstract class z1 {

    /* renamed from: a, reason: collision with root package name */
    public RenderEffect f21751a;

    public final RenderEffect a() {
        RenderEffect renderEffect = this.f21751a;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect renderEffectB = b();
        this.f21751a = renderEffectB;
        return renderEffectB;
    }

    public abstract RenderEffect b();
}
