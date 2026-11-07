package c3;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@SuppressLint({"HandlerLeak"})
/* loaded from: classes.dex */
public final class p extends o3.f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f2190b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(g gVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f2190b = gVar;
        this.f2189a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Resources.NotFoundException {
        int i6 = message.what;
        if (i6 != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i6);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int i7 = h.f2183a;
        g gVar = this.f2190b;
        Context context = this.f2189a;
        int iC = gVar.c(context, i7);
        AtomicBoolean atomicBoolean = k.f2186a;
        if (iC == 1 || iC == 2 || iC == 3 || iC == 9) {
            Intent intentB = gVar.b(context, "n", iC);
            gVar.g(context, iC, intentB == null ? null : PendingIntent.getActivity(context, 0, intentB, 201326592));
        }
    }
}
