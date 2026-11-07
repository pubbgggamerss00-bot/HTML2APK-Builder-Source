package dc;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;

/* loaded from: classes2.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public final n f7835a;

    /* renamed from: b, reason: collision with root package name */
    public final IntentFilter f7836b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f7837c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f7838d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public l f7839e = null;

    public m(n nVar, IntentFilter intentFilter, Context context) {
        this.f7835a = nVar;
        this.f7836b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.f7837c = applicationContext != null ? applicationContext : context;
    }

    public final void a() {
        l lVar;
        HashSet hashSet = this.f7838d;
        boolean zIsEmpty = hashSet.isEmpty();
        Context context = this.f7837c;
        if (!zIsEmpty && this.f7839e == null) {
            l lVar2 = new l(this);
            this.f7839e = lVar2;
            int i10 = Build.VERSION.SDK_INT;
            IntentFilter intentFilter = this.f7836b;
            if (i10 >= 33) {
                context.registerReceiver(lVar2, intentFilter, 2);
            } else {
                context.registerReceiver(lVar2, intentFilter);
            }
        }
        if (!hashSet.isEmpty() || (lVar = this.f7839e) == null) {
            return;
        }
        context.unregisterReceiver(lVar);
        this.f7839e = null;
    }
}
