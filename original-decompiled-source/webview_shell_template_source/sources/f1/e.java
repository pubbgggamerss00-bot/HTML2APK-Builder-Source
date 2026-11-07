package f1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.l;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final KeyListener f12972a;

    /* renamed from: b, reason: collision with root package name */
    public final a f12973b;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {
    }

    public e(KeyListener keyListener) {
        a aVar = new a();
        this.f12972a = keyListener;
        this.f12973b = aVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i6) {
        this.f12972a.clearMetaKeyState(view, editable, i6);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f12972a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i6, KeyEvent keyEvent) {
        boolean z6;
        this.f12973b.getClass();
        if (i6 != 67 ? i6 != 112 ? false : l.a(editable, keyEvent, true) : l.a(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z6 = true;
        } else {
            z6 = false;
        }
        return z6 || this.f12972a.onKeyDown(view, editable, i6, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f12972a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i6, KeyEvent keyEvent) {
        return this.f12972a.onKeyUp(view, editable, i6, keyEvent);
    }
}
