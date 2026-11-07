package a2;

import android.view.KeyEvent;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final KeyEvent f17a;

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return r.a(this.f17a, ((c) obj).f17a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f17a + ')';
    }
}
