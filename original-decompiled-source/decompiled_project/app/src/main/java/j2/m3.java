package j2;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class m3 {

    /* renamed from: a, reason: collision with root package name */
    public static final m3 f14829a = new m3();

    public final boolean a(MotionEvent motionEvent, int i10) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i10)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i10)) & Integer.MAX_VALUE) < 2139095040;
    }
}
