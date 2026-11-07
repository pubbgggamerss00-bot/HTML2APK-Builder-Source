package c2;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class m0 extends kotlin.jvm.internal.s implements eh.l<MotionEvent, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i3.l f4674a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(i3.l lVar) {
        super(1);
        this.f4674a = lVar;
    }

    @Override // eh.l
    public final Boolean invoke(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent;
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent2.getActionMasked();
        i3.l lVar = this.f4674a;
        switch (actionMasked) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                zDispatchTouchEvent = lVar.dispatchTouchEvent(motionEvent2);
                break;
            default:
                zDispatchTouchEvent = lVar.dispatchGenericMotionEvent(motionEvent2);
                break;
        }
        return Boolean.valueOf(zDispatchTouchEvent);
    }
}
