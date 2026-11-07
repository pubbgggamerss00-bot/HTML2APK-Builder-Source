package a9;

import android.content.Context;
import android.widget.Toast;

/* loaded from: classes.dex */
public final /* synthetic */ class t1 implements eh.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f313a;

    @Override // eh.p
    public final Object invoke(Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        String msg = (String) obj2;
        kotlin.jvm.internal.r.e(msg, "msg");
        Toast.makeText(this.f313a, msg, 0).show();
        return pg.f0.f21461a;
    }
}
