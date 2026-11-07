package ha;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public abstract class a extends g<a.d.c> {
    private static final a.g zza;
    private static final a.AbstractC0063a zzb;
    private static final com.google.android.gms.common.api.a zzc;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        b bVar = new b();
        zzb = bVar;
        zzc = new com.google.android.gms.common.api.a("SmsRetriever.API", bVar, gVar);
    }

    public a(Activity activity) {
        super(activity, (com.google.android.gms.common.api.a<a.d.c>) zzc, a.d.f5917i, g.a.f5924c);
    }

    public abstract Task<Void> startSmsRetriever();

    public abstract Task<Void> startSmsUserConsent(String str);

    public a(Context context) {
        super(context, (com.google.android.gms.common.api.a<a.d.c>) zzc, a.d.f5917i, g.a.f5924c);
    }
}
