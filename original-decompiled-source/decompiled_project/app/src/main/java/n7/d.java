package n7;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import pg.f0;

/* loaded from: classes.dex */
public final class d extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.a<f0> f18362a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a<f0> f18363b;

    public d(eh.a<f0> aVar, eh.a<f0> aVar2) {
        this.f18362a = aVar;
        this.f18363b = aVar2;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        eh.a<f0> aVar = this.f18363b;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        eh.a<f0> aVar = this.f18362a;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
