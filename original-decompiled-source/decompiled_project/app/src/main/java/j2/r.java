package j2;

import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.s implements eh.a<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f14885a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MotionEvent f14886b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(MotionEvent motionEvent, AndroidComposeView androidComposeView) {
        super(0);
        this.f14885a = androidComposeView;
        this.f14886b = motionEvent;
    }

    @Override // eh.a
    public final Boolean invoke() {
        return Boolean.valueOf(super/*android.view.View*/.dispatchGenericMotionEvent(this.f14886b));
    }
}
