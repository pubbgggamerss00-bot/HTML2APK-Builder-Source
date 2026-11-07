package androidx.room;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2851a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2852b;

    public /* synthetic */ b0(Object obj, int i10) {
        this.f2851a = i10;
        this.f2852b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f2851a;
        Object obj = this.f2852b;
        switch (i10) {
            case 0:
                return g0.runInTransaction$lambda$10((Runnable) obj);
            default:
                Context context = (Context) obj;
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("https://support.google.com/googleplay/android-developer/answer/9842756"));
                try {
                    context.startActivity(intent);
                    pg.f0 f0Var = pg.f0.f21461a;
                } catch (Throwable th2) {
                    pg.q.a(th2);
                }
                return pg.f0.f21461a;
        }
    }
}
