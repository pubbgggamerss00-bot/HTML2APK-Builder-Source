package pa;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class l extends zau {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21402a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f21403b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(d dVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f21403b = dVar;
        this.f21402a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        int i11 = e.f21388a;
        d dVar = this.f21403b;
        Context context = this.f21402a;
        int iC = dVar.c(context, i11);
        AtomicBoolean atomicBoolean = i.f21393a;
        if (iC == 1 || iC == 2 || iC == 3 || iC == 9) {
            Intent intentA = dVar.a(context, "n", iC);
            dVar.g(context, iC, intentA == null ? null : PendingIntent.getActivity(context, 0, intentA, 201326592));
        }
    }
}
