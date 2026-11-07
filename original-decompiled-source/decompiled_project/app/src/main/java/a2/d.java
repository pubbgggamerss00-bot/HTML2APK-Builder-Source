package a2;

import android.view.KeyEvent;

/* loaded from: classes.dex */
public final class d {
    public static final long a(KeyEvent keyEvent) {
        return g.a(keyEvent.getKeyCode());
    }

    public static final int b(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }
}
